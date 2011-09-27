package org.hpccsystems.eclide.builder;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;

public class RelationshipHelper{
	static final public String ID = new String("org.hpccsystems.eclide.builderRelationshipHelper");
	static final public QualifiedName ANCESTOR_PROP = new QualifiedName(ID, "ancestors");
	static final public QualifiedName  DESCENDANT_PROP = new QualifiedName(ID, "descendants");

	class FileBucket {
		IProject project;
		public Set<IFile> files;
	
		FileBucket(IProject project) {
			this.project = project;
			this.files = new HashSet<IFile>();
		}
		
		void load(String files) {
			if (files == null)
				return;
			
			String[] partialPaths = files.split(";");
			for(int i = 0; i < partialPaths.length; ++i) {
				IResource resource = project.findMember(partialPaths[i]);
				if (resource instanceof IFile && resource.getName().endsWith(".ecl")) {
					IFile file = (IFile) resource;
					if (file != null) 
						this.files.add(file);
				}
			}
		}
		
		String save() {
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
	protected FileBucket ancestors;
	protected FileBucket descendants;
	private boolean closeCalled = false;
	
	RelationshipHelper(IFile file) {
		assert(file.exists());
		this.file = file;
		ancestors = new FileBucket(file.getProject());
		descendants = new FileBucket(file.getProject());
		try {
			ancestors.load(file.getPersistentProperty(ANCESTOR_PROP));
		} catch (CoreException e) {
			e.printStackTrace();
		}
		try {
			descendants.load(file.getPersistentProperty(DESCENDANT_PROP));
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		assert(closeCalled  == true);
		super.finalize();
	}

	void close() {
		closeCalled = true;
		try {
			file.setPersistentProperty(ANCESTOR_PROP, ancestors.save());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		try {
			file.setPersistentProperty(DESCENDANT_PROP, descendants.save());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	boolean addDescendantNoPropigate(IFile decendant) {
		return descendants.files.add(decendant);
	}
	
	boolean removeDescendantNoPropigate(IFile decendant) {
		return descendants.files.remove(decendant);
	}

	void clearAncestors() {
		Iterator<IFile> itr = ancestors.files.iterator(); 
		while (itr.hasNext()) {
			IFile ancestor = itr.next();
			RelationshipHelper rhelper = new RelationshipHelper(ancestor);
			try {
				rhelper.removeDescendantNoPropigate(file);
			} finally {
				rhelper.close();
			}
		}
	}
	
	void setAncestors(Set<IFile> ancestors2) {
		clearAncestors();
		Iterator<IFile> itr = ancestors2.iterator(); 
		while (itr.hasNext()) {
			IFile ancestor = itr.next();
			if (!ancestor.equals(file)) {
				RelationshipHelper rhelper = new RelationshipHelper(ancestor);
				try {
					rhelper.addDescendantNoPropigate(file);
				} finally {
					rhelper.close();
				}
				ancestors.files.add(ancestor);
			}
		}
	}

	public Set<IFile> getDescendants() {
		return descendants.files;
	}
}
