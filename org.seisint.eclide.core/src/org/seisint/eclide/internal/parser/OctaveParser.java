<<<<<<< HEAD
//### This file created by BYACC 1.8(/Java extension  1.14)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";



package org.seisint.eclide.internal.parser;



//#line 2 "octave.y"
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
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.seisint.eclide.ast.OctaveASTListNode;
import org.seisint.eclide.ast.OctaveAnonFunctionHandleExpression;
import org.seisint.eclide.ast.OctaveAssignmentLHSExpression;
import org.seisint.eclide.ast.OctaveBinaryExpression;
import org.seisint.eclide.ast.OctaveCellExpression;
import org.seisint.eclide.ast.OctaveColonExpression;
import org.seisint.eclide.ast.OctaveConstant;
import org.seisint.eclide.ast.OctaveDoStatement;
import org.seisint.eclide.ast.OctaveExceptionStatement;
import org.seisint.eclide.ast.OctaveExpressionStatement;
import org.seisint.eclide.ast.OctaveForStatement;
import org.seisint.eclide.ast.OctaveFunctionDeclaration;
import org.seisint.eclide.ast.OctaveFunctionHandleExpression;
import org.seisint.eclide.ast.OctaveFunctionStatement;
import org.seisint.eclide.ast.OctaveGlobalStatement;
import org.seisint.eclide.ast.OctaveIdentifier;
import org.seisint.eclide.ast.OctaveIfStatement;
import org.seisint.eclide.ast.OctaveJumpStatement;
import org.seisint.eclide.ast.OctaveMatrixExpression;
import org.seisint.eclide.ast.OctaveParenthesisExpression;
import org.seisint.eclide.ast.OctavePersistentStatement;
import org.seisint.eclide.ast.OctavePostfixExpression;
import org.seisint.eclide.ast.OctaveStatement;
import org.seisint.eclide.ast.OctaveString;
import org.seisint.eclide.ast.OctaveSwitchStatement;
import org.seisint.eclide.ast.OctaveSymbolCallExpression;
import org.seisint.eclide.ast.OctaveSymbolCallExpression.OctaveDotCallExpression;
import org.seisint.eclide.ast.OctaveSymbolReference;
import org.seisint.eclide.ast.OctaveTranslationUnit;
import org.seisint.eclide.ast.OctaveUnaryExpression;
import org.seisint.eclide.ast.OctaveVariableDeclaration;
import org.seisint.eclide.ast.OctaveWhileStatement;
import org.seisint.eclide.ast.OctaveIfStatement.OctaveElseClause;
import org.seisint.eclide.ast.OctaveIfStatement.OctaveElseIfClause;
import org.seisint.eclide.core.OctclipsePlugin;

import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.ast.ASTListNode;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;
//#line 80 "OctaveParser.java"




public class OctaveParser
             extends AbstractSourceParser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//## **user defined:Object
String   yytext;//user variable to return contextual strings
Object yyval; //used to return semantic vals from action routines
Object yylval;//the 'lval' (result) I got from yylex()
Object valstk[] = new Object[YYSTACKSIZE];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
final void val_init()
{
  yyval=new Object();
  yylval=new Object();
  valptr=-1;
}
final void val_push(Object val)
{
  try {
    valptr++;
    valstk[valptr]=val;
  }
  catch (ArrayIndexOutOfBoundsException e) {
    int oldsize = valstk.length;
    int newsize = oldsize*2;
    Object[] newstack = new Object[newsize];
    System.arraycopy(valstk,0,newstack,0,oldsize);
    valstk = newstack;
    valstk[valptr]=val;
  }
}
final Object val_pop()
{
  return valstk[valptr--];
}
final void val_drop(int cnt)
{
  valptr -= cnt;
}
final Object val_peek(int relative)
{
  return valstk[valptr-relative];
}
//#### end semantic value section ####
public final static short IDENTIFIER=257;
public final static short CONSTANT=258;
public final static short STRING_LITERAL=259;
public final static short LE_OP=260;
public final static short GE_OP=261;
public final static short EQ_OP=262;
public final static short NE_OP=263;
public final static short IF=264;
public final static short ELSE=265;
public final static short ELSEIF=266;
public final static short WHILE=267;
public final static short FOR=268;
public final static short BREAK=269;
public final static short RETURN=270;
public final static short PERSISTENT=271;
public final static short CONTINUE=272;
public final static short FUNCTION=273;
public final static short TRANSPOSE=274;
public final static short CR=275;
public final static short GLOBAL=276;
public final static short DO=277;
public final static short UNTIL=278;
public final static short SWITCH=279;
public final static short CASE=280;
public final static short TRY=281;
public final static short CATCH=282;
public final static short UNWIND=283;
public final static short CLEANUP=284;
public final static short OTHERWISE=285;
public final static short END=286;
public final static short ENDFUNCTION=287;
public final static short ENDFOR=288;
public final static short ENDIF=289;
public final static short ENDWHILE=290;
public final static short ENDTRYCATCH=291;
public final static short ENDUNWINDPROTECT=292;
public final static short ENDSWITCH=293;
public final static short COMMENT=294;
public final static short CONTINUATION=295;
public final static short SEMICOLON=296;
public final static short COMMA=297;
public final static short COLON=298;
public final static short ASSIGN=299;
public final static short LPAREN=300;
public final static short RPAREN=301;
public final static short LBRACKET=302;
public final static short RBRACKET=303;
public final static short AND=304;
public final static short MINUS=305;
public final static short PLUS=306;
public final static short MULT=307;
public final static short DIV=308;
public final static short LDIV=309;
public final static short LT_OP=310;
public final static short GT_OP=311;
public final static short OR=312;
public final static short OR_OR=313;
public final static short AND_AND=314;
public final static short POW=315;
public final static short NOT=316;
public final static short PLUS_PLUS=317;
public final static short MINUS_MINUS=318;
public final static short LBRACE=319;
public final static short RBRACE=320;
public final static short DOT=321;
public final static short AT=322;
public final static short PLUS_EQ=323;
public final static short MINUS_EQ=324;
public final static short MULT_EQ=325;
public final static short DIV_EQ=326;
public final static short LDIV_EQ=327;
public final static short POW_EQ=328;
public final static short RSHIFT=329;
public final static short LSHIFT=330;
public final static short RSHIFT_EQ=331;
public final static short LSHIFT_EQ=332;
public final static short AND_EQ=333;
public final static short OR_EQ=334;
public final static short VARARGOUT=335;
public final static short VARARGIN=336;
public final static short EOF=337;
public final static short COMMAND_IDENTIFIER=338;
public final static short LEX_ERROR=339;
public final static short COMMAND_STRING=340;
public final static short UNARY=341;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    1,    1,    1,    2,    3,    4,    5,    6,    7,    7,
    7,    9,   10,   11,   11,   11,   12,   12,   13,   13,
   14,   16,   16,   16,   16,   16,   16,   16,   16,   18,
   18,   18,   20,   20,   20,   20,   20,   19,   19,   19,
   19,   19,   19,   21,   22,   22,   23,   23,   23,   23,
   23,   23,   23,   23,   23,   23,   23,   23,   23,   24,
   25,   28,   29,   29,   29,   29,   17,   17,   17,   30,
   30,   30,   30,   30,   30,   30,   30,   30,   30,   30,
   30,   31,   31,   31,   31,   31,   31,   32,   32,   33,
   33,   34,   34,   27,   27,   35,   35,   35,   35,   35,
   35,   42,   42,   43,   43,   26,   26,   26,   26,   44,
   44,   45,   45,   36,   36,   46,   47,    8,    8,   48,
   48,   49,   49,   50,   51,   51,   15,   15,   15,   15,
   15,   15,   52,   52,   53,   53,   37,   37,   37,   55,
   54,   38,   38,   38,   38,   56,   56,   60,   60,   61,
   61,   58,   58,   62,   62,   63,   63,   59,   57,   57,
   39,   39,   40,   40,   40,   64,   41,    0,    0,    0,
    0,   66,   66,   66,   67,   67,   67,   67,   68,   68,
   68,   65,   65,   65,   65,
};
final static short yylen[] = {                            2,
    1,    1,    1,    1,    1,    2,    1,    1,    2,    3,
    3,    1,    1,    2,    3,    3,    1,    1,    1,    1,
    1,    1,    4,    3,    3,    5,    2,    2,    2,    1,
    1,    2,    1,    1,    1,    1,    1,    3,    3,    3,
    3,    3,    3,    1,    1,    3,    1,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    3,    3,    3,    1,
    5,    2,    1,    1,    2,    2,    1,    1,    1,    1,
    3,    3,    3,    3,    3,    3,    3,    3,    3,    3,
    3,    1,    1,    1,    2,    2,    2,    0,    1,    0,
    1,    1,    2,    1,    1,    1,    1,    1,    1,    1,
    1,    0,    1,    2,    4,    1,    3,    1,    3,    1,
    3,    1,    2,    2,    2,    1,    1,    1,    2,    1,
    3,    1,    2,    0,    1,    1,    1,    1,    1,    3,
    3,    3,    1,    2,    3,    2,    3,    5,    6,    5,
    3,    5,    5,    7,    9,    1,    1,    1,    1,    1,
    1,    1,    1,    1,    1,    1,    1,    3,    4,    5,
    7,    7,    1,    1,    1,    1,    5,    2,    3,    1,
    2,    1,    1,    1,    2,    3,    3,    5,    1,    3,
    4,    1,    3,    3,    3,
};
final static short yydefred[] = {                         0,
    1,    2,    3,    0,    0,    0,  163,  164,    0,  165,
  166,   92,    0,    0,    0,    0,    0,   34,   33,   37,
   35,   36,   60,    0,    0,   22,    0,   94,    0,   31,
    0,   47,    0,    0,    0,   67,    0,   68,    0,    0,
    0,   95,   96,   97,   98,   99,  100,  101,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  112,    0,
    0,   84,   83,   82,    0,    0,    0,    0,    0,   64,
   63,    0,   27,    4,   28,   29,   12,    0,   17,   18,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  104,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   93,  168,    0,    0,    0,
    0,    0,    0,  182,    0,  147,  146,  137,    0,    0,
  134,  136,    0,    0,    0,    0,  113,   87,   86,   85,
    0,    0,    0,    0,   66,   65,   25,    0,  117,  116,
    5,   13,   19,   20,   24,    0,    0,  127,  128,  129,
    0,    0,    0,    0,    0,   41,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   48,   49,  106,
  108,    0,   71,   72,   73,   74,   75,   76,   77,   81,
   80,   78,   79,  169,    0,    0,    0,  175,    0,    0,
    0,    0,    0,  135,    0,    0,    0,    0,    0,  111,
    0,    0,    0,    0,    0,    0,   23,  125,  126,    0,
    0,    0,  105,    0,  183,  180,    0,  177,    0,  176,
  184,    0,  185,  141,    0,  149,  148,  142,    0,    0,
  143,    0,    0,    0,  153,  152,  138,    0,    0,    0,
   26,  131,  130,  132,  107,  109,   61,  181,    0,  174,
  173,  172,  167,    0,    0,    0,    0,    0,    0,  139,
    0,    0,  178,  140,    0,  151,  150,  144,  159,    0,
  158,  155,  154,  161,  157,  156,  162,    0,  160,  145,
};
final static short yydgoto[] = {                         25,
   26,   79,  153,    0,    0,    0,    0,    0,   80,  154,
    0,   81,  155,  156,  157,   27,   28,   29,   30,   31,
   32,   33,   34,   35,   36,  182,   37,   38,   72,   39,
   65,   66,   40,   41,   42,   43,   44,   45,   46,   47,
   48,   49,   50,   59,   60,  159,  160,    0,    0,  219,
  220,   53,   54,  131,  132,  128,  213,  247,  248,  238,
  278,  284,  287,   51,  122,  263,  123,  124,
};
final static short yysindex[] = {                      2956,
    0,    0,    0, -242, -242, 2233,    0,    0, -215,    0,
    0,    0, -215, -123, -242, -123, -123,    0,    0,    0,
    0,    0,    0, -253,    0,    0, -115,    0, -197,    0,
  329,    0, -279, 2147, -183,    0, -123,    0, 2347, 3146,
 -224,    0,    0,    0,    0,    0,    0,    0, -272, -123,
 -232, -123, -207,  -43, -123, 2230, 2422, -145,    0, -215,
 -215,    0,    0,    0, -114, 3146, -123, 3146, 3146,    0,
    0, -252,    0,    0,    0,    0,    0, -228,    0,    0,
 -249, 2230, 2230, 2230, 2230, 2230, 2230, -214, 2230, 2230,
 2230, 2230, 2230, 2230, 2230, 2230, 2230, 2230, 2230, 2230,
 2230, -239,    0, -242, -242, -242, -242, -242, -242, -242,
 -242, -242, -242, -242, -169,    0,    0, 3146, -164, -244,
 -124, -123, -113,    0, 3146,    0,    0,    0, -123, -123,
    0,    0, 3146, 2657, -242, -242,    0,    0,    0,    0,
 -107,  -73,  -83,  -57,    0,    0,    0, -242,    0,    0,
    0,    0,    0,    0,    0, -277,  -86,    0,    0,    0,
  -84,  -84,  -84,  -84,  -84,    0,  -99,  -77,  -77,  -77,
  -77, -216,  -77,  -77, -216, -216, -216,    0,    0,    0,
    0, -247,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0, -123,   -8, -243,    0,  -28, -219,
   -8, 2564,   -8,    0, 3146, -242, -184, -242, -123,    0,
 -242, -242,  -67, -123, -123,   -6,    0,    0,    0, 2481,
 -235, 3146,    0,   -4,    0,    0, -104,    0, -236,    0,
    0, -275,    0,    0, -123,    0,    0,    0,    2, 3146,
    0, -123, -242, -123,    0,    0,    0, -254, 3146, 3146,
    0,    0,    0,    0,    0,    0,    0,    0,   -2,    0,
    0,    0,    0, 3146, -123, -258, 3146, -123, 3146,    0,
 -225, -130,    0,    0, 3146,    0,    0,    0,    0, 3146,
    0,    0,    0,    0,    0,    0,    0, -258,    0,    0,
};
final static short yyrindex[] = {                        20,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0, 2987,    0, 3059, 3090,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  500,    0,  753,    0,
    0,    0,  671, 1664,    0,    0, 2157,    0, 2075,   40,
 2386,    0,    0,    0,    0,    0,    0,    0,  304, 2239,
    0, -126,    0, -152, 2620,    0,    0, 1746,    0, 1828,
 1910,    0,    0,    0, 2314,   42,   57,   96,   38,    0,
    0, 1993,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    1,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  383,    0,    0,    0, -109,    0,
    0,    0,    0,    0, -117,    0,    0,    0, 2676,  -81,
    0,    0,  -92,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0, 3173,    0,    0,    0,
   83,  165,  247,  336,  418,    0,  582,  835,  917, 1006,
 1088, 1335, 1170, 1252, 1417, 1499, 1581,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0, 2157,    0,    0,    0,    0,    0,
    0, -260,    0,    0,  -69,    0,    0,    0, 2732,    0,
    0,    0,    0, 2788, 2844,    0,    0,    0,    0,    0,
    0,    0,    0, -109,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0, -126,    0,    0,    0,    0,  -44,
    0, 2489,    0, 2900,    0,    0,    0,    0, -102, -128,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0, -117, 2732,    0,  -47, 2489, -238,    0,
    0,    0,    0,    0,  -44,    0,    0,    0,    0,  -47,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  229,    0,    0,  355, 2606, 1889,    0,    0,
    0,    0,   29,    0,    0, -116, -118,    0,    0,    0,
  276,  -14,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  -35,    0,  195,  389,  184,  199,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  191,    0,    0,
  171,    0,    0,    0,    0,    0,    0,   47,
};
final static int YYTABLESIZE=3511;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        195,
   32,   68,   69,  200,  115,   70,  145,    1,    2,    3,
  260,  261,  180,  180,    1,    2,    3,  180,   89,   90,
  255,  255,  103,  151,  119,  102,  102,  276,  147,  277,
  141,  245,  143,  144,   57,  118,  149,  125,  246,  102,
  133,   58,  152,   90,   91,   92,   93,  102,  150,  221,
  116,  151,  142,  222,  102,   18,   19,  226,  198,   73,
  282,  262,   18,   19,  117,  283,   20,   21,   22,  120,
  152,  148,   23,   20,   21,   22,  102,  229,  126,   23,
  227,  127,   43,  230,  134,   74,   71,  146,   24,  204,
  199,  181,  181,   95,   96,   24,  181,  207,  259,  256,
  256,  236,  121,  257,   77,  237,   78,   82,   83,   84,
   85,   86,  100,  101,  205,  206,  102,   87,  168,  169,
  170,  171,  172,  173,  174,  175,  176,  177,  178,  179,
   88,   88,   88,  133,  196,  197,  133,   88,   88,   88,
   88,   88,   88,   88,   88,   88,   88,  102,  102,   88,
   88,   62,   88,  136,   88,  285,   88,  102,   73,   88,
  138,  286,   88,  102,   42,  179,  232,  194,  102,  234,
  211,  102,   63,   64,  201,   88,   88,   88,   88,   88,
  223,  139,  140,  102,   74,  203,  179,  179,  102,   88,
   88,   88,  221,  102,  240,   88,  258,  102,  214,  249,
  250,   75,   76,   77,  266,   78,  212,   84,   85,   86,
  218,   88,  243,  271,  272,   87,  102,  244,  245,  102,
  264,  129,  130,   88,   88,  246,  215,  267,  274,  269,
   87,  279,  102,  281,   88,   88,   88,  102,  102,  288,
   88,  102,  225,  102,  289,  102,   38,  231,  224,  233,
  275,  100,  101,  280,  137,  137,   88,   32,   32,   32,
   32,   32,   32,   32,   32,   32,   32,   32,   32,   32,
   32,   32,   32,   32,  228,   32,   32,   32,   32,   32,
   32,   32,   32,   32,   32,   32,   32,   32,   32,   32,
   32,   32,   32,   32,  251,  197,   32,   32,   32,   32,
  273,   32,  265,  170,   32,   32,   32,   32,   32,   32,
   32,   32,   32,   32,   32,   32,   32,   32,   32,  102,
   32,  102,   32,   32,   32,   32,   32,   32,   32,   32,
   32,   32,   32,   32,   32,   39,   88,   32,   32,   43,
   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
   43,   43,   43,   43,   43,   43,   90,   43,   43,   43,
   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
   43,   43,   43,   43,   43,   43,  102,  102,   43,   43,
   43,   43,  171,   43,  217,   88,   43,   43,   43,   43,
   43,   43,   43,   43,   43,   43,   43,  202,   43,   43,
   43,   61,   43,  253,   43,   43,   43,   43,   43,   43,
   43,   43,   43,   43,   43,   43,   43,   40,  254,   43,
   43,   42,   42,   42,   42,   42,   42,   42,   42,   42,
   42,   42,   42,   42,   42,   42,   42,   42,  270,   42,
   42,   42,   42,   42,   42,   42,   42,   42,   42,   42,
   42,   42,   42,   42,   42,   42,   42,   42,  290,    0,
   42,   42,   42,   42,    0,   42,    0,    0,   42,   42,
   42,   42,   42,   42,   42,   42,   42,   42,   42,    0,
   42,   42,   42,    0,   42,    0,   42,   42,   42,   42,
   42,   42,   42,   42,   42,   42,   42,   42,   42,   30,
    0,   42,   42,   38,   38,   38,   38,   38,   38,   38,
   38,   38,   38,   38,   38,   38,   38,   38,   38,   38,
    0,   38,   38,   38,   38,   38,   38,   38,   38,   38,
   38,   38,   38,   38,   38,   38,   38,   38,   38,   38,
    0,    0,   38,   38,   38,   38,    0,   38,    0,    0,
   38,   38,   38,   38,   38,   38,   38,   38,   38,   38,
   38,    0,   38,   38,   38,    0,   38,    0,   38,   38,
   38,   38,   38,   38,   38,   38,   38,   38,   38,   38,
   38,   46,    0,   38,   38,    1,    2,    3,    0,    0,
    0,    0,   39,   39,   39,   39,   39,   39,   39,   39,
   39,   39,   39,   39,   39,   39,   39,   39,   39,    0,
   39,   39,   39,   39,   39,   39,   39,   39,   39,   39,
   39,   39,   39,   39,   39,   39,   39,   39,   39,    0,
    0,   39,   39,   39,   39,    0,   39,    0,    0,   39,
   39,   39,   39,   39,   39,   39,   39,   39,   39,   39,
    0,   39,   39,   39,    0,   39,    0,   39,   39,   39,
   39,   39,   39,   39,   39,   39,   39,   39,   39,   39,
   44,    0,   39,   39,   40,   40,   40,   40,   40,   40,
   40,   40,   40,   40,   40,   40,   40,   40,   40,   40,
   40,    0,   40,   40,   40,   40,   40,   40,   40,   40,
   40,   40,   40,   40,   40,   40,   40,   40,   40,   40,
   40,    0,    0,   40,   40,   40,   40,    0,   40,    0,
    0,   40,   40,   40,   40,   40,   40,   40,   40,   40,
   40,   40,    0,   40,   40,   40,    0,   40,    0,   40,
   40,   40,   40,   40,   40,   40,   40,   40,   40,   40,
   40,   40,   45,    0,   40,   40,   30,   30,   30,   30,
   30,   30,   30,   30,   30,   30,   30,   30,   30,   30,
   30,   30,   30,    0,   30,   30,   30,   30,   30,   30,
   30,   30,   30,   30,   30,   30,   30,   30,   30,   30,
   30,   30,   30,    0,    0,   30,   30,   30,   30,    0,
   30,    0,    0,   30,   30,   30,   30,   30,   30,   30,
   30,   30,   30,   30,   30,   30,    0,    0,    0,   30,
    0,   30,   30,   30,   30,   30,   30,   30,   30,   30,
   30,   30,   30,   30,   52,    0,   30,   30,   46,   46,
   46,   46,   46,   46,   46,   46,   46,   46,   46,   46,
   46,   46,   46,   46,   46,    0,   46,   46,   46,   46,
   46,   46,   46,   46,   46,   46,   46,   46,   46,   46,
   46,   46,   46,   46,   46,    0,    0,   46,   46,   46,
   46,    0,   46,    0,    0,   46,   46,   46,    0,    0,
    0,   46,   46,   46,   46,   46,    0,   46,   46,   46,
    0,   46,    0,   46,   46,   46,   46,   46,   46,   46,
   46,   46,   46,   46,   46,   46,   53,    0,   46,   46,
    0,    0,    0,    0,    0,    0,    0,   44,   44,   44,
   44,   44,   44,   44,   44,   44,   44,   44,   44,   44,
   44,   44,   44,   44,    0,   44,   44,   44,   44,   44,
   44,   44,   44,   44,   44,   44,   44,   44,   44,   44,
   44,   44,   44,   44,    0,    0,   44,   44,    0,   44,
    0,   44,    0,    0,   44,   44,   44,    0,    0,    0,
   44,   44,   44,   44,   44,    0,   44,   44,   44,    0,
   44,    0,   44,   44,   44,   44,   44,   44,   44,   44,
   44,   44,   44,   44,   44,   54,    0,   44,   44,   45,
   45,   45,   45,   45,   45,   45,   45,   45,   45,   45,
   45,   45,   45,   45,   45,   45,    0,   45,   45,   45,
   45,   45,   45,   45,   45,   45,   45,   45,   45,   45,
   45,   45,   45,   45,   45,   45,    0,    0,   45,   45,
   45,   45,    0,   45,    0,    0,   45,    0,    0,    0,
    0,    0,   45,   45,   45,   45,   45,    0,   45,   45,
   45,    0,   45,    0,   45,   45,   45,   45,   45,   45,
   45,   45,   45,   45,   45,   45,   45,   55,    0,   45,
   45,   52,   52,   52,   52,   52,   52,   52,   52,   52,
   52,   52,   52,   52,   52,   52,   52,   52,    0,   52,
   52,   52,   52,   52,   52,   52,   52,   52,   52,   52,
   52,   52,   52,   52,   52,   52,   52,   52,    0,    0,
   52,   52,   52,   52,    0,   52,    0,    0,   52,   52,
   52,    0,    0,    0,   52,   52,   52,   52,   52,    0,
   52,   52,   52,    0,   52,    0,   52,   52,   52,   52,
   52,   52,   52,    0,    0,   52,   52,   52,   52,   50,
    0,   52,   52,   53,   53,   53,   53,   53,   53,   53,
   53,   53,   53,   53,   53,   53,   53,   53,   53,   53,
    0,   53,   53,   53,   53,   53,   53,   53,   53,   53,
   53,   53,   53,   53,   53,   53,   53,   53,   53,   53,
    0,    0,   53,   53,   53,   53,    0,   53,    0,    0,
   53,   53,   53,    0,    0,    0,   53,   53,   53,   53,
   53,    0,   53,   53,   53,    0,   53,    0,   53,   53,
   53,   53,   53,   53,   53,    0,    0,   53,   53,   53,
   53,   51,    0,   53,   53,    0,    0,    0,    0,    0,
    0,    0,   54,   54,   54,   54,   54,   54,   54,   54,
   54,   54,   54,   54,   54,   54,   54,   54,   54,    0,
   54,   54,   54,   54,   54,   54,   54,   54,   54,   54,
   54,   54,   54,   54,   54,   54,   54,   54,   54,    0,
    0,   54,   54,   54,   54,    0,   54,    0,    0,   54,
   54,   54,    0,    0,    0,   54,   54,   54,   54,   54,
    0,   54,   54,   54,    0,   54,    0,   54,   54,   54,
   54,   54,   54,   54,   56,    0,   54,   54,   54,   54,
    0,    0,   54,   54,   55,   55,   55,   55,   55,   55,
   55,   55,   55,   55,   55,   55,   55,   55,   55,   55,
   55,    0,   55,   55,   55,   55,   55,   55,   55,   55,
   55,   55,   55,   55,   55,   55,   55,   55,   55,   55,
   55,    0,    0,   55,   55,   55,   55,    0,   55,    0,
    0,   55,   55,   55,    0,    0,    0,   55,   55,   55,
   55,   55,    0,   55,   55,   55,    0,   55,    0,   55,
   55,   55,   55,   55,   55,   55,   58,    0,   55,   55,
   55,   55,    0,    0,   55,   55,   50,   50,   50,   50,
   50,   50,   50,   50,   50,   50,   50,   50,   50,   50,
   50,   50,   50,    0,   50,   50,   50,   50,   50,   50,
   50,   50,   50,   50,   50,   50,   50,   50,   50,   50,
   50,   50,   50,    0,    0,   50,   50,   50,   50,    0,
   50,    0,    0,   50,   50,   50,    0,    0,    0,   50,
   50,   50,   50,   50,    0,   50,   50,   50,    0,   50,
    0,   50,   50,   50,   50,   50,   50,   50,   59,    0,
   50,   50,   50,   50,    0,    0,   50,   50,   51,   51,
   51,   51,   51,   51,   51,   51,   51,   51,   51,   51,
   51,   51,   51,   51,   51,    0,   51,   51,   51,   51,
   51,   51,   51,   51,   51,   51,   51,   51,   51,   51,
   51,   51,   51,   51,   51,    0,    0,   51,   51,   51,
   51,    0,   51,    0,    0,   51,   51,   51,    0,    0,
    0,   51,   51,   51,   51,   51,    0,   51,   51,   51,
    0,   51,    0,   51,   51,   51,   51,   51,   51,   51,
   57,    0,   51,   51,   51,   51,    0,    0,   51,   51,
    0,   56,   56,   56,    0,    0,    0,    0,   56,   56,
   56,   56,   56,   56,   56,   56,   56,   56,    0,   56,
   56,   56,   56,   56,   56,   56,   56,   56,   56,   56,
   56,   56,   56,   56,   56,   56,   56,   56,    0,    0,
   56,   56,   56,   56,    0,   56,    0,    0,   56,   56,
   56,    0,    0,    0,    0,    0,   56,   56,   56,    0,
   56,   56,   56,    0,   56,    0,   56,   56,   56,   56,
   56,   56,   56,   70,    0,   56,   56,   56,   56,    0,
    0,   56,   56,   58,   58,   58,    0,    0,    0,    0,
   58,   58,   58,   58,   58,   58,   58,   58,   58,   58,
    0,   58,   58,   58,   58,   58,   58,   58,   58,   58,
   58,   58,   58,   58,   58,   58,   58,   58,   58,   58,
    0,    0,   58,   58,   58,   58,    0,   58,    0,    0,
   58,   58,   58,    0,    0,    0,    0,    0,   58,   58,
   58,    0,   58,   58,   58,    0,   58,    0,   58,   58,
   58,   58,   58,   58,   58,  110,    0,   58,   58,   58,
   58,    0,    0,   58,   58,   59,   59,   59,    0,    0,
    0,    0,   59,   59,   59,   59,   59,   59,   59,   59,
   59,   59,    0,   59,   59,   59,   59,   59,   59,   59,
   59,   59,   59,   59,   59,   59,   59,   59,   59,   59,
   59,   59,    0,    0,   59,   59,   59,   59,    0,   59,
    0,    0,   59,   59,   59,    0,    0,    0,    0,    0,
   59,   59,   59,    0,   59,   59,   59,    0,   59,    0,
   59,   59,   59,   59,   59,   59,   59,  115,    0,   59,
   59,   59,   59,    0,    0,   59,   59,   57,   57,   57,
    0,    0,    0,    0,   57,   57,   57,   57,   57,   57,
   57,   57,   57,   57,    0,   57,   57,   57,   57,   57,
   57,   57,   57,   57,   57,   57,   57,   57,   57,   57,
   57,   57,   57,   57,    0,    0,   57,   57,   57,   57,
    0,   57,    0,    0,   57,   57,   57,    0,    0,    0,
    0,    0,   57,   57,   57,    0,   57,   57,   57,    0,
   57,    0,   57,   57,   57,   57,   57,   57,   57,  114,
    0,   57,   57,   57,   57,    0,    0,   57,   57,    0,
   70,   70,   70,    0,    0,    0,    0,   70,   70,   70,
   70,   70,   70,   70,   70,   70,   70,    0,   70,   70,
   70,   70,   70,   70,   70,   70,   70,   70,   70,   70,
   70,   70,   70,   70,   70,   70,   70,    0,    0,   70,
   70,   70,   70,    0,   70,    0,    0,    0,   70,   70,
  161,  162,  163,  164,  165,  166,    0,  167,    0,   70,
   70,   70,    0,   70,    0,   70,   70,   70,   70,   70,
   70,   70,   62,    0,   70,   70,   70,   70,    0,    0,
   70,   70,  110,  110,  110,    0,    0,    0,    0,  110,
  110,  110,  110,  110,  110,  110,  110,  110,  110,    0,
  110,  110,  110,  110,  110,  110,  110,  110,  110,  110,
  110,  110,  110,  110,  110,  110,  110,  110,  110,    0,
    0,  110,  110,  110,    0,    0,  110,    0,    0,    0,
  110,  110,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  110,  110,  110,    0,  110,    0,  110,  110,  110,
  110,  110,  110,  110,   69,    0,  110,  110,  110,  110,
    0,    0,  110,  110,    0,  115,  115,    0,    0,    0,
    0,  115,  115,  115,  115,  115,  115,  115,  115,  115,
  115,    0,  115,  115,  115,  115,  115,  115,  115,  115,
  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,
  115,    0,    0,  115,  115,  115,  115,    0,  115,    0,
    0,    0,  115,  115,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  115,  115,  115,    0,  115,    0,  115,
  115,  115,  115,  115,  115,  115,   88,    0,  115,  115,
  115,  115,    0,    0,  115,  115,    0,  114,  114,    0,
    0,    0,    0,  114,  114,  114,  114,  114,  114,  114,
  114,  114,  114,    0,  114,  114,  114,  114,  114,  114,
  114,  114,  114,  114,  114,  114,  114,  114,  114,  114,
  114,  114,  114,    0,    0,  114,  114,  114,  114,    0,
  114,    0,    0,    0,  114,  114,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  114,  114,  114,    0,  114,
    0,  114,  114,  114,  114,  114,  114,  114,  103,    0,
  114,  114,  114,  114,    0,    0,  114,  114,    0,   62,
   62,    0,    0,    0,    0,    0,   62,   62,   62,   62,
   62,   62,   62,   62,   62,   62,    0,   62,   62,   62,
   62,   62,   62,   62,   62,   62,   62,   62,   62,   62,
   62,   62,   62,   62,   62,   62,    0,    0,   62,   62,
   62,   62,    0,   62,    0,    0,    0,   62,   62,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   62,   62,
   62,    0,   62,   89,   62,   62,   62,   62,   62,   62,
   62,    0,    0,   62,   62,   62,   62,    0,    0,   62,
   62,   69,   69,   69,    0,    0,    0,    0,   69,   69,
   69,   69,   69,   69,   69,   69,   69,   69,    0,   69,
   69,   69,   69,   69,   69,   69,   69,   69,   69,   69,
   69,   69,   69,   69,   69,   69,   69,   69,    0,    0,
   69,   69,   69,    0,    0,   69,    0,    0,    0,   69,
   69,    0,    0,    0,    0,   91,    0,    0,    0,    0,
   69,   69,   69,    0,   69,    0,   69,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   90,   91,   92,   93,
    0,   69,   69,   88,   88,   88,    0,    0,    0,    0,
   88,   88,   88,   88,   88,   88,   88,   88,   88,   88,
    0,    0,   88,   88,   88,   88,   88,   88,   88,   88,
   88,   88,   88,   88,   88,   88,   88,   88,   88,   88,
   94,    0,    0,    0,    0,    0,   95,   96,   97,   98,
   99,   88,   88,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   88,   88,   88,  100,  101,    0,   88,    0,
    0,    0,    0,    0,    0,    0,    1,    2,    3,    1,
    2,    3,    0,   88,   88,   88,   88,   88,    0,    0,
    0,    0,   88,  103,  103,   88,   88,   88,   88,   88,
   88,   88,    0,    0,   88,   88,  103,   88,  103,   88,
  103,   88,  103,  103,  103,  103,  103,  103,  103,  103,
  103,  103,   56,    0,   18,   19,    0,   18,   19,    0,
    0,    0,    0,   88,   88,   20,   21,   22,   20,   21,
   22,    0,    0,    0,   88,   88,   88,    0,    0,    0,
   88,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   89,   89,   89,    0,    0,  103,   88,   89,   89,   89,
   89,   89,   89,   89,   89,   89,   89,    0,    0,   89,
   89,   89,   89,   89,   89,   89,   89,   89,   89,   89,
   89,   89,   89,   89,   89,   89,   89,    0,    0,   52,
   55,    0,    0,    0,    0,    0,    0,    0,   89,   89,
   67,    0,    0,    0,    0,    0,    0,    0,    0,   89,
   89,   89,    0,    0,    0,   89,    0,    0,    0,    0,
    0,    0,   91,   91,   91,  104,    0,    0,    0,   91,
   89,   89,   91,   91,   91,   91,   91,   91,   91,    0,
    0,   91,   91,    0,   91,    0,   91,    0,   91,  105,
  106,  107,  108,  109,  110,    0,    0,  111,  112,  113,
  114,   90,   91,   92,   93,    0,  158,    0,    0,    0,
   91,   91,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   91,   91,   91,    0,    0,    0,   91,    0,  183,
  184,  185,  186,  187,  188,  189,  190,  191,  192,  193,
  135,    0,   91,   91,    0,   94,    0,    0,    0,    0,
    0,   95,   96,   97,   98,   99,    0,    1,    2,    3,
  209,  210,    0,    0,    0,   88,   88,   88,    0,    0,
  100,  101,   88,  216,    0,   88,   88,   88,   88,   88,
   88,   88,    0,    0,   88,   88,  149,   88,   88,   88,
    0,   88,    0,   88,   88,    0,    0,    0,  150,    0,
    0,   88,    0,    0,    0,   18,   19,    0,    0,    0,
    0,    0,    0,   88,   88,    0,   20,   21,   22,    0,
    0,    0,   23,    0,   88,   88,   88,    0,    0,    0,
   88,  235,    0,  239,    0,    0,  241,  242,   24,    0,
    1,    2,    3,    0,    0,  252,   88,    4,    0,    0,
    5,    6,    7,    8,    9,   10,   11,    0,  138,   13,
   14,    0,   15,    0,   16,    0,   17,    0,  268,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  139,
  140,    0,    0,    0,    0,    0,    0,    0,   18,   19,
    0,    0,    0,    0,    0,    0,   88,   88,   88,   20,
   21,   22,    0,   88,    0,   23,   88,   88,   88,   88,
   88,   88,   88,    0,    0,   88,   88,    0,   88,    0,
   88,   24,   88,    0,    0,   88,    0,    0,    0,   88,
    0,    0,    0,    0,    0,    0,   90,   91,   92,   93,
    0,    0,    0,    0,   88,   88,    0,    0,    0,    0,
    0,    0,   88,   88,   88,   88,   88,   88,    0,   88,
    0,   88,   88,   88,   88,   88,   88,   88,   88,    0,
    0,   88,   88,    0,   88,  208,   88,   88,   88,    0,
   94,   88,    0,    0,   88,    0,   95,   96,   97,   98,
   99,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   88,   88,    0,    0,    0,  100,  101,    0,   88,   88,
   88,   88,   88,   88,    0,   88,    0,   88,   88,   88,
   88,   88,   88,   88,   88,    0,    0,   88,   88,    0,
   88,    0,   88,   88,   88,    0,    0,   88,    0,   88,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   88,   88,    0,    0,
    0,    0,    0,    0,   88,   88,   88,   88,   88,   88,
    0,   88,    0,   88,   88,   88,   88,   88,   88,   88,
   88,    0,    0,   88,   88,    0,   88,    0,   88,   88,
   88,    0,    0,   88,    0,    0,    0,    0,   88,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   88,   88,    0,    0,    0,    0,    0,    0,
   88,   88,   88,   88,   88,   88,    0,   88,    0,   88,
   88,   88,   88,   88,   88,   88,   88,    0,    0,   88,
   88,    0,   88,    0,   88,   88,   88,    0,    0,   88,
    0,    0,    0,    0,    0,   88,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   88,   88,
    0,    0,    0,    0,    0,    0,   88,   88,   88,   88,
   88,   88,    0,   88,    0,   88,   88,   88,   88,   88,
   88,   88,   88,    0,    0,   88,   88,    0,   88,    0,
   88,   88,   88,    0,    0,   88,    0,    0,    0,    0,
    0,    0,   88,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   88,   88,    0,    0,    0,    0,
    0,    0,    1,    2,    3,   88,   88,   88,    0,    4,
    0,   88,    5,    6,    7,    8,    9,   10,   11,    0,
   12,   13,   14,    0,   15,    0,   16,   88,   17,    0,
    0,    0,    0,   88,   88,   88,    0,    0,    0,    0,
   88,    0,    0,   88,   88,   88,   88,   88,   88,   88,
   18,   19,   88,   88,   88,   88,    0,   88,    0,   88,
    0,   20,   21,   22,    0,    0,    0,   23,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   88,   88,   24,    0,    0,    0,    0,    0,    0,
    0,    0,   88,   88,   88,    0,    0,    0,   88,    0,
    0,    0,    0,    0,    0,   88,   88,   88,    0,    0,
    0,    0,   88,    0,   88,   88,   88,   88,   88,   88,
   88,   88,    0,    0,   88,   88,    0,   88,    0,   88,
   88,   88,    0,    0,    0,    0,   88,   88,   88,    0,
    0,    0,    0,   88,    0,    0,   88,   88,   88,   88,
   88,   88,   88,   88,   88,   88,   88,    0,   88,    0,
   88,    0,   88,   88,   88,   88,   88,    0,    0,    0,
   88,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   88,   88,   88,    0,    0,    0,
    0,    0,    1,    2,    3,   88,   88,   88,    0,    4,
    0,   88,    5,    6,    7,    8,    9,   10,   11,    0,
    0,   13,   14,    0,   15,    0,   16,   88,   17,  124,
  124,  124,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   18,   19,    0,    0,    0,    0,    0,    0,  124,    0,
    0,   20,   21,   22,    0,    0,    0,   23,    0,    0,
  124,    0,    0,   21,    0,    0,    0,  124,  124,    0,
    0,    0,    0,   24,    0,    0,    0,    0,  124,  124,
  124,    0,   21,    0,  124,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  124,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                        118,
    0,   16,   17,  120,   40,  259,  259,  257,  258,  259,
  286,  287,  257,  257,  257,  258,  259,  257,  298,    0,
  257,  257,   37,  301,  257,  286,  287,  286,  257,  288,
   66,  286,   68,   69,    6,   50,  286,   52,  293,    0,
   55,  257,  320,  260,  261,  262,  263,  286,  298,  297,
  275,  301,   67,  301,  293,  305,  306,  301,  303,  274,
  286,  337,  305,  306,  337,  291,  316,  317,  318,  302,
  320,  300,  322,  316,  317,  318,  337,  297,  286,  322,
  197,  289,    0,  303,   56,  300,  340,  340,  338,  125,
  335,  336,  336,  310,  311,  338,  336,  133,  335,  336,
  336,  286,  335,  222,  319,  290,  321,  305,  306,  307,
  308,  309,  329,  330,  129,  130,  300,  315,   90,   91,
   92,   93,   94,   95,   96,   97,   98,   99,  100,  101,
  257,  258,  259,  286,  299,  300,  289,  264,  265,  266,
  267,  268,  269,  270,  271,  272,  273,  265,  266,  276,
  277,  275,  279,  299,  281,  286,  283,  286,  274,  286,
  275,  292,  289,  292,    0,  275,  202,  337,  286,  205,
  278,  289,  296,  297,  299,  257,  258,  259,  305,  306,
  195,  296,  297,  286,  300,  299,  296,  297,  291,  316,
  317,  318,  297,  286,  209,  322,  301,  290,  282,  214,
  215,  317,  318,  319,  240,  321,  280,  307,  308,  309,
  297,  338,  280,  249,  250,  315,  286,  285,  286,  289,
  235,  265,  266,  305,  306,  293,  284,  242,  264,  244,
  315,  267,  280,  269,  316,  317,  318,  285,  286,  275,
  322,  286,  196,  288,  280,  293,    0,  201,  257,  203,
  265,  329,  330,  268,   60,   61,  338,  257,  258,  259,
  260,  261,  262,  263,  264,  265,  266,  267,  268,  269,
  270,  271,  272,  273,  303,  275,  276,  277,  278,  279,
  280,  281,  282,  283,  284,  285,  286,  287,  288,  289,
  290,  291,  292,  293,  301,  300,  296,  297,  298,  299,
  303,  301,  301,    0,  304,  305,  306,  307,  308,  309,
  310,  311,  312,  313,  314,  315,  316,  317,  318,  278,
  320,  284,  322,  323,  324,  325,  326,  327,  328,  329,
  330,  331,  332,  333,  334,    0,  280,  337,  338,  257,
  258,  259,  260,  261,  262,  263,  264,  265,  266,  267,
  268,  269,  270,  271,  272,  273,  337,  275,  276,  277,
  278,  279,  280,  281,  282,  283,  284,  285,  286,  287,
  288,  289,  290,  291,  292,  293,  337,  282,  296,  297,
  298,  299,    0,  301,  156,   31,  304,  305,  306,  307,
  308,  309,  310,  311,  312,  313,  314,  122,  316,  317,
  318,   13,  320,  220,  322,  323,  324,  325,  326,  327,
  328,  329,  330,  331,  332,  333,  334,    0,  220,  337,
  338,  257,  258,  259,  260,  261,  262,  263,  264,  265,
  266,  267,  268,  269,  270,  271,  272,  273,  248,  275,
  276,  277,  278,  279,  280,  281,  282,  283,  284,  285,
  286,  287,  288,  289,  290,  291,  292,  293,  288,   -1,
  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,  305,
  306,  307,  308,  309,  310,  311,  312,  313,  314,   -1,
  316,  317,  318,   -1,  320,   -1,  322,  323,  324,  325,
  326,  327,  328,  329,  330,  331,  332,  333,  334,    0,
   -1,  337,  338,  257,  258,  259,  260,  261,  262,  263,
  264,  265,  266,  267,  268,  269,  270,  271,  272,  273,
   -1,  275,  276,  277,  278,  279,  280,  281,  282,  283,
  284,  285,  286,  287,  288,  289,  290,  291,  292,  293,
   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,
  304,  305,  306,  307,  308,  309,  310,  311,  312,  313,
  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,
  324,  325,  326,  327,  328,  329,  330,  331,  332,  333,
  334,    0,   -1,  337,  338,  257,  258,  259,   -1,   -1,
   -1,   -1,  257,  258,  259,  260,  261,  262,  263,  264,
  265,  266,  267,  268,  269,  270,  271,  272,  273,   -1,
  275,  276,  277,  278,  279,  280,  281,  282,  283,  284,
  285,  286,  287,  288,  289,  290,  291,  292,  293,   -1,
   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,
  305,  306,  307,  308,  309,  310,  311,  312,  313,  314,
   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,  324,
  325,  326,  327,  328,  329,  330,  331,  332,  333,  334,
    0,   -1,  337,  338,  257,  258,  259,  260,  261,  262,
  263,  264,  265,  266,  267,  268,  269,  270,  271,  272,
  273,   -1,  275,  276,  277,  278,  279,  280,  281,  282,
  283,  284,  285,  286,  287,  288,  289,  290,  291,  292,
  293,   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,
   -1,  304,  305,  306,  307,  308,  309,  310,  311,  312,
  313,  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,
  323,  324,  325,  326,  327,  328,  329,  330,  331,  332,
  333,  334,    0,   -1,  337,  338,  257,  258,  259,  260,
  261,  262,  263,  264,  265,  266,  267,  268,  269,  270,
  271,  272,  273,   -1,  275,  276,  277,  278,  279,  280,
  281,  282,  283,  284,  285,  286,  287,  288,  289,  290,
  291,  292,  293,   -1,   -1,  296,  297,  298,  299,   -1,
  301,   -1,   -1,  304,  305,  306,  307,  308,  309,  310,
  311,  312,  313,  314,  315,  316,   -1,   -1,   -1,  320,
   -1,  322,  323,  324,  325,  326,  327,  328,  329,  330,
  331,  332,  333,  334,    0,   -1,  337,  338,  257,  258,
  259,  260,  261,  262,  263,  264,  265,  266,  267,  268,
  269,  270,  271,  272,  273,   -1,  275,  276,  277,  278,
  279,  280,  281,  282,  283,  284,  285,  286,  287,  288,
  289,  290,  291,  292,  293,   -1,   -1,  296,  297,  298,
  299,   -1,  301,   -1,   -1,  304,  305,  306,   -1,   -1,
   -1,  310,  311,  312,  313,  314,   -1,  316,  317,  318,
   -1,  320,   -1,  322,  323,  324,  325,  326,  327,  328,
  329,  330,  331,  332,  333,  334,    0,   -1,  337,  338,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  257,  258,  259,
  260,  261,  262,  263,  264,  265,  266,  267,  268,  269,
  270,  271,  272,  273,   -1,  275,  276,  277,  278,  279,
  280,  281,  282,  283,  284,  285,  286,  287,  288,  289,
  290,  291,  292,  293,   -1,   -1,  296,  297,   -1,  299,
   -1,  301,   -1,   -1,  304,  305,  306,   -1,   -1,   -1,
  310,  311,  312,  313,  314,   -1,  316,  317,  318,   -1,
  320,   -1,  322,  323,  324,  325,  326,  327,  328,  329,
  330,  331,  332,  333,  334,    0,   -1,  337,  338,  257,
  258,  259,  260,  261,  262,  263,  264,  265,  266,  267,
  268,  269,  270,  271,  272,  273,   -1,  275,  276,  277,
  278,  279,  280,  281,  282,  283,  284,  285,  286,  287,
  288,  289,  290,  291,  292,  293,   -1,   -1,  296,  297,
  298,  299,   -1,  301,   -1,   -1,  304,   -1,   -1,   -1,
   -1,   -1,  310,  311,  312,  313,  314,   -1,  316,  317,
  318,   -1,  320,   -1,  322,  323,  324,  325,  326,  327,
  328,  329,  330,  331,  332,  333,  334,    0,   -1,  337,
  338,  257,  258,  259,  260,  261,  262,  263,  264,  265,
  266,  267,  268,  269,  270,  271,  272,  273,   -1,  275,
  276,  277,  278,  279,  280,  281,  282,  283,  284,  285,
  286,  287,  288,  289,  290,  291,  292,  293,   -1,   -1,
  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,  305,
  306,   -1,   -1,   -1,  310,  311,  312,  313,  314,   -1,
  316,  317,  318,   -1,  320,   -1,  322,  323,  324,  325,
  326,  327,  328,   -1,   -1,  331,  332,  333,  334,    0,
   -1,  337,  338,  257,  258,  259,  260,  261,  262,  263,
  264,  265,  266,  267,  268,  269,  270,  271,  272,  273,
   -1,  275,  276,  277,  278,  279,  280,  281,  282,  283,
  284,  285,  286,  287,  288,  289,  290,  291,  292,  293,
   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,
  304,  305,  306,   -1,   -1,   -1,  310,  311,  312,  313,
  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,
  324,  325,  326,  327,  328,   -1,   -1,  331,  332,  333,
  334,    0,   -1,  337,  338,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  260,  261,  262,  263,  264,
  265,  266,  267,  268,  269,  270,  271,  272,  273,   -1,
  275,  276,  277,  278,  279,  280,  281,  282,  283,  284,
  285,  286,  287,  288,  289,  290,  291,  292,  293,   -1,
   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,
  305,  306,   -1,   -1,   -1,  310,  311,  312,  313,  314,
   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,  324,
  325,  326,  327,  328,    0,   -1,  331,  332,  333,  334,
   -1,   -1,  337,  338,  257,  258,  259,  260,  261,  262,
  263,  264,  265,  266,  267,  268,  269,  270,  271,  272,
  273,   -1,  275,  276,  277,  278,  279,  280,  281,  282,
  283,  284,  285,  286,  287,  288,  289,  290,  291,  292,
  293,   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,
   -1,  304,  305,  306,   -1,   -1,   -1,  310,  311,  312,
  313,  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,
  323,  324,  325,  326,  327,  328,    0,   -1,  331,  332,
  333,  334,   -1,   -1,  337,  338,  257,  258,  259,  260,
  261,  262,  263,  264,  265,  266,  267,  268,  269,  270,
  271,  272,  273,   -1,  275,  276,  277,  278,  279,  280,
  281,  282,  283,  284,  285,  286,  287,  288,  289,  290,
  291,  292,  293,   -1,   -1,  296,  297,  298,  299,   -1,
  301,   -1,   -1,  304,  305,  306,   -1,   -1,   -1,  310,
  311,  312,  313,  314,   -1,  316,  317,  318,   -1,  320,
   -1,  322,  323,  324,  325,  326,  327,  328,    0,   -1,
  331,  332,  333,  334,   -1,   -1,  337,  338,  257,  258,
  259,  260,  261,  262,  263,  264,  265,  266,  267,  268,
  269,  270,  271,  272,  273,   -1,  275,  276,  277,  278,
  279,  280,  281,  282,  283,  284,  285,  286,  287,  288,
  289,  290,  291,  292,  293,   -1,   -1,  296,  297,  298,
  299,   -1,  301,   -1,   -1,  304,  305,  306,   -1,   -1,
   -1,  310,  311,  312,  313,  314,   -1,  316,  317,  318,
   -1,  320,   -1,  322,  323,  324,  325,  326,  327,  328,
    0,   -1,  331,  332,  333,  334,   -1,   -1,  337,  338,
   -1,  257,  258,  259,   -1,   -1,   -1,   -1,  264,  265,
  266,  267,  268,  269,  270,  271,  272,  273,   -1,  275,
  276,  277,  278,  279,  280,  281,  282,  283,  284,  285,
  286,  287,  288,  289,  290,  291,  292,  293,   -1,   -1,
  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,  305,
  306,   -1,   -1,   -1,   -1,   -1,  312,  313,  314,   -1,
  316,  317,  318,   -1,  320,   -1,  322,  323,  324,  325,
  326,  327,  328,    0,   -1,  331,  332,  333,  334,   -1,
   -1,  337,  338,  257,  258,  259,   -1,   -1,   -1,   -1,
  264,  265,  266,  267,  268,  269,  270,  271,  272,  273,
   -1,  275,  276,  277,  278,  279,  280,  281,  282,  283,
  284,  285,  286,  287,  288,  289,  290,  291,  292,  293,
   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,
  304,  305,  306,   -1,   -1,   -1,   -1,   -1,  312,  313,
  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,
  324,  325,  326,  327,  328,    0,   -1,  331,  332,  333,
  334,   -1,   -1,  337,  338,  257,  258,  259,   -1,   -1,
   -1,   -1,  264,  265,  266,  267,  268,  269,  270,  271,
  272,  273,   -1,  275,  276,  277,  278,  279,  280,  281,
  282,  283,  284,  285,  286,  287,  288,  289,  290,  291,
  292,  293,   -1,   -1,  296,  297,  298,  299,   -1,  301,
   -1,   -1,  304,  305,  306,   -1,   -1,   -1,   -1,   -1,
  312,  313,  314,   -1,  316,  317,  318,   -1,  320,   -1,
  322,  323,  324,  325,  326,  327,  328,    0,   -1,  331,
  332,  333,  334,   -1,   -1,  337,  338,  257,  258,  259,
   -1,   -1,   -1,   -1,  264,  265,  266,  267,  268,  269,
  270,  271,  272,  273,   -1,  275,  276,  277,  278,  279,
  280,  281,  282,  283,  284,  285,  286,  287,  288,  289,
  290,  291,  292,  293,   -1,   -1,  296,  297,  298,  299,
   -1,  301,   -1,   -1,  304,  305,  306,   -1,   -1,   -1,
   -1,   -1,  312,  313,  314,   -1,  316,  317,  318,   -1,
  320,   -1,  322,  323,  324,  325,  326,  327,  328,    0,
   -1,  331,  332,  333,  334,   -1,   -1,  337,  338,   -1,
  257,  258,  259,   -1,   -1,   -1,   -1,  264,  265,  266,
  267,  268,  269,  270,  271,  272,  273,   -1,  275,  276,
  277,  278,  279,  280,  281,  282,  283,  284,  285,  286,
  287,  288,  289,  290,  291,  292,  293,   -1,   -1,  296,
  297,  298,  299,   -1,  301,   -1,   -1,   -1,  305,  306,
   82,   83,   84,   85,   86,   87,   -1,   89,   -1,  316,
  317,  318,   -1,  320,   -1,  322,  323,  324,  325,  326,
  327,  328,    0,   -1,  331,  332,  333,  334,   -1,   -1,
  337,  338,  257,  258,  259,   -1,   -1,   -1,   -1,  264,
  265,  266,  267,  268,  269,  270,  271,  272,  273,   -1,
  275,  276,  277,  278,  279,  280,  281,  282,  283,  284,
  285,  286,  287,  288,  289,  290,  291,  292,  293,   -1,
   -1,  296,  297,  298,   -1,   -1,  301,   -1,   -1,   -1,
  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,  324,
  325,  326,  327,  328,    0,   -1,  331,  332,  333,  334,
   -1,   -1,  337,  338,   -1,  258,  259,   -1,   -1,   -1,
   -1,  264,  265,  266,  267,  268,  269,  270,  271,  272,
  273,   -1,  275,  276,  277,  278,  279,  280,  281,  282,
  283,  284,  285,  286,  287,  288,  289,  290,  291,  292,
  293,   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,
   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  316,  317,  318,   -1,  320,   -1,  322,
  323,  324,  325,  326,  327,  328,    0,   -1,  331,  332,
  333,  334,   -1,   -1,  337,  338,   -1,  258,  259,   -1,
   -1,   -1,   -1,  264,  265,  266,  267,  268,  269,  270,
  271,  272,  273,   -1,  275,  276,  277,  278,  279,  280,
  281,  282,  283,  284,  285,  286,  287,  288,  289,  290,
  291,  292,  293,   -1,   -1,  296,  297,  298,  299,   -1,
  301,   -1,   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  316,  317,  318,   -1,  320,
   -1,  322,  323,  324,  325,  326,  327,  328,    0,   -1,
  331,  332,  333,  334,   -1,   -1,  337,  338,   -1,  257,
  258,   -1,   -1,   -1,   -1,   -1,  264,  265,  266,  267,
  268,  269,  270,  271,  272,  273,   -1,  275,  276,  277,
  278,  279,  280,  281,  282,  283,  284,  285,  286,  287,
  288,  289,  290,  291,  292,  293,   -1,   -1,  296,  297,
  298,  299,   -1,  301,   -1,   -1,   -1,  305,  306,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  316,  317,
  318,   -1,  320,    0,  322,  323,  324,  325,  326,  327,
  328,   -1,   -1,  331,  332,  333,  334,   -1,   -1,  337,
  338,  257,  258,  259,   -1,   -1,   -1,   -1,  264,  265,
  266,  267,  268,  269,  270,  271,  272,  273,   -1,  275,
  276,  277,  278,  279,  280,  281,  282,  283,  284,  285,
  286,  287,  288,  289,  290,  291,  292,  293,   -1,   -1,
  296,  297,  298,   -1,   -1,  301,   -1,   -1,   -1,  305,
  306,   -1,   -1,   -1,   -1,    0,   -1,   -1,   -1,   -1,
  316,  317,  318,   -1,  320,   -1,  322,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  260,  261,  262,  263,
   -1,  337,  338,  257,  258,  259,   -1,   -1,   -1,   -1,
  264,  265,  266,  267,  268,  269,  270,  271,  272,  273,
   -1,   -1,  276,  277,  278,  279,  280,  281,  282,  283,
  284,  285,  286,  287,  288,  289,  290,  291,  292,  293,
  304,   -1,   -1,   -1,   -1,   -1,  310,  311,  312,  313,
  314,  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  316,  317,  318,  329,  330,   -1,  322,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  257,  258,  259,  257,
  258,  259,   -1,  337,  338,  257,  258,  259,   -1,   -1,
   -1,   -1,  264,  265,  266,  267,  268,  269,  270,  271,
  272,  273,   -1,   -1,  276,  277,  278,  279,  280,  281,
  282,  283,  284,  285,  286,  287,  288,  289,  290,  291,
  292,  293,  300,   -1,  305,  306,   -1,  305,  306,   -1,
   -1,   -1,   -1,  305,  306,  316,  317,  318,  316,  317,
  318,   -1,   -1,   -1,  316,  317,  318,   -1,   -1,   -1,
  322,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  257,  258,  259,   -1,   -1,  337,  338,  264,  265,  266,
  267,  268,  269,  270,  271,  272,  273,   -1,   -1,  276,
  277,  278,  279,  280,  281,  282,  283,  284,  285,  286,
  287,  288,  289,  290,  291,  292,  293,   -1,   -1,    4,
    5,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  305,  306,
   15,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  316,
  317,  318,   -1,   -1,   -1,  322,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  299,   -1,   -1,   -1,  264,
  337,  338,  267,  268,  269,  270,  271,  272,  273,   -1,
   -1,  276,  277,   -1,  279,   -1,  281,   -1,  283,  323,
  324,  325,  326,  327,  328,   -1,   -1,  331,  332,  333,
  334,  260,  261,  262,  263,   -1,   81,   -1,   -1,   -1,
  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  316,  317,  318,   -1,   -1,   -1,  322,   -1,  104,
  105,  106,  107,  108,  109,  110,  111,  112,  113,  114,
  299,   -1,  337,  338,   -1,  304,   -1,   -1,   -1,   -1,
   -1,  310,  311,  312,  313,  314,   -1,  257,  258,  259,
  135,  136,   -1,   -1,   -1,  257,  258,  259,   -1,   -1,
  329,  330,  264,  148,   -1,  267,  268,  269,  270,  271,
  272,  273,   -1,   -1,  276,  277,  286,  279,  280,  281,
   -1,  283,   -1,  285,  286,   -1,   -1,   -1,  298,   -1,
   -1,  293,   -1,   -1,   -1,  305,  306,   -1,   -1,   -1,
   -1,   -1,   -1,  305,  306,   -1,  316,  317,  318,   -1,
   -1,   -1,  322,   -1,  316,  317,  318,   -1,   -1,   -1,
  322,  206,   -1,  208,   -1,   -1,  211,  212,  338,   -1,
  257,  258,  259,   -1,   -1,  220,  338,  264,   -1,   -1,
  267,  268,  269,  270,  271,  272,  273,   -1,  275,  276,
  277,   -1,  279,   -1,  281,   -1,  283,   -1,  243,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  296,
  297,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  305,  306,
   -1,   -1,   -1,   -1,   -1,   -1,  257,  258,  259,  316,
  317,  318,   -1,  264,   -1,  322,  267,  268,  269,  270,
  271,  272,  273,   -1,   -1,  276,  277,   -1,  279,   -1,
  281,  338,  283,   -1,   -1,  286,   -1,   -1,   -1,  290,
   -1,   -1,   -1,   -1,   -1,   -1,  260,  261,  262,  263,
   -1,   -1,   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  316,  317,  318,   -1,  264,
   -1,  322,  267,  268,  269,  270,  271,  272,  273,   -1,
   -1,  276,  277,   -1,  279,  299,  281,  338,  283,   -1,
  304,  286,   -1,   -1,  289,   -1,  310,  311,  312,  313,
  314,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  305,  306,   -1,   -1,   -1,  329,  330,   -1,  257,  258,
  259,  316,  317,  318,   -1,  264,   -1,  322,  267,  268,
  269,  270,  271,  272,  273,   -1,   -1,  276,  277,   -1,
  279,   -1,  281,  338,  283,   -1,   -1,  286,   -1,  288,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  305,  306,   -1,   -1,
   -1,   -1,   -1,   -1,  257,  258,  259,  316,  317,  318,
   -1,  264,   -1,  322,  267,  268,  269,  270,  271,  272,
  273,   -1,   -1,  276,  277,   -1,  279,   -1,  281,  338,
  283,   -1,   -1,  286,   -1,   -1,   -1,   -1,  291,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,
  257,  258,  259,  316,  317,  318,   -1,  264,   -1,  322,
  267,  268,  269,  270,  271,  272,  273,   -1,   -1,  276,
  277,   -1,  279,   -1,  281,  338,  283,   -1,   -1,  286,
   -1,   -1,   -1,   -1,   -1,  292,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  305,  306,
   -1,   -1,   -1,   -1,   -1,   -1,  257,  258,  259,  316,
  317,  318,   -1,  264,   -1,  322,  267,  268,  269,  270,
  271,  272,  273,   -1,   -1,  276,  277,   -1,  279,   -1,
  281,  338,  283,   -1,   -1,  286,   -1,   -1,   -1,   -1,
   -1,   -1,  293,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  316,  317,  318,   -1,  264,
   -1,  322,  267,  268,  269,  270,  271,  272,  273,   -1,
  275,  276,  277,   -1,  279,   -1,  281,  338,  283,   -1,
   -1,   -1,   -1,  257,  258,  259,   -1,   -1,   -1,   -1,
  264,   -1,   -1,  267,  268,  269,  270,  271,  272,  273,
  305,  306,  276,  277,  278,  279,   -1,  281,   -1,  283,
   -1,  316,  317,  318,   -1,   -1,   -1,  322,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  305,  306,  338,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  316,  317,  318,   -1,   -1,   -1,  322,   -1,
   -1,   -1,   -1,   -1,   -1,  257,  258,  259,   -1,   -1,
   -1,   -1,  264,   -1,  338,  267,  268,  269,  270,  271,
  272,  273,   -1,   -1,  276,  277,   -1,  279,   -1,  281,
  282,  283,   -1,   -1,   -1,   -1,  257,  258,  259,   -1,
   -1,   -1,   -1,  264,   -1,   -1,  267,  268,  269,  270,
  271,  272,  273,  305,  306,  276,  277,   -1,  279,   -1,
  281,   -1,  283,  284,  316,  317,  318,   -1,   -1,   -1,
  322,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  305,  306,  338,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  316,  317,  318,   -1,  264,
   -1,  322,  267,  268,  269,  270,  271,  272,  273,   -1,
   -1,  276,  277,   -1,  279,   -1,  281,  338,  283,  257,
  258,  259,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,  286,   -1,
   -1,  316,  317,  318,   -1,   -1,   -1,  322,   -1,   -1,
  298,   -1,   -1,  301,   -1,   -1,   -1,  305,  306,   -1,
   -1,   -1,   -1,  338,   -1,   -1,   -1,   -1,  316,  317,
  318,   -1,  320,   -1,  322,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  338,
};
}
final static short YYFINAL=25;
final static short YYMAXTOKEN=341;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"IDENTIFIER","CONSTANT","STRING_LITERAL","LE_OP","GE_OP","EQ_OP",
"NE_OP","IF","ELSE","ELSEIF","WHILE","FOR","BREAK","RETURN","PERSISTENT",
"CONTINUE","FUNCTION","TRANSPOSE","CR","GLOBAL","DO","UNTIL","SWITCH","CASE",
"TRY","CATCH","UNWIND","CLEANUP","OTHERWISE","END","ENDFUNCTION","ENDFOR",
"ENDIF","ENDWHILE","ENDTRYCATCH","ENDUNWINDPROTECT","ENDSWITCH","COMMENT",
"CONTINUATION","SEMICOLON","COMMA","COLON","ASSIGN","LPAREN","RPAREN",
"LBRACKET","RBRACKET","AND","MINUS","PLUS","MULT","DIV","LDIV","LT_OP","GT_OP",
"OR","OR_OR","AND_AND","POW","NOT","PLUS_PLUS","MINUS_MINUS","LBRACE","RBRACE",
"DOT","AT","PLUS_EQ","MINUS_EQ","MULT_EQ","DIV_EQ","LDIV_EQ","POW_EQ","RSHIFT",
"LSHIFT","RSHIFT_EQ","LSHIFT_EQ","AND_EQ","OR_EQ","VARARGOUT","VARARGIN","EOF",
"COMMAND_IDENTIFIER","LEX_ERROR","COMMAND_STRING","UNARY",
};
final static String yyrule[] = {
"$accept : translation_unit",
"primary_expression : IDENTIFIER",
"primary_expression : CONSTANT",
"primary_expression : STRING_LITERAL",
"paren_start : LPAREN",
"paren_end : RPAREN",
"function_handle : AT IDENTIFIER",
"matrix_start : LBRACKET",
"matrix_end : RBRACKET",
"matrix_expression : matrix_start matrix_end",
"matrix_expression : matrix_start SEMICOLON matrix_end",
"matrix_expression : matrix_start array_list matrix_end",
"cell_start : LBRACE",
"cell_end : RBRACE",
"cell_expression : cell_start cell_end",
"cell_expression : cell_start SEMICOLON cell_end",
"cell_expression : cell_start array_list cell_end",
"index_start : paren_start",
"index_start : cell_start",
"index_stop : paren_end",
"index_stop : cell_end",
"index_element_list : array_element_list",
"postfix_expression : primary_expression",
"postfix_expression : postfix_expression index_start index_element_list index_stop",
"postfix_expression : postfix_expression index_start index_stop",
"postfix_expression : postfix_expression DOT IDENTIFIER",
"postfix_expression : postfix_expression DOT LPAREN expression RPAREN",
"postfix_expression : postfix_expression TRANSPOSE",
"postfix_expression : postfix_expression PLUS_PLUS",
"postfix_expression : postfix_expression MINUS_MINUS",
"prefix_expression : postfix_expression",
"prefix_expression : binary_expression",
"prefix_expression : unary_operator postfix_expression",
"unary_operator : PLUS",
"unary_operator : MINUS",
"unary_operator : PLUS_PLUS",
"unary_operator : MINUS_MINUS",
"unary_operator : NOT",
"binary_expression : prefix_expression MULT prefix_expression",
"binary_expression : prefix_expression DIV prefix_expression",
"binary_expression : prefix_expression LDIV prefix_expression",
"binary_expression : prefix_expression POW prefix_expression",
"binary_expression : prefix_expression PLUS prefix_expression",
"binary_expression : prefix_expression MINUS prefix_expression",
"colon_expression : colon_subexpression",
"colon_subexpression : prefix_expression",
"colon_subexpression : colon_subexpression COLON prefix_expression",
"simple_expression : colon_expression",
"simple_expression : simple_expression RSHIFT simple_expression",
"simple_expression : simple_expression LSHIFT simple_expression",
"simple_expression : simple_expression LT_OP simple_expression",
"simple_expression : simple_expression GT_OP simple_expression",
"simple_expression : simple_expression LE_OP simple_expression",
"simple_expression : simple_expression GE_OP simple_expression",
"simple_expression : simple_expression EQ_OP simple_expression",
"simple_expression : simple_expression NE_OP simple_expression",
"simple_expression : simple_expression AND simple_expression",
"simple_expression : simple_expression AND_AND simple_expression",
"simple_expression : simple_expression OR simple_expression",
"simple_expression : simple_expression OR_OR simple_expression",
"anon_function_start : AT",
"anon_function_handle_expression : anon_function_start LPAREN identifier_list RPAREN statement",
"command_expression : COMMAND_IDENTIFIER command_list",
"command_list : COMMAND_STRING",
"command_list : STRING_LITERAL",
"command_list : command_list COMMAND_STRING",
"command_list : command_list STRING_LITERAL",
"expression : anon_function_handle_expression",
"expression : command_expression",
"expression : assignment_expression",
"assignment_expression : simple_expression",
"assignment_expression : assignment_expression ASSIGN expression",
"assignment_expression : assignment_expression PLUS_EQ expression",
"assignment_expression : assignment_expression MINUS_EQ expression",
"assignment_expression : assignment_expression MULT_EQ expression",
"assignment_expression : assignment_expression DIV_EQ expression",
"assignment_expression : assignment_expression LDIV_EQ expression",
"assignment_expression : assignment_expression POW_EQ expression",
"assignment_expression : assignment_expression AND_EQ expression",
"assignment_expression : assignment_expression OR_EQ expression",
"assignment_expression : assignment_expression LSHIFT_EQ expression",
"assignment_expression : assignment_expression RSHIFT_EQ expression",
"eostmt : COMMA",
"eostmt : SEMICOLON",
"eostmt : CR",
"eostmt : eostmt COMMA",
"eostmt : eostmt SEMICOLON",
"eostmt : eostmt CR",
"opt_eostmt :",
"opt_eostmt : eostmt",
"opt_cr :",
"opt_cr : cr",
"cr : CR",
"cr : cr CR",
"statement : expression",
"statement : command",
"command : declaration_statement",
"command : selection_statement",
"command : iteration_statement",
"command : exception_statement",
"command : jump_statement",
"command : function_statement",
"statement_list :",
"statement_list : statement_sublist",
"statement_sublist : statement opt_eostmt",
"statement_sublist : statement_sublist opt_eostmt statement opt_eostmt",
"identifier_list : IDENTIFIER",
"identifier_list : identifier_list COMMA IDENTIFIER",
"identifier_list : VARARGIN",
"identifier_list : identifier_list COMMA VARARGIN",
"declaration : IDENTIFIER",
"declaration : IDENTIFIER ASSIGN expression",
"declaration_list : declaration",
"declaration_list : declaration_list declaration",
"declaration_statement : GLOBAL declaration_list",
"declaration_statement : PERSISTENT declaration_list",
"colon : COLON",
"array_element_end : END",
"array_list : array_sublist",
"array_list : array_sublist SEMICOLON",
"array_sublist : array_row",
"array_sublist : array_sublist SEMICOLON array_row",
"array_row : array_element_list",
"array_row : array_element_list COMMA",
"array_space :",
"array_comma : COMMA",
"array_comma : array_space",
"array_element_list : expression",
"array_element_list : colon",
"array_element_list : array_element_end",
"array_element_list : array_element_list array_comma colon",
"array_element_list : array_element_list array_comma expression",
"array_element_list : array_element_list array_comma array_element_end",
"if_list : if_sublist",
"if_list : if_sublist else_clause",
"if_sublist : expression opt_eostmt statement_list",
"if_sublist : if_sublist elseif_clause",
"selection_statement : IF if_list end_if",
"selection_statement : SWITCH expression opt_eostmt case_list end_switch",
"selection_statement : SWITCH expression opt_eostmt case_list otherwise_statement end_switch",
"elseif_clause : ELSEIF opt_eostmt expression opt_eostmt statement_list",
"else_clause : ELSE opt_eostmt statement_list",
"iteration_statement : WHILE expression opt_eostmt statement_list end_while",
"iteration_statement : DO opt_eostmt statement_list UNTIL expression",
"iteration_statement : FOR simple_expression ASSIGN expression opt_eostmt statement_list end_for",
"iteration_statement : FOR LPAREN simple_expression ASSIGN expression RPAREN opt_eostmt statement_list end_for",
"end_if : ENDIF",
"end_if : END",
"end_while : ENDWHILE",
"end_while : END",
"end_for : ENDFOR",
"end_for : END",
"end_switch : ENDSWITCH",
"end_switch : END",
"end_try : ENDTRYCATCH",
"end_try : END",
"end_unwind : ENDUNWINDPROTECT",
"end_unwind : END",
"otherwise_statement : OTHERWISE opt_eostmt statement_list",
"case_list : CASE expression opt_eostmt statement_list",
"case_list : case_list CASE expression opt_eostmt statement_list",
"exception_statement : TRY opt_eostmt statement_list CATCH opt_eostmt statement_list end_try",
"exception_statement : UNWIND opt_eostmt statement_list CLEANUP opt_eostmt statement_list end_unwind",
"jump_statement : BREAK",
"jump_statement : RETURN",
"jump_statement : CONTINUE",
"start_function : FUNCTION",
"function_statement : start_function function_declare eostmt statement_list end_function",
"translation_unit : statement_list EOF",
"translation_unit : opt_cr statement_list EOF",
"translation_unit : statement_list",
"translation_unit : opt_cr statement_list",
"end_function : EOF",
"end_function : ENDFUNCTION",
"end_function : END",
"func_return_list : LBRACKET RBRACKET",
"func_return_list : LBRACKET identifier_list RBRACKET",
"func_return_list : LBRACKET VARARGOUT RBRACKET",
"func_return_list : LBRACKET identifier_list COMMA VARARGOUT RBRACKET",
"function_declare_rhs : IDENTIFIER",
"function_declare_rhs : IDENTIFIER LPAREN RPAREN",
"function_declare_rhs : IDENTIFIER LPAREN identifier_list RPAREN",
"function_declare : function_declare_rhs",
"function_declare : IDENTIFIER ASSIGN function_declare_rhs",
"function_declare : VARARGOUT ASSIGN function_declare_rhs",
"function_declare : func_return_list ASSIGN function_declare_rhs",
};

//#line 899 "octave.y"

  private OctaveLexer lexer;
  int errLine, errColumn, errChar;
  String errMsg;
  private int yylex () {
    int yyl_return = -1;
    try {
      yyl_return = lexer.yylex();
    }
    catch (IOException e) {
    	errLine = lexer.Yyline();
    	errColumn = lexer.Yycolumn();
    	errChar = lexer.Yychar();
    	errMsg = e.getMessage();
    }
    catch (OctaveLexerException e) {
    	errLine = lexer.Yyline();
    	errColumn = lexer.Yycolumn();
    	errChar = lexer.Yychar();
    	errMsg = e.getMessage();
    }
    return yyl_return;
  }
  
  public void yyerror (String error) {
    OctclipsePlugin.getDefault().getLog().log(
    	new Status(Status.ERROR, OctclipsePlugin.PLUGIN_ID, 0, error, null));
    errLine = lexer.Yyline();
	errColumn = lexer.Yycolumn();
	errChar = lexer.Yychar();
	errMsg = error;
  }
  
  public ModuleDeclaration parse(IModuleSource input, IProblemReporter reporter) {
    char[] source = input.getContentsAsCharArray();
  	if(yyparse(new CharArrayReader(source)) != 0)
  	{
  		try
		{
			if (reporter != null)
			{
				char [] fileName = input.getFileName().toCharArray();
				reporter.reportProblem(new DefaultProblem(
						fileName == null ? "" : new String(fileName),
						errMsg, 0, null, 
						ProblemSeverities.Error, errChar, errChar, errLine));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
  	}
  	return (ModuleDeclaration)yyval;
  }		
	
  private int yyparse(Reader r) {
    yydebug = true;
  	lexer = new OctaveLexer(r, this);
  	return yyparse();
  }	
	
  public OctaveParser() {
  }
  
//#line 1390 "OctaveParser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    //if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      //if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        //if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          //if (yydebug)
          //  yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        //if (yydebug)
          //debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      //if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            //if (yydebug)
              //debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            //if (yydebug)
              //debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        //if (yydebug)
          //{
          //yys = null;
          //if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          //if (yys == null) yys = "illegal-symbol";
          //debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          //}
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    //if (yydebug)
      //debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 96 "octave.y"
{ yyval = new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 2:
//#line 98 "octave.y"
{ yyval = new OctaveConstant((OctaveToken)val_peek(0)); }
break;
case 3:
//#line 100 "octave.y"
{ yyval = new OctaveString((OctaveToken)val_peek(0)); }
break;
case 4:
//#line 115 "octave.y"
{ lexer.enableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 5:
//#line 121 "octave.y"
{ lexer.disableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 6:
//#line 127 "octave.y"
{ yyval = new OctaveFunctionHandleExpression(new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 7:
//#line 132 "octave.y"
{ lexer.enableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 8:
//#line 138 "octave.y"
{ lexer.disableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 9:
//#line 144 "octave.y"
{ yyval = new OctaveMatrixExpression(new OctaveASTListNode()); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 10:
//#line 148 "octave.y"
{ yyval = new OctaveMatrixExpression(new OctaveASTListNode()); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 11:
//#line 152 "octave.y"
{ yyval = new OctaveMatrixExpression((OctaveASTListNode)val_peek(1)); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 12:
//#line 159 "octave.y"
{ lexer.enableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 13:
//#line 165 "octave.y"
{ lexer.disableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 14:
//#line 171 "octave.y"
{ yyval = new OctaveCellExpression(new OctaveASTListNode()); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 15:
//#line 175 "octave.y"
{ yyval = new OctaveCellExpression(new OctaveASTListNode()); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 16:
//#line 179 "octave.y"
{ yyval = new OctaveCellExpression((OctaveASTListNode)val_peek(1)); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 17:
//#line 186 "octave.y"
{ yyval = val_peek(0); }
break;
case 18:
//#line 188 "octave.y"
{ yyval = val_peek(0); }
break;
case 19:
//#line 193 "octave.y"
{ yyval = val_peek(0); }
break;
case 20:
//#line 195 "octave.y"
{ yyval = val_peek(0); }
break;
case 21:
//#line 200 "octave.y"
{ yyval = val_peek(0); }
break;
case 22:
//#line 205 "octave.y"
{ yyval = val_peek(0); }
break;
case 23:
//#line 207 "octave.y"
{ CallArgumentsList list = new CallArgumentsList(((ASTListNode)val_peek(1)).sourceStart(),
        	       ((ASTListNode)val_peek(1)).sourceEnd());
        	   list.getChilds().addAll(((ASTListNode)val_peek(1)).getChilds());
        	   yyval = new OctaveSymbolCallExpression((Expression)val_peek(3), list);
        	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 24:
//#line 213 "octave.y"
{ yyval = new OctaveSymbolCallExpression((Expression)val_peek(2), CallArgumentsList.EMPTY);
        	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 25:
//#line 216 "octave.y"
{ OctaveSymbolReference s = new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)val_peek(0)));  
        	   CallArgumentsList list = new CallArgumentsList(s.sourceStart(), s.sourceEnd());
        	   list.getChilds().add(s);      	   
        	   if (val_peek(2) instanceof OctaveDotCallExpression) {
        	    yyval = val_peek(2);
        	    ((OctaveDotCallExpression)yyval).appendArg(list);
        	   } else {
        	     
        	   	 yyval = new OctaveDotCallExpression((Expression)val_peek(2), list);
        	   }
        	  ((ASTNode)yyval).setEnd(s.sourceEnd()); }
break;
case 26:
//#line 228 "octave.y"
{ CallArgumentsList list = new CallArgumentsList(((Expression)val_peek(1)).sourceStart(),
        	       ((Expression)val_peek(1)).sourceEnd());
        	   list.getChilds().add(val_peek(1));
        	  if (val_peek(4) instanceof OctaveDotCallExpression) {
        	    yyval = val_peek(4);
        	    ((OctaveDotCallExpression)yyval).appendArg(list);
        	  } else {
        	   yyval = new OctaveDotCallExpression((Expression)val_peek(4), list);
        	  }
        	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 27:
//#line 239 "octave.y"
{ yyval = new OctavePostfixExpression((Expression)val_peek(1), (OctaveToken)val_peek(0)); }
break;
case 28:
//#line 241 "octave.y"
{ yyval = new OctavePostfixExpression((Expression)val_peek(1), (OctaveToken)val_peek(0)); }
break;
case 29:
//#line 243 "octave.y"
{ yyval = new OctavePostfixExpression((Expression)val_peek(1), (OctaveToken)val_peek(0)); }
break;
case 30:
//#line 248 "octave.y"
{ yyval = val_peek(0); }
break;
case 31:
//#line 250 "octave.y"
{ yyval = val_peek(0); }
break;
case 32:
//#line 252 "octave.y"
{ yyval = new OctaveUnaryExpression((OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 33:
//#line 257 "octave.y"
{ yyval = val_peek(0); }
break;
case 34:
//#line 259 "octave.y"
{ yyval = val_peek(0); }
break;
case 35:
//#line 261 "octave.y"
{ yyval = val_peek(0); }
break;
case 36:
//#line 263 "octave.y"
{ yyval = val_peek(0); }
break;
case 37:
//#line 265 "octave.y"
{ yyval = val_peek(0); }
break;
case 38:
//#line 270 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 39:
//#line 272 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 40:
//#line 274 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 41:
//#line 276 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 42:
//#line 278 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 43:
//#line 280 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 44:
//#line 285 "octave.y"
{ yyval = val_peek(0); }
break;
case 45:
//#line 290 "octave.y"
{ yyval = val_peek(0); }
break;
case 46:
//#line 292 "octave.y"
{ 
				if (val_peek(2) instanceof OctaveColonExpression)
				{
					((OctaveColonExpression)val_peek(2)).addNode((Expression)val_peek(0));
				}
				else 
				{ 
					yyval = new OctaveColonExpression((Expression)val_peek(2));
					((OctaveColonExpression)yyval).addNode((Expression)val_peek(0));
				}	 
			}
break;
case 47:
//#line 307 "octave.y"
{ yyval = val_peek(0); }
break;
case 48:
//#line 309 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 49:
//#line 311 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 50:
//#line 313 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 51:
//#line 315 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 52:
//#line 317 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 53:
//#line 319 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 54:
//#line 321 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 55:
//#line 323 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 56:
//#line 325 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 57:
//#line 327 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 58:
//#line 329 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 59:
//#line 331 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 60:
//#line 336 "octave.y"
{ yyval = val_peek(0);
			  	lexer.enableVarArgIn(); }
break;
case 61:
//#line 342 "octave.y"
{ yyval = new OctaveAnonFunctionHandleExpression((OctaveASTListNode)val_peek(2), 
			         (OctaveStatement)val_peek(0));
			   ((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
               ((ASTNode)yyval).setEnd(((ASTNode)val_peek(0)).sourceEnd()); 
			   lexer.disableVarArgIn(); }
break;
case 62:
//#line 351 "octave.y"
{ CallArgumentsList list = new CallArgumentsList(((ASTListNode)val_peek(0)).sourceStart(),
                   ((ASTListNode)val_peek(0)).sourceEnd());
               list.getChilds().addAll(((ASTListNode)val_peek(0)).getChilds());
               yyval = new OctaveSymbolCallExpression(
				new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)val_peek(1))),
				list); }
break;
case 63:
//#line 361 "octave.y"
{ yyval = new OctaveASTListNode(); 
				((OctaveASTListNode)yyval).addNode(new OctaveString((OctaveToken)val_peek(0))); }
break;
case 64:
//#line 364 "octave.y"
{ yyval = new OctaveASTListNode(); 
                ((OctaveASTListNode)yyval).addNode((OctaveString)val_peek(0)); }
break;
case 65:
//#line 367 "octave.y"
{ yyval = val_peek(1);
				((OctaveASTListNode)yyval).addNode(new OctaveString((OctaveToken)val_peek(0))); }
break;
case 66:
//#line 370 "octave.y"
{ yyval = val_peek(1);
		          ((OctaveASTListNode)yyval).addNode((OctaveString)val_peek(0)); }
break;
case 67:
//#line 376 "octave.y"
{ yyval = val_peek(0); }
break;
case 68:
//#line 378 "octave.y"
{ yyval = val_peek(0); }
break;
case 69:
//#line 380 "octave.y"
{ yyval = val_peek(0); }
break;
case 70:
//#line 385 "octave.y"
{ yyval = val_peek(0); }
break;
case 71:
//#line 387 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			 (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 72:
//#line 390 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 73:
//#line 393 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 74:
//#line 396 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 75:
//#line 399 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 76:
//#line 402 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 77:
//#line 405 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 78:
//#line 408 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 79:
//#line 411 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 80:
//#line 414 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 81:
//#line 417 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 82:
//#line 423 "octave.y"
{ yyval = val_peek(0); }
break;
case 83:
//#line 425 "octave.y"
{ yyval = val_peek(0); }
break;
case 84:
//#line 427 "octave.y"
{ yyval = val_peek(0); }
break;
case 85:
//#line 429 "octave.y"
{ yyval = val_peek(1); }
break;
case 86:
//#line 431 "octave.y"
{ yyval = val_peek(1); }
break;
case 87:
//#line 433 "octave.y"
{ yyval = val_peek(1); }
break;
case 88:
//#line 438 "octave.y"
{ yyval = null; }
break;
case 89:
//#line 440 "octave.y"
{ yyval = val_peek(0); }
break;
case 90:
//#line 445 "octave.y"
{ yyval = null; }
break;
case 91:
//#line 447 "octave.y"
{ yyval = val_peek(0); }
break;
case 92:
//#line 452 "octave.y"
{ yyval = val_peek(0); }
break;
case 93:
//#line 454 "octave.y"
{ yyval = val_peek(1); }
break;
case 94:
//#line 460 "octave.y"
{ yyval = new OctaveExpressionStatement((Expression)val_peek(0)); }
break;
case 95:
//#line 462 "octave.y"
{ yyval = val_peek(0); }
break;
case 96:
//#line 467 "octave.y"
{ yyval = val_peek(0); }
break;
case 97:
//#line 469 "octave.y"
{ yyval = val_peek(0); }
break;
case 98:
//#line 471 "octave.y"
{ yyval = val_peek(0); }
break;
case 99:
//#line 473 "octave.y"
{ yyval = val_peek(0); }
break;
case 100:
//#line 475 "octave.y"
{ yyval = val_peek(0); }
break;
case 101:
//#line 477 "octave.y"
{ yyval = val_peek(0); }
break;
case 102:
//#line 482 "octave.y"
{ yyval = new OctaveASTListNode(); }
break;
case 103:
//#line 484 "octave.y"
{ yyval = val_peek(0); }
break;
case 104:
//#line 489 "octave.y"
{ yyval = new OctaveASTListNode(); 
        		((OctaveASTListNode)yyval).addNode((ASTNode)val_peek(1)); }
break;
case 105:
//#line 492 "octave.y"
{ ((OctaveASTListNode)val_peek(3)).addNode((ASTNode)val_peek(1)); 
        	  yyval = val_peek(3); }
break;
case 106:
//#line 498 "octave.y"
{ yyval = new OctaveASTListNode(); 
        		((OctaveASTListNode)yyval).addNode(
        		    new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 107:
//#line 502 "octave.y"
{ yyval = val_peek(2);
			    ((OctaveASTListNode)val_peek(2)).addNode(
					new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 108:
//#line 506 "octave.y"
{ yyval = new OctaveASTListNode();
			     ((OctaveASTListNode)yyval).addNode(
                    new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 109:
//#line 510 "octave.y"
{ yyval = val_peek(2);
			     ((OctaveASTListNode)val_peek(2)).addNode(
                    new OctaveIdentifier((OctaveToken)val_peek(0)));  }
break;
case 110:
//#line 517 "octave.y"
{ yyval = new OctaveASTListNode(); 
        		((OctaveASTListNode)yyval).addNode(new OctaveVariableDeclaration(
        			new OctaveIdentifier((OctaveToken)val_peek(0)))); }
break;
case 111:
//#line 521 "octave.y"
{ yyval = new OctaveASTListNode(); 
        		((OctaveASTListNode)yyval).addNode(new OctaveVariableDeclaration(
        			new OctaveIdentifier((OctaveToken)val_peek(2)),(Expression)val_peek(0))); }
break;
case 112:
//#line 528 "octave.y"
{ yyval = val_peek(0); }
break;
case 113:
//#line 530 "octave.y"
{ yyval = val_peek(1);
				Iterator i = ((OctaveASTListNode)val_peek(0)).getChilds().iterator();
				while(i.hasNext()) { 
					((OctaveASTListNode)val_peek(1)).addNode((ASTNode)i.next());
				}
			}
break;
case 114:
//#line 540 "octave.y"
{ yyval = new OctaveGlobalStatement((OctaveASTListNode)val_peek(0)); 
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
        	}
break;
case 115:
//#line 544 "octave.y"
{ yyval = new OctavePersistentStatement((OctaveASTListNode)val_peek(0)); 
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
			}
break;
case 116:
//#line 551 "octave.y"
{ yyval = new OctaveConstant((OctaveToken)val_peek(0)); }
break;
case 117:
//#line 556 "octave.y"
{ yyval = new OctaveConstant((OctaveToken)val_peek(0)); }
break;
case 118:
//#line 561 "octave.y"
{ yyval = val_peek(0); }
break;
case 119:
//#line 563 "octave.y"
{ yyval = val_peek(1); }
break;
case 120:
//#line 568 "octave.y"
{ yyval = val_peek(0);  }
break;
case 121:
//#line 570 "octave.y"
{ yyval = val_peek(2);
        		((OctaveASTListNode)yyval).getChilds()
        			.addAll(((OctaveASTListNode)val_peek(0)).getChilds()); }
break;
case 122:
//#line 577 "octave.y"
{ yyval = val_peek(0); }
break;
case 123:
//#line 579 "octave.y"
{ yyval = val_peek(1); }
break;
case 124:
//#line 584 "octave.y"
{ yyval = null; }
break;
case 125:
//#line 589 "octave.y"
{ yyval = val_peek(0); }
break;
case 126:
//#line 591 "octave.y"
{ yyval = val_peek(0); }
break;
case 127:
//#line 597 "octave.y"
{ yyval = new OctaveASTListNode(); 
		  		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 128:
//#line 602 "octave.y"
{ yyval = new OctaveASTListNode();
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 129:
//#line 607 "octave.y"
{ yyval = new OctaveASTListNode();
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 130:
//#line 612 "octave.y"
{
		    yyval = val_peek(2); 
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 131:
//#line 618 "octave.y"
{
		    yyval = val_peek(2); 
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 132:
//#line 624 "octave.y"
{
		    yyval = val_peek(2); 
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 133:
//#line 634 "octave.y"
{ yyval = val_peek(0); }
break;
case 134:
//#line 636 "octave.y"
{ yyval = val_peek(1);
			  ((OctaveIfStatement)yyval).addElseClause((ASTNode)val_peek(0)); }
break;
case 135:
//#line 642 "octave.y"
{ yyval = new OctaveIfStatement((Expression)val_peek(2), (OctaveASTListNode)val_peek(0), new OctaveASTListNode()); }
break;
case 136:
//#line 644 "octave.y"
{ yyval = val_peek(1);
			  ((OctaveIfStatement)yyval).addElseClause((ASTNode)val_peek(0)); }
break;
case 137:
//#line 651 "octave.y"
{ yyval = val_peek(1); 
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
        	  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 138:
//#line 655 "octave.y"
{ yyval = new OctaveSwitchStatement((Expression)val_peek(3), (OctaveASTListNode)val_peek(1), new OctaveASTListNode()); 
        	  	((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
        	  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 139:
//#line 659 "octave.y"
{ yyval = new OctaveSwitchStatement((Expression)val_peek(4), (OctaveASTListNode)val_peek(2), (OctaveASTListNode)val_peek(1)); 
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(5)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 140:
//#line 666 "octave.y"
{ yyval = new OctaveElseIfClause((Expression)val_peek(2), (OctaveASTListNode)val_peek(0)); 
        	  ((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
        	  if (((OctaveASTListNode)val_peek(0)).getChilds().isEmpty()) {
        	  	((ASTNode)yyval).setEnd(((Expression)val_peek(2)).sourceEnd());
        	  } else {
        	  	((ASTNode)yyval).setEnd(((OctaveASTListNode)val_peek(0)).sourceEnd());
        	  }
        	}
break;
case 141:
//#line 678 "octave.y"
{ yyval = new OctaveElseClause((OctaveASTListNode)val_peek(0)); 
        	  ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
        	  if (((OctaveASTListNode)val_peek(0)).getChilds().isEmpty()) {
        	  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(2)).getCharacter());
        	  } else {
        	  	((ASTNode)yyval).setEnd(((OctaveASTListNode)val_peek(0)).sourceEnd());
        	  }
        	}
break;
case 142:
//#line 690 "octave.y"
{ yyval = new OctaveWhileStatement((Expression)val_peek(3), (OctaveASTListNode)val_peek(1)); 
        	  	((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
        	  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 143:
//#line 694 "octave.y"
{ yyval = new OctaveDoStatement((OctaveASTListNode)val_peek(2), (Expression)val_peek(0)); 
        	  	((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter()); 
        	  	((ASTNode)yyval).setEnd(((Expression)val_peek(0)).sourceEnd()); }
break;
case 144:
//#line 698 "octave.y"
{ yyval = new OctaveForStatement((Expression)val_peek(5), (Expression)val_peek(3), (OctaveASTListNode)val_peek(1));
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(6)).getCharacter()); 
        		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 145:
//#line 702 "octave.y"
{ yyval = new OctaveForStatement((Expression)val_peek(6), (Expression)val_peek(4), (OctaveASTListNode)val_peek(1));
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(8)).getCharacter());
        		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 146:
//#line 709 "octave.y"
{ yyval = val_peek(0); }
break;
case 147:
//#line 711 "octave.y"
{ yyval = val_peek(0); }
break;
case 148:
//#line 714 "octave.y"
{ yyval = val_peek(0); }
break;
case 149:
//#line 716 "octave.y"
{ yyval = val_peek(0); }
break;
case 150:
//#line 721 "octave.y"
{ yyval = val_peek(0); }
break;
case 151:
//#line 723 "octave.y"
{ yyval = val_peek(0); }
break;
case 152:
//#line 728 "octave.y"
{ yyval = val_peek(0); }
break;
case 153:
//#line 730 "octave.y"
{ yyval = val_peek(0); }
break;
case 154:
//#line 735 "octave.y"
{ yyval = val_peek(0); }
break;
case 155:
//#line 737 "octave.y"
{ yyval = val_peek(0); }
break;
case 156:
//#line 742 "octave.y"
{ yyval = val_peek(0); }
break;
case 157:
//#line 744 "octave.y"
{ yyval = val_peek(0); }
break;
case 158:
//#line 749 "octave.y"
{ yyval = val_peek(0); 
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
				if (((OctaveASTListNode)val_peek(0)).getChilds().isEmpty()) {
        	  		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(2)).getCharacter());
        	  	} else {
        	  		((ASTNode)yyval).setEnd(((OctaveASTListNode)val_peek(0)).sourceEnd());
        	  	}
        	}
break;
case 159:
//#line 761 "octave.y"
{ yyval = new OctaveASTListNode(); 
				((OctaveASTListNode)yyval).addNode((Expression)val_peek(2));
				((OctaveASTListNode)yyval).getChilds().addAll(((OctaveASTListNode)val_peek(0)).getChilds()); }
break;
case 160:
//#line 765 "octave.y"
{ yyval = val_peek(4);
				((OctaveASTListNode)yyval).addNode((Expression)val_peek(2));
				((OctaveASTListNode)yyval).getChilds().addAll(((OctaveASTListNode)val_peek(0)).getChilds()); }
break;
case 161:
//#line 772 "octave.y"
{ yyval = new OctaveExceptionStatement.OctaveTryStatement((OctaveASTListNode)val_peek(4), (OctaveASTListNode)val_peek(1)); 
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(6)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 162:
//#line 776 "octave.y"
{ yyval = new OctaveExceptionStatement.OctaveUnwindStatement((OctaveASTListNode)val_peek(4), (OctaveASTListNode)val_peek(1));
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(6)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 163:
//#line 783 "octave.y"
{ yyval = new OctaveJumpStatement((OctaveToken)val_peek(0)); }
break;
case 164:
//#line 785 "octave.y"
{ yyval = new OctaveJumpStatement((OctaveToken)val_peek(0)); }
break;
case 165:
//#line 787 "octave.y"
{ yyval = new OctaveJumpStatement((OctaveToken)val_peek(0)); }
break;
case 166:
//#line 792 "octave.y"
{ lexer.increaseFunctionDepth(); 
			  lexer.enableVarArgOut();
			  lexer.enableVarArgIn();
			  yyval = val_peek(0); }
break;
case 167:
//#line 800 "octave.y"
{ yyval = new OctaveFunctionStatement((OctaveFunctionDeclaration)val_peek(3), (OctaveASTListNode)val_peek(1));
			  ((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
			  if (val_peek(0) != null) {
			  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); 
			  } else if (!((OctaveASTListNode)val_peek(1)).getChilds().isEmpty()) { 
			  	((ASTNode)yyval).setEnd(((OctaveASTListNode)val_peek(1)).sourceEnd());
			  } else {
			  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(2)).getCharacter() + ((OctaveToken)val_peek(2)).toString().length());
			  } }
break;
case 168:
//#line 813 "octave.y"
{ yyval = new OctaveTranslationUnit((OctaveASTListNode)val_peek(1)); }
break;
case 169:
//#line 815 "octave.y"
{ yyval = new OctaveTranslationUnit((OctaveASTListNode)val_peek(1)); }
break;
case 170:
//#line 817 "octave.y"
{ yyval = new OctaveTranslationUnit((OctaveASTListNode)val_peek(0)); }
break;
case 171:
//#line 819 "octave.y"
{ yyval = new OctaveTranslationUnit((OctaveASTListNode)val_peek(0)); }
break;
case 172:
//#line 824 "octave.y"
{ lexer.decreaseFunctionDepth();  
			  yyval = null; }
break;
case 173:
//#line 827 "octave.y"
{ lexer.decreaseFunctionDepth();  
			  yyval = val_peek(0); }
break;
case 174:
//#line 830 "octave.y"
{ lexer.decreaseFunctionDepth();  
			  yyval = val_peek(0); }
break;
case 175:
//#line 836 "octave.y"
{ yyval = new OctaveASTListNode(); 
			((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 176:
//#line 840 "octave.y"
{ yyval = val_peek(1);
        	    ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 177:
//#line 844 "octave.y"
{ yyval = new OctaveASTListNode(); 
        	    ((OctaveASTListNode)yyval).addNode(new OctaveIdentifier((OctaveToken)val_peek(1)));    
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length());}
break;
case 178:
//#line 849 "octave.y"
{ yyval = val_peek(3);
        	    ((OctaveASTListNode)yyval).addNode(new OctaveIdentifier((OctaveToken)val_peek(1)));
        	    ((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 179:
//#line 857 "octave.y"
{ yyval = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)val_peek(0)), new OctaveASTListNode()); }
break;
case 180:
//#line 859 "octave.y"
{ yyval = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)val_peek(2)), new OctaveASTListNode()); 
        		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 181:
//#line 862 "octave.y"
{ yyval = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)val_peek(3)), (OctaveASTListNode)val_peek(1));
        		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 182:
//#line 868 "octave.y"
{ yyval = val_peek(0);
        	  lexer.disableVarArgOut();
			  lexer.disableVarArgIn(); }
break;
case 183:
//#line 872 "octave.y"
{ OctaveASTListNode list = new OctaveASTListNode(); 
				list.addNode(
					new OctaveIdentifier((OctaveToken)val_peek(2)));
        		((OctaveFunctionDeclaration)val_peek(0)).setReturnList(list); 
        		yyval = val_peek(0);
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
        		((ASTNode)yyval).setEnd(((ASTNode)val_peek(0)).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
break;
case 184:
//#line 882 "octave.y"
{ OctaveASTListNode list = new OctaveASTListNode(); 
        		((OctaveFunctionDeclaration)val_peek(0)).setReturnList(list);
        		yyval = val_peek(0);
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
        		((ASTNode)yyval).setEnd(((ASTNode)val_peek(0)).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
break;
case 185:
//#line 890 "octave.y"
{ ((OctaveFunctionDeclaration)val_peek(0)).setReturnList((OctaveASTListNode)val_peek(2)); 
        		yyval = val_peek(0);
        		((ASTNode)yyval).setStart(((ASTNode)val_peek(2)).sourceStart());
        		((ASTNode)yyval).setEnd(((ASTNode)val_peek(0)).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
break;
//#line 2493 "OctaveParser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    //if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      //if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        //if (yydebug)
          //yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      //if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
//## The -Jnorun option was used ##
//## end of method run() ########################################



//## Constructors ###############################################
//## The -Jnoconstruct option was used ##
//###############################################################



}
//################### END OF CLASS ##############################
=======
//### This file created by BYACC 1.8(/Java extension  1.14)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";



package org.seisint.eclide.internal.parser;



//#line 2 "octave.y"
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
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.seisint.eclide.ast.OctaveASTListNode;
import org.seisint.eclide.ast.OctaveAnonFunctionHandleExpression;
import org.seisint.eclide.ast.OctaveAssignmentLHSExpression;
import org.seisint.eclide.ast.OctaveBinaryExpression;
import org.seisint.eclide.ast.OctaveCellExpression;
import org.seisint.eclide.ast.OctaveColonExpression;
import org.seisint.eclide.ast.OctaveConstant;
import org.seisint.eclide.ast.OctaveDoStatement;
import org.seisint.eclide.ast.OctaveExceptionStatement;
import org.seisint.eclide.ast.OctaveExpressionStatement;
import org.seisint.eclide.ast.OctaveForStatement;
import org.seisint.eclide.ast.OctaveFunctionDeclaration;
import org.seisint.eclide.ast.OctaveFunctionHandleExpression;
import org.seisint.eclide.ast.OctaveFunctionStatement;
import org.seisint.eclide.ast.OctaveGlobalStatement;
import org.seisint.eclide.ast.OctaveIdentifier;
import org.seisint.eclide.ast.OctaveIfStatement;
import org.seisint.eclide.ast.OctaveJumpStatement;
import org.seisint.eclide.ast.OctaveMatrixExpression;
import org.seisint.eclide.ast.OctaveParenthesisExpression;
import org.seisint.eclide.ast.OctavePersistentStatement;
import org.seisint.eclide.ast.OctavePostfixExpression;
import org.seisint.eclide.ast.OctaveStatement;
import org.seisint.eclide.ast.OctaveString;
import org.seisint.eclide.ast.OctaveSwitchStatement;
import org.seisint.eclide.ast.OctaveSymbolCallExpression;
import org.seisint.eclide.ast.OctaveSymbolCallExpression.OctaveDotCallExpression;
import org.seisint.eclide.ast.OctaveSymbolReference;
import org.seisint.eclide.ast.OctaveTranslationUnit;
import org.seisint.eclide.ast.OctaveUnaryExpression;
import org.seisint.eclide.ast.OctaveVariableDeclaration;
import org.seisint.eclide.ast.OctaveWhileStatement;
import org.seisint.eclide.ast.OctaveIfStatement.OctaveElseClause;
import org.seisint.eclide.ast.OctaveIfStatement.OctaveElseIfClause;
import org.seisint.eclide.core.OctclipsePlugin;

import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.ast.ASTListNode;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;
//#line 80 "OctaveParser.java"




public class OctaveParser
             extends AbstractSourceParser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//## **user defined:Object
String   yytext;//user variable to return contextual strings
Object yyval; //used to return semantic vals from action routines
Object yylval;//the 'lval' (result) I got from yylex()
Object valstk[] = new Object[YYSTACKSIZE];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
final void val_init()
{
  yyval=new Object();
  yylval=new Object();
  valptr=-1;
}
final void val_push(Object val)
{
  try {
    valptr++;
    valstk[valptr]=val;
  }
  catch (ArrayIndexOutOfBoundsException e) {
    int oldsize = valstk.length;
    int newsize = oldsize*2;
    Object[] newstack = new Object[newsize];
    System.arraycopy(valstk,0,newstack,0,oldsize);
    valstk = newstack;
    valstk[valptr]=val;
  }
}
final Object val_pop()
{
  return valstk[valptr--];
}
final void val_drop(int cnt)
{
  valptr -= cnt;
}
final Object val_peek(int relative)
{
  return valstk[valptr-relative];
}
//#### end semantic value section ####
public final static short IDENTIFIER=257;
public final static short CONSTANT=258;
public final static short STRING_LITERAL=259;
public final static short LE_OP=260;
public final static short GE_OP=261;
public final static short EQ_OP=262;
public final static short NE_OP=263;
public final static short IF=264;
public final static short ELSE=265;
public final static short ELSEIF=266;
public final static short WHILE=267;
public final static short FOR=268;
public final static short BREAK=269;
public final static short RETURN=270;
public final static short PERSISTENT=271;
public final static short CONTINUE=272;
public final static short FUNCTION=273;
public final static short TRANSPOSE=274;
public final static short CR=275;
public final static short GLOBAL=276;
public final static short DO=277;
public final static short UNTIL=278;
public final static short SWITCH=279;
public final static short CASE=280;
public final static short TRY=281;
public final static short CATCH=282;
public final static short UNWIND=283;
public final static short CLEANUP=284;
public final static short OTHERWISE=285;
public final static short END=286;
public final static short ENDFUNCTION=287;
public final static short ENDFOR=288;
public final static short ENDIF=289;
public final static short ENDWHILE=290;
public final static short ENDTRYCATCH=291;
public final static short ENDUNWINDPROTECT=292;
public final static short ENDSWITCH=293;
public final static short COMMENT=294;
public final static short CONTINUATION=295;
public final static short SEMICOLON=296;
public final static short COMMA=297;
public final static short COLON=298;
public final static short ASSIGN=299;
public final static short LPAREN=300;
public final static short RPAREN=301;
public final static short LBRACKET=302;
public final static short RBRACKET=303;
public final static short AND=304;
public final static short MINUS=305;
public final static short PLUS=306;
public final static short MULT=307;
public final static short DIV=308;
public final static short LDIV=309;
public final static short LT_OP=310;
public final static short GT_OP=311;
public final static short OR=312;
public final static short OR_OR=313;
public final static short AND_AND=314;
public final static short POW=315;
public final static short NOT=316;
public final static short PLUS_PLUS=317;
public final static short MINUS_MINUS=318;
public final static short LBRACE=319;
public final static short RBRACE=320;
public final static short DOT=321;
public final static short AT=322;
public final static short PLUS_EQ=323;
public final static short MINUS_EQ=324;
public final static short MULT_EQ=325;
public final static short DIV_EQ=326;
public final static short LDIV_EQ=327;
public final static short POW_EQ=328;
public final static short RSHIFT=329;
public final static short LSHIFT=330;
public final static short RSHIFT_EQ=331;
public final static short LSHIFT_EQ=332;
public final static short AND_EQ=333;
public final static short OR_EQ=334;
public final static short VARARGOUT=335;
public final static short VARARGIN=336;
public final static short EOF=337;
public final static short COMMAND_IDENTIFIER=338;
public final static short LEX_ERROR=339;
public final static short COMMAND_STRING=340;
public final static short UNARY=341;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    1,    1,    1,    2,    3,    4,    5,    6,    7,    7,
    7,    9,   10,   11,   11,   11,   12,   12,   13,   13,
   14,   16,   16,   16,   16,   16,   16,   16,   16,   18,
   18,   18,   20,   20,   20,   20,   20,   19,   19,   19,
   19,   19,   19,   21,   22,   22,   23,   23,   23,   23,
   23,   23,   23,   23,   23,   23,   23,   23,   23,   24,
   25,   28,   29,   29,   29,   29,   17,   17,   17,   30,
   30,   30,   30,   30,   30,   30,   30,   30,   30,   30,
   30,   31,   31,   31,   31,   31,   31,   32,   32,   33,
   33,   34,   34,   27,   27,   35,   35,   35,   35,   35,
   35,   42,   42,   43,   43,   26,   26,   26,   26,   44,
   44,   45,   45,   36,   36,   46,   47,    8,    8,   48,
   48,   49,   49,   50,   51,   51,   15,   15,   15,   15,
   15,   15,   52,   52,   53,   53,   37,   37,   37,   55,
   54,   38,   38,   38,   38,   56,   56,   60,   60,   61,
   61,   58,   58,   62,   62,   63,   63,   59,   57,   57,
   39,   39,   40,   40,   40,   64,   41,    0,    0,    0,
    0,   66,   66,   66,   67,   67,   67,   67,   68,   68,
   68,   65,   65,   65,   65,
};
final static short yylen[] = {                            2,
    1,    1,    1,    1,    1,    2,    1,    1,    2,    3,
    3,    1,    1,    2,    3,    3,    1,    1,    1,    1,
    1,    1,    4,    3,    3,    5,    2,    2,    2,    1,
    1,    2,    1,    1,    1,    1,    1,    3,    3,    3,
    3,    3,    3,    1,    1,    3,    1,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    3,    3,    3,    1,
    5,    2,    1,    1,    2,    2,    1,    1,    1,    1,
    3,    3,    3,    3,    3,    3,    3,    3,    3,    3,
    3,    1,    1,    1,    2,    2,    2,    0,    1,    0,
    1,    1,    2,    1,    1,    1,    1,    1,    1,    1,
    1,    0,    1,    2,    4,    1,    3,    1,    3,    1,
    3,    1,    2,    2,    2,    1,    1,    1,    2,    1,
    3,    1,    2,    0,    1,    1,    1,    1,    1,    3,
    3,    3,    1,    2,    3,    2,    3,    5,    6,    5,
    3,    5,    5,    7,    9,    1,    1,    1,    1,    1,
    1,    1,    1,    1,    1,    1,    1,    3,    4,    5,
    7,    7,    1,    1,    1,    1,    5,    2,    3,    1,
    2,    1,    1,    1,    2,    3,    3,    5,    1,    3,
    4,    1,    3,    3,    3,
};
final static short yydefred[] = {                         0,
    1,    2,    3,    0,    0,    0,  163,  164,    0,  165,
  166,   92,    0,    0,    0,    0,    0,   34,   33,   37,
   35,   36,   60,    0,    0,   22,    0,   94,    0,   31,
    0,   47,    0,    0,    0,   67,    0,   68,    0,    0,
    0,   95,   96,   97,   98,   99,  100,  101,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  112,    0,
    0,   84,   83,   82,    0,    0,    0,    0,    0,   64,
   63,    0,   27,    4,   28,   29,   12,    0,   17,   18,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  104,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   93,  168,    0,    0,    0,
    0,    0,    0,  182,    0,  147,  146,  137,    0,    0,
  134,  136,    0,    0,    0,    0,  113,   87,   86,   85,
    0,    0,    0,    0,   66,   65,   25,    0,  117,  116,
    5,   13,   19,   20,   24,    0,    0,  127,  128,  129,
    0,    0,    0,    0,    0,   41,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   48,   49,  106,
  108,    0,   71,   72,   73,   74,   75,   76,   77,   81,
   80,   78,   79,  169,    0,    0,    0,  175,    0,    0,
    0,    0,    0,  135,    0,    0,    0,    0,    0,  111,
    0,    0,    0,    0,    0,    0,   23,  125,  126,    0,
    0,    0,  105,    0,  183,  180,    0,  177,    0,  176,
  184,    0,  185,  141,    0,  149,  148,  142,    0,    0,
  143,    0,    0,    0,  153,  152,  138,    0,    0,    0,
   26,  131,  130,  132,  107,  109,   61,  181,    0,  174,
  173,  172,  167,    0,    0,    0,    0,    0,    0,  139,
    0,    0,  178,  140,    0,  151,  150,  144,  159,    0,
  158,  155,  154,  161,  157,  156,  162,    0,  160,  145,
};
final static short yydgoto[] = {                         25,
   26,   79,  153,    0,    0,    0,    0,    0,   80,  154,
    0,   81,  155,  156,  157,   27,   28,   29,   30,   31,
   32,   33,   34,   35,   36,  182,   37,   38,   72,   39,
   65,   66,   40,   41,   42,   43,   44,   45,   46,   47,
   48,   49,   50,   59,   60,  159,  160,    0,    0,  219,
  220,   53,   54,  131,  132,  128,  213,  247,  248,  238,
  278,  284,  287,   51,  122,  263,  123,  124,
};
final static short yysindex[] = {                      2956,
    0,    0,    0, -242, -242, 2233,    0,    0, -215,    0,
    0,    0, -215, -123, -242, -123, -123,    0,    0,    0,
    0,    0,    0, -253,    0,    0, -115,    0, -197,    0,
  329,    0, -279, 2147, -183,    0, -123,    0, 2347, 3146,
 -224,    0,    0,    0,    0,    0,    0,    0, -272, -123,
 -232, -123, -207,  -43, -123, 2230, 2422, -145,    0, -215,
 -215,    0,    0,    0, -114, 3146, -123, 3146, 3146,    0,
    0, -252,    0,    0,    0,    0,    0, -228,    0,    0,
 -249, 2230, 2230, 2230, 2230, 2230, 2230, -214, 2230, 2230,
 2230, 2230, 2230, 2230, 2230, 2230, 2230, 2230, 2230, 2230,
 2230, -239,    0, -242, -242, -242, -242, -242, -242, -242,
 -242, -242, -242, -242, -169,    0,    0, 3146, -164, -244,
 -124, -123, -113,    0, 3146,    0,    0,    0, -123, -123,
    0,    0, 3146, 2657, -242, -242,    0,    0,    0,    0,
 -107,  -73,  -83,  -57,    0,    0,    0, -242,    0,    0,
    0,    0,    0,    0,    0, -277,  -86,    0,    0,    0,
  -84,  -84,  -84,  -84,  -84,    0,  -99,  -77,  -77,  -77,
  -77, -216,  -77,  -77, -216, -216, -216,    0,    0,    0,
    0, -247,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0, -123,   -8, -243,    0,  -28, -219,
   -8, 2564,   -8,    0, 3146, -242, -184, -242, -123,    0,
 -242, -242,  -67, -123, -123,   -6,    0,    0,    0, 2481,
 -235, 3146,    0,   -4,    0,    0, -104,    0, -236,    0,
    0, -275,    0,    0, -123,    0,    0,    0,    2, 3146,
    0, -123, -242, -123,    0,    0,    0, -254, 3146, 3146,
    0,    0,    0,    0,    0,    0,    0,    0,   -2,    0,
    0,    0,    0, 3146, -123, -258, 3146, -123, 3146,    0,
 -225, -130,    0,    0, 3146,    0,    0,    0,    0, 3146,
    0,    0,    0,    0,    0,    0,    0, -258,    0,    0,
};
final static short yyrindex[] = {                        20,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0, 2987,    0, 3059, 3090,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  500,    0,  753,    0,
    0,    0,  671, 1664,    0,    0, 2157,    0, 2075,   40,
 2386,    0,    0,    0,    0,    0,    0,    0,  304, 2239,
    0, -126,    0, -152, 2620,    0,    0, 1746,    0, 1828,
 1910,    0,    0,    0, 2314,   42,   57,   96,   38,    0,
    0, 1993,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    1,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  383,    0,    0,    0, -109,    0,
    0,    0,    0,    0, -117,    0,    0,    0, 2676,  -81,
    0,    0,  -92,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0, 3173,    0,    0,    0,
   83,  165,  247,  336,  418,    0,  582,  835,  917, 1006,
 1088, 1335, 1170, 1252, 1417, 1499, 1581,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0, 2157,    0,    0,    0,    0,    0,
    0, -260,    0,    0,  -69,    0,    0,    0, 2732,    0,
    0,    0,    0, 2788, 2844,    0,    0,    0,    0,    0,
    0,    0,    0, -109,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0, -126,    0,    0,    0,    0,  -44,
    0, 2489,    0, 2900,    0,    0,    0,    0, -102, -128,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0, -117, 2732,    0,  -47, 2489, -238,    0,
    0,    0,    0,    0,  -44,    0,    0,    0,    0,  -47,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  229,    0,    0,  355, 2606, 1889,    0,    0,
    0,    0,   29,    0,    0, -116, -118,    0,    0,    0,
  276,  -14,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  -35,    0,  195,  389,  184,  199,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  191,    0,    0,
  171,    0,    0,    0,    0,    0,    0,   47,
};
final static int YYTABLESIZE=3511;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        195,
   32,   68,   69,  200,  115,   70,  145,    1,    2,    3,
  260,  261,  180,  180,    1,    2,    3,  180,   89,   90,
  255,  255,  103,  151,  119,  102,  102,  276,  147,  277,
  141,  245,  143,  144,   57,  118,  149,  125,  246,  102,
  133,   58,  152,   90,   91,   92,   93,  102,  150,  221,
  116,  151,  142,  222,  102,   18,   19,  226,  198,   73,
  282,  262,   18,   19,  117,  283,   20,   21,   22,  120,
  152,  148,   23,   20,   21,   22,  102,  229,  126,   23,
  227,  127,   43,  230,  134,   74,   71,  146,   24,  204,
  199,  181,  181,   95,   96,   24,  181,  207,  259,  256,
  256,  236,  121,  257,   77,  237,   78,   82,   83,   84,
   85,   86,  100,  101,  205,  206,  102,   87,  168,  169,
  170,  171,  172,  173,  174,  175,  176,  177,  178,  179,
   88,   88,   88,  133,  196,  197,  133,   88,   88,   88,
   88,   88,   88,   88,   88,   88,   88,  102,  102,   88,
   88,   62,   88,  136,   88,  285,   88,  102,   73,   88,
  138,  286,   88,  102,   42,  179,  232,  194,  102,  234,
  211,  102,   63,   64,  201,   88,   88,   88,   88,   88,
  223,  139,  140,  102,   74,  203,  179,  179,  102,   88,
   88,   88,  221,  102,  240,   88,  258,  102,  214,  249,
  250,   75,   76,   77,  266,   78,  212,   84,   85,   86,
  218,   88,  243,  271,  272,   87,  102,  244,  245,  102,
  264,  129,  130,   88,   88,  246,  215,  267,  274,  269,
   87,  279,  102,  281,   88,   88,   88,  102,  102,  288,
   88,  102,  225,  102,  289,  102,   38,  231,  224,  233,
  275,  100,  101,  280,  137,  137,   88,   32,   32,   32,
   32,   32,   32,   32,   32,   32,   32,   32,   32,   32,
   32,   32,   32,   32,  228,   32,   32,   32,   32,   32,
   32,   32,   32,   32,   32,   32,   32,   32,   32,   32,
   32,   32,   32,   32,  251,  197,   32,   32,   32,   32,
  273,   32,  265,  170,   32,   32,   32,   32,   32,   32,
   32,   32,   32,   32,   32,   32,   32,   32,   32,  102,
   32,  102,   32,   32,   32,   32,   32,   32,   32,   32,
   32,   32,   32,   32,   32,   39,   88,   32,   32,   43,
   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
   43,   43,   43,   43,   43,   43,   90,   43,   43,   43,
   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
   43,   43,   43,   43,   43,   43,  102,  102,   43,   43,
   43,   43,  171,   43,  217,   88,   43,   43,   43,   43,
   43,   43,   43,   43,   43,   43,   43,  202,   43,   43,
   43,   61,   43,  253,   43,   43,   43,   43,   43,   43,
   43,   43,   43,   43,   43,   43,   43,   40,  254,   43,
   43,   42,   42,   42,   42,   42,   42,   42,   42,   42,
   42,   42,   42,   42,   42,   42,   42,   42,  270,   42,
   42,   42,   42,   42,   42,   42,   42,   42,   42,   42,
   42,   42,   42,   42,   42,   42,   42,   42,  290,    0,
   42,   42,   42,   42,    0,   42,    0,    0,   42,   42,
   42,   42,   42,   42,   42,   42,   42,   42,   42,    0,
   42,   42,   42,    0,   42,    0,   42,   42,   42,   42,
   42,   42,   42,   42,   42,   42,   42,   42,   42,   30,
    0,   42,   42,   38,   38,   38,   38,   38,   38,   38,
   38,   38,   38,   38,   38,   38,   38,   38,   38,   38,
    0,   38,   38,   38,   38,   38,   38,   38,   38,   38,
   38,   38,   38,   38,   38,   38,   38,   38,   38,   38,
    0,    0,   38,   38,   38,   38,    0,   38,    0,    0,
   38,   38,   38,   38,   38,   38,   38,   38,   38,   38,
   38,    0,   38,   38,   38,    0,   38,    0,   38,   38,
   38,   38,   38,   38,   38,   38,   38,   38,   38,   38,
   38,   46,    0,   38,   38,    1,    2,    3,    0,    0,
    0,    0,   39,   39,   39,   39,   39,   39,   39,   39,
   39,   39,   39,   39,   39,   39,   39,   39,   39,    0,
   39,   39,   39,   39,   39,   39,   39,   39,   39,   39,
   39,   39,   39,   39,   39,   39,   39,   39,   39,    0,
    0,   39,   39,   39,   39,    0,   39,    0,    0,   39,
   39,   39,   39,   39,   39,   39,   39,   39,   39,   39,
    0,   39,   39,   39,    0,   39,    0,   39,   39,   39,
   39,   39,   39,   39,   39,   39,   39,   39,   39,   39,
   44,    0,   39,   39,   40,   40,   40,   40,   40,   40,
   40,   40,   40,   40,   40,   40,   40,   40,   40,   40,
   40,    0,   40,   40,   40,   40,   40,   40,   40,   40,
   40,   40,   40,   40,   40,   40,   40,   40,   40,   40,
   40,    0,    0,   40,   40,   40,   40,    0,   40,    0,
    0,   40,   40,   40,   40,   40,   40,   40,   40,   40,
   40,   40,    0,   40,   40,   40,    0,   40,    0,   40,
   40,   40,   40,   40,   40,   40,   40,   40,   40,   40,
   40,   40,   45,    0,   40,   40,   30,   30,   30,   30,
   30,   30,   30,   30,   30,   30,   30,   30,   30,   30,
   30,   30,   30,    0,   30,   30,   30,   30,   30,   30,
   30,   30,   30,   30,   30,   30,   30,   30,   30,   30,
   30,   30,   30,    0,    0,   30,   30,   30,   30,    0,
   30,    0,    0,   30,   30,   30,   30,   30,   30,   30,
   30,   30,   30,   30,   30,   30,    0,    0,    0,   30,
    0,   30,   30,   30,   30,   30,   30,   30,   30,   30,
   30,   30,   30,   30,   52,    0,   30,   30,   46,   46,
   46,   46,   46,   46,   46,   46,   46,   46,   46,   46,
   46,   46,   46,   46,   46,    0,   46,   46,   46,   46,
   46,   46,   46,   46,   46,   46,   46,   46,   46,   46,
   46,   46,   46,   46,   46,    0,    0,   46,   46,   46,
   46,    0,   46,    0,    0,   46,   46,   46,    0,    0,
    0,   46,   46,   46,   46,   46,    0,   46,   46,   46,
    0,   46,    0,   46,   46,   46,   46,   46,   46,   46,
   46,   46,   46,   46,   46,   46,   53,    0,   46,   46,
    0,    0,    0,    0,    0,    0,    0,   44,   44,   44,
   44,   44,   44,   44,   44,   44,   44,   44,   44,   44,
   44,   44,   44,   44,    0,   44,   44,   44,   44,   44,
   44,   44,   44,   44,   44,   44,   44,   44,   44,   44,
   44,   44,   44,   44,    0,    0,   44,   44,    0,   44,
    0,   44,    0,    0,   44,   44,   44,    0,    0,    0,
   44,   44,   44,   44,   44,    0,   44,   44,   44,    0,
   44,    0,   44,   44,   44,   44,   44,   44,   44,   44,
   44,   44,   44,   44,   44,   54,    0,   44,   44,   45,
   45,   45,   45,   45,   45,   45,   45,   45,   45,   45,
   45,   45,   45,   45,   45,   45,    0,   45,   45,   45,
   45,   45,   45,   45,   45,   45,   45,   45,   45,   45,
   45,   45,   45,   45,   45,   45,    0,    0,   45,   45,
   45,   45,    0,   45,    0,    0,   45,    0,    0,    0,
    0,    0,   45,   45,   45,   45,   45,    0,   45,   45,
   45,    0,   45,    0,   45,   45,   45,   45,   45,   45,
   45,   45,   45,   45,   45,   45,   45,   55,    0,   45,
   45,   52,   52,   52,   52,   52,   52,   52,   52,   52,
   52,   52,   52,   52,   52,   52,   52,   52,    0,   52,
   52,   52,   52,   52,   52,   52,   52,   52,   52,   52,
   52,   52,   52,   52,   52,   52,   52,   52,    0,    0,
   52,   52,   52,   52,    0,   52,    0,    0,   52,   52,
   52,    0,    0,    0,   52,   52,   52,   52,   52,    0,
   52,   52,   52,    0,   52,    0,   52,   52,   52,   52,
   52,   52,   52,    0,    0,   52,   52,   52,   52,   50,
    0,   52,   52,   53,   53,   53,   53,   53,   53,   53,
   53,   53,   53,   53,   53,   53,   53,   53,   53,   53,
    0,   53,   53,   53,   53,   53,   53,   53,   53,   53,
   53,   53,   53,   53,   53,   53,   53,   53,   53,   53,
    0,    0,   53,   53,   53,   53,    0,   53,    0,    0,
   53,   53,   53,    0,    0,    0,   53,   53,   53,   53,
   53,    0,   53,   53,   53,    0,   53,    0,   53,   53,
   53,   53,   53,   53,   53,    0,    0,   53,   53,   53,
   53,   51,    0,   53,   53,    0,    0,    0,    0,    0,
    0,    0,   54,   54,   54,   54,   54,   54,   54,   54,
   54,   54,   54,   54,   54,   54,   54,   54,   54,    0,
   54,   54,   54,   54,   54,   54,   54,   54,   54,   54,
   54,   54,   54,   54,   54,   54,   54,   54,   54,    0,
    0,   54,   54,   54,   54,    0,   54,    0,    0,   54,
   54,   54,    0,    0,    0,   54,   54,   54,   54,   54,
    0,   54,   54,   54,    0,   54,    0,   54,   54,   54,
   54,   54,   54,   54,   56,    0,   54,   54,   54,   54,
    0,    0,   54,   54,   55,   55,   55,   55,   55,   55,
   55,   55,   55,   55,   55,   55,   55,   55,   55,   55,
   55,    0,   55,   55,   55,   55,   55,   55,   55,   55,
   55,   55,   55,   55,   55,   55,   55,   55,   55,   55,
   55,    0,    0,   55,   55,   55,   55,    0,   55,    0,
    0,   55,   55,   55,    0,    0,    0,   55,   55,   55,
   55,   55,    0,   55,   55,   55,    0,   55,    0,   55,
   55,   55,   55,   55,   55,   55,   58,    0,   55,   55,
   55,   55,    0,    0,   55,   55,   50,   50,   50,   50,
   50,   50,   50,   50,   50,   50,   50,   50,   50,   50,
   50,   50,   50,    0,   50,   50,   50,   50,   50,   50,
   50,   50,   50,   50,   50,   50,   50,   50,   50,   50,
   50,   50,   50,    0,    0,   50,   50,   50,   50,    0,
   50,    0,    0,   50,   50,   50,    0,    0,    0,   50,
   50,   50,   50,   50,    0,   50,   50,   50,    0,   50,
    0,   50,   50,   50,   50,   50,   50,   50,   59,    0,
   50,   50,   50,   50,    0,    0,   50,   50,   51,   51,
   51,   51,   51,   51,   51,   51,   51,   51,   51,   51,
   51,   51,   51,   51,   51,    0,   51,   51,   51,   51,
   51,   51,   51,   51,   51,   51,   51,   51,   51,   51,
   51,   51,   51,   51,   51,    0,    0,   51,   51,   51,
   51,    0,   51,    0,    0,   51,   51,   51,    0,    0,
    0,   51,   51,   51,   51,   51,    0,   51,   51,   51,
    0,   51,    0,   51,   51,   51,   51,   51,   51,   51,
   57,    0,   51,   51,   51,   51,    0,    0,   51,   51,
    0,   56,   56,   56,    0,    0,    0,    0,   56,   56,
   56,   56,   56,   56,   56,   56,   56,   56,    0,   56,
   56,   56,   56,   56,   56,   56,   56,   56,   56,   56,
   56,   56,   56,   56,   56,   56,   56,   56,    0,    0,
   56,   56,   56,   56,    0,   56,    0,    0,   56,   56,
   56,    0,    0,    0,    0,    0,   56,   56,   56,    0,
   56,   56,   56,    0,   56,    0,   56,   56,   56,   56,
   56,   56,   56,   70,    0,   56,   56,   56,   56,    0,
    0,   56,   56,   58,   58,   58,    0,    0,    0,    0,
   58,   58,   58,   58,   58,   58,   58,   58,   58,   58,
    0,   58,   58,   58,   58,   58,   58,   58,   58,   58,
   58,   58,   58,   58,   58,   58,   58,   58,   58,   58,
    0,    0,   58,   58,   58,   58,    0,   58,    0,    0,
   58,   58,   58,    0,    0,    0,    0,    0,   58,   58,
   58,    0,   58,   58,   58,    0,   58,    0,   58,   58,
   58,   58,   58,   58,   58,  110,    0,   58,   58,   58,
   58,    0,    0,   58,   58,   59,   59,   59,    0,    0,
    0,    0,   59,   59,   59,   59,   59,   59,   59,   59,
   59,   59,    0,   59,   59,   59,   59,   59,   59,   59,
   59,   59,   59,   59,   59,   59,   59,   59,   59,   59,
   59,   59,    0,    0,   59,   59,   59,   59,    0,   59,
    0,    0,   59,   59,   59,    0,    0,    0,    0,    0,
   59,   59,   59,    0,   59,   59,   59,    0,   59,    0,
   59,   59,   59,   59,   59,   59,   59,  115,    0,   59,
   59,   59,   59,    0,    0,   59,   59,   57,   57,   57,
    0,    0,    0,    0,   57,   57,   57,   57,   57,   57,
   57,   57,   57,   57,    0,   57,   57,   57,   57,   57,
   57,   57,   57,   57,   57,   57,   57,   57,   57,   57,
   57,   57,   57,   57,    0,    0,   57,   57,   57,   57,
    0,   57,    0,    0,   57,   57,   57,    0,    0,    0,
    0,    0,   57,   57,   57,    0,   57,   57,   57,    0,
   57,    0,   57,   57,   57,   57,   57,   57,   57,  114,
    0,   57,   57,   57,   57,    0,    0,   57,   57,    0,
   70,   70,   70,    0,    0,    0,    0,   70,   70,   70,
   70,   70,   70,   70,   70,   70,   70,    0,   70,   70,
   70,   70,   70,   70,   70,   70,   70,   70,   70,   70,
   70,   70,   70,   70,   70,   70,   70,    0,    0,   70,
   70,   70,   70,    0,   70,    0,    0,    0,   70,   70,
  161,  162,  163,  164,  165,  166,    0,  167,    0,   70,
   70,   70,    0,   70,    0,   70,   70,   70,   70,   70,
   70,   70,   62,    0,   70,   70,   70,   70,    0,    0,
   70,   70,  110,  110,  110,    0,    0,    0,    0,  110,
  110,  110,  110,  110,  110,  110,  110,  110,  110,    0,
  110,  110,  110,  110,  110,  110,  110,  110,  110,  110,
  110,  110,  110,  110,  110,  110,  110,  110,  110,    0,
    0,  110,  110,  110,    0,    0,  110,    0,    0,    0,
  110,  110,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  110,  110,  110,    0,  110,    0,  110,  110,  110,
  110,  110,  110,  110,   69,    0,  110,  110,  110,  110,
    0,    0,  110,  110,    0,  115,  115,    0,    0,    0,
    0,  115,  115,  115,  115,  115,  115,  115,  115,  115,
  115,    0,  115,  115,  115,  115,  115,  115,  115,  115,
  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,
  115,    0,    0,  115,  115,  115,  115,    0,  115,    0,
    0,    0,  115,  115,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  115,  115,  115,    0,  115,    0,  115,
  115,  115,  115,  115,  115,  115,   88,    0,  115,  115,
  115,  115,    0,    0,  115,  115,    0,  114,  114,    0,
    0,    0,    0,  114,  114,  114,  114,  114,  114,  114,
  114,  114,  114,    0,  114,  114,  114,  114,  114,  114,
  114,  114,  114,  114,  114,  114,  114,  114,  114,  114,
  114,  114,  114,    0,    0,  114,  114,  114,  114,    0,
  114,    0,    0,    0,  114,  114,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  114,  114,  114,    0,  114,
    0,  114,  114,  114,  114,  114,  114,  114,  103,    0,
  114,  114,  114,  114,    0,    0,  114,  114,    0,   62,
   62,    0,    0,    0,    0,    0,   62,   62,   62,   62,
   62,   62,   62,   62,   62,   62,    0,   62,   62,   62,
   62,   62,   62,   62,   62,   62,   62,   62,   62,   62,
   62,   62,   62,   62,   62,   62,    0,    0,   62,   62,
   62,   62,    0,   62,    0,    0,    0,   62,   62,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   62,   62,
   62,    0,   62,   89,   62,   62,   62,   62,   62,   62,
   62,    0,    0,   62,   62,   62,   62,    0,    0,   62,
   62,   69,   69,   69,    0,    0,    0,    0,   69,   69,
   69,   69,   69,   69,   69,   69,   69,   69,    0,   69,
   69,   69,   69,   69,   69,   69,   69,   69,   69,   69,
   69,   69,   69,   69,   69,   69,   69,   69,    0,    0,
   69,   69,   69,    0,    0,   69,    0,    0,    0,   69,
   69,    0,    0,    0,    0,   91,    0,    0,    0,    0,
   69,   69,   69,    0,   69,    0,   69,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   90,   91,   92,   93,
    0,   69,   69,   88,   88,   88,    0,    0,    0,    0,
   88,   88,   88,   88,   88,   88,   88,   88,   88,   88,
    0,    0,   88,   88,   88,   88,   88,   88,   88,   88,
   88,   88,   88,   88,   88,   88,   88,   88,   88,   88,
   94,    0,    0,    0,    0,    0,   95,   96,   97,   98,
   99,   88,   88,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   88,   88,   88,  100,  101,    0,   88,    0,
    0,    0,    0,    0,    0,    0,    1,    2,    3,    1,
    2,    3,    0,   88,   88,   88,   88,   88,    0,    0,
    0,    0,   88,  103,  103,   88,   88,   88,   88,   88,
   88,   88,    0,    0,   88,   88,  103,   88,  103,   88,
  103,   88,  103,  103,  103,  103,  103,  103,  103,  103,
  103,  103,   56,    0,   18,   19,    0,   18,   19,    0,
    0,    0,    0,   88,   88,   20,   21,   22,   20,   21,
   22,    0,    0,    0,   88,   88,   88,    0,    0,    0,
   88,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   89,   89,   89,    0,    0,  103,   88,   89,   89,   89,
   89,   89,   89,   89,   89,   89,   89,    0,    0,   89,
   89,   89,   89,   89,   89,   89,   89,   89,   89,   89,
   89,   89,   89,   89,   89,   89,   89,    0,    0,   52,
   55,    0,    0,    0,    0,    0,    0,    0,   89,   89,
   67,    0,    0,    0,    0,    0,    0,    0,    0,   89,
   89,   89,    0,    0,    0,   89,    0,    0,    0,    0,
    0,    0,   91,   91,   91,  104,    0,    0,    0,   91,
   89,   89,   91,   91,   91,   91,   91,   91,   91,    0,
    0,   91,   91,    0,   91,    0,   91,    0,   91,  105,
  106,  107,  108,  109,  110,    0,    0,  111,  112,  113,
  114,   90,   91,   92,   93,    0,  158,    0,    0,    0,
   91,   91,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   91,   91,   91,    0,    0,    0,   91,    0,  183,
  184,  185,  186,  187,  188,  189,  190,  191,  192,  193,
  135,    0,   91,   91,    0,   94,    0,    0,    0,    0,
    0,   95,   96,   97,   98,   99,    0,    1,    2,    3,
  209,  210,    0,    0,    0,   88,   88,   88,    0,    0,
  100,  101,   88,  216,    0,   88,   88,   88,   88,   88,
   88,   88,    0,    0,   88,   88,  149,   88,   88,   88,
    0,   88,    0,   88,   88,    0,    0,    0,  150,    0,
    0,   88,    0,    0,    0,   18,   19,    0,    0,    0,
    0,    0,    0,   88,   88,    0,   20,   21,   22,    0,
    0,    0,   23,    0,   88,   88,   88,    0,    0,    0,
   88,  235,    0,  239,    0,    0,  241,  242,   24,    0,
    1,    2,    3,    0,    0,  252,   88,    4,    0,    0,
    5,    6,    7,    8,    9,   10,   11,    0,  138,   13,
   14,    0,   15,    0,   16,    0,   17,    0,  268,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  139,
  140,    0,    0,    0,    0,    0,    0,    0,   18,   19,
    0,    0,    0,    0,    0,    0,   88,   88,   88,   20,
   21,   22,    0,   88,    0,   23,   88,   88,   88,   88,
   88,   88,   88,    0,    0,   88,   88,    0,   88,    0,
   88,   24,   88,    0,    0,   88,    0,    0,    0,   88,
    0,    0,    0,    0,    0,    0,   90,   91,   92,   93,
    0,    0,    0,    0,   88,   88,    0,    0,    0,    0,
    0,    0,   88,   88,   88,   88,   88,   88,    0,   88,
    0,   88,   88,   88,   88,   88,   88,   88,   88,    0,
    0,   88,   88,    0,   88,  208,   88,   88,   88,    0,
   94,   88,    0,    0,   88,    0,   95,   96,   97,   98,
   99,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   88,   88,    0,    0,    0,  100,  101,    0,   88,   88,
   88,   88,   88,   88,    0,   88,    0,   88,   88,   88,
   88,   88,   88,   88,   88,    0,    0,   88,   88,    0,
   88,    0,   88,   88,   88,    0,    0,   88,    0,   88,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   88,   88,    0,    0,
    0,    0,    0,    0,   88,   88,   88,   88,   88,   88,
    0,   88,    0,   88,   88,   88,   88,   88,   88,   88,
   88,    0,    0,   88,   88,    0,   88,    0,   88,   88,
   88,    0,    0,   88,    0,    0,    0,    0,   88,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   88,   88,    0,    0,    0,    0,    0,    0,
   88,   88,   88,   88,   88,   88,    0,   88,    0,   88,
   88,   88,   88,   88,   88,   88,   88,    0,    0,   88,
   88,    0,   88,    0,   88,   88,   88,    0,    0,   88,
    0,    0,    0,    0,    0,   88,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   88,   88,
    0,    0,    0,    0,    0,    0,   88,   88,   88,   88,
   88,   88,    0,   88,    0,   88,   88,   88,   88,   88,
   88,   88,   88,    0,    0,   88,   88,    0,   88,    0,
   88,   88,   88,    0,    0,   88,    0,    0,    0,    0,
    0,    0,   88,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   88,   88,    0,    0,    0,    0,
    0,    0,    1,    2,    3,   88,   88,   88,    0,    4,
    0,   88,    5,    6,    7,    8,    9,   10,   11,    0,
   12,   13,   14,    0,   15,    0,   16,   88,   17,    0,
    0,    0,    0,   88,   88,   88,    0,    0,    0,    0,
   88,    0,    0,   88,   88,   88,   88,   88,   88,   88,
   18,   19,   88,   88,   88,   88,    0,   88,    0,   88,
    0,   20,   21,   22,    0,    0,    0,   23,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   88,   88,   24,    0,    0,    0,    0,    0,    0,
    0,    0,   88,   88,   88,    0,    0,    0,   88,    0,
    0,    0,    0,    0,    0,   88,   88,   88,    0,    0,
    0,    0,   88,    0,   88,   88,   88,   88,   88,   88,
   88,   88,    0,    0,   88,   88,    0,   88,    0,   88,
   88,   88,    0,    0,    0,    0,   88,   88,   88,    0,
    0,    0,    0,   88,    0,    0,   88,   88,   88,   88,
   88,   88,   88,   88,   88,   88,   88,    0,   88,    0,
   88,    0,   88,   88,   88,   88,   88,    0,    0,    0,
   88,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   88,   88,   88,    0,    0,    0,
    0,    0,    1,    2,    3,   88,   88,   88,    0,    4,
    0,   88,    5,    6,    7,    8,    9,   10,   11,    0,
    0,   13,   14,    0,   15,    0,   16,   88,   17,  124,
  124,  124,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   18,   19,    0,    0,    0,    0,    0,    0,  124,    0,
    0,   20,   21,   22,    0,    0,    0,   23,    0,    0,
  124,    0,    0,   21,    0,    0,    0,  124,  124,    0,
    0,    0,    0,   24,    0,    0,    0,    0,  124,  124,
  124,    0,   21,    0,  124,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  124,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                        118,
    0,   16,   17,  120,   40,  259,  259,  257,  258,  259,
  286,  287,  257,  257,  257,  258,  259,  257,  298,    0,
  257,  257,   37,  301,  257,  286,  287,  286,  257,  288,
   66,  286,   68,   69,    6,   50,  286,   52,  293,    0,
   55,  257,  320,  260,  261,  262,  263,  286,  298,  297,
  275,  301,   67,  301,  293,  305,  306,  301,  303,  274,
  286,  337,  305,  306,  337,  291,  316,  317,  318,  302,
  320,  300,  322,  316,  317,  318,  337,  297,  286,  322,
  197,  289,    0,  303,   56,  300,  340,  340,  338,  125,
  335,  336,  336,  310,  311,  338,  336,  133,  335,  336,
  336,  286,  335,  222,  319,  290,  321,  305,  306,  307,
  308,  309,  329,  330,  129,  130,  300,  315,   90,   91,
   92,   93,   94,   95,   96,   97,   98,   99,  100,  101,
  257,  258,  259,  286,  299,  300,  289,  264,  265,  266,
  267,  268,  269,  270,  271,  272,  273,  265,  266,  276,
  277,  275,  279,  299,  281,  286,  283,  286,  274,  286,
  275,  292,  289,  292,    0,  275,  202,  337,  286,  205,
  278,  289,  296,  297,  299,  257,  258,  259,  305,  306,
  195,  296,  297,  286,  300,  299,  296,  297,  291,  316,
  317,  318,  297,  286,  209,  322,  301,  290,  282,  214,
  215,  317,  318,  319,  240,  321,  280,  307,  308,  309,
  297,  338,  280,  249,  250,  315,  286,  285,  286,  289,
  235,  265,  266,  305,  306,  293,  284,  242,  264,  244,
  315,  267,  280,  269,  316,  317,  318,  285,  286,  275,
  322,  286,  196,  288,  280,  293,    0,  201,  257,  203,
  265,  329,  330,  268,   60,   61,  338,  257,  258,  259,
  260,  261,  262,  263,  264,  265,  266,  267,  268,  269,
  270,  271,  272,  273,  303,  275,  276,  277,  278,  279,
  280,  281,  282,  283,  284,  285,  286,  287,  288,  289,
  290,  291,  292,  293,  301,  300,  296,  297,  298,  299,
  303,  301,  301,    0,  304,  305,  306,  307,  308,  309,
  310,  311,  312,  313,  314,  315,  316,  317,  318,  278,
  320,  284,  322,  323,  324,  325,  326,  327,  328,  329,
  330,  331,  332,  333,  334,    0,  280,  337,  338,  257,
  258,  259,  260,  261,  262,  263,  264,  265,  266,  267,
  268,  269,  270,  271,  272,  273,  337,  275,  276,  277,
  278,  279,  280,  281,  282,  283,  284,  285,  286,  287,
  288,  289,  290,  291,  292,  293,  337,  282,  296,  297,
  298,  299,    0,  301,  156,   31,  304,  305,  306,  307,
  308,  309,  310,  311,  312,  313,  314,  122,  316,  317,
  318,   13,  320,  220,  322,  323,  324,  325,  326,  327,
  328,  329,  330,  331,  332,  333,  334,    0,  220,  337,
  338,  257,  258,  259,  260,  261,  262,  263,  264,  265,
  266,  267,  268,  269,  270,  271,  272,  273,  248,  275,
  276,  277,  278,  279,  280,  281,  282,  283,  284,  285,
  286,  287,  288,  289,  290,  291,  292,  293,  288,   -1,
  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,  305,
  306,  307,  308,  309,  310,  311,  312,  313,  314,   -1,
  316,  317,  318,   -1,  320,   -1,  322,  323,  324,  325,
  326,  327,  328,  329,  330,  331,  332,  333,  334,    0,
   -1,  337,  338,  257,  258,  259,  260,  261,  262,  263,
  264,  265,  266,  267,  268,  269,  270,  271,  272,  273,
   -1,  275,  276,  277,  278,  279,  280,  281,  282,  283,
  284,  285,  286,  287,  288,  289,  290,  291,  292,  293,
   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,
  304,  305,  306,  307,  308,  309,  310,  311,  312,  313,
  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,
  324,  325,  326,  327,  328,  329,  330,  331,  332,  333,
  334,    0,   -1,  337,  338,  257,  258,  259,   -1,   -1,
   -1,   -1,  257,  258,  259,  260,  261,  262,  263,  264,
  265,  266,  267,  268,  269,  270,  271,  272,  273,   -1,
  275,  276,  277,  278,  279,  280,  281,  282,  283,  284,
  285,  286,  287,  288,  289,  290,  291,  292,  293,   -1,
   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,
  305,  306,  307,  308,  309,  310,  311,  312,  313,  314,
   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,  324,
  325,  326,  327,  328,  329,  330,  331,  332,  333,  334,
    0,   -1,  337,  338,  257,  258,  259,  260,  261,  262,
  263,  264,  265,  266,  267,  268,  269,  270,  271,  272,
  273,   -1,  275,  276,  277,  278,  279,  280,  281,  282,
  283,  284,  285,  286,  287,  288,  289,  290,  291,  292,
  293,   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,
   -1,  304,  305,  306,  307,  308,  309,  310,  311,  312,
  313,  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,
  323,  324,  325,  326,  327,  328,  329,  330,  331,  332,
  333,  334,    0,   -1,  337,  338,  257,  258,  259,  260,
  261,  262,  263,  264,  265,  266,  267,  268,  269,  270,
  271,  272,  273,   -1,  275,  276,  277,  278,  279,  280,
  281,  282,  283,  284,  285,  286,  287,  288,  289,  290,
  291,  292,  293,   -1,   -1,  296,  297,  298,  299,   -1,
  301,   -1,   -1,  304,  305,  306,  307,  308,  309,  310,
  311,  312,  313,  314,  315,  316,   -1,   -1,   -1,  320,
   -1,  322,  323,  324,  325,  326,  327,  328,  329,  330,
  331,  332,  333,  334,    0,   -1,  337,  338,  257,  258,
  259,  260,  261,  262,  263,  264,  265,  266,  267,  268,
  269,  270,  271,  272,  273,   -1,  275,  276,  277,  278,
  279,  280,  281,  282,  283,  284,  285,  286,  287,  288,
  289,  290,  291,  292,  293,   -1,   -1,  296,  297,  298,
  299,   -1,  301,   -1,   -1,  304,  305,  306,   -1,   -1,
   -1,  310,  311,  312,  313,  314,   -1,  316,  317,  318,
   -1,  320,   -1,  322,  323,  324,  325,  326,  327,  328,
  329,  330,  331,  332,  333,  334,    0,   -1,  337,  338,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  257,  258,  259,
  260,  261,  262,  263,  264,  265,  266,  267,  268,  269,
  270,  271,  272,  273,   -1,  275,  276,  277,  278,  279,
  280,  281,  282,  283,  284,  285,  286,  287,  288,  289,
  290,  291,  292,  293,   -1,   -1,  296,  297,   -1,  299,
   -1,  301,   -1,   -1,  304,  305,  306,   -1,   -1,   -1,
  310,  311,  312,  313,  314,   -1,  316,  317,  318,   -1,
  320,   -1,  322,  323,  324,  325,  326,  327,  328,  329,
  330,  331,  332,  333,  334,    0,   -1,  337,  338,  257,
  258,  259,  260,  261,  262,  263,  264,  265,  266,  267,
  268,  269,  270,  271,  272,  273,   -1,  275,  276,  277,
  278,  279,  280,  281,  282,  283,  284,  285,  286,  287,
  288,  289,  290,  291,  292,  293,   -1,   -1,  296,  297,
  298,  299,   -1,  301,   -1,   -1,  304,   -1,   -1,   -1,
   -1,   -1,  310,  311,  312,  313,  314,   -1,  316,  317,
  318,   -1,  320,   -1,  322,  323,  324,  325,  326,  327,
  328,  329,  330,  331,  332,  333,  334,    0,   -1,  337,
  338,  257,  258,  259,  260,  261,  262,  263,  264,  265,
  266,  267,  268,  269,  270,  271,  272,  273,   -1,  275,
  276,  277,  278,  279,  280,  281,  282,  283,  284,  285,
  286,  287,  288,  289,  290,  291,  292,  293,   -1,   -1,
  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,  305,
  306,   -1,   -1,   -1,  310,  311,  312,  313,  314,   -1,
  316,  317,  318,   -1,  320,   -1,  322,  323,  324,  325,
  326,  327,  328,   -1,   -1,  331,  332,  333,  334,    0,
   -1,  337,  338,  257,  258,  259,  260,  261,  262,  263,
  264,  265,  266,  267,  268,  269,  270,  271,  272,  273,
   -1,  275,  276,  277,  278,  279,  280,  281,  282,  283,
  284,  285,  286,  287,  288,  289,  290,  291,  292,  293,
   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,
  304,  305,  306,   -1,   -1,   -1,  310,  311,  312,  313,
  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,
  324,  325,  326,  327,  328,   -1,   -1,  331,  332,  333,
  334,    0,   -1,  337,  338,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  260,  261,  262,  263,  264,
  265,  266,  267,  268,  269,  270,  271,  272,  273,   -1,
  275,  276,  277,  278,  279,  280,  281,  282,  283,  284,
  285,  286,  287,  288,  289,  290,  291,  292,  293,   -1,
   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,
  305,  306,   -1,   -1,   -1,  310,  311,  312,  313,  314,
   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,  324,
  325,  326,  327,  328,    0,   -1,  331,  332,  333,  334,
   -1,   -1,  337,  338,  257,  258,  259,  260,  261,  262,
  263,  264,  265,  266,  267,  268,  269,  270,  271,  272,
  273,   -1,  275,  276,  277,  278,  279,  280,  281,  282,
  283,  284,  285,  286,  287,  288,  289,  290,  291,  292,
  293,   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,
   -1,  304,  305,  306,   -1,   -1,   -1,  310,  311,  312,
  313,  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,
  323,  324,  325,  326,  327,  328,    0,   -1,  331,  332,
  333,  334,   -1,   -1,  337,  338,  257,  258,  259,  260,
  261,  262,  263,  264,  265,  266,  267,  268,  269,  270,
  271,  272,  273,   -1,  275,  276,  277,  278,  279,  280,
  281,  282,  283,  284,  285,  286,  287,  288,  289,  290,
  291,  292,  293,   -1,   -1,  296,  297,  298,  299,   -1,
  301,   -1,   -1,  304,  305,  306,   -1,   -1,   -1,  310,
  311,  312,  313,  314,   -1,  316,  317,  318,   -1,  320,
   -1,  322,  323,  324,  325,  326,  327,  328,    0,   -1,
  331,  332,  333,  334,   -1,   -1,  337,  338,  257,  258,
  259,  260,  261,  262,  263,  264,  265,  266,  267,  268,
  269,  270,  271,  272,  273,   -1,  275,  276,  277,  278,
  279,  280,  281,  282,  283,  284,  285,  286,  287,  288,
  289,  290,  291,  292,  293,   -1,   -1,  296,  297,  298,
  299,   -1,  301,   -1,   -1,  304,  305,  306,   -1,   -1,
   -1,  310,  311,  312,  313,  314,   -1,  316,  317,  318,
   -1,  320,   -1,  322,  323,  324,  325,  326,  327,  328,
    0,   -1,  331,  332,  333,  334,   -1,   -1,  337,  338,
   -1,  257,  258,  259,   -1,   -1,   -1,   -1,  264,  265,
  266,  267,  268,  269,  270,  271,  272,  273,   -1,  275,
  276,  277,  278,  279,  280,  281,  282,  283,  284,  285,
  286,  287,  288,  289,  290,  291,  292,  293,   -1,   -1,
  296,  297,  298,  299,   -1,  301,   -1,   -1,  304,  305,
  306,   -1,   -1,   -1,   -1,   -1,  312,  313,  314,   -1,
  316,  317,  318,   -1,  320,   -1,  322,  323,  324,  325,
  326,  327,  328,    0,   -1,  331,  332,  333,  334,   -1,
   -1,  337,  338,  257,  258,  259,   -1,   -1,   -1,   -1,
  264,  265,  266,  267,  268,  269,  270,  271,  272,  273,
   -1,  275,  276,  277,  278,  279,  280,  281,  282,  283,
  284,  285,  286,  287,  288,  289,  290,  291,  292,  293,
   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,   -1,
  304,  305,  306,   -1,   -1,   -1,   -1,   -1,  312,  313,
  314,   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,
  324,  325,  326,  327,  328,    0,   -1,  331,  332,  333,
  334,   -1,   -1,  337,  338,  257,  258,  259,   -1,   -1,
   -1,   -1,  264,  265,  266,  267,  268,  269,  270,  271,
  272,  273,   -1,  275,  276,  277,  278,  279,  280,  281,
  282,  283,  284,  285,  286,  287,  288,  289,  290,  291,
  292,  293,   -1,   -1,  296,  297,  298,  299,   -1,  301,
   -1,   -1,  304,  305,  306,   -1,   -1,   -1,   -1,   -1,
  312,  313,  314,   -1,  316,  317,  318,   -1,  320,   -1,
  322,  323,  324,  325,  326,  327,  328,    0,   -1,  331,
  332,  333,  334,   -1,   -1,  337,  338,  257,  258,  259,
   -1,   -1,   -1,   -1,  264,  265,  266,  267,  268,  269,
  270,  271,  272,  273,   -1,  275,  276,  277,  278,  279,
  280,  281,  282,  283,  284,  285,  286,  287,  288,  289,
  290,  291,  292,  293,   -1,   -1,  296,  297,  298,  299,
   -1,  301,   -1,   -1,  304,  305,  306,   -1,   -1,   -1,
   -1,   -1,  312,  313,  314,   -1,  316,  317,  318,   -1,
  320,   -1,  322,  323,  324,  325,  326,  327,  328,    0,
   -1,  331,  332,  333,  334,   -1,   -1,  337,  338,   -1,
  257,  258,  259,   -1,   -1,   -1,   -1,  264,  265,  266,
  267,  268,  269,  270,  271,  272,  273,   -1,  275,  276,
  277,  278,  279,  280,  281,  282,  283,  284,  285,  286,
  287,  288,  289,  290,  291,  292,  293,   -1,   -1,  296,
  297,  298,  299,   -1,  301,   -1,   -1,   -1,  305,  306,
   82,   83,   84,   85,   86,   87,   -1,   89,   -1,  316,
  317,  318,   -1,  320,   -1,  322,  323,  324,  325,  326,
  327,  328,    0,   -1,  331,  332,  333,  334,   -1,   -1,
  337,  338,  257,  258,  259,   -1,   -1,   -1,   -1,  264,
  265,  266,  267,  268,  269,  270,  271,  272,  273,   -1,
  275,  276,  277,  278,  279,  280,  281,  282,  283,  284,
  285,  286,  287,  288,  289,  290,  291,  292,  293,   -1,
   -1,  296,  297,  298,   -1,   -1,  301,   -1,   -1,   -1,
  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  316,  317,  318,   -1,  320,   -1,  322,  323,  324,
  325,  326,  327,  328,    0,   -1,  331,  332,  333,  334,
   -1,   -1,  337,  338,   -1,  258,  259,   -1,   -1,   -1,
   -1,  264,  265,  266,  267,  268,  269,  270,  271,  272,
  273,   -1,  275,  276,  277,  278,  279,  280,  281,  282,
  283,  284,  285,  286,  287,  288,  289,  290,  291,  292,
  293,   -1,   -1,  296,  297,  298,  299,   -1,  301,   -1,
   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  316,  317,  318,   -1,  320,   -1,  322,
  323,  324,  325,  326,  327,  328,    0,   -1,  331,  332,
  333,  334,   -1,   -1,  337,  338,   -1,  258,  259,   -1,
   -1,   -1,   -1,  264,  265,  266,  267,  268,  269,  270,
  271,  272,  273,   -1,  275,  276,  277,  278,  279,  280,
  281,  282,  283,  284,  285,  286,  287,  288,  289,  290,
  291,  292,  293,   -1,   -1,  296,  297,  298,  299,   -1,
  301,   -1,   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  316,  317,  318,   -1,  320,
   -1,  322,  323,  324,  325,  326,  327,  328,    0,   -1,
  331,  332,  333,  334,   -1,   -1,  337,  338,   -1,  257,
  258,   -1,   -1,   -1,   -1,   -1,  264,  265,  266,  267,
  268,  269,  270,  271,  272,  273,   -1,  275,  276,  277,
  278,  279,  280,  281,  282,  283,  284,  285,  286,  287,
  288,  289,  290,  291,  292,  293,   -1,   -1,  296,  297,
  298,  299,   -1,  301,   -1,   -1,   -1,  305,  306,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  316,  317,
  318,   -1,  320,    0,  322,  323,  324,  325,  326,  327,
  328,   -1,   -1,  331,  332,  333,  334,   -1,   -1,  337,
  338,  257,  258,  259,   -1,   -1,   -1,   -1,  264,  265,
  266,  267,  268,  269,  270,  271,  272,  273,   -1,  275,
  276,  277,  278,  279,  280,  281,  282,  283,  284,  285,
  286,  287,  288,  289,  290,  291,  292,  293,   -1,   -1,
  296,  297,  298,   -1,   -1,  301,   -1,   -1,   -1,  305,
  306,   -1,   -1,   -1,   -1,    0,   -1,   -1,   -1,   -1,
  316,  317,  318,   -1,  320,   -1,  322,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  260,  261,  262,  263,
   -1,  337,  338,  257,  258,  259,   -1,   -1,   -1,   -1,
  264,  265,  266,  267,  268,  269,  270,  271,  272,  273,
   -1,   -1,  276,  277,  278,  279,  280,  281,  282,  283,
  284,  285,  286,  287,  288,  289,  290,  291,  292,  293,
  304,   -1,   -1,   -1,   -1,   -1,  310,  311,  312,  313,
  314,  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  316,  317,  318,  329,  330,   -1,  322,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  257,  258,  259,  257,
  258,  259,   -1,  337,  338,  257,  258,  259,   -1,   -1,
   -1,   -1,  264,  265,  266,  267,  268,  269,  270,  271,
  272,  273,   -1,   -1,  276,  277,  278,  279,  280,  281,
  282,  283,  284,  285,  286,  287,  288,  289,  290,  291,
  292,  293,  300,   -1,  305,  306,   -1,  305,  306,   -1,
   -1,   -1,   -1,  305,  306,  316,  317,  318,  316,  317,
  318,   -1,   -1,   -1,  316,  317,  318,   -1,   -1,   -1,
  322,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  257,  258,  259,   -1,   -1,  337,  338,  264,  265,  266,
  267,  268,  269,  270,  271,  272,  273,   -1,   -1,  276,
  277,  278,  279,  280,  281,  282,  283,  284,  285,  286,
  287,  288,  289,  290,  291,  292,  293,   -1,   -1,    4,
    5,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  305,  306,
   15,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  316,
  317,  318,   -1,   -1,   -1,  322,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  299,   -1,   -1,   -1,  264,
  337,  338,  267,  268,  269,  270,  271,  272,  273,   -1,
   -1,  276,  277,   -1,  279,   -1,  281,   -1,  283,  323,
  324,  325,  326,  327,  328,   -1,   -1,  331,  332,  333,
  334,  260,  261,  262,  263,   -1,   81,   -1,   -1,   -1,
  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  316,  317,  318,   -1,   -1,   -1,  322,   -1,  104,
  105,  106,  107,  108,  109,  110,  111,  112,  113,  114,
  299,   -1,  337,  338,   -1,  304,   -1,   -1,   -1,   -1,
   -1,  310,  311,  312,  313,  314,   -1,  257,  258,  259,
  135,  136,   -1,   -1,   -1,  257,  258,  259,   -1,   -1,
  329,  330,  264,  148,   -1,  267,  268,  269,  270,  271,
  272,  273,   -1,   -1,  276,  277,  286,  279,  280,  281,
   -1,  283,   -1,  285,  286,   -1,   -1,   -1,  298,   -1,
   -1,  293,   -1,   -1,   -1,  305,  306,   -1,   -1,   -1,
   -1,   -1,   -1,  305,  306,   -1,  316,  317,  318,   -1,
   -1,   -1,  322,   -1,  316,  317,  318,   -1,   -1,   -1,
  322,  206,   -1,  208,   -1,   -1,  211,  212,  338,   -1,
  257,  258,  259,   -1,   -1,  220,  338,  264,   -1,   -1,
  267,  268,  269,  270,  271,  272,  273,   -1,  275,  276,
  277,   -1,  279,   -1,  281,   -1,  283,   -1,  243,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  296,
  297,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  305,  306,
   -1,   -1,   -1,   -1,   -1,   -1,  257,  258,  259,  316,
  317,  318,   -1,  264,   -1,  322,  267,  268,  269,  270,
  271,  272,  273,   -1,   -1,  276,  277,   -1,  279,   -1,
  281,  338,  283,   -1,   -1,  286,   -1,   -1,   -1,  290,
   -1,   -1,   -1,   -1,   -1,   -1,  260,  261,  262,  263,
   -1,   -1,   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  316,  317,  318,   -1,  264,
   -1,  322,  267,  268,  269,  270,  271,  272,  273,   -1,
   -1,  276,  277,   -1,  279,  299,  281,  338,  283,   -1,
  304,  286,   -1,   -1,  289,   -1,  310,  311,  312,  313,
  314,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  305,  306,   -1,   -1,   -1,  329,  330,   -1,  257,  258,
  259,  316,  317,  318,   -1,  264,   -1,  322,  267,  268,
  269,  270,  271,  272,  273,   -1,   -1,  276,  277,   -1,
  279,   -1,  281,  338,  283,   -1,   -1,  286,   -1,  288,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  305,  306,   -1,   -1,
   -1,   -1,   -1,   -1,  257,  258,  259,  316,  317,  318,
   -1,  264,   -1,  322,  267,  268,  269,  270,  271,  272,
  273,   -1,   -1,  276,  277,   -1,  279,   -1,  281,  338,
  283,   -1,   -1,  286,   -1,   -1,   -1,   -1,  291,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,
  257,  258,  259,  316,  317,  318,   -1,  264,   -1,  322,
  267,  268,  269,  270,  271,  272,  273,   -1,   -1,  276,
  277,   -1,  279,   -1,  281,  338,  283,   -1,   -1,  286,
   -1,   -1,   -1,   -1,   -1,  292,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  305,  306,
   -1,   -1,   -1,   -1,   -1,   -1,  257,  258,  259,  316,
  317,  318,   -1,  264,   -1,  322,  267,  268,  269,  270,
  271,  272,  273,   -1,   -1,  276,  277,   -1,  279,   -1,
  281,  338,  283,   -1,   -1,  286,   -1,   -1,   -1,   -1,
   -1,   -1,  293,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  305,  306,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  316,  317,  318,   -1,  264,
   -1,  322,  267,  268,  269,  270,  271,  272,  273,   -1,
  275,  276,  277,   -1,  279,   -1,  281,  338,  283,   -1,
   -1,   -1,   -1,  257,  258,  259,   -1,   -1,   -1,   -1,
  264,   -1,   -1,  267,  268,  269,  270,  271,  272,  273,
  305,  306,  276,  277,  278,  279,   -1,  281,   -1,  283,
   -1,  316,  317,  318,   -1,   -1,   -1,  322,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  305,  306,  338,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  316,  317,  318,   -1,   -1,   -1,  322,   -1,
   -1,   -1,   -1,   -1,   -1,  257,  258,  259,   -1,   -1,
   -1,   -1,  264,   -1,  338,  267,  268,  269,  270,  271,
  272,  273,   -1,   -1,  276,  277,   -1,  279,   -1,  281,
  282,  283,   -1,   -1,   -1,   -1,  257,  258,  259,   -1,
   -1,   -1,   -1,  264,   -1,   -1,  267,  268,  269,  270,
  271,  272,  273,  305,  306,  276,  277,   -1,  279,   -1,
  281,   -1,  283,  284,  316,  317,  318,   -1,   -1,   -1,
  322,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  305,  306,  338,   -1,   -1,   -1,
   -1,   -1,  257,  258,  259,  316,  317,  318,   -1,  264,
   -1,  322,  267,  268,  269,  270,  271,  272,  273,   -1,
   -1,  276,  277,   -1,  279,   -1,  281,  338,  283,  257,
  258,  259,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  305,  306,   -1,   -1,   -1,   -1,   -1,   -1,  286,   -1,
   -1,  316,  317,  318,   -1,   -1,   -1,  322,   -1,   -1,
  298,   -1,   -1,  301,   -1,   -1,   -1,  305,  306,   -1,
   -1,   -1,   -1,  338,   -1,   -1,   -1,   -1,  316,  317,
  318,   -1,  320,   -1,  322,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  338,
};
}
final static short YYFINAL=25;
final static short YYMAXTOKEN=341;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"IDENTIFIER","CONSTANT","STRING_LITERAL","LE_OP","GE_OP","EQ_OP",
"NE_OP","IF","ELSE","ELSEIF","WHILE","FOR","BREAK","RETURN","PERSISTENT",
"CONTINUE","FUNCTION","TRANSPOSE","CR","GLOBAL","DO","UNTIL","SWITCH","CASE",
"TRY","CATCH","UNWIND","CLEANUP","OTHERWISE","END","ENDFUNCTION","ENDFOR",
"ENDIF","ENDWHILE","ENDTRYCATCH","ENDUNWINDPROTECT","ENDSWITCH","COMMENT",
"CONTINUATION","SEMICOLON","COMMA","COLON","ASSIGN","LPAREN","RPAREN",
"LBRACKET","RBRACKET","AND","MINUS","PLUS","MULT","DIV","LDIV","LT_OP","GT_OP",
"OR","OR_OR","AND_AND","POW","NOT","PLUS_PLUS","MINUS_MINUS","LBRACE","RBRACE",
"DOT","AT","PLUS_EQ","MINUS_EQ","MULT_EQ","DIV_EQ","LDIV_EQ","POW_EQ","RSHIFT",
"LSHIFT","RSHIFT_EQ","LSHIFT_EQ","AND_EQ","OR_EQ","VARARGOUT","VARARGIN","EOF",
"COMMAND_IDENTIFIER","LEX_ERROR","COMMAND_STRING","UNARY",
};
final static String yyrule[] = {
"$accept : translation_unit",
"primary_expression : IDENTIFIER",
"primary_expression : CONSTANT",
"primary_expression : STRING_LITERAL",
"paren_start : LPAREN",
"paren_end : RPAREN",
"function_handle : AT IDENTIFIER",
"matrix_start : LBRACKET",
"matrix_end : RBRACKET",
"matrix_expression : matrix_start matrix_end",
"matrix_expression : matrix_start SEMICOLON matrix_end",
"matrix_expression : matrix_start array_list matrix_end",
"cell_start : LBRACE",
"cell_end : RBRACE",
"cell_expression : cell_start cell_end",
"cell_expression : cell_start SEMICOLON cell_end",
"cell_expression : cell_start array_list cell_end",
"index_start : paren_start",
"index_start : cell_start",
"index_stop : paren_end",
"index_stop : cell_end",
"index_element_list : array_element_list",
"postfix_expression : primary_expression",
"postfix_expression : postfix_expression index_start index_element_list index_stop",
"postfix_expression : postfix_expression index_start index_stop",
"postfix_expression : postfix_expression DOT IDENTIFIER",
"postfix_expression : postfix_expression DOT LPAREN expression RPAREN",
"postfix_expression : postfix_expression TRANSPOSE",
"postfix_expression : postfix_expression PLUS_PLUS",
"postfix_expression : postfix_expression MINUS_MINUS",
"prefix_expression : postfix_expression",
"prefix_expression : binary_expression",
"prefix_expression : unary_operator postfix_expression",
"unary_operator : PLUS",
"unary_operator : MINUS",
"unary_operator : PLUS_PLUS",
"unary_operator : MINUS_MINUS",
"unary_operator : NOT",
"binary_expression : prefix_expression MULT prefix_expression",
"binary_expression : prefix_expression DIV prefix_expression",
"binary_expression : prefix_expression LDIV prefix_expression",
"binary_expression : prefix_expression POW prefix_expression",
"binary_expression : prefix_expression PLUS prefix_expression",
"binary_expression : prefix_expression MINUS prefix_expression",
"colon_expression : colon_subexpression",
"colon_subexpression : prefix_expression",
"colon_subexpression : colon_subexpression COLON prefix_expression",
"simple_expression : colon_expression",
"simple_expression : simple_expression RSHIFT simple_expression",
"simple_expression : simple_expression LSHIFT simple_expression",
"simple_expression : simple_expression LT_OP simple_expression",
"simple_expression : simple_expression GT_OP simple_expression",
"simple_expression : simple_expression LE_OP simple_expression",
"simple_expression : simple_expression GE_OP simple_expression",
"simple_expression : simple_expression EQ_OP simple_expression",
"simple_expression : simple_expression NE_OP simple_expression",
"simple_expression : simple_expression AND simple_expression",
"simple_expression : simple_expression AND_AND simple_expression",
"simple_expression : simple_expression OR simple_expression",
"simple_expression : simple_expression OR_OR simple_expression",
"anon_function_start : AT",
"anon_function_handle_expression : anon_function_start LPAREN identifier_list RPAREN statement",
"command_expression : COMMAND_IDENTIFIER command_list",
"command_list : COMMAND_STRING",
"command_list : STRING_LITERAL",
"command_list : command_list COMMAND_STRING",
"command_list : command_list STRING_LITERAL",
"expression : anon_function_handle_expression",
"expression : command_expression",
"expression : assignment_expression",
"assignment_expression : simple_expression",
"assignment_expression : assignment_expression ASSIGN expression",
"assignment_expression : assignment_expression PLUS_EQ expression",
"assignment_expression : assignment_expression MINUS_EQ expression",
"assignment_expression : assignment_expression MULT_EQ expression",
"assignment_expression : assignment_expression DIV_EQ expression",
"assignment_expression : assignment_expression LDIV_EQ expression",
"assignment_expression : assignment_expression POW_EQ expression",
"assignment_expression : assignment_expression AND_EQ expression",
"assignment_expression : assignment_expression OR_EQ expression",
"assignment_expression : assignment_expression LSHIFT_EQ expression",
"assignment_expression : assignment_expression RSHIFT_EQ expression",
"eostmt : COMMA",
"eostmt : SEMICOLON",
"eostmt : CR",
"eostmt : eostmt COMMA",
"eostmt : eostmt SEMICOLON",
"eostmt : eostmt CR",
"opt_eostmt :",
"opt_eostmt : eostmt",
"opt_cr :",
"opt_cr : cr",
"cr : CR",
"cr : cr CR",
"statement : expression",
"statement : command",
"command : declaration_statement",
"command : selection_statement",
"command : iteration_statement",
"command : exception_statement",
"command : jump_statement",
"command : function_statement",
"statement_list :",
"statement_list : statement_sublist",
"statement_sublist : statement opt_eostmt",
"statement_sublist : statement_sublist opt_eostmt statement opt_eostmt",
"identifier_list : IDENTIFIER",
"identifier_list : identifier_list COMMA IDENTIFIER",
"identifier_list : VARARGIN",
"identifier_list : identifier_list COMMA VARARGIN",
"declaration : IDENTIFIER",
"declaration : IDENTIFIER ASSIGN expression",
"declaration_list : declaration",
"declaration_list : declaration_list declaration",
"declaration_statement : GLOBAL declaration_list",
"declaration_statement : PERSISTENT declaration_list",
"colon : COLON",
"array_element_end : END",
"array_list : array_sublist",
"array_list : array_sublist SEMICOLON",
"array_sublist : array_row",
"array_sublist : array_sublist SEMICOLON array_row",
"array_row : array_element_list",
"array_row : array_element_list COMMA",
"array_space :",
"array_comma : COMMA",
"array_comma : array_space",
"array_element_list : expression",
"array_element_list : colon",
"array_element_list : array_element_end",
"array_element_list : array_element_list array_comma colon",
"array_element_list : array_element_list array_comma expression",
"array_element_list : array_element_list array_comma array_element_end",
"if_list : if_sublist",
"if_list : if_sublist else_clause",
"if_sublist : expression opt_eostmt statement_list",
"if_sublist : if_sublist elseif_clause",
"selection_statement : IF if_list end_if",
"selection_statement : SWITCH expression opt_eostmt case_list end_switch",
"selection_statement : SWITCH expression opt_eostmt case_list otherwise_statement end_switch",
"elseif_clause : ELSEIF opt_eostmt expression opt_eostmt statement_list",
"else_clause : ELSE opt_eostmt statement_list",
"iteration_statement : WHILE expression opt_eostmt statement_list end_while",
"iteration_statement : DO opt_eostmt statement_list UNTIL expression",
"iteration_statement : FOR simple_expression ASSIGN expression opt_eostmt statement_list end_for",
"iteration_statement : FOR LPAREN simple_expression ASSIGN expression RPAREN opt_eostmt statement_list end_for",
"end_if : ENDIF",
"end_if : END",
"end_while : ENDWHILE",
"end_while : END",
"end_for : ENDFOR",
"end_for : END",
"end_switch : ENDSWITCH",
"end_switch : END",
"end_try : ENDTRYCATCH",
"end_try : END",
"end_unwind : ENDUNWINDPROTECT",
"end_unwind : END",
"otherwise_statement : OTHERWISE opt_eostmt statement_list",
"case_list : CASE expression opt_eostmt statement_list",
"case_list : case_list CASE expression opt_eostmt statement_list",
"exception_statement : TRY opt_eostmt statement_list CATCH opt_eostmt statement_list end_try",
"exception_statement : UNWIND opt_eostmt statement_list CLEANUP opt_eostmt statement_list end_unwind",
"jump_statement : BREAK",
"jump_statement : RETURN",
"jump_statement : CONTINUE",
"start_function : FUNCTION",
"function_statement : start_function function_declare eostmt statement_list end_function",
"translation_unit : statement_list EOF",
"translation_unit : opt_cr statement_list EOF",
"translation_unit : statement_list",
"translation_unit : opt_cr statement_list",
"end_function : EOF",
"end_function : ENDFUNCTION",
"end_function : END",
"func_return_list : LBRACKET RBRACKET",
"func_return_list : LBRACKET identifier_list RBRACKET",
"func_return_list : LBRACKET VARARGOUT RBRACKET",
"func_return_list : LBRACKET identifier_list COMMA VARARGOUT RBRACKET",
"function_declare_rhs : IDENTIFIER",
"function_declare_rhs : IDENTIFIER LPAREN RPAREN",
"function_declare_rhs : IDENTIFIER LPAREN identifier_list RPAREN",
"function_declare : function_declare_rhs",
"function_declare : IDENTIFIER ASSIGN function_declare_rhs",
"function_declare : VARARGOUT ASSIGN function_declare_rhs",
"function_declare : func_return_list ASSIGN function_declare_rhs",
};

//#line 899 "octave.y"

  private OctaveLexer lexer;
  int errLine, errColumn, errChar;
  String errMsg;
  private int yylex () {
    int yyl_return = -1;
    try {
      yyl_return = lexer.yylex();
    }
    catch (IOException e) {
    	errLine = lexer.Yyline();
    	errColumn = lexer.Yycolumn();
    	errChar = lexer.Yychar();
    	errMsg = e.getMessage();
    }
    catch (OctaveLexerException e) {
    	errLine = lexer.Yyline();
    	errColumn = lexer.Yycolumn();
    	errChar = lexer.Yychar();
    	errMsg = e.getMessage();
    }
    return yyl_return;
  }
  
  public void yyerror (String error) {
    OctclipsePlugin.getDefault().getLog().log(
    	new Status(Status.ERROR, OctclipsePlugin.PLUGIN_ID, 0, error, null));
    errLine = lexer.Yyline();
	errColumn = lexer.Yycolumn();
	errChar = lexer.Yychar();
	errMsg = error;
  }
  
  public ModuleDeclaration parse(IModuleSource input, IProblemReporter reporter) {
    char[] source = input.getContentsAsCharArray();
  	if(yyparse(new CharArrayReader(source)) != 0)
  	{
  		try
		{
			if (reporter != null)
			{
				char [] fileName = input.getFileName().toCharArray();
				reporter.reportProblem(new DefaultProblem(
						fileName == null ? "" : new String(fileName),
						errMsg, 0, null, 
						ProblemSeverities.Error, errChar, errChar, errLine));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
  	}
  	return (ModuleDeclaration)yyval;
  }		
	
  private int yyparse(Reader r) {
    yydebug = true;
  	lexer = new OctaveLexer(r, this);
  	return yyparse();
  }	
	
  public OctaveParser() {
  }
  
//#line 1390 "OctaveParser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    //if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      //if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        //if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          //if (yydebug)
          //  yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        //if (yydebug)
          //debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      //if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            //if (yydebug)
              //debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            //if (yydebug)
              //debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        //if (yydebug)
          //{
          //yys = null;
          //if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          //if (yys == null) yys = "illegal-symbol";
          //debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          //}
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    //if (yydebug)
      //debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 96 "octave.y"
{ yyval = new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 2:
//#line 98 "octave.y"
{ yyval = new OctaveConstant((OctaveToken)val_peek(0)); }
break;
case 3:
//#line 100 "octave.y"
{ yyval = new OctaveString((OctaveToken)val_peek(0)); }
break;
case 4:
//#line 115 "octave.y"
{ lexer.enableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 5:
//#line 121 "octave.y"
{ lexer.disableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 6:
//#line 127 "octave.y"
{ yyval = new OctaveFunctionHandleExpression(new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 7:
//#line 132 "octave.y"
{ lexer.enableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 8:
//#line 138 "octave.y"
{ lexer.disableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 9:
//#line 144 "octave.y"
{ yyval = new OctaveMatrixExpression(new OctaveASTListNode()); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 10:
//#line 148 "octave.y"
{ yyval = new OctaveMatrixExpression(new OctaveASTListNode()); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 11:
//#line 152 "octave.y"
{ yyval = new OctaveMatrixExpression((OctaveASTListNode)val_peek(1)); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 12:
//#line 159 "octave.y"
{ lexer.enableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 13:
//#line 165 "octave.y"
{ lexer.disableMatrixIgnoreNewLine();
				yyval = val_peek(0); }
break;
case 14:
//#line 171 "octave.y"
{ yyval = new OctaveCellExpression(new OctaveASTListNode()); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 15:
//#line 175 "octave.y"
{ yyval = new OctaveCellExpression(new OctaveASTListNode()); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 16:
//#line 179 "octave.y"
{ yyval = new OctaveCellExpression((OctaveASTListNode)val_peek(1)); 
	          ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
	    	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 17:
//#line 186 "octave.y"
{ yyval = val_peek(0); }
break;
case 18:
//#line 188 "octave.y"
{ yyval = val_peek(0); }
break;
case 19:
//#line 193 "octave.y"
{ yyval = val_peek(0); }
break;
case 20:
//#line 195 "octave.y"
{ yyval = val_peek(0); }
break;
case 21:
//#line 200 "octave.y"
{ yyval = val_peek(0); }
break;
case 22:
//#line 205 "octave.y"
{ yyval = val_peek(0); }
break;
case 23:
//#line 207 "octave.y"
{ CallArgumentsList list = new CallArgumentsList(((ASTListNode)val_peek(1)).sourceStart(),
        	       ((ASTListNode)val_peek(1)).sourceEnd());
        	   list.getChilds().addAll(((ASTListNode)val_peek(1)).getChilds());
        	   yyval = new OctaveSymbolCallExpression((Expression)val_peek(3), list);
        	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 24:
//#line 213 "octave.y"
{ yyval = new OctaveSymbolCallExpression((Expression)val_peek(2), CallArgumentsList.EMPTY);
        	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 25:
//#line 216 "octave.y"
{ OctaveSymbolReference s = new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)val_peek(0)));  
        	   CallArgumentsList list = new CallArgumentsList(s.sourceStart(), s.sourceEnd());
        	   list.getChilds().add(s);      	   
        	   if (val_peek(2) instanceof OctaveDotCallExpression) {
        	    yyval = val_peek(2);
        	    ((OctaveDotCallExpression)yyval).appendArg(list);
        	   } else {
        	     
        	   	 yyval = new OctaveDotCallExpression((Expression)val_peek(2), list);
        	   }
        	  ((ASTNode)yyval).setEnd(s.sourceEnd()); }
break;
case 26:
//#line 228 "octave.y"
{ CallArgumentsList list = new CallArgumentsList(((Expression)val_peek(1)).sourceStart(),
        	       ((Expression)val_peek(1)).sourceEnd());
        	   list.getChilds().add(val_peek(1));
        	  if (val_peek(4) instanceof OctaveDotCallExpression) {
        	    yyval = val_peek(4);
        	    ((OctaveDotCallExpression)yyval).appendArg(list);
        	  } else {
        	   yyval = new OctaveDotCallExpression((Expression)val_peek(4), list);
        	  }
        	  ((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 27:
//#line 239 "octave.y"
{ yyval = new OctavePostfixExpression((Expression)val_peek(1), (OctaveToken)val_peek(0)); }
break;
case 28:
//#line 241 "octave.y"
{ yyval = new OctavePostfixExpression((Expression)val_peek(1), (OctaveToken)val_peek(0)); }
break;
case 29:
//#line 243 "octave.y"
{ yyval = new OctavePostfixExpression((Expression)val_peek(1), (OctaveToken)val_peek(0)); }
break;
case 30:
//#line 248 "octave.y"
{ yyval = val_peek(0); }
break;
case 31:
//#line 250 "octave.y"
{ yyval = val_peek(0); }
break;
case 32:
//#line 252 "octave.y"
{ yyval = new OctaveUnaryExpression((OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 33:
//#line 257 "octave.y"
{ yyval = val_peek(0); }
break;
case 34:
//#line 259 "octave.y"
{ yyval = val_peek(0); }
break;
case 35:
//#line 261 "octave.y"
{ yyval = val_peek(0); }
break;
case 36:
//#line 263 "octave.y"
{ yyval = val_peek(0); }
break;
case 37:
//#line 265 "octave.y"
{ yyval = val_peek(0); }
break;
case 38:
//#line 270 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 39:
//#line 272 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 40:
//#line 274 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 41:
//#line 276 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 42:
//#line 278 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 43:
//#line 280 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 44:
//#line 285 "octave.y"
{ yyval = val_peek(0); }
break;
case 45:
//#line 290 "octave.y"
{ yyval = val_peek(0); }
break;
case 46:
//#line 292 "octave.y"
{ 
				if (val_peek(2) instanceof OctaveColonExpression)
				{
					((OctaveColonExpression)val_peek(2)).addNode((Expression)val_peek(0));
				}
				else 
				{ 
					yyval = new OctaveColonExpression((Expression)val_peek(2));
					((OctaveColonExpression)yyval).addNode((Expression)val_peek(0));
				}	 
			}
break;
case 47:
//#line 307 "octave.y"
{ yyval = val_peek(0); }
break;
case 48:
//#line 309 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 49:
//#line 311 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 50:
//#line 313 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 51:
//#line 315 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 52:
//#line 317 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 53:
//#line 319 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 54:
//#line 321 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 55:
//#line 323 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 56:
//#line 325 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 57:
//#line 327 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 58:
//#line 329 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 59:
//#line 331 "octave.y"
{ yyval = new OctaveBinaryExpression((Expression)val_peek(2), (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 60:
//#line 336 "octave.y"
{ yyval = val_peek(0);
			  	lexer.enableVarArgIn(); }
break;
case 61:
//#line 342 "octave.y"
{ yyval = new OctaveAnonFunctionHandleExpression((OctaveASTListNode)val_peek(2), 
			         (OctaveStatement)val_peek(0));
			   ((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
               ((ASTNode)yyval).setEnd(((ASTNode)val_peek(0)).sourceEnd()); 
			   lexer.disableVarArgIn(); }
break;
case 62:
//#line 351 "octave.y"
{ CallArgumentsList list = new CallArgumentsList(((ASTListNode)val_peek(0)).sourceStart(),
                   ((ASTListNode)val_peek(0)).sourceEnd());
               list.getChilds().addAll(((ASTListNode)val_peek(0)).getChilds());
               yyval = new OctaveSymbolCallExpression(
				new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)val_peek(1))),
				list); }
break;
case 63:
//#line 361 "octave.y"
{ yyval = new OctaveASTListNode(); 
				((OctaveASTListNode)yyval).addNode(new OctaveString((OctaveToken)val_peek(0))); }
break;
case 64:
//#line 364 "octave.y"
{ yyval = new OctaveASTListNode(); 
                ((OctaveASTListNode)yyval).addNode((OctaveString)val_peek(0)); }
break;
case 65:
//#line 367 "octave.y"
{ yyval = val_peek(1);
				((OctaveASTListNode)yyval).addNode(new OctaveString((OctaveToken)val_peek(0))); }
break;
case 66:
//#line 370 "octave.y"
{ yyval = val_peek(1);
		          ((OctaveASTListNode)yyval).addNode((OctaveString)val_peek(0)); }
break;
case 67:
//#line 376 "octave.y"
{ yyval = val_peek(0); }
break;
case 68:
//#line 378 "octave.y"
{ yyval = val_peek(0); }
break;
case 69:
//#line 380 "octave.y"
{ yyval = val_peek(0); }
break;
case 70:
//#line 385 "octave.y"
{ yyval = val_peek(0); }
break;
case 71:
//#line 387 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			 (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 72:
//#line 390 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 73:
//#line 393 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 74:
//#line 396 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 75:
//#line 399 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 76:
//#line 402 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 77:
//#line 405 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 78:
//#line 408 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 79:
//#line 411 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 80:
//#line 414 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 81:
//#line 417 "octave.y"
{ yyval = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)val_peek(2)),
    			  (OctaveToken)val_peek(1), (Expression)val_peek(0)); }
break;
case 82:
//#line 423 "octave.y"
{ yyval = val_peek(0); }
break;
case 83:
//#line 425 "octave.y"
{ yyval = val_peek(0); }
break;
case 84:
//#line 427 "octave.y"
{ yyval = val_peek(0); }
break;
case 85:
//#line 429 "octave.y"
{ yyval = val_peek(1); }
break;
case 86:
//#line 431 "octave.y"
{ yyval = val_peek(1); }
break;
case 87:
//#line 433 "octave.y"
{ yyval = val_peek(1); }
break;
case 88:
//#line 438 "octave.y"
{ yyval = null; }
break;
case 89:
//#line 440 "octave.y"
{ yyval = val_peek(0); }
break;
case 90:
//#line 445 "octave.y"
{ yyval = null; }
break;
case 91:
//#line 447 "octave.y"
{ yyval = val_peek(0); }
break;
case 92:
//#line 452 "octave.y"
{ yyval = val_peek(0); }
break;
case 93:
//#line 454 "octave.y"
{ yyval = val_peek(1); }
break;
case 94:
//#line 460 "octave.y"
{ yyval = new OctaveExpressionStatement((Expression)val_peek(0)); }
break;
case 95:
//#line 462 "octave.y"
{ yyval = val_peek(0); }
break;
case 96:
//#line 467 "octave.y"
{ yyval = val_peek(0); }
break;
case 97:
//#line 469 "octave.y"
{ yyval = val_peek(0); }
break;
case 98:
//#line 471 "octave.y"
{ yyval = val_peek(0); }
break;
case 99:
//#line 473 "octave.y"
{ yyval = val_peek(0); }
break;
case 100:
//#line 475 "octave.y"
{ yyval = val_peek(0); }
break;
case 101:
//#line 477 "octave.y"
{ yyval = val_peek(0); }
break;
case 102:
//#line 482 "octave.y"
{ yyval = new OctaveASTListNode(); }
break;
case 103:
//#line 484 "octave.y"
{ yyval = val_peek(0); }
break;
case 104:
//#line 489 "octave.y"
{ yyval = new OctaveASTListNode(); 
        		((OctaveASTListNode)yyval).addNode((ASTNode)val_peek(1)); }
break;
case 105:
//#line 492 "octave.y"
{ ((OctaveASTListNode)val_peek(3)).addNode((ASTNode)val_peek(1)); 
        	  yyval = val_peek(3); }
break;
case 106:
//#line 498 "octave.y"
{ yyval = new OctaveASTListNode(); 
        		((OctaveASTListNode)yyval).addNode(
        		    new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 107:
//#line 502 "octave.y"
{ yyval = val_peek(2);
			    ((OctaveASTListNode)val_peek(2)).addNode(
					new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 108:
//#line 506 "octave.y"
{ yyval = new OctaveASTListNode();
			     ((OctaveASTListNode)yyval).addNode(
                    new OctaveIdentifier((OctaveToken)val_peek(0))); }
break;
case 109:
//#line 510 "octave.y"
{ yyval = val_peek(2);
			     ((OctaveASTListNode)val_peek(2)).addNode(
                    new OctaveIdentifier((OctaveToken)val_peek(0)));  }
break;
case 110:
//#line 517 "octave.y"
{ yyval = new OctaveASTListNode(); 
        		((OctaveASTListNode)yyval).addNode(new OctaveVariableDeclaration(
        			new OctaveIdentifier((OctaveToken)val_peek(0)))); }
break;
case 111:
//#line 521 "octave.y"
{ yyval = new OctaveASTListNode(); 
        		((OctaveASTListNode)yyval).addNode(new OctaveVariableDeclaration(
        			new OctaveIdentifier((OctaveToken)val_peek(2)),(Expression)val_peek(0))); }
break;
case 112:
//#line 528 "octave.y"
{ yyval = val_peek(0); }
break;
case 113:
//#line 530 "octave.y"
{ yyval = val_peek(1);
				Iterator i = ((OctaveASTListNode)val_peek(0)).getChilds().iterator();
				while(i.hasNext()) { 
					((OctaveASTListNode)val_peek(1)).addNode((ASTNode)i.next());
				}
			}
break;
case 114:
//#line 540 "octave.y"
{ yyval = new OctaveGlobalStatement((OctaveASTListNode)val_peek(0)); 
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
        	}
break;
case 115:
//#line 544 "octave.y"
{ yyval = new OctavePersistentStatement((OctaveASTListNode)val_peek(0)); 
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
			}
break;
case 116:
//#line 551 "octave.y"
{ yyval = new OctaveConstant((OctaveToken)val_peek(0)); }
break;
case 117:
//#line 556 "octave.y"
{ yyval = new OctaveConstant((OctaveToken)val_peek(0)); }
break;
case 118:
//#line 561 "octave.y"
{ yyval = val_peek(0); }
break;
case 119:
//#line 563 "octave.y"
{ yyval = val_peek(1); }
break;
case 120:
//#line 568 "octave.y"
{ yyval = val_peek(0);  }
break;
case 121:
//#line 570 "octave.y"
{ yyval = val_peek(2);
        		((OctaveASTListNode)yyval).getChilds()
        			.addAll(((OctaveASTListNode)val_peek(0)).getChilds()); }
break;
case 122:
//#line 577 "octave.y"
{ yyval = val_peek(0); }
break;
case 123:
//#line 579 "octave.y"
{ yyval = val_peek(1); }
break;
case 124:
//#line 584 "octave.y"
{ yyval = null; }
break;
case 125:
//#line 589 "octave.y"
{ yyval = val_peek(0); }
break;
case 126:
//#line 591 "octave.y"
{ yyval = val_peek(0); }
break;
case 127:
//#line 597 "octave.y"
{ yyval = new OctaveASTListNode(); 
		  		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 128:
//#line 602 "octave.y"
{ yyval = new OctaveASTListNode();
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 129:
//#line 607 "octave.y"
{ yyval = new OctaveASTListNode();
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 130:
//#line 612 "octave.y"
{
		    yyval = val_peek(2); 
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 131:
//#line 618 "octave.y"
{
		    yyval = val_peek(2); 
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 132:
//#line 624 "octave.y"
{
		    yyval = val_peek(2); 
        		if (val_peek(0) != null) {
        			((OctaveASTListNode)yyval).addNode((Expression)val_peek(0)); 
        		} }
break;
case 133:
//#line 634 "octave.y"
{ yyval = val_peek(0); }
break;
case 134:
//#line 636 "octave.y"
{ yyval = val_peek(1);
			  ((OctaveIfStatement)yyval).addElseClause((ASTNode)val_peek(0)); }
break;
case 135:
//#line 642 "octave.y"
{ yyval = new OctaveIfStatement((Expression)val_peek(2), (OctaveASTListNode)val_peek(0), new OctaveASTListNode()); }
break;
case 136:
//#line 644 "octave.y"
{ yyval = val_peek(1);
			  ((OctaveIfStatement)yyval).addElseClause((ASTNode)val_peek(0)); }
break;
case 137:
//#line 651 "octave.y"
{ yyval = val_peek(1); 
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
        	  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 138:
//#line 655 "octave.y"
{ yyval = new OctaveSwitchStatement((Expression)val_peek(3), (OctaveASTListNode)val_peek(1), new OctaveASTListNode()); 
        	  	((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
        	  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 139:
//#line 659 "octave.y"
{ yyval = new OctaveSwitchStatement((Expression)val_peek(4), (OctaveASTListNode)val_peek(2), (OctaveASTListNode)val_peek(1)); 
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(5)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 140:
//#line 666 "octave.y"
{ yyval = new OctaveElseIfClause((Expression)val_peek(2), (OctaveASTListNode)val_peek(0)); 
        	  ((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
        	  if (((OctaveASTListNode)val_peek(0)).getChilds().isEmpty()) {
        	  	((ASTNode)yyval).setEnd(((Expression)val_peek(2)).sourceEnd());
        	  } else {
        	  	((ASTNode)yyval).setEnd(((OctaveASTListNode)val_peek(0)).sourceEnd());
        	  }
        	}
break;
case 141:
//#line 678 "octave.y"
{ yyval = new OctaveElseClause((OctaveASTListNode)val_peek(0)); 
        	  ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
        	  if (((OctaveASTListNode)val_peek(0)).getChilds().isEmpty()) {
        	  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(2)).getCharacter());
        	  } else {
        	  	((ASTNode)yyval).setEnd(((OctaveASTListNode)val_peek(0)).sourceEnd());
        	  }
        	}
break;
case 142:
//#line 690 "octave.y"
{ yyval = new OctaveWhileStatement((Expression)val_peek(3), (OctaveASTListNode)val_peek(1)); 
        	  	((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
        	  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 143:
//#line 694 "octave.y"
{ yyval = new OctaveDoStatement((OctaveASTListNode)val_peek(2), (Expression)val_peek(0)); 
        	  	((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter()); 
        	  	((ASTNode)yyval).setEnd(((Expression)val_peek(0)).sourceEnd()); }
break;
case 144:
//#line 698 "octave.y"
{ yyval = new OctaveForStatement((Expression)val_peek(5), (Expression)val_peek(3), (OctaveASTListNode)val_peek(1));
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(6)).getCharacter()); 
        		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 145:
//#line 702 "octave.y"
{ yyval = new OctaveForStatement((Expression)val_peek(6), (Expression)val_peek(4), (OctaveASTListNode)val_peek(1));
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(8)).getCharacter());
        		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 146:
//#line 709 "octave.y"
{ yyval = val_peek(0); }
break;
case 147:
//#line 711 "octave.y"
{ yyval = val_peek(0); }
break;
case 148:
//#line 714 "octave.y"
{ yyval = val_peek(0); }
break;
case 149:
//#line 716 "octave.y"
{ yyval = val_peek(0); }
break;
case 150:
//#line 721 "octave.y"
{ yyval = val_peek(0); }
break;
case 151:
//#line 723 "octave.y"
{ yyval = val_peek(0); }
break;
case 152:
//#line 728 "octave.y"
{ yyval = val_peek(0); }
break;
case 153:
//#line 730 "octave.y"
{ yyval = val_peek(0); }
break;
case 154:
//#line 735 "octave.y"
{ yyval = val_peek(0); }
break;
case 155:
//#line 737 "octave.y"
{ yyval = val_peek(0); }
break;
case 156:
//#line 742 "octave.y"
{ yyval = val_peek(0); }
break;
case 157:
//#line 744 "octave.y"
{ yyval = val_peek(0); }
break;
case 158:
//#line 749 "octave.y"
{ yyval = val_peek(0); 
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
				if (((OctaveASTListNode)val_peek(0)).getChilds().isEmpty()) {
        	  		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(2)).getCharacter());
        	  	} else {
        	  		((ASTNode)yyval).setEnd(((OctaveASTListNode)val_peek(0)).sourceEnd());
        	  	}
        	}
break;
case 159:
//#line 761 "octave.y"
{ yyval = new OctaveASTListNode(); 
				((OctaveASTListNode)yyval).addNode((Expression)val_peek(2));
				((OctaveASTListNode)yyval).getChilds().addAll(((OctaveASTListNode)val_peek(0)).getChilds()); }
break;
case 160:
//#line 765 "octave.y"
{ yyval = val_peek(4);
				((OctaveASTListNode)yyval).addNode((Expression)val_peek(2));
				((OctaveASTListNode)yyval).getChilds().addAll(((OctaveASTListNode)val_peek(0)).getChilds()); }
break;
case 161:
//#line 772 "octave.y"
{ yyval = new OctaveExceptionStatement.OctaveTryStatement((OctaveASTListNode)val_peek(4), (OctaveASTListNode)val_peek(1)); 
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(6)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 162:
//#line 776 "octave.y"
{ yyval = new OctaveExceptionStatement.OctaveUnwindStatement((OctaveASTListNode)val_peek(4), (OctaveASTListNode)val_peek(1));
				((ASTNode)yyval).setStart(((OctaveToken)val_peek(6)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 163:
//#line 783 "octave.y"
{ yyval = new OctaveJumpStatement((OctaveToken)val_peek(0)); }
break;
case 164:
//#line 785 "octave.y"
{ yyval = new OctaveJumpStatement((OctaveToken)val_peek(0)); }
break;
case 165:
//#line 787 "octave.y"
{ yyval = new OctaveJumpStatement((OctaveToken)val_peek(0)); }
break;
case 166:
//#line 792 "octave.y"
{ lexer.increaseFunctionDepth(); 
			  lexer.enableVarArgOut();
			  lexer.enableVarArgIn();
			  yyval = val_peek(0); }
break;
case 167:
//#line 800 "octave.y"
{ yyval = new OctaveFunctionStatement((OctaveFunctionDeclaration)val_peek(3), (OctaveASTListNode)val_peek(1));
			  ((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
			  if (val_peek(0) != null) {
			  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); 
			  } else if (!((OctaveASTListNode)val_peek(1)).getChilds().isEmpty()) { 
			  	((ASTNode)yyval).setEnd(((OctaveASTListNode)val_peek(1)).sourceEnd());
			  } else {
			  	((ASTNode)yyval).setEnd(((OctaveToken)val_peek(2)).getCharacter() + ((OctaveToken)val_peek(2)).toString().length());
			  } }
break;
case 168:
//#line 813 "octave.y"
{ yyval = new OctaveTranslationUnit((OctaveASTListNode)val_peek(1)); }
break;
case 169:
//#line 815 "octave.y"
{ yyval = new OctaveTranslationUnit((OctaveASTListNode)val_peek(1)); }
break;
case 170:
//#line 817 "octave.y"
{ yyval = new OctaveTranslationUnit((OctaveASTListNode)val_peek(0)); }
break;
case 171:
//#line 819 "octave.y"
{ yyval = new OctaveTranslationUnit((OctaveASTListNode)val_peek(0)); }
break;
case 172:
//#line 824 "octave.y"
{ lexer.decreaseFunctionDepth();  
			  yyval = null; }
break;
case 173:
//#line 827 "octave.y"
{ lexer.decreaseFunctionDepth();  
			  yyval = val_peek(0); }
break;
case 174:
//#line 830 "octave.y"
{ lexer.decreaseFunctionDepth();  
			  yyval = val_peek(0); }
break;
case 175:
//#line 836 "octave.y"
{ yyval = new OctaveASTListNode(); 
			((ASTNode)yyval).setStart(((OctaveToken)val_peek(1)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 176:
//#line 840 "octave.y"
{ yyval = val_peek(1);
        	    ((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 177:
//#line 844 "octave.y"
{ yyval = new OctaveASTListNode(); 
        	    ((OctaveASTListNode)yyval).addNode(new OctaveIdentifier((OctaveToken)val_peek(1)));    
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length());}
break;
case 178:
//#line 849 "octave.y"
{ yyval = val_peek(3);
        	    ((OctaveASTListNode)yyval).addNode(new OctaveIdentifier((OctaveToken)val_peek(1)));
        	    ((ASTNode)yyval).setStart(((OctaveToken)val_peek(4)).getCharacter());
				((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 179:
//#line 857 "octave.y"
{ yyval = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)val_peek(0)), new OctaveASTListNode()); }
break;
case 180:
//#line 859 "octave.y"
{ yyval = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)val_peek(2)), new OctaveASTListNode()); 
        		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 181:
//#line 862 "octave.y"
{ yyval = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)val_peek(3)), (OctaveASTListNode)val_peek(1));
        		((ASTNode)yyval).setEnd(((OctaveToken)val_peek(0)).getCharacter() + ((OctaveToken)val_peek(0)).toString().length()); }
break;
case 182:
//#line 868 "octave.y"
{ yyval = val_peek(0);
        	  lexer.disableVarArgOut();
			  lexer.disableVarArgIn(); }
break;
case 183:
//#line 872 "octave.y"
{ OctaveASTListNode list = new OctaveASTListNode(); 
				list.addNode(
					new OctaveIdentifier((OctaveToken)val_peek(2)));
        		((OctaveFunctionDeclaration)val_peek(0)).setReturnList(list); 
        		yyval = val_peek(0);
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
        		((ASTNode)yyval).setEnd(((ASTNode)val_peek(0)).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
break;
case 184:
//#line 882 "octave.y"
{ OctaveASTListNode list = new OctaveASTListNode(); 
        		((OctaveFunctionDeclaration)val_peek(0)).setReturnList(list);
        		yyval = val_peek(0);
        		((ASTNode)yyval).setStart(((OctaveToken)val_peek(2)).getCharacter());
        		((ASTNode)yyval).setEnd(((ASTNode)val_peek(0)).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
break;
case 185:
//#line 890 "octave.y"
{ ((OctaveFunctionDeclaration)val_peek(0)).setReturnList((OctaveASTListNode)val_peek(2)); 
        		yyval = val_peek(0);
        		((ASTNode)yyval).setStart(((ASTNode)val_peek(2)).sourceStart());
        		((ASTNode)yyval).setEnd(((ASTNode)val_peek(0)).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
break;
//#line 2493 "OctaveParser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    //if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      //if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        //if (yydebug)
          //yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      //if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
//## The -Jnorun option was used ##
//## end of method run() ########################################



//## Constructors ###############################################
//## The -Jnoconstruct option was used ##
//###############################################################



}
//################### END OF CLASS ##############################
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
