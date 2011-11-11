package org.hpccsystems.eclide.ui.navigator;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.navigator.CommonNavigator;

public class ECLNavigator extends CommonNavigator {

	public ECLNavigator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IViewSite aSite, IMemento aMemento) throws PartInitException {
		super.init(aSite, aMemento);
		
	}

}
