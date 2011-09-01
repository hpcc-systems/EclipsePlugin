<<<<<<< HEAD
/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.debug.console.ui;


import org.eclipse.debug.core.ILaunch;
import org.eclipse.dltk.console.IScriptInterpreter;
import org.eclipse.dltk.console.ScriptConsolePrompt;
import org.eclipse.dltk.console.ui.IScriptConsole;
import org.eclipse.dltk.console.ui.IScriptConsoleFactory;
import org.eclipse.dltk.console.ui.ScriptConsole;
import org.eclipse.dltk.console.ui.ScriptConsoleFactoryBase;
import org.eclipse.dltk.core.internal.environment.LocalEnvironment;
import org.eclipse.dltk.debug.ui.DLTKDebugUIPlugin;
import org.eclipse.dltk.launching.LaunchingMessages;
import org.eclipse.dltk.launching.ScriptRuntime;
import org.eclipse.dltk.launching.ScriptRuntime.DefaultInterpreterEntry;
import org.eclipse.dltk.ui.DLTKUILanguageManager;
import org.eclipse.dltk.ui.IDLTKUILanguageToolkit;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.seisint.eclide.console.OctaveConsoleConstants;
import org.seisint.eclide.console.OctaveConsoleUtil;
import org.seisint.eclide.console.OctaveInterpreter;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.debug.ui.OctclipseDebugUIPlugin;

public class OctaveConsoleFactory extends ScriptConsoleFactoryBase implements
	IScriptConsoleFactory {

	protected IScriptConsole createConsoleInstance() {
		return createConsoleInstance(null, null);
	}
	
	protected IPreferenceStore getPreferenceStore() {
		return OctclipseDebugUIPlugin.getDefault().getPreferenceStore();
	}
	
	protected ScriptConsolePrompt makeInvitation() {
		IPreferenceStore store = getPreferenceStore();
		return new ScriptConsolePrompt(store
				.getString(OctaveConsoleConstants.PREF_NEW_PROMPT), store
				.getString(OctaveConsoleConstants.PREF_CONTINUE_PROMPT));
	}

	protected OctaveConsole makeConsole(OctaveInterpreter interpreter, String id) {
		OctaveConsole console = new OctaveConsole(interpreter, id);
		console.setPrompt(makeInvitation());
		return console;
	}
	
	protected void showInterpreterPreferencePage(String natureId) {
		String preferencePageId = null;
		IDLTKUILanguageToolkit languageToolkit = null;
		languageToolkit = DLTKUILanguageManager.getLanguageToolkit(natureId);
		if( languageToolkit == null ) {
			return;
		}
		preferencePageId = languageToolkit.getInterpreterPreferencePage();

		if (preferencePageId != null) {
			PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
					null, preferencePageId, null, null);
			dialog.open();
		}
	}
	
	private void showQuestion() {
		final boolean result[] = new boolean[] { false };
		DLTKDebugUIPlugin.getStandardDisplay().syncExec(new Runnable() {
			public void run() {
				String title = LaunchingMessages.NoDefaultInterpreterStatusHandler_title;
				String message = LaunchingMessages.NoDefaultInterpreterStatusHandler_message;
				result[0] = (MessageDialog.openQuestion(DLTKDebugUIPlugin
						.getActiveWorkbenchShell(), title, message));
				if (result[0]) {
					showInterpreterPreferencePage(OctaveNature.NATURE_ID);
				}
			}
		});
	}
	
	private OctaveConsole createConsoleInstance(IScriptInterpreter interpreter, String id) {
		if (interpreter == null) {
			try {
				id = "default";
				interpreter = new OctaveInterpreter();
				if( ScriptRuntime.getDefaultInterpreterInstall(new DefaultInterpreterEntry(
						OctaveNature.NATURE_ID,
						LocalEnvironment.ENVIRONMENT_ID)) == null ) {
					showQuestion();
					if( ScriptRuntime.getDefaultInterpreterInstall(new DefaultInterpreterEntry(
							OctaveNature.NATURE_ID,
							LocalEnvironment.ENVIRONMENT_ID)) == null ) {
						return null;
					}
				}
				OctaveConsoleUtil
						.runDefaultOctaveInterpreter((OctaveInterpreter) interpreter);
			} catch (Exception e) {
				return null;
			}
		}
		return makeConsole((OctaveInterpreter) interpreter, id);
	}

	public IScriptConsole openConsole(IScriptInterpreter interpreter, String id,
			ILaunch launch) {
		OctaveConsole octaveConsole = createConsoleInstance(interpreter, id);
		octaveConsole.setLaunch(launch);
		registerAndOpenConsole(octaveConsole);
		return octaveConsole;
	}

}
=======
/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.debug.console.ui;


import org.eclipse.debug.core.ILaunch;
import org.eclipse.dltk.console.IScriptInterpreter;
import org.eclipse.dltk.console.ScriptConsolePrompt;
import org.eclipse.dltk.console.ui.IScriptConsole;
import org.eclipse.dltk.console.ui.IScriptConsoleFactory;
import org.eclipse.dltk.console.ui.ScriptConsole;
import org.eclipse.dltk.console.ui.ScriptConsoleFactoryBase;
import org.eclipse.dltk.core.internal.environment.LocalEnvironment;
import org.eclipse.dltk.debug.ui.DLTKDebugUIPlugin;
import org.eclipse.dltk.launching.LaunchingMessages;
import org.eclipse.dltk.launching.ScriptRuntime;
import org.eclipse.dltk.launching.ScriptRuntime.DefaultInterpreterEntry;
import org.eclipse.dltk.ui.DLTKUILanguageManager;
import org.eclipse.dltk.ui.IDLTKUILanguageToolkit;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.seisint.eclide.console.OctaveConsoleConstants;
import org.seisint.eclide.console.OctaveConsoleUtil;
import org.seisint.eclide.console.OctaveInterpreter;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.debug.ui.OctclipseDebugUIPlugin;

public class OctaveConsoleFactory extends ScriptConsoleFactoryBase implements
	IScriptConsoleFactory {

	protected IScriptConsole createConsoleInstance() {
		return createConsoleInstance(null, null);
	}
	
	protected IPreferenceStore getPreferenceStore() {
		return OctclipseDebugUIPlugin.getDefault().getPreferenceStore();
	}
	
	protected ScriptConsolePrompt makeInvitation() {
		IPreferenceStore store = getPreferenceStore();
		return new ScriptConsolePrompt(store
				.getString(OctaveConsoleConstants.PREF_NEW_PROMPT), store
				.getString(OctaveConsoleConstants.PREF_CONTINUE_PROMPT));
	}

	protected OctaveConsole makeConsole(OctaveInterpreter interpreter, String id) {
		OctaveConsole console = new OctaveConsole(interpreter, id);
		console.setPrompt(makeInvitation());
		return console;
	}
	
	protected void showInterpreterPreferencePage(String natureId) {
		String preferencePageId = null;
		IDLTKUILanguageToolkit languageToolkit = null;
		languageToolkit = DLTKUILanguageManager.getLanguageToolkit(natureId);
		if( languageToolkit == null ) {
			return;
		}
		preferencePageId = languageToolkit.getInterpreterPreferencePage();

		if (preferencePageId != null) {
			PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
					null, preferencePageId, null, null);
			dialog.open();
		}
	}
	
	private void showQuestion() {
		final boolean result[] = new boolean[] { false };
		DLTKDebugUIPlugin.getStandardDisplay().syncExec(new Runnable() {
			public void run() {
				String title = LaunchingMessages.NoDefaultInterpreterStatusHandler_title;
				String message = LaunchingMessages.NoDefaultInterpreterStatusHandler_message;
				result[0] = (MessageDialog.openQuestion(DLTKDebugUIPlugin
						.getActiveWorkbenchShell(), title, message));
				if (result[0]) {
					showInterpreterPreferencePage(OctaveNature.NATURE_ID);
				}
			}
		});
	}
	
	private OctaveConsole createConsoleInstance(IScriptInterpreter interpreter, String id) {
		if (interpreter == null) {
			try {
				id = "default";
				interpreter = new OctaveInterpreter();
				if( ScriptRuntime.getDefaultInterpreterInstall(new DefaultInterpreterEntry(
						OctaveNature.NATURE_ID,
						LocalEnvironment.ENVIRONMENT_ID)) == null ) {
					showQuestion();
					if( ScriptRuntime.getDefaultInterpreterInstall(new DefaultInterpreterEntry(
							OctaveNature.NATURE_ID,
							LocalEnvironment.ENVIRONMENT_ID)) == null ) {
						return null;
					}
				}
				OctaveConsoleUtil
						.runDefaultOctaveInterpreter((OctaveInterpreter) interpreter);
			} catch (Exception e) {
				return null;
			}
		}
		return makeConsole((OctaveInterpreter) interpreter, id);
	}

	public IScriptConsole openConsole(IScriptInterpreter interpreter, String id,
			ILaunch launch) {
		OctaveConsole octaveConsole = createConsoleInstance(interpreter, id);
		octaveConsole.setLaunch(launch);
		registerAndOpenConsole(octaveConsole);
		return octaveConsole;
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
