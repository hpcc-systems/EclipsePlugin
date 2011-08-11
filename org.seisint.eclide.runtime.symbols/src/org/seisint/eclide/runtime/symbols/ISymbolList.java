package org.seisint.eclide.runtime.symbols;

public interface ISymbolList {

	public abstract void updateListeners();

	/**
	 * @param viewer
	 */
	public abstract void removeChangeListener(ISymbolListener viewer);

	/**
	 * @param viewer
	 */
	public abstract void addChangeListener(ISymbolListener viewer);

}