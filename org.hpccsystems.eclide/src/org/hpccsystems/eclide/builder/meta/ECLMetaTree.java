package org.hpccsystems.eclide.builder.meta;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Observable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.hpccsystems.internal.Eclipse;
import org.xml.sax.helpers.AttributesImpl;

public class ECLMetaTree implements Serializable {
	private static final long serialVersionUID = -9173602976413200055L;
	private ECLMetaNode root;

	public ECLMetaTree() {
		root = new ECLMetaNode("");
	}

	public ECLMetaNode getRoot() {
		return root;
	}

	public ECLMetaNode getNode(String qualifiedName) {
		String[] segments = qualifiedName.split("\\.");
		ECLMetaNode node = root;
		for (int i = 0; i < segments.length; ++i) {
			node = node.getChild(segments[i]);
			if (node == null) {
				break;
			}
		}
		return node;
	}

	public ECLMetaNode createNode(String qualifiedName, ECLDefinition data) {
		qualifiedName = qualifiedName.toLowerCase();
		String[] segments = qualifiedName.split("\\.");
		ECLMetaNode parentNode = root;
		for (int i = 0; i < segments.length - 1; ++i) {
			parentNode = parentNode.getChild(segments[i]);
			if (parentNode == null) {
				break;
			}
		}
		if (parentNode != null) {
			return parentNode.addChild(segments[segments.length - 1], data);
		}
		return null;
	}

	public ECLMetaNode createNode(String sourceQualifiedName, ECLSource source) {
		sourceQualifiedName = sourceQualifiedName.toLowerCase();
		IPath sourcePath = source.getPath();
		String[] segments = sourceQualifiedName.split("\\.");
		String qualifiedName = "";
		ECLMetaNode parentNode = root;
		for (int i = 0; i < segments.length; ++i) {
			boolean isFolder = (i < segments.length - 1);
			if (!qualifiedName.isEmpty()) {
				qualifiedName += ".";
			}
			qualifiedName += segments[i];
			if (parentNode.hasChild(segments[i])) {
				parentNode = parentNode.getChild(segments[i]);
				if (!isFolder) {
					parentNode.setData(source);
				}
			} else {
				if (isFolder) {
					parentNode = parentNode.addChild(segments[i], new ECLFolder(qualifiedName, sourcePath.removeLastSegments(segments.length - 1 - i)));
				} else {
					parentNode = parentNode.addChild(segments[i], source);
				}
			}
			if (!isFolder) {
				return parentNode;
			}
		}
		return null;
	}

	interface IVisitor {
		ECLMetaNode processNode(ECLMetaNode node);
	}

	ECLMetaNode walkTree(ECLMetaNode node, IVisitor visitor) {
		ECLMetaNode retVal = visitor.processNode(node);
		if (retVal != null) {
			return retVal;
		}

		for (ECLMetaNode n : node.getChildren()) {
			retVal = walkTree(n, visitor);
			if (retVal != null) {
				return retVal;
			}
		}
		return null;
	}

	ECLMetaNode depthFirst(ECLMetaNode node, IVisitor visitor) {
		for (ECLMetaNode n : node.getChildren()) {
			ECLMetaNode retVal = walkTree(n, visitor);
			if (retVal != null) {
				return retVal;
			}
		}
		return visitor.processNode(node);
	}

	public ECLMetaNode getSource(IFile file) {
		if (file == null)
			return null;
		return getSource(file.getLocation());
	}
	
	public ECLMetaNode getSource(final IPath path) {
		if (path == null)
			return null;
		ECLMetaNode found = depthFirst(root, new IVisitor() {
			@Override
			public ECLMetaNode processNode(ECLMetaNode node) {
				if (node.getData() instanceof ECLSource) {
					if (((ECLSource) node.getData()).getPath().equals(path)) {
						return node;
					}
				}
				return null;
			}
		});

		if (found == null) {
			// No meta info from compiler, use project structure.
			IResource resource = Eclipse.findFile(path);
			if (resource != null) {
				IPath relPath = resource.getProjectRelativePath();
				relPath = relPath.removeFileExtension();
				String qualifiedName = "";
				for (int i = 0; i < relPath.segmentCount(); ++i) {
					if (!qualifiedName.isEmpty()) {
						qualifiedName += ".";
					}
					qualifiedName += relPath.segment(i);
				}
				AttributesImpl attributes = new AttributesImpl();
				attributes.addAttribute("", "sourcePath", "sourcePath", "string", path.toOSString());
				attributes.addAttribute("", "name", "name", "string", qualifiedName);
				found = createNode(qualifiedName, new ECLSource(attributes));
			}
		}
		return found;
	}

	// Node ---
	public class ECLMetaNode extends Observable implements Serializable {
		private static final long serialVersionUID = -1247780682673907433L;

		private String name;
		private ECLMetaNode parent;
		private ECLDefinition data;
		private HashMap<String, ECLMetaNode> children;

		public ECLMetaNode(String name) {
			this(null, name, null);
		}

		public ECLMetaNode(ECLMetaNode parent, String name, ECLDefinition data) {
			this.parent = parent;
			this.name = name.toLowerCase();
			this.data = data;
			children = new HashMap<String, ECLMetaNode>();
			setChanged();
		}

		public ECLMetaNode addChild(String name, ECLDefinition data) {
			name = name.toLowerCase();
			if (children.containsKey(name)) {
				children.get(name).setData(data);
			} else {
				children.put(name, new ECLMetaNode(this, name, data));
			}
			setChanged();
			ECLMetaNode parentNode = parent;
			while (parentNode != null) {
				parentNode.setChanged();
				parentNode = parentNode.parent;
			}
			return children.get(name);
		}

		public boolean hasChild(String name) {
			return children.containsKey(name.toLowerCase());
		}

		public ECLMetaNode getChild(String name) {
			if (hasChild(name)) {
				return children.get(name.toLowerCase());
			}
			return null;
		}

		public String getQualifiedName() {
			String retVal = "";
			if (parent != null) {
				retVal = parent.getQualifiedName();
			}
			if (!retVal.isEmpty()) {
				retVal += ".";
			}
			retVal += name;
			return retVal;
		}
		
		public IPath getPath() {
			if (data != null && data.attributes.containsKey("sourcePath")) {
				return new Path(data.attributes.get("sourcePath"));
			}
			if (parent != null) {
				return parent.getPath();
			}
			return null;
		}

		public ECLMetaNode getECLFolderNode() {
			if (data instanceof ECLFolder) {
				return this;
			}
			if (parent != null) {
				return parent.getECLFolderNode();
			}
			return null;
		}

		public ECLMetaNode getECLSourceNode() {
			if (data instanceof ECLSource) {
				return this;
			}
			if (parent != null) {
				return parent.getECLSourceNode();
			}
			return null;
		}

		public String getName() {
			return name;
		}

		void setData(ECLDefinition data) {
			children.clear();
			this.data = data;
			setChanged();
		}

		public ECLDefinition getData() {
			return data;
		}

		public ECLMetaNode getContext(final int offset) {
			if (getName().startsWith("__") && getName().endsWith("__")) {
				return null;
			}

			ECLMetaNode retVal = null;
			for (ECLMetaNode node : getChildren()) {
				retVal = node.getContext(offset);
				if (retVal != null) {
					return retVal;
				}
			}

			if (offset >= getData().getOffset() && offset <= getData().getEndOffset()) {
				return this;
			}

			if (getData() instanceof ECLSource) {
				return this;
			}

			return null;
		}

		public ECLMetaNode findDefinition(String text, boolean downOnly) {
			if (text.startsWith("$")) {
				ECLMetaNode eclFolderNode = this.getECLFolderNode();
				if (eclFolderNode != null) {
					text = eclFolderNode.getName() + text.substring(1);
				}
			}
			if (text.startsWith("$.")) {
				text = text.substring(2);				
			}
			text = text.toLowerCase();
			if (getName().equalsIgnoreCase(text)) {
				return this;
			}

			for (ECLMetaNode node : getChildren()) {
				if (node.getName().equalsIgnoreCase(text)) {
					if (node.getData() instanceof ECLImport) {
						return getNode(((ECLImport) node.getData()).getRef());
					}
					return node;
				}

				if (text.startsWith(node.getName() + ".")) {
					if (node.getData() instanceof ECLImport) {
						String ref = ((ECLImport) node.getData()).getRef();
						text = ref + text.substring(text.indexOf("."));
						return getNode(text);
					}
					return node.findDefinition(text.substring(text.indexOf(".") + 1), true);
				}
			}

			if (downOnly) {
				return null;
			}

			if (parent != null) {
				return parent.findDefinition(text, false);
			}
			return null;
		}

		public Collection<ECLMetaNode> getChildren() {
			return children.values();
		}

		public int getLine() {
			if (data != null && data.attributes.containsKey("line")) {
				return Integer.decode(data.attributes.get("line"));
			}
			return 0;
		}

		public boolean isFolder() {
			if (getData() instanceof ECLFolder) {
				return true;
			}
			return false;
		}
	}

	public void clear() {
		root = new ECLMetaNode("");
	}
}
