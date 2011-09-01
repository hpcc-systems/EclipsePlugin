package org.seisint.eclide.internal.search;

import org.eclipse.dltk.core.ISearchPatternProcessor;

public class OctaveSearchPatternProcessor implements ISearchPatternProcessor {

	private static final String DELIMITER = "."; //$NON-NLS-1$
	
	public char[] extractDeclaringTypeQualification(String patternString) {
		int pos1 = patternString.lastIndexOf(DELIMITER);
		if (pos1 != -1) {
			String p = patternString.substring(0, pos1);
			int pos2 = p.lastIndexOf(DELIMITER);
			if (pos2 != -1) {
				return patternString.substring(0, pos2).toCharArray();
			}
			return null;
		}
		return null;
	}

	public char[] extractDeclaringTypeSimpleName(String patternString) {
		int pos1 = patternString.lastIndexOf(DELIMITER);
		if (pos1 != -1) {
			String p = patternString.substring(0, pos1);
			return getLastOctaveElementName(p).toCharArray();
		}
		return null;
	}

	public char[] extractSelector(String patternString) {
		return getLastOctaveElementName(patternString).toCharArray();
	}

	public String extractTypeChars(String patternString) {
		return getLastOctaveElementName(null);
	}
	
	private String getLastOctaveElementName(String patternString)
	{
		final int pos = patternString.lastIndexOf(DELIMITER);
		if (pos != -1) {
			final int begin = pos + DELIMITER.length();
			if (begin < patternString.length()) {
				return patternString.substring(begin);
			}
		}
		return patternString;
	}
	
	public char[] extractTypeQualification(String patternString) {
		int pos1 = patternString.lastIndexOf(DELIMITER);
		if (pos1 != -1) {
			return patternString.substring(0, pos1).toCharArray();
		}
		return null;
	}

	public String getDelimiterReplacementString() {
		return DELIMITER;
	}

	public ITypePattern parseType(String patternString) {
		// TODO Auto-generated method stub
		return null;
	}

}
