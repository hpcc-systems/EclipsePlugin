/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.ui;


import org.eclipse.dltk.ui.CodeFormatterConstants;
import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.dltk.ui.preferences.NewScriptProjectPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import org.seisint.eclide.core.OctaveCoreConstants;
import org.seisint.eclide.internal.ui.text.OctaveColorConstants;
import org.seisint.eclide.internal.ui.text.folding.OctaveParserCodeBlockProvider;

public class OctavePreferenceConstants extends PreferenceConstants {

    public final static String EDITOR_SINGLE_LINE_COMMENT_COLOR = OctaveColorConstants.ECL_COMMENT;

	public final static String EDITOR_SINGLE_LINE_COMMENT_BOLD = OctaveColorConstants.ECL_COMMENT
			+ EDITOR_BOLD_SUFFIX;

	public final static String EDITOR_SINGLE_LINE_COMMENT_ITALIC = OctaveColorConstants.ECL_COMMENT
			+ EDITOR_ITALIC_SUFFIX;

	public final static String EDITOR_SINGLE_LINE_COMMENT_STRIKETHROUGH = OctaveColorConstants.ECL_COMMENT
			+ EDITOR_STRIKETHROUGH_SUFFIX;

	public final static String EDITOR_SINGLE_LINE_COMMENT_UNDERLINE = OctaveColorConstants.ECL_COMMENT
			+ EDITOR_UNDERLINE_SUFFIX;
	
	public final static String EDITOR_KEYWORD1_COLOR = OctaveColorConstants.ECL_KEYWORD1;
	public final static String EDITOR_KEYWORD1_BOLD = OctaveColorConstants.ECL_KEYWORD1 + EDITOR_BOLD_SUFFIX;
	public final static String EDITOR_KEYWORD1_ITALIC = OctaveColorConstants.ECL_KEYWORD1 + EDITOR_ITALIC_SUFFIX;
	public final static String EDITOR_KEYWORD1_STRIKETHROUGH = OctaveColorConstants.ECL_KEYWORD1 + EDITOR_STRIKETHROUGH_SUFFIX;
	public final static String EDITOR_KEYWORD1_UNDERLINE = OctaveColorConstants.ECL_KEYWORD1 + EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_KEYWORD2_COLOR = OctaveColorConstants.ECL_KEYWORD2;
	public final static String EDITOR_KEYWORD2_BOLD = OctaveColorConstants.ECL_KEYWORD2 + EDITOR_BOLD_SUFFIX;
	public final static String EDITOR_KEYWORD2_ITALIC = OctaveColorConstants.ECL_KEYWORD2 + EDITOR_ITALIC_SUFFIX;
	public final static String EDITOR_KEYWORD2_STRIKETHROUGH = OctaveColorConstants.ECL_KEYWORD2 + EDITOR_STRIKETHROUGH_SUFFIX;
	public final static String EDITOR_KEYWORD2_UNDERLINE = OctaveColorConstants.ECL_KEYWORD2 + EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_KEYWORD3_COLOR = OctaveColorConstants.ECL_KEYWORD3;
	public final static String EDITOR_KEYWORD3_BOLD = OctaveColorConstants.ECL_KEYWORD3 + EDITOR_BOLD_SUFFIX;
	public final static String EDITOR_KEYWORD3_ITALIC = OctaveColorConstants.ECL_KEYWORD3 + EDITOR_ITALIC_SUFFIX;
	public final static String EDITOR_KEYWORD3_STRIKETHROUGH = OctaveColorConstants.ECL_KEYWORD3 + EDITOR_STRIKETHROUGH_SUFFIX;
	public final static String EDITOR_KEYWORD3_UNDERLINE = OctaveColorConstants.ECL_KEYWORD3 + EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_KEYWORD4_COLOR = OctaveColorConstants.ECL_KEYWORD4;
	public final static String EDITOR_KEYWORD4_BOLD = OctaveColorConstants.ECL_KEYWORD4 + EDITOR_BOLD_SUFFIX;
	public final static String EDITOR_KEYWORD4_ITALIC = OctaveColorConstants.ECL_KEYWORD4 + EDITOR_ITALIC_SUFFIX;
	public final static String EDITOR_KEYWORD4_STRIKETHROUGH = OctaveColorConstants.ECL_KEYWORD4 + EDITOR_STRIKETHROUGH_SUFFIX;
	public final static String EDITOR_KEYWORD4_UNDERLINE = OctaveColorConstants.ECL_KEYWORD4 + EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_KEYWORD5_COLOR = OctaveColorConstants.ECL_KEYWORD5;
	public final static String EDITOR_KEYWORD5_BOLD = OctaveColorConstants.ECL_KEYWORD5 + EDITOR_BOLD_SUFFIX;
	public final static String EDITOR_KEYWORD5_ITALIC = OctaveColorConstants.ECL_KEYWORD5 + EDITOR_ITALIC_SUFFIX;
	public final static String EDITOR_KEYWORD5_STRIKETHROUGH = OctaveColorConstants.ECL_KEYWORD5 + EDITOR_STRIKETHROUGH_SUFFIX;
	public final static String EDITOR_KEYWORD5_UNDERLINE = OctaveColorConstants.ECL_KEYWORD5 + EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_KEYWORD6_COLOR = OctaveColorConstants.ECL_KEYWORD6;
	public final static String EDITOR_KEYWORD6_BOLD = OctaveColorConstants.ECL_KEYWORD6 + EDITOR_BOLD_SUFFIX;
	public final static String EDITOR_KEYWORD6_ITALIC = OctaveColorConstants.ECL_KEYWORD6 + EDITOR_ITALIC_SUFFIX;
	public final static String EDITOR_KEYWORD6_STRIKETHROUGH = OctaveColorConstants.ECL_KEYWORD6 + EDITOR_STRIKETHROUGH_SUFFIX;
	public final static String EDITOR_KEYWORD6_UNDERLINE = OctaveColorConstants.ECL_KEYWORD6 + EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_NUMBER_COLOR = OctaveColorConstants.ECL_CONSTANT;

	public final static String EDITOR_NUMBER_BOLD = OctaveColorConstants.ECL_CONSTANT
			+ EDITOR_BOLD_SUFFIX;

	public final static String EDITOR_NUMBER_ITALIC = OctaveColorConstants.ECL_CONSTANT
			+ EDITOR_ITALIC_SUFFIX;

	public final static String EDITOR_NUMBER_STRIKETHROUGH = OctaveColorConstants.ECL_CONSTANT
			+ EDITOR_STRIKETHROUGH_SUFFIX;

	public final static String EDITOR_NUMBER_UNDERLINE = OctaveColorConstants.ECL_CONSTANT
			+ EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_VARIABLE_COLOR = OctaveColorConstants.ECL_VARIABLE;

	public final static String EDITOR_VARIABLE_BOLD = OctaveColorConstants.ECL_VARIABLE
			+ EDITOR_BOLD_SUFFIX;

	public final static String EDITOR_VARIABLE_ITALIC = OctaveColorConstants.ECL_VARIABLE
			+ EDITOR_ITALIC_SUFFIX;

	public final static String EDITOR_VARIABLE_STRIKETHROUGH = OctaveColorConstants.ECL_VARIABLE
			+ EDITOR_STRIKETHROUGH_SUFFIX;

	public final static String EDITOR_VARIABLE_UNDERLINE = OctaveColorConstants.ECL_VARIABLE
			+ EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_FUNCTION_COLOR = OctaveColorConstants.ECL_FUNCTION;

	public final static String EDITOR_FUNCTION_BOLD = OctaveColorConstants.ECL_FUNCTION
			+ EDITOR_BOLD_SUFFIX;

	public final static String EDITOR_FUNCTION_ITALIC = OctaveColorConstants.ECL_FUNCTION
			+ EDITOR_ITALIC_SUFFIX;

	public final static String EDITOR_FUNCTION_STRIKETHROUGH = OctaveColorConstants.ECL_FUNCTION
			+ EDITOR_STRIKETHROUGH_SUFFIX;

	public final static String EDITOR_FUNCTION_UNDERLINE = OctaveColorConstants.ECL_FUNCTION
			+ EDITOR_UNDERLINE_SUFFIX;
	
	public final static String EDITOR_STRING_COLOR = OctaveColorConstants.ECL_STRING;

	public final static String EDITOR_STRING_BOLD = OctaveColorConstants.ECL_STRING
			+ EDITOR_BOLD_SUFFIX;

	public final static String EDITOR_STRING_ITALIC = OctaveColorConstants.ECL_STRING
			+ EDITOR_ITALIC_SUFFIX;

	public final static String EDITOR_STRING_STRIKETHROUGH = OctaveColorConstants.ECL_STRING
			+ EDITOR_STRIKETHROUGH_SUFFIX;

	public final static String EDITOR_STRING_UNDERLINE = OctaveColorConstants.ECL_STRING
			+ EDITOR_UNDERLINE_SUFFIX;

	public final static String EDITOR_SMART_PASTE_MODE = "smartPasteMode"; //$NON-NLS-1$
	public final static int EDITOR_SMART_PASTE_MODE_SIMPLE = 1; //$NON-NLS-1$
	public final static int EDITOR_SMART_PASTE_MODE_FULL = 2; //$NON-NLS-1$

	public static final String EDITOR_FOLDING_IMPORTS = "editor_folding_default_imports"; //$NON-NLS-1$

	public static final String EDITOR_FOLDING_BLOCKS = "editor_folding_blocks"; //$NON-NLS-1$

	public static final int EDITOR_FOLDING_BLOCKS_OFF = 0; //$NON-NLS-1$

	public static final int EDITOR_FOLDING_BLOCKS_INCLUDE = 1; //$NON-NLS-1$

	public static final int EDITOR_FOLDING_BLOCKS_EXCLUDE = 2; //$NON-NLS-1$

	public static final String EDITOR_FOLDING_INCLUDE_LIST = "editor_folding_include_list"; //$NON-NLS-1$

	public static final String EDITOR_FOLDING_EXCLUDE_LIST = "editor_folding_exclude_list"; //$NON-NLS-1$

	public static final String EDITOR_FOLDING_INIT_COMMENTS = "editor_folding_init_comments"; //$NON-NLS-1$

	public static final String EDITOR_FOLDING_INIT_BLOCKS = "editor_folding_init_blocks"; //$NON-NLS-1$

	public static final String EDITOR_FOLDING_COMMENTS_WITH_NEWLINES = "editor_folding_comments_lines"; //$NON-NLS-1$

	public static final String DOC_MAN_PAGES_LOCATIONS = "doc_man_pages_locations";

	public static final String EDITOR_FOLDING_COMMENTS_FOLDING = "editor_folding_comments";

	public final static String COMMENT_TASK_TAGS = OctaveColorConstants.TODO_TAG;
	public final static String COMMENT_TASK_TAGS_BOLD = COMMENT_TASK_TAGS + EDITOR_BOLD_SUFFIX;
	
	public static void initializeDefaultValues(IPreferenceStore store) {
		PreferenceConstants.initializeDefaultValues(store);

		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_SINGLE_LINE_COMMENT_COLOR,
				new RGB(0, 128, 0));
		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_KEYWORD1_COLOR,
				new RGB(0, 0, 255));
		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_KEYWORD2_COLOR,
				new RGB(0, 0, 128));
		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_KEYWORD3_COLOR,
				new RGB(128, 0, 0));
		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_KEYWORD4_COLOR,
				new RGB(128, 0, 0));
		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_KEYWORD5_COLOR,
				new RGB(128, 0, 128));
		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_KEYWORD6_COLOR,
				new RGB(128, 0, 128));
		PreferenceConverter
				.setDefault(store, OctavePreferenceConstants.EDITOR_STRING_COLOR,
						new RGB(128, 128, 128));
		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_NUMBER_COLOR, new RGB(0, 0, 0));
		PreferenceConverter.setDefault(store,
				OctavePreferenceConstants.EDITOR_VARIABLE_COLOR,
				new RGB(200, 0, 0));

		store.setDefault(OctavePreferenceConstants.DOC_MAN_PAGES_LOCATIONS, "<manPages></manPages>");

		store.setDefault(
				OctavePreferenceConstants.EDITOR_SINGLE_LINE_COMMENT_BOLD, false);
		store
				.setDefault(
						OctavePreferenceConstants.EDITOR_SINGLE_LINE_COMMENT_ITALIC,
						false);

		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD1_BOLD, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD1_ITALIC, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD2_BOLD, true);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD2_ITALIC, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD3_BOLD, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD3_ITALIC, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD4_BOLD, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD4_ITALIC, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD5_BOLD, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD5_ITALIC, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD6_BOLD, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_KEYWORD6_ITALIC, false);
		store.setDefault(OctavePreferenceConstants.EDITOR_CLOSE_STRINGS, true);
		store.setDefault(OctavePreferenceConstants.EDITOR_CLOSE_BRACKETS, true);
		store.setDefault(OctavePreferenceConstants.EDITOR_CLOSE_BRACES, true);
		store.setDefault(OctavePreferenceConstants.EDITOR_SMART_TAB, true);
		store.setDefault(OctavePreferenceConstants.EDITOR_SMART_PASTE_MODE,
				OctavePreferenceConstants.EDITOR_SMART_PASTE_MODE_SIMPLE);

		store.setDefault(PreferenceConstants.EDITOR_SMART_INDENT, true);
		store.setDefault(PreferenceConstants.EDITOR_TAB_WIDTH, 4);
		store.setDefault(PreferenceConstants.EDITOR_SMART_HOME_END, true);
		store.setDefault(PreferenceConstants.EDITOR_SUB_WORD_NAVIGATION, true);
		store.setDefault(
				PreferenceConstants.EDITOR_SYNC_OUTLINE_ON_CURSOR_MOVE, true);

		// folding
		store.setDefault(PreferenceConstants.EDITOR_FOLDING_ENABLED, true);
		store.setDefault(PreferenceConstants.EDITOR_COMMENTS_FOLDING_ENABLED,
				true);
		store.setDefault(OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS,
				OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS_EXCLUDE);
		store.setDefault(OctavePreferenceConstants.EDITOR_FOLDING_INCLUDE_LIST,
				"");
		store.setDefault(OctavePreferenceConstants.EDITOR_FOLDING_EXCLUDE_LIST,
				"if,do,while,try,unwind_protect,for,function");
		store.setDefault(
				OctavePreferenceConstants.EDITOR_FOLDING_COMMENTS_WITH_NEWLINES,
				true);
		store.setDefault(OctavePreferenceConstants.EDITOR_FOLDING_INIT_COMMENTS,
				true);
		store.setDefault(PreferenceConstants.EDITOR_FOLDING_LINES_LIMIT, 5);

		store.setDefault(CodeFormatterConstants.FORMATTER_TAB_CHAR,
				CodeFormatterConstants.MIXED);
		store.setDefault(CodeFormatterConstants.FORMATTER_TAB_SIZE, "4");
		store
				.setDefault(CodeFormatterConstants.FORMATTER_INDENTATION_SIZE,
						"4");

		// do more complicated stuff
		NewScriptProjectPreferencePage.initDefaults(store);

		store.setDefault(PreferenceConstants.APPEARANCE_COMPRESS_PACKAGE_NAMES,
				false);
		store.setDefault(PreferenceConstants.APPEARANCE_METHOD_RETURNTYPE,
				false);
		store.setDefault(PreferenceConstants.APPEARANCE_METHOD_TYPEPARAMETERS,
				true);
		store.setDefault(
				PreferenceConstants.APPEARANCE_PKG_NAME_PATTERN_FOR_PKG_VIEW,
				""); //$NON-NLS-1$

		store.setDefault(PreferenceConstants.SHOW_SOURCE_MODULE_CHILDREN, true);

		store.setDefault(
				PreferenceConstants.CODEASSIST_AUTOACTIVATION_TRIGGERS, ".");
		
		PreferenceConverter.setDefault(store, COMMENT_TASK_TAGS, new RGB(127, 159, 191));
		store.setDefault(COMMENT_TASK_TAGS_BOLD, true);
		
		store.setDefault(OctaveCoreConstants.CODE_BLOCK_PROVIDER, OctaveParserCodeBlockProvider.ID);
		
	}
}
