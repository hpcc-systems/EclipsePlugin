/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

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
