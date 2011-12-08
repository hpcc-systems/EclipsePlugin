package org.hpccsystems.eclide.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.Document;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;

//  TODO:  There must be an easier way to get an IFile to the HoverText callback. 
public class ECLDocument extends Document {

	FileEditorInput editorInput;
	
	public void setEditorInput(IEditorInput editorInput) {
		if (editorInput instanceof FileEditorInput)
			this.editorInput = (FileEditorInput)editorInput;
	}
	
	IFile getFile() {
		return editorInput.getFile();
	}

}
