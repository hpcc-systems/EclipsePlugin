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
package org.seisint.eclide.internal.launching;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.internal.launching.AbstractInterpreterInstallType;
import org.eclipse.dltk.internal.launching.InterpreterMessages;
import org.eclipse.dltk.launching.EnvironmentVariable;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.LibraryLocation;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.launching.OctclipseLaunchingPlugin;

public class OctaveInterpreterInstallType extends AbstractInterpreterInstallType {

	protected String getBuildPathDelimeter() {
		return File.pathSeparator;
	}
	
	protected String[] buildCommandLine(IFileHandle installLocation,
			IFileHandle pathFile) {
		return new String[] { installLocation.getCanonicalPath(), /*"-q", "-f",*/ pathFile.getCanonicalPath() };
	}

	protected IPath createPathFile(IDeployment deployment) throws IOException {
		return deployment.add(OctclipseLaunchingPlugin.getDefault().getBundle(), "scriptsXXX/dltk_path.ecl");
	}

	protected IInterpreterInstall doCreateInterpreterInstall(String id) {
		return new OctaveInterpreterInstall(this, id);
	}

	protected ILog getLog() {
		return OctclipseLaunchingPlugin.getDefault().getLog();
	}

	protected String getPluginId() {
		return OctclipseLaunchingPlugin.PLUGIN_ID;
	}
	
	private static String[] possibleExes = { "eclcc"/*, "eclplus"*/ };

	protected String[] getPossibleInterpreterNames() {
		return possibleExes;
	}
	
	@Override
	public synchronized LibraryLocation[] getDefaultLibraryLocations(
			IFileHandle installLocation, EnvironmentVariable[] variables,
			IProgressMonitor monitor) {
		List<LibraryLocation> retVal = new ArrayList<LibraryLocation>();
		retVal.add(new LibraryLocation(installLocation.getParent().getFullPath().append("eclLibrary")));
		return retVal.toArray(new LibraryLocation[retVal.size()]);
	}

	public String getName() {
		return "ECL Install";
	}

	public String getNatureId() {
		return OctaveNature.NATURE_ID;
	}
	
	protected static Pattern regex = Pattern.compile("eclcc[\\.\\+\\-\\d]*(\\.bat|\\.exe)?");

	public IStatus validateInstallLocation(File installLocation) {
		
		if (!installLocation.exists() || !installLocation.isFile()
				|| installLocation.isHidden()) {
			return createStatus(IStatus.ERROR,
					InterpreterMessages.errNonExistentOrInvalidInstallLocation,
					null);
		}

		boolean matchFound = false;
		final String name = installLocation.getName();
		
		Matcher matcher = regex.matcher(name);
		if (matcher.matches())
		{
			if (Platform.OS_WIN32.equals(Platform.getOS())) {
				if (matcher.group(1) != null)
					matchFound = true;
			} else {
				if (matcher.group(1) == null)
					matchFound = true;
			}
		}

		if (matchFound) {
			return createStatus(IStatus.OK, "", null);
		} else {
			return createStatus(IStatus.ERROR,
					InterpreterMessages.errNoInterpreterExecutablesFound, null);
		}
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
package org.seisint.eclide.internal.launching;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.internal.launching.AbstractInterpreterInstallType;
import org.eclipse.dltk.internal.launching.InterpreterMessages;
import org.eclipse.dltk.launching.EnvironmentVariable;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.LibraryLocation;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.launching.OctclipseLaunchingPlugin;

public class OctaveInterpreterInstallType extends AbstractInterpreterInstallType {

	protected String getBuildPathDelimeter() {
		return File.pathSeparator;
	}
	
	protected String[] buildCommandLine(IFileHandle installLocation,
			IFileHandle pathFile) {
		return new String[] { installLocation.getCanonicalPath(), /*"-q", "-f",*/ pathFile.getCanonicalPath() };
	}

	protected IPath createPathFile(IDeployment deployment) throws IOException {
		return deployment.add(OctclipseLaunchingPlugin.getDefault().getBundle(), "scriptsXXX/dltk_path.ecl");
	}

	protected IInterpreterInstall doCreateInterpreterInstall(String id) {
		return new OctaveInterpreterInstall(this, id);
	}

	protected ILog getLog() {
		return OctclipseLaunchingPlugin.getDefault().getLog();
	}

	protected String getPluginId() {
		return OctclipseLaunchingPlugin.PLUGIN_ID;
	}
	
	private static String[] possibleExes = { "eclcc"/*, "eclplus"*/ };

	protected String[] getPossibleInterpreterNames() {
		return possibleExes;
	}
	
	@Override
	public synchronized LibraryLocation[] getDefaultLibraryLocations(
			IFileHandle installLocation, EnvironmentVariable[] variables,
			IProgressMonitor monitor) {
		List<LibraryLocation> retVal = new ArrayList<LibraryLocation>();
		retVal.add(new LibraryLocation(installLocation.getParent().getFullPath().append("eclLibrary")));
		return retVal.toArray(new LibraryLocation[retVal.size()]);
	}

	public String getName() {
		return "ECL Install";
	}

	public String getNatureId() {
		return OctaveNature.NATURE_ID;
	}
	
	protected static Pattern regex = Pattern.compile("eclcc[\\.\\+\\-\\d]*(\\.bat|\\.exe)?");

	public IStatus validateInstallLocation(File installLocation) {
		
		if (!installLocation.exists() || !installLocation.isFile()
				|| installLocation.isHidden()) {
			return createStatus(IStatus.ERROR,
					InterpreterMessages.errNonExistentOrInvalidInstallLocation,
					null);
		}

		boolean matchFound = false;
		final String name = installLocation.getName();
		
		Matcher matcher = regex.matcher(name);
		if (matcher.matches())
		{
			if (Platform.OS_WIN32.equals(Platform.getOS())) {
				if (matcher.group(1) != null)
					matchFound = true;
			} else {
				if (matcher.group(1) == null)
					matchFound = true;
			}
		}

		if (matchFound) {
			return createStatus(IStatus.OK, "", null);
		} else {
			return createStatus(IStatus.ERROR,
					InterpreterMessages.errNoInterpreterExecutablesFound, null);
		}
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
