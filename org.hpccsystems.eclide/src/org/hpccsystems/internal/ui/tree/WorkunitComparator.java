package org.hpccsystems.internal.ui.tree;

import java.util.Comparator;

public class WorkunitComparator implements Comparator<ItemView> {

	@Override
	public int compare(ItemView left, ItemView right) {
		String l = left.getText();
		String r = right.getText();

		//  Ignore "W" and "D" and maybe "L"  ---
		l = l.substring(1);
		r = r.substring(1);
		return r.compareTo(l);
	}
}
