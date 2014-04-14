package org.hpccsystems.eclide.ui.viewer.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import org.hpccsystems.eclide.resources.Messages;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;

public class ResultFolderView extends FolderItemView implements Observer {
	Workunit workunit;

	ResultFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Workunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		workunit = wu;
		workunit.addObserver(this);
	}

	@Override
	public String getText() {
		return Messages.ResultFolderView_0;
	}

	@Override
	public URL getWebPageURL(boolean hasNewEclWatch) throws MalformedURLException {
		if (hasNewEclWatch) {
			return platform.getWidgetURL("ResultsWidget", "TabPosition=top&Wuid=" + workunit.getWuid()); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return platform.getURL("esp/files", "ECLPlaygroundResults.htm", "Wuid=" + workunit.getWuid()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Result r : workunit.getResults()) {
			retVal.add(new ResultView(treeViewer, this, platform, r));
		}
		children.set(retVal.toArray(new ItemView[0]));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof Workunit.Notification) {
			switch ((Workunit.Notification)arg1){
			case RESULTS:
				refresh();
			}
		}
	}
}