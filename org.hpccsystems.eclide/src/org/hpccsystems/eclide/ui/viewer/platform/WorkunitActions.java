/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.ui.viewer.platform;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.jface.action.Action;
import org.hpccsystems.eclide.resources.Messages;
import org.hpccsystems.internal.ui.tree.ItemView;

public class WorkunitActions {

	public interface IPlatformUI {
		Vector<ItemView> getSelection();
		void refresh();
	}

	IPlatformUI owner;

	//  Workunit Actions  ---
	public Action abortItemAction;
	public Action deleteItemAction;
	public Action resubmitItemAction;
	public Action restartItemAction;
	public Action cloneItemAction;
	public Action publishItemAction;
	public Action refreshItemAction;

	public WorkunitActions(IPlatformUI owner) {
		this.owner = owner;
		createActions();
	}

	public void setState() {
		abortItemAction.setEnabled(canPerform(ItemView.ACTION.ABORT));
		deleteItemAction.setEnabled(canPerform(ItemView.ACTION.DELETE));
		resubmitItemAction.setEnabled(canPerform(ItemView.ACTION.RESUBMIT));
		restartItemAction.setEnabled(canPerform(ItemView.ACTION.RESTART));
		cloneItemAction.setEnabled(canPerform(ItemView.ACTION.CLONE));
		publishItemAction.setEnabled(canPerform(ItemView.ACTION.PUBLISH));
		refreshItemAction.setEnabled(true);
	}

	public boolean canPerform(ItemView.ACTION action) {
		Iterator<ItemView> iter = owner.getSelection().iterator();
		while (iter.hasNext()) {
			ItemView iv = iter.next();
			if (iv.canPerform(action)) {
				return true;
			}
		}
		return false;
	}

	public void perform(ItemView.ACTION action) {
		Iterator<ItemView> iter = owner.getSelection().iterator();
		while (iter.hasNext()) {
			ItemView iv = iter.next();
			iv.perform(action);
		}
	}

	public void createActions() {
		abortItemAction = new Action(Messages.WorkunitActions_0) {
			@Override
			public void run() {
				perform(ItemView.ACTION.ABORT);
			}
		};

		deleteItemAction = new Action(Messages.WorkunitActions_1) {
			@Override
			public void run() {
				perform(ItemView.ACTION.DELETE);
			}
		};

		resubmitItemAction = new Action(Messages.WorkunitActions_2) {
			@Override
			public void run() {
				perform(ItemView.ACTION.RESUBMIT);
			}
		};

		restartItemAction = new Action(Messages.WorkunitActions_3) {
			@Override
			public void run() {
				perform(ItemView.ACTION.RESTART);
			}
		};

		cloneItemAction = new Action(Messages.WorkunitActions_4) {
			@Override
			public void run() {
				perform(ItemView.ACTION.CLONE);
			}
		};

		publishItemAction = new Action(Messages.WorkunitActions_5) {
			@Override
			public void run() {
				perform(ItemView.ACTION.PUBLISH);
			}
		};

		refreshItemAction = new Action(Messages.WorkunitActions_6) {
			@Override
			public void run() { 
				Vector<ItemView> sel = owner.getSelection();
				if (sel.size() == 0) {	//  No selection == reload
					owner.refresh();
				} else {
					Iterator<?> iter = sel.iterator();
					while (iter.hasNext()) {
						Object o = iter.next();
						if (o instanceof ItemView) {
							((ItemView)o).refresh();
						}
					}
				}
			}
		};
	}
}
