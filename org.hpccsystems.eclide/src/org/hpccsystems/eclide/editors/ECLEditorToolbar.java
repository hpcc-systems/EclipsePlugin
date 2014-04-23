package org.hpccsystems.eclide.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationListener;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.resources.Messages;
import org.hpccsystems.internal.data.Cluster;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import de.ikoffice.widgets.SplitButton;
import de.ikoffice.widgets.SplitButtonSelectionListener;

public class ECLEditorToolbar extends Composite {

	private IFile file;
	private ILaunchConfiguration[] configurations;
	private SplitButton submitButton;
	private Combo comboServer;
	private Combo comboTarget;

	public ECLEditorToolbar(IFile sourceFile, Composite parent, int style) {
		super(parent, style);
		file = sourceFile;
		GridLayout innerTopLayout = new GridLayout(5, false);
		innerTopLayout.marginHeight = 0;
		innerTopLayout.marginWidth = 0;
		setLayout(innerTopLayout);

		Display display = Display.getCurrent();
		Color titleBackground = display.getSystemColor(SWT.COLOR_WIDGET_BACKGROUND);

		setBackground(titleBackground);

		FormData fData = new FormData();
		fData.top = new FormAttachment(0);
		fData.left = new FormAttachment(0);
		fData.right = new FormAttachment(100);
		setLayoutData(fData);

		submitButton = new SplitButton(this, SWT.NONE);
		submitButton.setText(Messages.ECLEditorToolbar_6);
		GridData gd = new GridData();
		submitButton.setLayoutData(gd);
		SWTFactory.setButtonDimensionHint(submitButton);
		menuCreator(submitButton.getMenu());
		submitButton.addSplitButtonSelectionListener(new SplitButtonSelectionListener() {
			@Override
			public boolean showMenu() {
				return true;
			}

			@Override
			public void buttonSelected() {
				submit(false);
			}
		});

		SWTFactory.createLabel(this, Messages.ECLEditorToolbar_1, 1);
		comboServer = SWTFactory.createCombo(this, SWT.VERTICAL | SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY, 1, null);
		comboServer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Preferences prefs = Activator.getPreferences("ECLEditorToolbar"); //$NON-NLS-1$
				prefs.put("comboServer", comboServer.getText());
				refreshTarget(true);
				try {
					prefs.flush();
				} catch (BackingStoreException e1) {
				}
			}
		});
		SWTFactory.createLabel(this, Messages.ECLEditorToolbar_4, 1);
		comboTarget = SWTFactory.createCombo(this, SWT.VERTICAL | SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY, 1, null);
		comboTarget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Preferences prefs = Activator.getPreferences("ECLEditorToolbar"); //$NON-NLS-1$
				prefs.put(comboServer.getText(), comboTarget.getText());
				try {
					prefs.flush();
				} catch (BackingStoreException e1) {
				}
			}
		});

		ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
		launchManager.addLaunchConfigurationListener(new ILaunchConfigurationListener() {
			@Override
			public void launchConfigurationAdded(ILaunchConfiguration configuration) {
				refreshLaunchConfigurations(false);
			}

			@Override
			public void launchConfigurationChanged(ILaunchConfiguration configuration) {
				refreshServers(false);
			}

			@Override
			public void launchConfigurationRemoved(ILaunchConfiguration configuration) {
				refreshLaunchConfigurations(false);
			}
		});
		refreshLaunchConfigurations(true);
	}

	private void menuCreator(Menu menu) {
		MenuItem[] items = menu.getItems();
		if (items != null) {
			for (MenuItem item : items) {
				item.dispose();
			}
		}

		MenuItem submit = new MenuItem(menu, SWT.PUSH);
		submit.setText(Messages.ECLEditorToolbar_6);
		submit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				submit(false);
			}
		});

		MenuItem compile = new MenuItem(menu, SWT.PUSH);
		compile.setText(Messages.ECLEditorToolbar_7);
		compile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				submit(true);
			}
		});

		MenuItem debug = new MenuItem(menu, SWT.PUSH);
		debug.setText(Messages.ECLEditorToolbar_8);
		debug.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
			}
		});
		debug.setEnabled(false);
	}

	ILaunchConfiguration getSelectedConfiguration() {
		int selIndex = comboServer.getSelectionIndex();
		if (selIndex >= 0 && selIndex < configurations.length) {
			return configurations[comboServer.getSelectionIndex()];
		}
		return null;
	}

	void submit(boolean compileOnly) {
		ILaunchConfiguration configuration = getSelectedConfiguration();
		if (configuration != null) {
			Platform platform = Data.get().GetPlatform(configuration);
			platform.submit(configuration, file, comboTarget.getText(), compileOnly);
		}
	}

	private void refreshLaunchConfigurations(boolean ignoreCurrent) {
		configurations = new ILaunchConfiguration[0];
		ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
		try {
			configurations = launchManager.getLaunchConfigurations();
		} catch (CoreException e) {
		}
		refreshServers(ignoreCurrent);
	}

	private void refreshServers(String defaultServer, boolean ignoreCurrent) {
		String currentServer = comboServer.getText();
		comboServer.removeAll();
		int currentServerSel = -1;
		int defaultServerSel = -1;
		for (int i = 0; i < configurations.length; ++i) {
			String name = configurations[i].getName();
			comboServer.add(name);
			if (name.equals(currentServer))
				currentServerSel = i;
			if (name.equals(defaultServer))
				defaultServerSel = i;
		}
		if (currentServerSel >= 0)
			comboServer.select(currentServerSel);
		else if (defaultServerSel >= 0)
			comboServer.select(defaultServerSel);
		else
			comboServer.select(0);
		refreshTarget(ignoreCurrent);
	}

	private void refreshServers(boolean ignoreCurrent) {
		Preferences prefs = Activator.getPreferences("ECLEditorToolbar"); //$NON-NLS-1$
		refreshServers(prefs.get("comboServer", ""), ignoreCurrent); //$NON-NLS-1$ //$NON-NLS-2$
	}

	private void refreshTarget(String defaultTarget, boolean ignoreCurrent) {
		String currentTarget = ignoreCurrent ? "" : comboServer.getText(); //$NON-NLS-1$
		comboTarget.removeAll();
		ILaunchConfiguration configuration = getSelectedConfiguration();
		if (configuration != null) {
			Platform platform = Data.get().GetPlatform(configuration);
			if (platform != null) {
				Cluster[] clusters = platform.getClusters();
				int currentTargetSel = -1;
				int defaultTargetSel = -1;
				for (int i = 0; i < clusters.length; ++i) {
					String name = clusters[i].getName();
					comboTarget.add(name);
					if (name.equals(currentTarget))
						currentTargetSel = i;
					if (name.equals(defaultTarget))
						defaultTargetSel = i;
				}

				if (currentTargetSel >= 0)
					comboTarget.select(currentTargetSel);
				else if (defaultTargetSel >= 0)
					comboTarget.select(defaultTargetSel);
			}
		}
	}

	private void refreshTarget(boolean ignoreCurrent) {
		Preferences prefs = Activator.getPreferences("ECLEditorToolbar"); //$NON-NLS-1$
		String defaultTarget = prefs.get(comboServer.getText(), ""); //$NON-NLS-1$
		if (defaultTarget.isEmpty()) {
			try {
				ILaunchConfiguration configuration = getSelectedConfiguration();
				if (configuration != null) {
					defaultTarget = configuration.getAttribute(Platform.P_CLUSTER, ""); //$NON-NLS-1$
				}
			} catch (CoreException e) {
			}
		}
		refreshTarget(defaultTarget, ignoreCurrent);
	}
}
