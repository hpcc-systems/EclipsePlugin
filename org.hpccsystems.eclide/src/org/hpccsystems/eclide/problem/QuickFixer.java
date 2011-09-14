package org.hpccsystems.eclide.problem;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;

public class QuickFixer implements IMarkerResolutionGenerator {

	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
        try {
            Object problem = marker.getAttribute("WhatsUp");
            return new IMarkerResolution[] {
               new QuickFix("Fix #1 for "+problem),
               new QuickFix("Fix #2 for "+problem),
            };
         }
         catch (CoreException e) {
            return new IMarkerResolution[0];
         }
	}

}
