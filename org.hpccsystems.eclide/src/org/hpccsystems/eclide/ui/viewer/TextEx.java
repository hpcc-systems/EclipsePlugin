package org.hpccsystems.eclide.ui.viewer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class TextEx extends Composite {

	private Text text;

	public TextEx(Composite parent) {
		super(parent, SWT.BORDER);

		FillLayout layout = new FillLayout();
		setLayout(layout);

		text = new Text(this, SWT.READ_ONLY | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
	}

	public void setText(String txt) {
		text.setText(txt);		
	}
}
