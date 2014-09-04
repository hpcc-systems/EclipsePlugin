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
package org.hpccsystems.eclide.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.hpccsystems.eclide.resources.Messages;
import org.hpccsystems.internal.CmdArgs;
import org.hpccsystems.internal.CmdProcess;
import org.hpccsystems.internal.EclCCErrorParser;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.OS;
import org.hpccsystems.internal.data.ClientTools;

public class PluginCompiler extends ECLCompiler {
	final static String badConfiguration = Messages.Error_Plugin_Config;
	final static String noCompiler = Messages.Error_Plugin_Not_Found;
	
	final static String PREPROCESS_CREATE = "Create";
	final static String PREPROCESS_SYNTAXCHECK = "SyntaxCheck";
	final static String PREPROCESS_CALCINCLUDES = "CalcIncludes";
	final static String PREPROCESS_SAVE = "Save";
	final static String PREPROCESS_COMMIT = "Commit";
	final static String PREPROCESS_SUBMIT = "Submit";
	
	class PluginHandler extends SyntaxHandler {
		EclCCErrorParser errorParser;
		IFile file;
		Vector<IFile> includedIFiles;
		Map<File, String> includedFiles;
		String includeExt; 

		public PluginHandler(IFile file, String includeExt) {
			super();
			this.file = file;
			this.includeExt = includeExt;
			includedIFiles = new Vector<IFile>();
			includedFiles = new HashMap<File, String>();
		}

		@Override
		public void ProcessOut(BufferedReader reader) {
			String line = null;
			try {
				File currFile = null;
				while ((line = reader.readLine()) != null) {
					if (line.startsWith("//IMPORT:")) {
						line = line.substring(9);
						line = line.replace(".", OS.getPathSep());
						line = line + "." + this.includeExt;
						IFile includedFile = Eclipse.findFile(file.getProject(), line);
						if (includedFile != null) {
							includedIFiles.add(includedFile);
							File rawFile = new File(includedFile.getLocation().toOSString());
							includedFiles.put(rawFile, new String());
							currFile = rawFile;
						}
					} else if (currFile != null) {
						String currContent = includedFiles.get(currFile);
						if (currContent.length() > 0) {
							currContent += "\n";
						}
						currContent += line;
						includedFiles.put(currFile, currContent);
					}
					resultsConsoleWriter.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void ProcessErr(BufferedReader errReader) {
			super.ProcessErr(errReader);
		}
	}

	String type;
	File scriptFile;
	IPath scriptFolder;

	public PluginCompiler(IPath rootPath, String ext) {
		super(rootPath);
		type = ext;
		locate();
	}
	
	private void locate()
	{
		IPath pluginPath = binFolder.removeLastSegments(2);
		File fileFinder = pluginPath.toFile();
		File[] matchingFiles = fileFinder.listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.equalsIgnoreCase(type);
		    }
		});		
		if (matchingFiles.length> 0) {
			scriptFolder = new Path(matchingFiles[0].getPath());
			matchingFiles = matchingFiles[0].listFiles(new FilenameFilter() {
			    public boolean accept(File dir, String name) {
			        return name.equalsIgnoreCase(type + OS.getScriptExt());
			    }
			});		
			if (matchingFiles.length> 0) {
				scriptFile = matchingFiles[0];
			}
		}
	}
	
	String removeExtension(final String s)
	{
	    return s != null && s.lastIndexOf(".") > 0 ? s.substring(0, s.lastIndexOf(".")) : s;
	}
	
	String[] getModAttr(IFile file) {
		String[] retVal = new String[2];
		try {
			retVal[1] = removeExtension(file.getName());
			retVal[0] = file.getFullPath().removeFirstSegments(1).removeLastSegments(1).toOSString();
		} catch(Exception e) {
			retVal[0] = "";
			retVal[1] = "";
		}
		return retVal;
	}
	
	boolean checkPlugin(IFile file) {
		if (scriptFile == null) {
			Eclipse.addMarker(file, IMarker.SEVERITY_ERROR, badConfigurationCode, badConfiguration + " (" + type + ")", 0, 0, true);
			eclccConsoleWriter.println(noCompiler + " " + type + ".");
			return false;
		}
		return true;
	}
	
	void callPlugin(IFile file, String action, BasicHandler handler) {
		String[] modAttrLabel = getModAttr(file);

		try {
			File outFile = File.createTempFile("outFile", ".tmp");
			outFile.deleteOnExit();
			File errFile = File.createTempFile("errFile", ".tmp");
			errFile.deleteOnExit();

			try {
				String args = action + " \"" + modAttrLabel[0] + "\" \"" + modAttrLabel[1] + "\" " + file.getLocation().toOSString() + " " + outFile.getAbsolutePath() + " " + errFile.getAbsolutePath();
				CmdArgs cmdArgs = new CmdArgs(scriptFile.getPath(), args, "");
	
				CmdProcess process = new CmdProcess(scriptFolder, new Path(""), handler, eclccConsoleWriter);
				process.exec(cmdArgs, null, false);
				
				BufferedReader errReader = new BufferedReader( new FileReader(errFile));
				handler.ProcessErr(errReader);
				BufferedReader outReader = new BufferedReader( new FileReader(outFile));
				handler.ProcessOut(outReader);
			} finally {
				errFile.delete();
				outFile.delete();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void checkSyntax(IFile file) {
		Eclipse.deleteMarkers(file);
		if (!checkPlugin(file)) {
			return;		
		}
		callPlugin(file, PREPROCESS_SYNTAXCHECK, new SyntaxHandler());
	}

	public void saveFile(IFile file) {
		if (!checkPlugin(file)) {
			return;		
		}
		eclccConsole = Eclipse.findConsole("eclcc"); //$NON-NLS-1$
		eclccConsoleWriter = eclccConsole.newMessageStream();
	
		PluginHandler includeHandler = new PluginHandler(file, file.getFileExtension());
		callPlugin(file, PREPROCESS_CALCINCLUDES, includeHandler);
		eclccConsoleWriter.print("---PREPROCESS_CALCINCLUDES---");
		for (IFile includedFile : includeHandler.includedIFiles) {
			ClientTools ct = ClientTools.get();
			ECLCompiler compiler = ct.getCompiler(includedFile);
			if (compiler instanceof PluginCompiler) {
				PluginCompiler pCompiler = (PluginCompiler)compiler;
				pCompiler.saveFile(includedFile);
			}
		}
		
		PluginHandler saveHandler = new PluginHandler(file, "ecl");
		callPlugin(file, PREPROCESS_SAVE, saveHandler);
		eclccConsoleWriter.print("---PREPROCESS_SAVE---");
		for (File f : saveHandler.includedFiles.keySet()) {
			String content =saveHandler.includedFiles.get(f); 
			try {
				Eclipse.writeFile(f, content);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
