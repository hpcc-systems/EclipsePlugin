package org.hpccsystems.eclide.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree.ECLMetaNode;
import org.hpccsystems.eclide.editors.ECLEditor;
import org.hpccsystems.eclide.editors.ECLWindow;
import org.hpccsystems.internal.Eclipse;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class OpenDeclarationHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public OpenDeclarationHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IEditorPart editorWindow = window.getActivePage().getActiveEditor();
		if (editorWindow != null && (editorWindow instanceof ECLWindow)) {
			ECLEditor editor = ((ECLWindow) editorWindow).getEditor();
			ECLMetaNode def = editor.getDefinition();
			if (def != null) {
				if (def.isFolder()) {
				} else {
					IPath filePath = def.getPath();
					
					if (filePath != null) {
						IFile fileToBeOpened = Eclipse.findFile(filePath, editor.getProject());
						try {
							IEditorPart ep = IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), fileToBeOpened, true);
							((ECLWindow) ep).gotoLine(def.getLine());
						} catch (PartInitException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}
}
