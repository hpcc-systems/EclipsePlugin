<<<<<<< HEAD
/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.core;


import org.eclipse.dltk.core.ISearchPatternProcessor;
import org.eclipse.dltk.core.search.AbstractSearchFactory;
import org.eclipse.dltk.core.search.DLTKSearchParticipant;
import org.eclipse.dltk.core.search.IMatchLocatorParser;
import org.eclipse.dltk.core.search.matching.MatchLocator;
import org.seisint.eclide.core.OctaveMatchLocatorParser;
import org.seisint.eclide.internal.search.OctaveSearchParticipant;
import org.seisint.eclide.internal.search.OctaveSearchPatternProcessor;

public class OctaveSearchFactory extends AbstractSearchFactory {
	
	public DLTKSearchParticipant createSearchParticipant() {
		return new OctaveSearchParticipant();
	}

	public ISearchPatternProcessor createSearchPatternProcessor() {
		return new OctaveSearchPatternProcessor();
	}

	public IMatchLocatorParser createMatchParser(MatchLocator locator) {
		return new OctaveMatchLocatorParser(locator);
	}

}
=======
/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.core;


import org.eclipse.dltk.core.ISearchPatternProcessor;
import org.eclipse.dltk.core.search.AbstractSearchFactory;
import org.eclipse.dltk.core.search.DLTKSearchParticipant;
import org.eclipse.dltk.core.search.IMatchLocatorParser;
import org.eclipse.dltk.core.search.matching.MatchLocator;
import org.seisint.eclide.core.OctaveMatchLocatorParser;
import org.seisint.eclide.internal.search.OctaveSearchParticipant;
import org.seisint.eclide.internal.search.OctaveSearchPatternProcessor;

public class OctaveSearchFactory extends AbstractSearchFactory {
	
	public DLTKSearchParticipant createSearchParticipant() {
		return new OctaveSearchParticipant();
	}

	public ISearchPatternProcessor createSearchPatternProcessor() {
		return new OctaveSearchPatternProcessor();
	}

	public IMatchLocatorParser createMatchParser(MatchLocator locator) {
		return new OctaveMatchLocatorParser(locator);
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
