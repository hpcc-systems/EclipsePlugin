package org.seisint.eclide.internal.ui.text;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptCommentScanner;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class OctaveScriptCommentScanner extends ScriptCommentScanner {

	public OctaveScriptCommentScanner(IColorManager manager,
			IPreferenceStore store, String comment, String todoTag,
			ITodoTaskPreferences preferences) {
		super(manager, store, comment, todoTag, preferences);
	}
	
	public void setRange(IDocument document, int offset, int length) {
		super.setRange(document, offset, length);
		state = STATE_START;
	}

	private int state = STATE_START;

	private static final int STATE_START = 0;
	private static final int STATE_STARTED = 1;
	private static final int STATE_BODY = 2;
	
	public IToken nextToken() {
		fTokenOffset = fOffset;
		fColumn = UNDEFINED;
		if (state == STATE_START) {
			state = STATE_STARTED;
			int count = 0;
			int c = read();
			if (c == COMMENT_CHAR1 || c == COMMENT_CHAR2) {
				c = read();
				++count;
			}
			while (c != EOF && Character.isWhitespace((char) c)) {
				c = read();
				++count;
			}
			unread();
			if (count > 0) {
				return fDefaultReturnToken;
			} else if (c == EOF) {
				return Token.EOF;
			}
		}
		if (state == STATE_STARTED) {
			state = STATE_BODY;
			final IToken token = fRules[0].evaluate(this);
			if (!token.isUndefined()) {
				return token;
			}
		}
		int count = 0;
		while (read() != EOF) {
			++count;
		}
		return count > 0 ? fDefaultReturnToken : Token.EOF;
	}

	private static final char COMMENT_CHAR1 = '#';
	private static final char COMMENT_CHAR2 = '%';
	
}
