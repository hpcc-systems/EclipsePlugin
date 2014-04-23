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
package org.hpccsystems.eclide.editors;

import org.eclipse.jface.action.Action;
import org.hpccsystems.eclide.editors.ECLWindow;
import org.hpccsystems.eclide.resources.Messages;

public class ECLWindowActions {
	ECLWindow owner;

	public Action close;
	public Action closeOthers;
	public Action closeAll;

	public ECLWindowActions(ECLWindow owner) {
		this.owner = owner;
		createActions();
	}

	public void setState() {
		close.setEnabled(canPerform(ECLWindow.ACTION.CLOSE));
		closeOthers.setEnabled(canPerform(ECLWindow.ACTION.CLOSEOTHERS));
		closeAll.setEnabled(canPerform(ECLWindow.ACTION.CLOSEALL));
	}

	public boolean canPerform(ECLWindow.ACTION action) {
		return owner.canPerform(action);
	}

	public void perform(ECLWindow.ACTION action) {
		owner.perform(action);
	}

	public void createActions() {
		close = new Action(Messages.ECLWindowActions_0) {
			@Override
			public void run() {
				perform(ECLWindow.ACTION.CLOSE);
			}
		};

		closeOthers = new Action(Messages.ECLWindowActions_1) {
			@Override
			public void run() {
				perform(ECLWindow.ACTION.CLOSEOTHERS);
			}
		};

		closeAll = new Action(Messages.ECLWindowActions_2) {
			@Override
			public void run() {
				perform(ECLWindow.ACTION.CLOSEALL);
			}
		};
	}
}
