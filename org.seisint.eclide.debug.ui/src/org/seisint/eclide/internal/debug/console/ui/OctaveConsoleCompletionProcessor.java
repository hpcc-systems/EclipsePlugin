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
package org.seisint.eclide.internal.debug.console.ui;

import java.io.IOException;
import java.util.List;

import org.eclipse.dltk.console.IScriptConsoleShell;
import org.eclipse.dltk.console.ScriptConsoleCompletionProposal;
import org.eclipse.dltk.console.ui.IScriptConsoleViewer;
import org.eclipse.dltk.console.ui.ScriptConsoleCompletionProcessor;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationPresenter;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

public class OctaveConsoleCompletionProcessor extends ScriptConsoleCompletionProcessor {

	public OctaveConsoleCompletionProcessor(IScriptConsoleShell interpreterShell) {
		super(interpreterShell);
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { };
	}
	
	protected IProposalDecorator octaveDecorator = new IProposalDecorator() {
		public String formatProposal(ScriptConsoleCompletionProposal c) {
			return c.getDisplay();
		}

		public Image getImage(ScriptConsoleCompletionProposal c) {
			String type = c.getType();
			if ("var".equals(type)){
				return DLTKPluginImages
					.get(DLTKPluginImages.IMG_OBJS_FIELD); 
			} else if ("proc".equals(type)) {
				return DLTKPluginImages
					.get(DLTKPluginImages.IMG_METHOD_PUBLIC);
			} 
			return null; 
		}
	};
	
	protected ICompletionProposal[] computeCompletionProposalsImpl(
			IScriptConsoleViewer viewer, int offset) {
		String commandLine = viewer.getCommandLine();
		try {
		int cursorPosition = offset - viewer.getCommandLineOffset();
		List list = getInterpreterShell().getCompletions(commandLine,
				cursorPosition);
		List proposals = createProposalsFromString(list, offset, octaveDecorator);
		return (ICompletionProposal[]) proposals
				.toArray(new ICompletionProposal[proposals.size()]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ICompletionProposal[] {};
	}

	protected IContextInformation[] computeContextInformationImpl(
			ITextViewer viewer, int offset) {
		return null;
	}
	
	protected static class Validator implements IContextInformationValidator,
	IContextInformationPresenter {
		protected int installOffset;
		public boolean isContextInformationValid(int offset) {
			return Math.abs(installOffset - offset) < 5;
		}		
		public void install(IContextInformation info, ITextViewer viewer,
				int offset) {
			installOffset = offset;
		}		
		public boolean updatePresentation(int documentPosition,
				TextPresentation presentation) {
			return false;
		}
	}
	
	private IContextInformationValidator validator;
	public IContextInformationValidator getContextInformationValidator() {
		if (validator == null) {
			validator = new Validator();
		}
		return validator;
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
package org.seisint.eclide.internal.debug.console.ui;

import java.io.IOException;
import java.util.List;

import org.eclipse.dltk.console.IScriptConsoleShell;
import org.eclipse.dltk.console.ScriptConsoleCompletionProposal;
import org.eclipse.dltk.console.ui.IScriptConsoleViewer;
import org.eclipse.dltk.console.ui.ScriptConsoleCompletionProcessor;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationPresenter;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

public class OctaveConsoleCompletionProcessor extends ScriptConsoleCompletionProcessor {

	public OctaveConsoleCompletionProcessor(IScriptConsoleShell interpreterShell) {
		super(interpreterShell);
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { };
	}
	
	protected IProposalDecorator octaveDecorator = new IProposalDecorator() {
		public String formatProposal(ScriptConsoleCompletionProposal c) {
			return c.getDisplay();
		}

		public Image getImage(ScriptConsoleCompletionProposal c) {
			String type = c.getType();
			if ("var".equals(type)){
				return DLTKPluginImages
					.get(DLTKPluginImages.IMG_OBJS_FIELD); 
			} else if ("proc".equals(type)) {
				return DLTKPluginImages
					.get(DLTKPluginImages.IMG_METHOD_PUBLIC);
			} 
			return null; 
		}
	};
	
	protected ICompletionProposal[] computeCompletionProposalsImpl(
			IScriptConsoleViewer viewer, int offset) {
		String commandLine = viewer.getCommandLine();
		try {
		int cursorPosition = offset - viewer.getCommandLineOffset();
		List list = getInterpreterShell().getCompletions(commandLine,
				cursorPosition);
		List proposals = createProposalsFromString(list, offset, octaveDecorator);
		return (ICompletionProposal[]) proposals
				.toArray(new ICompletionProposal[proposals.size()]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ICompletionProposal[] {};
	}

	protected IContextInformation[] computeContextInformationImpl(
			ITextViewer viewer, int offset) {
		return null;
	}
	
	protected static class Validator implements IContextInformationValidator,
	IContextInformationPresenter {
		protected int installOffset;
		public boolean isContextInformationValid(int offset) {
			return Math.abs(installOffset - offset) < 5;
		}		
		public void install(IContextInformation info, ITextViewer viewer,
				int offset) {
			installOffset = offset;
		}		
		public boolean updatePresentation(int documentPosition,
				TextPresentation presentation) {
			return false;
		}
	}
	
	private IContextInformationValidator validator;
	public IContextInformationValidator getContextInformationValidator() {
		if (validator == null) {
			validator = new Validator();
		}
		return validator;
	}


}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
