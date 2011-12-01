package org.hpccsystems.eclide.ui.viewer.platform;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.ui.viewer.BrowserEx;
import org.hpccsystems.eclide.ui.viewer.TableEx;
import org.hpccsystems.eclide.ui.viewer.TextEx;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.data.Workunit;

public class WorkunitTabItem extends CTabItem implements TreeItemOwner{
	
	Workunit wu;
	WorkunitTreeItem item;
	
	SashForm sashFormMain;

	CTabFolder resultContainer;
	
	//SashForm sashFormResult;
	WorkunitViewer workunitViewer;
	
	CTabItem browserTab;
	private BrowserEx browser;
	CTabItem tableTab;
	private TableEx table;
	CTabItem textTab;
	private TextEx text;

	public WorkunitTabItem(CTabFolder parent, int style, int index, Workunit wu) {
		super(parent, style, index);
		this.wu = wu;
		
		item = new WorkunitTreeItem(this, null, wu);

		parent.setLayout(new FillLayout());
		sashFormMain = new SashForm(parent, SWT.HORIZONTAL);

		workunitViewer = new WorkunitViewer(this, wu);
		workunitViewer.createPartControl(sashFormMain);

		//sashFormResult = new SashForm(sashFormMain, SWT.VERTICAL);
		resultContainer = new CTabFolder(sashFormMain, SWT.TOP);

		browserTab = new CTabItem(resultContainer, SWT.NONE);
		browser = new BrowserEx(resultContainer);
		browserTab.setControl(browser);
		browserTab.setText("ECL Watch");
					
		tableTab = new CTabItem(resultContainer, SWT.NONE);
		table = new TableEx(resultContainer);
		tableTab.setControl(table);
		tableTab.setText("Result View");

		textTab = new CTabItem(resultContainer, SWT.NONE);
		text = new TextEx(resultContainer);
		textTab.setControl(text);
		textTab.setText("Query");

		setText(item.getText());
		setImage(item.getImage());

		sashFormMain.setWeights(new int[] {15, 85});
		//sashFormResult.setWeights(new int[] {100, 0});
		
	    setControl(sashFormMain);
	}

	@Override
	public void update(Object element, String[] properties) {
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				setText(item.getText());
				setImage(item.getImage());
			}
		});
	}

	@Override
	public void refresh(Object element) {
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
			}
		});
	}

	void navigateTo(String url, String user, String password) {
		browser.setUrl(url, user, password);
		resultContainer.setSelection(browserTab);
	}

	void setResult(Result result) {
		table.setResult(result);
		resultContainer.setSelection(tableTab);
	}

	void setQuery(String query) {
		text.setText(query);
		//table.setResult(result);
		resultContainer.setSelection(textTab);
	}
}

