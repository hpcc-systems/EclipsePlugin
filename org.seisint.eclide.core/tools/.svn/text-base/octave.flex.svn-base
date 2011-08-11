/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.parser;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.internal.parser.OctaveParser;
import org.seisint.eclide.internal.parser.OctaveToken;
import org.seisint.eclide.runtime.symbols.Symbol;
import org.seisint.eclide.internal.parser.OctaveLexerException;
%%
%class OctaveLexer
%byaccj
%public
%unicode
%line
%column
%char
%scanerror OctaveLexerException
%{
	private OctaveParser yyparser;
	private int functionDepth;
	private boolean varargoutIsToken;
	private boolean vararginIsToken;
	private int matrixIgnoreNL;
	private boolean peekFlag;
	private int returnState;
	StringBuffer string;
	int b_comm_h_lvl;
	int b_comm_p_lvl;
	int myline;
  	int mycolumn;
  	int mychar;
	public OctaveLexer(java.io.Reader r, OctaveParser yyparser) {
		this(r);
		this.yyparser = yyparser;
		functionDepth = 0;
		varargoutIsToken = false;
		vararginIsToken = false;
		matrixIgnoreNL = 0;
		peekFlag = false;
		string = new StringBuffer();
		b_comm_p_lvl = 0;
		b_comm_h_lvl = 0;
	}
	
	public void increaseFunctionDepth() {
		functionDepth++;
	}

	public void decreaseFunctionDepth() {
		functionDepth--;
	}

	public void enableMatrixIgnoreNewLine() {
		matrixIgnoreNL++;
	}
	
	public void disableMatrixIgnoreNewLine() {
		matrixIgnoreNL--;
	}

	public void enableVarArgOut() {
		varargoutIsToken = true;
	}
	
	public void disableVarArgOut() {
		varargoutIsToken = false;
	}
	
	public void enableVarArgIn() {
		vararginIsToken = true;
	}
	
	public void disableVarArgIn() {
		vararginIsToken = false;
	}
	
	public boolean peekIs(List types) throws IOException, OctaveLexerException {
		boolean retval = false;
		peekFlag = true;
		yylex();
		peekFlag = false;
		OctaveToken token = (OctaveToken)yyparser.yylval;
		for (Iterator it = types.iterator(); it.hasNext(); )
		{
			Object o = it.next();
			if (o instanceof Integer)
			{
				Integer ic = (Integer)o;
				if (token.getType() == ic.intValue()) {
					retval = true;
					break;
				}
			}
		}
		yypushback(yylength());
		return retval;
	}
	
	public boolean peekIs(int type) throws IOException, OctaveLexerException {
		boolean retval;
		peekFlag = true;
		yylex();
		peekFlag = false;
		OctaveToken token = (OctaveToken)yyparser.yylval;
		if (token == null) {
			return false;
		} else if (token.getType() == type) {
			retval = true;
		} else { 
			retval = false;
		}
		yypushback(yylength());
		return retval;
	}

	public boolean isCommand(String name) {
		Vector list = OctclipsePlugin.getSymbolList().getSymbols(Symbol.COMMAND);
		Iterator i = list.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			if (o instanceof Symbol) {
				Symbol s = (Symbol)o;
				if (name.equals(s.getName())) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int Yyline() {
		return yyline;
	}
	
	public int Yychar() {
		return yychar;
	}
	
	public int Yycolumn() {
		return yycolumn;
	}

%}
%init{
%init}
%function yylex
%eof{
%eof}
D                     = [0-9]
WS					  = [ \t]
L                     = [a-zA-Z_]
E                     = ([DdEe][+-]?{D}+)
I					  = [IiJj]
DQSC 			      = [^\r\n\"\\]
SQSC                  = [^']
N					  = (({D}+\.?{D}*{E}?)|(\.{D}+{E}?)|(0[xX][0-9a-fA-F]+))
%state TRANSPOSABLE DQSTRING COMMAND SQSTRING BLOCK_COMMENT
%%		
<BLOCK_COMMENT> {
[\r\n]*"/*"{WS}*$ { b_comm_p_lvl++; 
					yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*"*/"{WS}*$ { b_comm_p_lvl--;
					if (b_comm_p_lvl == 0 && b_comm_h_lvl == 0) {
						yybegin(returnState); 
					} 
					yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*"#{"{WS}*$ { b_comm_h_lvl++; 
					yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*"#}"{WS}*$ { b_comm_p_lvl--;
					if (b_comm_p_lvl == 0 && b_comm_h_lvl == 0) {
						yybegin(returnState);
					}
					yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*.+$		  { yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
}
<SQSTRING> {
"'"                   	{ 
						  yybegin(returnState); 
                          yyparser.yylval = new OctaveToken(OctaveParser.STRING_LITERAL, string.toString(), myline, mycolumn, mychar);
                          return(OctaveParser.STRING_LITERAL); }
{SQSC}+               	{ 
						  yybegin(SQSTRING);
                          string.append( yytext() ); }
"'""'"                	{ 
						  yybegin(SQSTRING);
                          string.append( '\'' ); }                         
}	  
<DQSTRING> {
"\""   			  		{ 
						  yybegin(returnState); 
				 	      yyparser.yylval = new OctaveToken(OctaveParser.STRING_LITERAL, string.toString(), myline, mycolumn, mychar);
					      return(OctaveParser.STRING_LITERAL); }
{DQSC}+             	{ 
						  yybegin(DQSTRING);
  						  string.append( yytext() ); }
"\\b"               	{ 
						  yybegin(DQSTRING);
  						  string.append( '\b' ); }
"\\t"               	{ 
						  yybegin(DQSTRING);
  						  string.append( '\t' ); }
"\\n"               	{ 
						  yybegin(DQSTRING);
  						  string.append( '\n' ); }
"\\f"               	{ 
						  yybegin(DQSTRING);
  						  string.append( '\f' ); }
"\\r"               	{ 
						  yybegin(DQSTRING);
  						  string.append( '\r' ); }
"\\\""              	{ 
						  yybegin(DQSTRING);
  						  string.append( '\"' ); }
"\\'"               	{ 
						  yybegin(DQSTRING);
  						  string.append( '\'' ); }
"\\\\"              	{ 
						  yybegin(DQSTRING);
  						  string.append( '\\' ); }
"\\"{WS}*[\r]?\n    	{ yybegin(DQSTRING); }						
}
<YYINITIAL, TRANSPOSABLE> {
[\r\n]*"/*"{WS}*$		{ yybegin(BLOCK_COMMENT); 
						  returnState = YYINITIAL;
						  b_comm_h_lvl = 0;
						  b_comm_p_lvl = 1; 
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*"*/"{WS}*$		{ yybegin(BLOCK_COMMENT);
						  returnState = YYINITIAL;
						  b_comm_h_lvl = 1;
						  b_comm_p_lvl = 0; 
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }									  
[\r\n]*"%"$        		{ 
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*"%"[^{].*$    	{ 
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*"%".*$    	    { 
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }						  
[\r\n]*"#"$      		{ 
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*"#"[^{].*$    	    { 
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }
[\r\n]*"#".*$    	    { 
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMENT, yytext(), yyline, yycolumn, yychar); }						  						  			  
"..."{WS}*[\r]?\n       { 
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.CONTINUATION, yytext(), yyline, yycolumn, yychar); }
"break"                 {  
                          yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.BREAK, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.BREAK); }
"else"                  { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ELSE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ELSE); }
"end"                   { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.END, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.END); }
"endif"                 { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ENDIF, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ENDIF); }
"endfor"                { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ENDFOR, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ENDFOR); }						  						  
"endwhile"              { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ENDWHILE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ENDWHILE); }		
"endswitch"             { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ENDSWITCH, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ENDSWITCH); }		
"end_try_catch"         { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ENDTRYCATCH, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ENDTRYCATCH); }	
"end_unwind_protect"    { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ENDUNWINDPROTECT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ENDUNWINDPROTECT); }	
"endfunction"           { 
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ENDFUNCTION, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ENDFUNCTION); }							  						  						  				  				  
"elseif"                {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ELSEIF, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ELSEIF); }
"persistent"|"static"	{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.PERSISTENT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.PERSISTENT); }
"try"					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.TRY, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.TRY); }
"catch"					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.CATCH, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.CATCH); }
"unwind_protect"				{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.UNWIND, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.UNWIND); }
"unwind_protect_cleanup"		{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.CLEANUP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.CLEANUP); }
"do"					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.DO, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.DO); }
"until"					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.UNTIL, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.UNTIL); }
"switch"				{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.SWITCH, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.SWITCH); }
"case"					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.CASE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.CASE); }
"otherwise"				{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.OTHERWISE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.OTHERWISE); }
"while"					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.WHILE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.WHILE); }
"for"                   {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.FOR, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.FOR); }
"function"              {  
						  yybegin(YYINITIAL); 
						  if (functionDepth > 0)
						  {
							  yyparser.yylval = new OctaveToken(OctaveParser.ENDFUNCTION, "", yyline, yycolumn, yychar - 1);
							  /* pushback token so we can start a new function correctly */
							  yypushback(yylength());
							  return(OctaveParser.ENDFUNCTION); 
						  }
						  else
						  {
							  yyparser.yylval = new OctaveToken(OctaveParser.FUNCTION, yytext(), yyline, yycolumn, yychar);
							  return(OctaveParser.FUNCTION); 
						  }}
"global"                {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.GLOBAL, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.GLOBAL); }
"if"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.IF, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.IF); }
"return"                {  
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.RETURN, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.RETURN); }
"varargin"              {  
						  yybegin(YYINITIAL);
						  if (vararginIsToken)
						  {
						  	yyparser.yylval = new OctaveToken(OctaveParser.VARARGIN, yytext(), yyline, yycolumn, yychar);
						  	return(OctaveParser.VARARGIN);
						  } else {
						  	yyparser.yylval = new OctaveToken(OctaveParser.IDENTIFIER, yytext(), yyline, yycolumn, yychar);
						  	return(OctaveParser.IDENTIFIER);
						  } }
"varargout"             {  
						  yybegin(YYINITIAL);
						  if (varargoutIsToken)
						  {
						  	yyparser.yylval = new OctaveToken(OctaveParser.VARARGOUT, yytext(), yyline, yycolumn, yychar);
						  	return(OctaveParser.VARARGOUT);
						  } else {
						  	yyparser.yylval = new OctaveToken(OctaveParser.IDENTIFIER, yytext(), yyline, yycolumn, yychar);
						  	return(OctaveParser.IDENTIFIER);
						  } }						  
{L}({L}|{D})*           {  
						  String text = yytext();
						  myline = yyline;
  						  mycolumn = yycolumn;
  						  mychar = yychar;
  						  if (isCommand(text) && !peekIs(OctaveParser.LPAREN))
						  {
						    yybegin(COMMAND);
						  	yyparser.yylval = new OctaveToken(OctaveParser.COMMAND_IDENTIFIER, text, myline, mycolumn, mychar);
						  	return(OctaveParser.COMMAND_IDENTIFIER);
						  } 
						  else 
						  {
						    yybegin(TRANSPOSABLE);
						    yyparser.yylval = new OctaveToken(OctaveParser.IDENTIFIER, text, myline, mycolumn, mychar);
						  	return(OctaveParser.IDENTIFIER);
						  } }
{N}({I}?)               {  
						  yybegin(TRANSPOSABLE); 
						  yyparser.yylval = new OctaveToken(OctaveParser.CONSTANT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.CONSTANT); }
"."                     {  
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.DOT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.DOT); }
".+"                    {  
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.PLUS, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.PLUS); }
".-"                    {  
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.MINUS, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MINUS); }						  						  
".*"                    {  
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.MULT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MULT); }
".^"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.POW, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.POW); }
".**"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.POW, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.POW); }
"./"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.DIV, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.DIV); }
".\\"                   {  
                          yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LDIV, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LDIV); }
"\\"{WS}*\n             { yybegin(YYINITIAL);
                          yyparser.yylval = new OctaveToken(OctaveParser.CONTINUATION, yytext(), yyline, yycolumn, yychar); }
"<="                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LE_OP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LE_OP); }
">="                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.GE_OP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.GE_OP); }
"=="                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.EQ_OP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.EQ_OP); }
"~="                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.NE_OP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.NE_OP); }
"!="                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.NE_OP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.NE_OP); }		
"<>"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.NE_OP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.NE_OP); }
"~"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.NOT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.NOT); }
"!"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.NOT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.NOT); }						  
";"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.SEMICOLON, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.SEMICOLON); }
{WS}*","{WS}*           {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.COMMA, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.COMMA); }
":"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.COLON, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.COLON); }
"="                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.ASSIGN, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.ASSIGN); }
"("                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LPAREN, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LPAREN); }
")"                     {  
						  yybegin(TRANSPOSABLE); 
						  yyparser.yylval = new OctaveToken(OctaveParser.RPAREN, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.RPAREN); }
"{"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LBRACE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LBRACE); }
"}"                     {  
						  yybegin(TRANSPOSABLE); 
						  yyparser.yylval = new OctaveToken(OctaveParser.RBRACE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.RBRACE); }						  
"["                     {  
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.LBRACKET, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LBRACKET); }
"]"                     {  
						  yybegin(TRANSPOSABLE);
						  yyparser.yylval = new OctaveToken(OctaveParser.RBRACKET, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.RBRACKET); }
"&&"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.AND_AND, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.AND_AND); }						  
"&"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.AND, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.AND); }
"-"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.MINUS, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MINUS); }
"--"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.MINUS_MINUS, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MINUS_MINUS); }						  
"+"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.PLUS, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.PLUS); }
"++"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.PLUS_PLUS, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.PLUS_PLUS); }
"*"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.MULT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MULT); }
"**"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.POW, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.POW); }						  
"/"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.DIV, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.DIV); }
"\\"                    {  
						  yybegin(YYINITIAL); 
						  if (!peekFlag && !peekIs(OctaveParser.CR)) {
						  	yyparser.yylval = new OctaveToken(OctaveParser.LDIV, yytext(), yyline, yycolumn, yychar);
						  	return(OctaveParser.LDIV); 
						  } }
"<"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LT_OP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LT_OP); }
">"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.GT_OP, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.GT_OP); }
"^"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.POW, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.POW); }
"|"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.OR, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.OR); }
"||"                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.OR_OR, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.OR_OR); }	
"@"                     {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.AT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.AT); }	
"+="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.PLUS_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.PLUS_EQ); }
"-="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.MINUS_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MINUS_EQ); }
"*="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.MULT_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MULT_EQ); }
"/="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.DIV_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.DIV_EQ); }
"\\="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LDIV_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LDIV_EQ); }
"^="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.POW_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.POW_EQ); }
"**="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.POW_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.POW_EQ); }	  					 
">>="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.RSHIFT_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.RSHIFT_EQ); }
"<<="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LSHIFT_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LSHIFT_EQ); }	
".+="                   {  
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.PLUS_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.PLUS_EQ); }
".-="                   {  
						  yybegin(YYINITIAL);
						  yyparser.yylval = new OctaveToken(OctaveParser.MINUS_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MINUS_EQ); }						  						  					  
".*="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.MULT_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.MULT_EQ); }			
"./="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.DIV_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.DIV_EQ); }		
".\\="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LDIV_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LDIV_EQ); }		
"&="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.AND_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.AND_EQ); }		
"|="					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.OR_EQ, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.OR_EQ); }
".^="                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.POW, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.POW_EQ); }
".**="                    {  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.POW, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.POW_EQ); }
">>"					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.RSHIFT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.RSHIFT); }
"<<"					{  
						  yybegin(YYINITIAL); 
						  yyparser.yylval = new OctaveToken(OctaveParser.LSHIFT, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.LSHIFT); }
[\r]?\n                      {  
						  yybegin(YYINITIAL); 
						  if (peekFlag || matrixIgnoreNL<=0)
						  {
						  	yyparser.yylval = new OctaveToken(OctaveParser.CR, yytext(), yyline, yycolumn, yychar);
						  	return(OctaveParser.CR);
						  } }
{WS}+               	{ 
						  yybegin(YYINITIAL); }
<<EOF>>    				{ 
						  if (functionDepth >= 1)
						  { 
							  yybegin(YYINITIAL);
							  yyparser.yylval = new OctaveToken(OctaveParser.EOF, yytext(), yyline, yycolumn, yychar);
							  return(OctaveParser.EOF);
						  } else {
						  	  return(0);
						  }	}						  			  
}	
<YYINITIAL> {
\"                      { 
                          returnState = YYINITIAL;
                          yybegin(DQSTRING); 
                          string.setLength(0);
                          myline = yyline;
                          mycolumn = yycolumn;
                          mychar = yychar; }
"'"                     { 
                          returnState = YYINITIAL;
                          yybegin(SQSTRING); 
                          string.setLength(0);
                          myline = yyline;
                          mycolumn = yycolumn;
                          mychar = yychar; }                        
}   					
<TRANSPOSABLE> 			{
"'"	       				{  
						  yybegin(TRANSPOSABLE);
						  yyparser.yylval = new OctaveToken(OctaveParser.TRANSPOSE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.TRANSPOSE); }
".'"			    	{  
						  yybegin(TRANSPOSABLE); 
						  yyparser.yylval = new OctaveToken(OctaveParser.TRANSPOSE, yytext(), yyline, yycolumn, yychar);
						  return(OctaveParser.TRANSPOSE); }						  						  
}		
<COMMAND>               {
{L}({L}|{D})*           {
                          yybegin(COMMAND);
                          yyparser.yylval = new OctaveToken(OctaveParser.COMMAND_STRING, yytext(), yyline, yycolumn, yychar);
                          return(OctaveParser.COMMAND_STRING); }
{WS}+                   { 
                          yybegin(COMMAND); } 
[\r]?\n                 {  
                          yybegin(YYINITIAL); 
                          yyparser.yylval = new OctaveToken(OctaveParser.CR, yytext(), yyline, yycolumn, yychar);
                          return(OctaveParser.CR); }  
";"                     {  
                          yybegin(YYINITIAL); 
                          yyparser.yylval = new OctaveToken(OctaveParser.SEMICOLON, yytext(), yyline, yycolumn, yychar);
                          return(OctaveParser.SEMICOLON); }
","                     {  
                          yybegin(YYINITIAL); 
                          yyparser.yylval = new OctaveToken(OctaveParser.COMMA, yytext(), yyline, yycolumn, yychar);
                          return(OctaveParser.COMMA); }
\"                      { 
                          returnState = COMMAND;
                          yybegin(DQSTRING); 
                          string.setLength(0);
                          myline = yyline;
                          mycolumn = yycolumn;
                          mychar = yychar; }
"'"                     { 
                          returnState = COMMAND;
                          yybegin(SQSTRING); 
                          string.setLength(0);
                          myline = yyline;
                          mycolumn = yycolumn;
                          mychar = yychar; }
}			
<YYINITIAL, TRANSPOSABLE, DQSTRING, COMMAND, SQSTRING, BLOCK_COMMENT> {
.                       { return(OctaveParser.LEX_ERROR); }	
}		 					 