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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.ui.progress.WorkbenchJob;

public abstract class ECLLaunchConfigurationTab extends AbstractLaunchConfigurationTab {
	private Job fRereshJob;	

	private Job getUpdateJob() {
		if (fRereshJob == null) {
			fRereshJob = createUpdateJob();
			fRereshJob.setSystem(true);
		}
		return fRereshJob;
	}
	
	protected void scheduleUpdateJob() {
		Job job = getUpdateJob();
		job.cancel(); // cancel existing job
		job.schedule(getUpdateJobDelay());
	}
	
	protected Job createUpdateJob() {
		return  new WorkbenchJob(getControl().getDisplay(), "Update LCD") { //$NON-NLS-1$
			public IStatus runInUIThread(IProgressMonitor monitor) {
				if (!getControl().isDisposed()) {
					updateLaunchConfigurationDialog();
				}
				return Status.OK_STATUS;
			}
			public boolean shouldRun() {
				return !getControl().isDisposed();
			}
		};
	}
	
	protected long getUpdateJobDelay() {
		return 200;
	}	
}
