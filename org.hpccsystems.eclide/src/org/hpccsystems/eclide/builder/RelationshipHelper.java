package org.hpccsystems.eclide.builder;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;

public class RelationshipHelper{
	static final public String ID = new String("org.hpccsystems.eclide.builderRelationshipHelper");
	static final public QualifiedName DEPENDEE_PROP = new QualifiedName(ID, "dependees");
	static final public QualifiedName  DEPENDENT_PROP = new QualifiedName(ID, "org.hpccsystems.eclide.builderRelationshipHelper.dependent");

	class FileBucket {
		IProject project;
		public Set<IFile> files;
	
		FileBucket(IProject project) {
			this.project = project;
			this.files = new HashSet<IFile>();
		}
		
		void Load(String files) {
			if (files == null)
				return;
			
			String[] partialPaths = files.split(";");
			for(int i = 0; i < partialPaths.length; ++i) {
				IFile file = (IFile)project.findMember(partialPaths[i]);
				if (file != null) 
					this.files.add(file);
			}
		}
		
		String Save() {
			StringBuilder retVal = new StringBuilder();
			for(Iterator<IFile> itr = files.iterator(); itr.hasNext();) {
				IFile file = itr.next();
				if (retVal.length() > 0)
					retVal.append(";");
				retVal.append(file.getProjectRelativePath().toOSString());
			}
			return retVal.toString();
		}
	}
	
	protected IFile file;
	public FileBucket dependees;
	public FileBucket dependents;
	
	
	RelationshipHelper(IFile file) {
		this.file = file;
		dependees = new FileBucket(file.getProject());
		dependents = new FileBucket(file.getProject());
		
		if (file == null)
			return;
		
		try {
			dependees.Load(file.getPersistentProperty(DEPENDEE_PROP));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dependents.Load(file.getPersistentProperty(DEPENDENT_PROP));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void ClearDependants() {
		for(Iterator<IFile> itr = dependents.files.iterator(); itr.hasNext();) {
			IFile file = itr.next();
		}
	}
	
	void SetDepandants(List<IFile> dependants) {
	}
}
