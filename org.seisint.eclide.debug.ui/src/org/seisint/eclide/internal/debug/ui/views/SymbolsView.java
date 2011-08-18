/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.debug.ui.views;

import java.text.Collator;


import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.runtime.symbols.ISymbolList;
import org.seisint.eclide.runtime.symbols.ISymbolListener;
import org.seisint.eclide.runtime.symbols.OctaveSymbolList;
import org.seisint.eclide.runtime.symbols.Symbol;

public class SymbolsView extends ViewPart {
	private static final String SIZE = "Size";
	private static final String DIM = "Dim";
	private static final String NAME = "Name";
	private static final String TYPE = "Type";
	private TableViewer viewer;
	
	class ViewContentProvider implements IStructuredContentProvider, ISymbolListener {
		Viewer viewer;
		Object currentInput;
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			viewer = v;
			currentInput = newInput;
			if (oldInput != null)
				((ISymbolList)oldInput).removeChangeListener(this);
			if (newInput != null)
				((ISymbolList)newInput).addChangeListener(this);
		}
		public void dispose() {
			if (currentInput != null)
				((ISymbolList)currentInput).removeChangeListener(this);
		}
		public Object[] getElements(Object parent) {
			Object[] x = ((OctaveSymbolList)currentInput).getSymbols(Symbol.USER_VARIABLE).toArray();
			return x;
		}
		public void update() {
			viewer.getControl().getDisplay().asyncExec(new Runnable() {
				public void run() {
					viewer.refresh();	
				}	
			});
		}
	}
	
	class ViewCellLabelProvider extends CellLabelProvider {
		public String getToolTipText(Object element) {
			if (element instanceof Symbol)
			{
				Symbol s = (Symbol)element;
				return s.getValue();
			}
			return new String();
		}
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof Symbol)
			{
				if (cell.getElement() instanceof Symbol) {
					Symbol s = (Symbol)cell.getElement();
					switch (cell.getColumnIndex()) {
					case 3:
						cell.setText(Long.toString(s.getSize()));
						break;
					case 2:
						cell.setText(s.getDims());
						break;
					case 1:
						cell.setText(s.getTypeName());
						break;
					case 0:
					default:
						cell.setText(s.getName());
						break;
					}
				}
			}
		}
	}
	
	class NameSorter extends ViewerSorter {
		public int compare(Viewer viewer, Object e1, Object e2) {
			if ((e1 instanceof Symbol) && (e2 instanceof Symbol)) {
				return Collator.getInstance().compare(((Symbol)e1).getName(),((Symbol)e2).getName());
			} else {
				return 0;
			}
		}
	}

	/**
	 * The constructor.
	 */
	public SymbolsView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		TableLayout layout1 = new TableLayout();
		viewer.getTable().setLayout(layout1);
		ColumnLayoutData data = new ColumnWeightData(25);
		layout1.addColumnData(data);
		layout1.addColumnData(data);
		layout1.addColumnData(data);
		layout1.addColumnData(data);
		ColumnViewerToolTipSupport.enableFor(viewer);
		TableViewerColumn tableViewerColumn = new TableViewerColumn(viewer, SWT.NONE);
		tableViewerColumn.getColumn().setText(NAME);
		tableViewerColumn.getColumn().setResizable(data.resizable);		
		tableViewerColumn.setLabelProvider(new ViewCellLabelProvider());
		TableViewerColumn tableViewerColumn1 = new TableViewerColumn(viewer, SWT.NONE);
		tableViewerColumn1.getColumn().setText(TYPE);
		tableViewerColumn1.getColumn().setResizable(data.resizable);
		tableViewerColumn1.setLabelProvider(new ViewCellLabelProvider());
		TableViewerColumn tableViewerColumn2 = new TableViewerColumn(viewer, SWT.NONE);
		tableViewerColumn2.getColumn().setText(DIM);
		tableViewerColumn2.getColumn().setResizable(data.resizable);
		tableViewerColumn2.setLabelProvider(new ViewCellLabelProvider());
		TableViewerColumn tableViewerColumn3 = new TableViewerColumn(viewer, SWT.NONE);
		tableViewerColumn3.getColumn().setText(SIZE);
		tableViewerColumn3.getColumn().setResizable(data.resizable);
		tableViewerColumn3.setLabelProvider(new ViewCellLabelProvider());;
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setCellModifier(new ICellModifier() {
			public boolean canModify(Object element, String property) {
				return false;
			}
			public Object getValue(Object element, String property) {
				if (NAME.equals(property)) {
					return ((Symbol)element).getName();
				} else if (TYPE.equals(property)) {
					return ((Symbol)element).getTypeName();
				} else if (DIM.equals(property)) {
					return ((Symbol)element).getDims();
				} else if (SIZE.equals(property)) {
					return Integer.toString((int)((Symbol)element).getSize());
				}
				return null;
			} 
			public void modify(Object element, String property, Object value) {
			};		
		});
		viewer.setColumnProperties(new String[] { NAME,
				TYPE,
				DIM,
				SIZE});
		viewer.getTable().setSortColumn(tableViewerColumn.getColumn());
		viewer.getTable().setSortDirection(SWT.DOWN);
		viewer.setSorter(new NameSorter());
		viewer.setInput(OctclipsePlugin.getSymbolList());
		/* */
		makeActions();
		contributeToActionBars();
	}

	private void makeActions() {
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
	}
	
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}