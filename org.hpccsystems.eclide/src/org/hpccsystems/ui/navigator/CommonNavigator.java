package org.hpccsystems.ui.navigator;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;

public class CommonNavigator extends org.eclipse.ui.navigator.CommonNavigator {

	public CommonNavigator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IViewSite aSite, IMemento aMemento)
			throws PartInitException {
		super.init(aSite, aMemento);
		
	}

}
