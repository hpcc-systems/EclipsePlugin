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
package org.hpccsystems.internal;

import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.progress.WorkbenchJob;

public abstract class ECLLaunchConfigurationTab extends AbstractLaunchConfigurationTab {
	private Job fRereshJob;	

	protected ConfigurationPreferenceStore store;
	class FieldEditorRef{
		Group parent;
		FieldEditor item;
		
		FieldEditorRef(Group parent, FieldEditor item) {
			this.parent = parent;
			this.item = item;
		}
	}
	protected HashMap<String, FieldEditorRef> fieldMap;

	public ECLLaunchConfigurationTab() {
		fieldMap = new HashMap<String, FieldEditorRef>();
	}

	private Job getUpdateJob() {
		if (fRereshJob == null) {
			fRereshJob = createUpdateJob();
			fRereshJob.setSystem(true);
		}
		return fRereshJob;
	}
	
	@Override
	protected void scheduleUpdateJob() {
		Job job = getUpdateJob();
		job.cancel(); // cancel existing job
		job.schedule(getUpdateJobDelay());
	}

	@Override
	protected Job createUpdateJob() {
		return  new WorkbenchJob(getControl().getDisplay(), "Update LCD") { //$NON-NLS-1$
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				if (!getControl().isDisposed()) {
					updateLaunchConfigurationDialog();
				}
				return Status.OK_STATUS;
			}
			@Override
			public boolean shouldRun() {
				return !getControl().isDisposed();
			}
		};
	}

	@Override
	protected long getUpdateJobDelay() {
		return 200;
	}
	
	protected void refreshEnabled(String id, boolean enabled) {
		FieldEditorRef ref = fieldMap.get(id);
		ref.item.setEnabled(enabled, ref.parent);
	}

	protected void addField(Group parent, FieldEditor field) {
		fieldMap.put(field.getPreferenceName(), new FieldEditorRef(parent, field));
		store.addField(field);
	}
}
