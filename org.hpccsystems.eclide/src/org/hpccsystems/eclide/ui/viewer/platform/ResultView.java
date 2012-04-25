package org.hpccsystems.eclide.ui.viewer.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.ui.tree.ItemView;

public class ResultView extends PlatformBaseView implements Observer {
	Result result;

	ResultView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, Result result) {
		super(treeViewer, parent, platform);
		this.result = result; 
		this.result.addObserver(this);
		refreshChildren();
	}

	@Override
	public String getText() {
		if (!result.getValue().isEmpty())
			return result.getName() + " " + result.getValue();
		return result.getName();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/result.png"); 
	}

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUResult", "Wuid=" + result.getWuid() + "&Sequence=" + result.getSequence());
	}
	
	@Override
	public Result getResult() {
		return result;
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(String s : result.getResultViews())
			retVal.add(new ResultViewView(treeViewer, this, platform, result, s));
		children.set(retVal.toArray(new ItemView[0]));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		update(null);
	}
}