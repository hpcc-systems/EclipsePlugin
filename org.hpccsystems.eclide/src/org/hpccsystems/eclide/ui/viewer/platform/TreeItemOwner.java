package org.hpccsystems.eclide.ui.viewer.platform;

public interface TreeItemOwner {
	public void update(Object element, String[] properties);
	public void refresh(Object element);
}
