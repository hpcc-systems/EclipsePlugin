package org.seisint.eclide.internal.parser;


import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.compiler.task.TodoTaskPreferencesOnPreferenceLookupDelegate;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.builder.AbstractTodoTaskBuildParticipantType;
import org.seisint.eclide.core.OctclipsePlugin;

public class OctaveTodoParserType extends AbstractTodoTaskBuildParticipantType {

	protected ITodoTaskPreferences getPreferences(IScriptProject project) {
		return new TodoTaskPreferencesOnPreferenceLookupDelegate(OctclipsePlugin.PLUGIN_ID, project);
	}
	
}
