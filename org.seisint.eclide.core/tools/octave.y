<<<<<<< HEAD
%{
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
%}
%token IDENTIFIER CONSTANT STRING_LITERAL
%token LE_OP GE_OP EQ_OP NE_OP
%token IF ELSE ELSEIF WHILE FOR BREAK RETURN PERSISTENT CONTINUE
%token FUNCTION TRANSPOSE CR GLOBAL
%token DO UNTIL WHILE SWITCH CASE TRY CATCH UNWIND CLEANUP OTHERWISE
%token END ENDFUNCTION ENDFOR ENDIF ENDWHILE ENDTRYCATCH ENDUNWINDPROTECT ENDSWITCH
%token COMMENT CONTINUATION SEMICOLON COMMA COLON ASSIGN LPAREN RPAREN
%token LBRACKET RBRACKET AND MINUS PLUS MULT DIV LDIV
%token LT_OP GT_OP OR OR_OR AND_AND POW
%token NOT PLUS_PLUS MINUS_MINUS LBRACE RBRACE DOT AT
%token PLUS_EQ MINUS_EQ MULT_EQ DIV_EQ LDIV_EQ POW_EQ
%token RSHIFT LSHIFT RSHIFT_EQ LSHIFT_EQ AND_EQ OR_EQ 
%token VARARGOUT VARARGIN EOF COMMAND_IDENTIFIER
%token LEX_ERROR COMMAND_STRING

%left SEMICOLON COMMA CR
%left OR_OR OR AND_AND AND
%left LE_OP GE_OP EQ_OP NE_OP LT_OP GT_OP
%left LSHIFT RSHIFT
%left MINUS PLUS MULT DIV LDIV 
%left UNARY PLUS_PLUS MINUS_MINUS NOT NOT
%left POW TRANSPOSE 
%left LPAREN DOT LBRACE COLON
%right ASSIGN PLUS_EQ MINUS_EQ MULT_EQ DIV_EQ LDIV_EQ POW_EQ 
%right OR_EQ AND_EQ LSHIFT_EQ RSHIFT_EQ

%start translation_unit
%%

primary_expression
		: IDENTIFIER  
	    	{ $$ = new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)$1)); } 
	    | CONSTANT 
	        { $$ = new OctaveConstant((OctaveToken)$1); }
	    | STRING_LITERAL  
	        { $$ = new OctaveString((OctaveToken)$1); }      
/*	    | paren_start expression paren_end
	    	{ $$ = new OctaveParenthesisExpression((Expression)$2);
	    	  ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
	    | matrix_expression
	    	{ $$ = $1; }
	    | cell_expression
	    	{ $$ = $1; }
	    | function_handle
	    	{ $$ = $1; }
*/	    ;  

paren_start
		: LPAREN
			{ lexer.enableMatrixIgnoreNewLine();
				$$ = $1; }
		;
		
paren_end
		: RPAREN
			{ lexer.disableMatrixIgnoreNewLine();
				$$ = $1; }
		;
    
function_handle
		: AT IDENTIFIER
			{ $$ = new OctaveFunctionHandleExpression(new OctaveIdentifier((OctaveToken)$2)); }
		;

matrix_start
		: LBRACKET
			{ lexer.enableMatrixIgnoreNewLine();
				$$ = $1; }
		;
		
matrix_end
		: RBRACKET
			{ lexer.disableMatrixIgnoreNewLine();
				$$ = $1; }
		;
		
matrix_expression
		: matrix_start matrix_end
	        { $$ = new OctaveMatrixExpression(new OctaveASTListNode()); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$2).getCharacter() + ((OctaveToken)$2).toString().length()); }
	    | matrix_start SEMICOLON matrix_end
	        { $$ = new OctaveMatrixExpression(new OctaveASTListNode()); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
	    | matrix_start array_list matrix_end
	        { $$ = new OctaveMatrixExpression((OctaveASTListNode)$2); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
		;

cell_start
		: LBRACE
			{ lexer.enableMatrixIgnoreNewLine();
				$$ = $1; }
		;
		
cell_end
		: RBRACE
			{ lexer.disableMatrixIgnoreNewLine();
				$$ = $1; }
		;

cell_expression
		: cell_start cell_end
	        { $$ = new OctaveCellExpression(new OctaveASTListNode()); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$2).getCharacter() + ((OctaveToken)$2).toString().length()); }
	    | cell_start SEMICOLON cell_end
	        { $$ = new OctaveCellExpression(new OctaveASTListNode()); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
	    | cell_start array_list cell_end
	        { $$ = new OctaveCellExpression((OctaveASTListNode)$2); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
		;
	
index_start
		: paren_start
			{ $$ = $1; }
		| cell_start
			{ $$ = $1; }
		;
		
index_stop
		: paren_end
			{ $$ = $1; }
		| cell_end
			{ $$ = $1; }
		;
				
index_element_list
		: array_element_list
			{ $$ = $1; }
		;
		
postfix_expression
		: primary_expression
        	{ $$ = $1; }
        | postfix_expression index_start index_element_list index_stop
        	{ CallArgumentsList list = new CallArgumentsList(((ASTListNode)$3).sourceStart(),
        	       ((ASTListNode)$3).sourceEnd());
        	   list.getChilds().addAll(((ASTListNode)$3).getChilds());
        	   $$ = new OctaveSymbolCallExpression((Expression)$1, list);
        	  ((ASTNode)$$).setEnd(((OctaveToken)$4).getCharacter() + ((OctaveToken)$4).toString().length()); }
        | postfix_expression index_start index_stop
        	{ $$ = new OctaveSymbolCallExpression((Expression)$1, CallArgumentsList.EMPTY);
        	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
        | postfix_expression DOT IDENTIFIER
        	{ OctaveSymbolReference s = new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)$3));  
        	   CallArgumentsList list = new CallArgumentsList(s.sourceStart(), s.sourceEnd());
        	   list.getChilds().add(s);      	   
        	   if ($1 instanceof OctaveDotCallExpression) {
        	    $$ = $1;
        	    ((OctaveDotCallExpression)$$).appendArg(list);
        	   } else {
        	     
        	   	 $$ = new OctaveDotCallExpression((Expression)$1, list);
        	   }
        	  ((ASTNode)$$).setEnd(s.sourceEnd()); } 
        | postfix_expression DOT LPAREN expression RPAREN
			{ CallArgumentsList list = new CallArgumentsList(((Expression)$4).sourceStart(),
        	       ((Expression)$4).sourceEnd());
        	   list.getChilds().add($4);
        	  if ($1 instanceof OctaveDotCallExpression) {
        	    $$ = $1;
        	    ((OctaveDotCallExpression)$$).appendArg(list);
        	  } else {
        	   $$ = new OctaveDotCallExpression((Expression)$1, list);
        	  }
        	  ((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); }	
        | postfix_expression TRANSPOSE
        	{ $$ = new OctavePostfixExpression((Expression)$1, (OctaveToken)$2); }
        | postfix_expression PLUS_PLUS
        	{ $$ = new OctavePostfixExpression((Expression)$1, (OctaveToken)$2); } 
        | postfix_expression MINUS_MINUS
        	{ $$ = new OctavePostfixExpression((Expression)$1, (OctaveToken)$2); }
        ;

prefix_expression
        : postfix_expression
        	{ $$ = $1; }
        | binary_expression
        	{ $$ = $1; }
        | unary_operator postfix_expression %prec UNARY
        	{ $$ = new OctaveUnaryExpression((OctaveToken)$1, (Expression)$2); }
        ;

unary_operator
        : PLUS
        	{ $$ = $1; }
        | MINUS
        	{ $$ = $1; }
        | PLUS_PLUS
        	{ $$ = $1; }
        | MINUS_MINUS
        	{ $$ = $1; }
        | NOT
        	{ $$ = $1; }	  
        ;

binary_expression
        : prefix_expression MULT prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression DIV prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression LDIV prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression POW prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression PLUS prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression MINUS prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
       	;
		
colon_expression
		: colon_subexpression
			{ $$ = $1; }
		;		
		
colon_subexpression
		: prefix_expression
			{ $$ = $1; }
		| colon_subexpression COLON prefix_expression
			{ 
				if ($1 instanceof OctaveColonExpression)
				{
					((OctaveColonExpression)$1).addNode((Expression)$3);
				}
				else 
				{ 
					$$ = new OctaveColonExpression((Expression)$1);
					((OctaveColonExpression)$$).addNode((Expression)$3);
				}	 
			}
		;
		
simple_expression	
		: colon_expression
			{ $$ = $1; }
		| simple_expression RSHIFT simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression LSHIFT simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
		| simple_expression LT_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression GT_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression LE_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression GE_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression EQ_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression NE_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression AND simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression AND_AND simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression OR simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression OR_OR simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
		;
		
anon_function_start
		: AT
			{ $$ = $1;
			  	lexer.enableVarArgIn(); }
		;		
		
anon_function_handle_expression
		: anon_function_start LPAREN identifier_list RPAREN statement
			{ $$ = new OctaveAnonFunctionHandleExpression((OctaveASTListNode)$3, 
			         (OctaveStatement)$5);
			   ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
               ((ASTNode)$$).setEnd(((ASTNode)$5).sourceEnd()); 
			   lexer.disableVarArgIn(); }
		;
			
command_expression
		: COMMAND_IDENTIFIER command_list
			{ CallArgumentsList list = new CallArgumentsList(((ASTListNode)$2).sourceStart(),
                   ((ASTListNode)$2).sourceEnd());
               list.getChilds().addAll(((ASTListNode)$2).getChilds());
               $$ = new OctaveSymbolCallExpression(
				new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)$1)),
				list); }
		;			
			
command_list
		: COMMAND_STRING
			{ $$ = new OctaveASTListNode(); 
				((OctaveASTListNode)$$).addNode(new OctaveString((OctaveToken)$1)); }
		| STRING_LITERAL
		      { $$ = new OctaveASTListNode(); 
                ((OctaveASTListNode)$$).addNode((OctaveString)$1); }
		| command_list COMMAND_STRING
			{ $$ = $1;
				((OctaveASTListNode)$$).addNode(new OctaveString((OctaveToken)$2)); }
		| command_list STRING_LITERAL
		    { $$ = $1;
		          ((OctaveASTListNode)$$).addNode((OctaveString)$2); }
		;			
			
expression
		: anon_function_handle_expression
			{ $$ = $1; }
		| command_expression
			{ $$ = $1; }
		| assignment_expression
    		{ $$ = $1; }
		;

assignment_expression
		: simple_expression
			{ $$ = $1; }
		| assignment_expression ASSIGN expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			 (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression PLUS_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression MINUS_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression MULT_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression DIV_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression LDIV_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression POW_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression AND_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression OR_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression LSHIFT_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression RSHIFT_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	;

eostmt 
        :  COMMA
        	{ $$ = $1; } 
        |  SEMICOLON
        	{ $$ = $1; }
        |  CR
        	{ $$ = $1; }
        |  eostmt COMMA
        	{ $$ = $1; } 
        |  eostmt SEMICOLON
        	{ $$ = $1; }
        |  eostmt CR
        	{ $$ = $1; }
        ;

opt_eostmt
		:	/* optional */
			{ $$ = null; }
		| 	eostmt
			{ $$ = $1; }
		;
		
opt_cr
		:
			{ $$ = null; }
		|  cr
        	{ $$ = $1; }
        ;

cr
		: CR
			{ $$ = $1; }
		| cr CR
        	{ $$ = $1; }
        ;        
        
        
statement
		: expression
        	{ $$ = new OctaveExpressionStatement((Expression)$1); }
		| command
			{ $$ = $1; }
		;
		
command		
        : declaration_statement
        	{ $$ = $1; }
        | selection_statement
        	{ $$ = $1; }
        | iteration_statement
        	{ $$ = $1; }
        | exception_statement
        	{ $$ = $1; }
        | jump_statement
        	{ $$ = $1; }
        | function_statement
        	{ $$ = $1; }
        ;
        
statement_list
		: /*  empty:  statement_list can be empty  */
			{ $$ = new OctaveASTListNode(); }
		| statement_sublist
			{ $$ = $1; }
		;
		
statement_sublist
		: statement opt_eostmt
        	{ $$ = new OctaveASTListNode(); 
        		((OctaveASTListNode)$$).addNode((ASTNode)$1); }
        | statement_sublist opt_eostmt statement opt_eostmt
        	{ ((OctaveASTListNode)$1).addNode((ASTNode)$3); 
        	  $$ = $1; }
        ;
	
identifier_list
        : IDENTIFIER 
        	{ $$ = new OctaveASTListNode(); 
        		((OctaveASTListNode)$$).addNode(
        		    new OctaveIdentifier((OctaveToken)$1)); }
        | identifier_list COMMA IDENTIFIER
			{ $$ = $1;
			    ((OctaveASTListNode)$1).addNode(
					new OctaveIdentifier((OctaveToken)$3)); }
		| VARARGIN
			{ $$ = new OctaveASTListNode();
			     ((OctaveASTListNode)$$).addNode(
                    new OctaveIdentifier((OctaveToken)$1)); }
		| identifier_list COMMA VARARGIN
			{ $$ = $1;
			     ((OctaveASTListNode)$1).addNode(
                    new OctaveIdentifier((OctaveToken)$3));  }
        ;

declaration
		: IDENTIFIER
			{ $$ = new OctaveASTListNode(); 
        		((OctaveASTListNode)$$).addNode(new OctaveVariableDeclaration(
        			new OctaveIdentifier((OctaveToken)$1))); }
		| IDENTIFIER ASSIGN expression
			{ $$ = new OctaveASTListNode(); 
        		((OctaveASTListNode)$$).addNode(new OctaveVariableDeclaration(
        			new OctaveIdentifier((OctaveToken)$1),(Expression)$3)); }
		;

declaration_list
		: declaration
			{ $$ = $1; }
		| declaration_list declaration
			{ $$ = $1;
				Iterator i = ((OctaveASTListNode)$2).getChilds().iterator();
				while(i.hasNext()) { 
					((OctaveASTListNode)$1).addNode((ASTNode)i.next());
				}
			}
		;

declaration_statement
		: GLOBAL declaration_list 
        	{ $$ = new OctaveGlobalStatement((OctaveASTListNode)$2); 
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	}
        | PERSISTENT declaration_list
        	{ $$ = new OctavePersistentStatement((OctaveASTListNode)$2); 
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
			}
        ;      

colon
		: COLON
			{ $$ = new OctaveConstant((OctaveToken)$1); }
		;
		
array_element_end
		: END	
			{ $$ = new OctaveConstant((OctaveToken)$1); }
		;
			
array_list
        : array_sublist 
        	{ $$ = $1; }
        | array_sublist SEMICOLON 
        	{ $$ = $1; }
        ;

array_sublist
		: array_row
        	{ $$ = $1;  }
        | array_sublist SEMICOLON array_row
        	{ $$ = $1;
        		((OctaveASTListNode)$$).getChilds()
        			.addAll(((OctaveASTListNode)$3).getChilds()); }
        ;	

array_row
		: array_element_list
			{ $$ = $1; }
		| array_element_list COMMA
			{ $$ = $1; }
		;
        
array_space
		:
			{ $$ = null; }
		;

array_comma
		: COMMA
			{ $$ = $1; }
		| array_space 
			{ $$ = $1; }
		
		;        
        
array_element_list	
		: expression
		  { $$ = new OctaveASTListNode(); 
		  		if ($1 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$1); 
        		} }
		| colon
		  { $$ = new OctaveASTListNode();
        		if ($1 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$1); 
        		} }
        | array_element_end
		  { $$ = new OctaveASTListNode();
        		if ($1 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$1); 
        		} }
		| array_element_list array_comma colon
		  {
		    $$ = $1; 
        		if ($3 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$3); 
        		} }
		| array_element_list array_comma expression
		  {
		    $$ = $1; 
        		if ($3 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$3); 
        		} }
		| array_element_list array_comma array_element_end
		  {
		    $$ = $1; 
        		if ($3 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$3); 
        		} }
		;           		
		;        
        
if_list
		: if_sublist
			{ $$ = $1; }
		| if_sublist else_clause
			{ $$ = $1;
			  ((OctaveIfStatement)$$).addElseClause((ASTNode)$2); }
		;
		
if_sublist
		: expression opt_eostmt statement_list
			{ $$ = new OctaveIfStatement((Expression)$1, (OctaveASTListNode)$3, new OctaveASTListNode()); }
		| if_sublist elseif_clause
			{ $$ = $1;
			  ((OctaveIfStatement)$$).addElseClause((ASTNode)$2); }
		;
		
 
selection_statement
		: IF if_list end_if
			{ $$ = $2; 
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  	((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
		| SWITCH expression opt_eostmt case_list end_switch
        	{ $$ = new OctaveSwitchStatement((Expression)$2, (OctaveASTListNode)$4, new OctaveASTListNode()); 
        	  	((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  	((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); }
		| SWITCH expression opt_eostmt case_list otherwise_statement end_switch
			{ $$ = new OctaveSwitchStatement((Expression)$2, (OctaveASTListNode)$4, (OctaveASTListNode)$5); 
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$6).getCharacter() + ((OctaveToken)$6).toString().length()); }
        ;

elseif_clause
        : ELSEIF opt_eostmt expression opt_eostmt statement_list
        	{ $$ = new OctaveElseIfClause((Expression)$3, (OctaveASTListNode)$5); 
        	  ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  if (((OctaveASTListNode)$5).getChilds().isEmpty()) {
        	  	((ASTNode)$$).setEnd(((Expression)$3).sourceEnd());
        	  } else {
        	  	((ASTNode)$$).setEnd(((OctaveASTListNode)$5).sourceEnd());
        	  }
        	}
        ;
        
else_clause
		: ELSE opt_eostmt statement_list
			{ $$ = new OctaveElseClause((OctaveASTListNode)$3); 
        	  ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  if (((OctaveASTListNode)$3).getChilds().isEmpty()) {
        	  	((ASTNode)$$).setEnd(((OctaveToken)$1).getCharacter());
        	  } else {
        	  	((ASTNode)$$).setEnd(((OctaveASTListNode)$3).sourceEnd());
        	  }
        	}
		;
	
iteration_statement
        : WHILE expression opt_eostmt statement_list end_while
        	{ $$ = new OctaveWhileStatement((Expression)$2, (OctaveASTListNode)$4); 
        	  	((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  	((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); }
        | DO opt_eostmt statement_list UNTIL expression
        	{ $$ = new OctaveDoStatement((OctaveASTListNode)$3, (Expression)$5); 
        	  	((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter()); 
        	  	((ASTNode)$$).setEnd(((Expression)$5).sourceEnd()); }
        | FOR simple_expression ASSIGN expression opt_eostmt statement_list end_for
        	{ $$ = new OctaveForStatement((Expression)$2, (Expression)$4, (OctaveASTListNode)$6);
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter()); 
        		((ASTNode)$$).setEnd(((OctaveToken)$7).getCharacter() + ((OctaveToken)$7).toString().length()); }
        | FOR LPAREN simple_expression ASSIGN expression RPAREN opt_eostmt statement_list end_for
        	{ $$ = new OctaveForStatement((Expression)$3, (Expression)$5, (OctaveASTListNode)$8);
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        		((ASTNode)$$).setEnd(((OctaveToken)$9).getCharacter() + ((OctaveToken)$9).toString().length()); } 
        ;

end_if	
		: ENDIF
			{ $$ = $1; }
		| END
			{ $$ = $1; }  
end_while
		: ENDWHILE
			{ $$ = $1; }
		| END
			{ $$ = $1; }
		;
		
end_for
		: ENDFOR
			{ $$ = $1; }
		| END
			{ $$ = $1; }
		;
		
end_switch
		: ENDSWITCH
			{ $$ = $1; }
		| END
			{ $$ = $1; }
		;
		
end_try
		: ENDTRYCATCH
			{ $$ = $1; }
		| END	
			{ $$ = $1; }
		;

end_unwind
		: ENDUNWINDPROTECT
			{ $$ = $1; }
		| END
			{ $$ = $1; }
		;
		
otherwise_statement	
		: OTHERWISE opt_eostmt statement_list
			{ $$ = $3; 
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				if (((OctaveASTListNode)$3).getChilds().isEmpty()) {
        	  		((ASTNode)$$).setEnd(((OctaveToken)$1).getCharacter());
        	  	} else {
        	  		((ASTNode)$$).setEnd(((OctaveASTListNode)$3).sourceEnd());
        	  	}
        	}
		;
		
case_list
		: CASE expression opt_eostmt statement_list
			{ $$ = new OctaveASTListNode(); 
				((OctaveASTListNode)$$).addNode((Expression)$2);
				((OctaveASTListNode)$$).getChilds().addAll(((OctaveASTListNode)$4).getChilds()); }
		| case_list CASE expression opt_eostmt statement_list
			{ $$ = $1;
				((OctaveASTListNode)$$).addNode((Expression)$3);
				((OctaveASTListNode)$$).getChilds().addAll(((OctaveASTListNode)$5).getChilds()); }
		;
		
exception_statement
		: TRY opt_eostmt statement_list CATCH opt_eostmt statement_list end_try
			{ $$ = new OctaveExceptionStatement.OctaveTryStatement((OctaveASTListNode)$3, (OctaveASTListNode)$6); 
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$7).getCharacter() + ((OctaveToken)$7).toString().length()); }
		| UNWIND opt_eostmt statement_list CLEANUP opt_eostmt statement_list end_unwind
			{ $$ = new OctaveExceptionStatement.OctaveUnwindStatement((OctaveASTListNode)$3, (OctaveASTListNode)$6);
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$7).getCharacter() + ((OctaveToken)$7).toString().length()); }
		;

jump_statement
        : BREAK
        	{ $$ = new OctaveJumpStatement((OctaveToken)$1); }
        | RETURN
        	{ $$ = new OctaveJumpStatement((OctaveToken)$1); }
        | CONTINUE
        	{ $$ = new OctaveJumpStatement((OctaveToken)$1); }
        ;

start_function
		: FUNCTION
			{ lexer.increaseFunctionDepth(); 
			  lexer.enableVarArgOut();
			  lexer.enableVarArgIn();
			  $$ = $1; }
		;

function_statement
		: start_function function_declare eostmt statement_list end_function
			{ $$ = new OctaveFunctionStatement((OctaveFunctionDeclaration)$2, (OctaveASTListNode)$4);
			  ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
			  if ($5 != null) {
			  	((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); 
			  } else if (!((OctaveASTListNode)$4).getChilds().isEmpty()) { 
			  	((ASTNode)$$).setEnd(((OctaveASTListNode)$4).sourceEnd());
			  } else {
			  	((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length());
			  } }
		;

translation_unit
        : statement_list EOF
        	{ $$ = new OctaveTranslationUnit((OctaveASTListNode)$1); }
        | opt_cr statement_list EOF
        	{ $$ = new OctaveTranslationUnit((OctaveASTListNode)$2); }
        | statement_list
        	{ $$ = new OctaveTranslationUnit((OctaveASTListNode)$1); }
        | opt_cr statement_list
        	{ $$ = new OctaveTranslationUnit((OctaveASTListNode)$2); }
        ;

end_function
		: EOF
			{ lexer.decreaseFunctionDepth();  
			  $$ = null; }
		| ENDFUNCTION 
			{ lexer.decreaseFunctionDepth();  
			  $$ = $1; }
		| END 
			{ lexer.decreaseFunctionDepth();  
			  $$ = $1; }
		;

func_return_list
        : LBRACKET RBRACKET
			{ $$ = new OctaveASTListNode(); 
			((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$2).getCharacter() + ((OctaveToken)$2).toString().length()); }
        | LBRACKET identifier_list RBRACKET 
        	{ $$ = $2;
        	    ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
        | LBRACKET VARARGOUT RBRACKET
        	{ $$ = new OctaveASTListNode(); 
        	    ((OctaveASTListNode)$$).addNode(new OctaveIdentifier((OctaveToken)$2));    
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length());}
        | LBRACKET identifier_list COMMA VARARGOUT RBRACKET
        	{ $$ = $2;
        	    ((OctaveASTListNode)$$).addNode(new OctaveIdentifier((OctaveToken)$4));
        	    ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); }
        ;

function_declare_rhs
        : IDENTIFIER 
        	{ $$ = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)$1), new OctaveASTListNode()); }
        | IDENTIFIER LPAREN RPAREN
        	{ $$ = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)$1), new OctaveASTListNode()); 
        		((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }        	 
        | IDENTIFIER LPAREN identifier_list RPAREN 
        	{ $$ = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)$1), (OctaveASTListNode)$3);
        		((ASTNode)$$).setEnd(((OctaveToken)$4).getCharacter() + ((OctaveToken)$4).toString().length()); }         	
        ;

function_declare
        : function_declare_rhs
        	{ $$ = $1;
        	  lexer.disableVarArgOut();
			  lexer.disableVarArgIn(); }
        | IDENTIFIER ASSIGN function_declare_rhs
        	{ OctaveASTListNode list = new OctaveASTListNode(); 
				list.addNode(
					new OctaveIdentifier((OctaveToken)$1));
        		((OctaveFunctionDeclaration)$3).setReturnList(list); 
        		$$ = $3;
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        		((ASTNode)$$).setEnd(((ASTNode)$3).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
        | VARARGOUT ASSIGN function_declare_rhs
        	{ OctaveASTListNode list = new OctaveASTListNode(); 
        		((OctaveFunctionDeclaration)$3).setReturnList(list);
        		$$ = $3;
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        		((ASTNode)$$).setEnd(((ASTNode)$3).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
        | func_return_list ASSIGN function_declare_rhs
        	{ ((OctaveFunctionDeclaration)$3).setReturnList((OctaveASTListNode)$1); 
        		$$ = $3;
        		((ASTNode)$$).setStart(((ASTNode)$1).sourceStart());
        		((ASTNode)$$).setEnd(((ASTNode)$3).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }        
        ;
      
%%

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
=======
%{
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
%}
%token IDENTIFIER CONSTANT STRING_LITERAL
%token LE_OP GE_OP EQ_OP NE_OP
%token IF ELSE ELSEIF WHILE FOR BREAK RETURN PERSISTENT CONTINUE
%token FUNCTION TRANSPOSE CR GLOBAL
%token DO UNTIL WHILE SWITCH CASE TRY CATCH UNWIND CLEANUP OTHERWISE
%token END ENDFUNCTION ENDFOR ENDIF ENDWHILE ENDTRYCATCH ENDUNWINDPROTECT ENDSWITCH
%token COMMENT CONTINUATION SEMICOLON COMMA COLON ASSIGN LPAREN RPAREN
%token LBRACKET RBRACKET AND MINUS PLUS MULT DIV LDIV
%token LT_OP GT_OP OR OR_OR AND_AND POW
%token NOT PLUS_PLUS MINUS_MINUS LBRACE RBRACE DOT AT
%token PLUS_EQ MINUS_EQ MULT_EQ DIV_EQ LDIV_EQ POW_EQ
%token RSHIFT LSHIFT RSHIFT_EQ LSHIFT_EQ AND_EQ OR_EQ 
%token VARARGOUT VARARGIN EOF COMMAND_IDENTIFIER
%token LEX_ERROR COMMAND_STRING

%left SEMICOLON COMMA CR
%left OR_OR OR AND_AND AND
%left LE_OP GE_OP EQ_OP NE_OP LT_OP GT_OP
%left LSHIFT RSHIFT
%left MINUS PLUS MULT DIV LDIV 
%left UNARY PLUS_PLUS MINUS_MINUS NOT NOT
%left POW TRANSPOSE 
%left LPAREN DOT LBRACE COLON
%right ASSIGN PLUS_EQ MINUS_EQ MULT_EQ DIV_EQ LDIV_EQ POW_EQ 
%right OR_EQ AND_EQ LSHIFT_EQ RSHIFT_EQ

%start translation_unit
%%

primary_expression
		: IDENTIFIER  
	    	{ $$ = new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)$1)); } 
	    | CONSTANT 
	        { $$ = new OctaveConstant((OctaveToken)$1); }
	    | STRING_LITERAL  
	        { $$ = new OctaveString((OctaveToken)$1); }      
/*	    | paren_start expression paren_end
	    	{ $$ = new OctaveParenthesisExpression((Expression)$2);
	    	  ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
	    | matrix_expression
	    	{ $$ = $1; }
	    | cell_expression
	    	{ $$ = $1; }
	    | function_handle
	    	{ $$ = $1; }
*/	    ;  

paren_start
		: LPAREN
			{ lexer.enableMatrixIgnoreNewLine();
				$$ = $1; }
		;
		
paren_end
		: RPAREN
			{ lexer.disableMatrixIgnoreNewLine();
				$$ = $1; }
		;
    
function_handle
		: AT IDENTIFIER
			{ $$ = new OctaveFunctionHandleExpression(new OctaveIdentifier((OctaveToken)$2)); }
		;

matrix_start
		: LBRACKET
			{ lexer.enableMatrixIgnoreNewLine();
				$$ = $1; }
		;
		
matrix_end
		: RBRACKET
			{ lexer.disableMatrixIgnoreNewLine();
				$$ = $1; }
		;
		
matrix_expression
		: matrix_start matrix_end
	        { $$ = new OctaveMatrixExpression(new OctaveASTListNode()); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$2).getCharacter() + ((OctaveToken)$2).toString().length()); }
	    | matrix_start SEMICOLON matrix_end
	        { $$ = new OctaveMatrixExpression(new OctaveASTListNode()); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
	    | matrix_start array_list matrix_end
	        { $$ = new OctaveMatrixExpression((OctaveASTListNode)$2); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
		;

cell_start
		: LBRACE
			{ lexer.enableMatrixIgnoreNewLine();
				$$ = $1; }
		;
		
cell_end
		: RBRACE
			{ lexer.disableMatrixIgnoreNewLine();
				$$ = $1; }
		;

cell_expression
		: cell_start cell_end
	        { $$ = new OctaveCellExpression(new OctaveASTListNode()); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$2).getCharacter() + ((OctaveToken)$2).toString().length()); }
	    | cell_start SEMICOLON cell_end
	        { $$ = new OctaveCellExpression(new OctaveASTListNode()); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
	    | cell_start array_list cell_end
	        { $$ = new OctaveCellExpression((OctaveASTListNode)$2); 
	          ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
	    	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
		;
	
index_start
		: paren_start
			{ $$ = $1; }
		| cell_start
			{ $$ = $1; }
		;
		
index_stop
		: paren_end
			{ $$ = $1; }
		| cell_end
			{ $$ = $1; }
		;
				
index_element_list
		: array_element_list
			{ $$ = $1; }
		;
		
postfix_expression
		: primary_expression
        	{ $$ = $1; }
        | postfix_expression index_start index_element_list index_stop
        	{ CallArgumentsList list = new CallArgumentsList(((ASTListNode)$3).sourceStart(),
        	       ((ASTListNode)$3).sourceEnd());
        	   list.getChilds().addAll(((ASTListNode)$3).getChilds());
        	   $$ = new OctaveSymbolCallExpression((Expression)$1, list);
        	  ((ASTNode)$$).setEnd(((OctaveToken)$4).getCharacter() + ((OctaveToken)$4).toString().length()); }
        | postfix_expression index_start index_stop
        	{ $$ = new OctaveSymbolCallExpression((Expression)$1, CallArgumentsList.EMPTY);
        	  ((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
        | postfix_expression DOT IDENTIFIER
        	{ OctaveSymbolReference s = new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)$3));  
        	   CallArgumentsList list = new CallArgumentsList(s.sourceStart(), s.sourceEnd());
        	   list.getChilds().add(s);      	   
        	   if ($1 instanceof OctaveDotCallExpression) {
        	    $$ = $1;
        	    ((OctaveDotCallExpression)$$).appendArg(list);
        	   } else {
        	     
        	   	 $$ = new OctaveDotCallExpression((Expression)$1, list);
        	   }
        	  ((ASTNode)$$).setEnd(s.sourceEnd()); } 
        | postfix_expression DOT LPAREN expression RPAREN
			{ CallArgumentsList list = new CallArgumentsList(((Expression)$4).sourceStart(),
        	       ((Expression)$4).sourceEnd());
        	   list.getChilds().add($4);
        	  if ($1 instanceof OctaveDotCallExpression) {
        	    $$ = $1;
        	    ((OctaveDotCallExpression)$$).appendArg(list);
        	  } else {
        	   $$ = new OctaveDotCallExpression((Expression)$1, list);
        	  }
        	  ((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); }	
        | postfix_expression TRANSPOSE
        	{ $$ = new OctavePostfixExpression((Expression)$1, (OctaveToken)$2); }
        | postfix_expression PLUS_PLUS
        	{ $$ = new OctavePostfixExpression((Expression)$1, (OctaveToken)$2); } 
        | postfix_expression MINUS_MINUS
        	{ $$ = new OctavePostfixExpression((Expression)$1, (OctaveToken)$2); }
        ;

prefix_expression
        : postfix_expression
        	{ $$ = $1; }
        | binary_expression
        	{ $$ = $1; }
        | unary_operator postfix_expression %prec UNARY
        	{ $$ = new OctaveUnaryExpression((OctaveToken)$1, (Expression)$2); }
        ;

unary_operator
        : PLUS
        	{ $$ = $1; }
        | MINUS
        	{ $$ = $1; }
        | PLUS_PLUS
        	{ $$ = $1; }
        | MINUS_MINUS
        	{ $$ = $1; }
        | NOT
        	{ $$ = $1; }	  
        ;

binary_expression
        : prefix_expression MULT prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression DIV prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression LDIV prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression POW prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression PLUS prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | prefix_expression MINUS prefix_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
       	;
		
colon_expression
		: colon_subexpression
			{ $$ = $1; }
		;		
		
colon_subexpression
		: prefix_expression
			{ $$ = $1; }
		| colon_subexpression COLON prefix_expression
			{ 
				if ($1 instanceof OctaveColonExpression)
				{
					((OctaveColonExpression)$1).addNode((Expression)$3);
				}
				else 
				{ 
					$$ = new OctaveColonExpression((Expression)$1);
					((OctaveColonExpression)$$).addNode((Expression)$3);
				}	 
			}
		;
		
simple_expression	
		: colon_expression
			{ $$ = $1; }
		| simple_expression RSHIFT simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression LSHIFT simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
		| simple_expression LT_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression GT_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression LE_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression GE_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression EQ_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression NE_OP simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression AND simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression AND_AND simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression OR simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
        | simple_expression OR_OR simple_expression
        	{ $$ = new OctaveBinaryExpression((Expression)$1, (OctaveToken)$2, (Expression)$3); }
		;
		
anon_function_start
		: AT
			{ $$ = $1;
			  	lexer.enableVarArgIn(); }
		;		
		
anon_function_handle_expression
		: anon_function_start LPAREN identifier_list RPAREN statement
			{ $$ = new OctaveAnonFunctionHandleExpression((OctaveASTListNode)$3, 
			         (OctaveStatement)$5);
			   ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
               ((ASTNode)$$).setEnd(((ASTNode)$5).sourceEnd()); 
			   lexer.disableVarArgIn(); }
		;
			
command_expression
		: COMMAND_IDENTIFIER command_list
			{ CallArgumentsList list = new CallArgumentsList(((ASTListNode)$2).sourceStart(),
                   ((ASTListNode)$2).sourceEnd());
               list.getChilds().addAll(((ASTListNode)$2).getChilds());
               $$ = new OctaveSymbolCallExpression(
				new OctaveSymbolReference(new OctaveIdentifier((OctaveToken)$1)),
				list); }
		;			
			
command_list
		: COMMAND_STRING
			{ $$ = new OctaveASTListNode(); 
				((OctaveASTListNode)$$).addNode(new OctaveString((OctaveToken)$1)); }
		| STRING_LITERAL
		      { $$ = new OctaveASTListNode(); 
                ((OctaveASTListNode)$$).addNode((OctaveString)$1); }
		| command_list COMMAND_STRING
			{ $$ = $1;
				((OctaveASTListNode)$$).addNode(new OctaveString((OctaveToken)$2)); }
		| command_list STRING_LITERAL
		    { $$ = $1;
		          ((OctaveASTListNode)$$).addNode((OctaveString)$2); }
		;			
			
expression
		: anon_function_handle_expression
			{ $$ = $1; }
		| command_expression
			{ $$ = $1; }
		| assignment_expression
    		{ $$ = $1; }
		;

assignment_expression
		: simple_expression
			{ $$ = $1; }
		| assignment_expression ASSIGN expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			 (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression PLUS_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression MINUS_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression MULT_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression DIV_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression LDIV_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression POW_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression AND_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression OR_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression LSHIFT_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	| assignment_expression RSHIFT_EQ expression 
    		{ $$ = new OctaveBinaryExpression(new OctaveAssignmentLHSExpression((Expression)$1),
    			  (OctaveToken)$2, (Expression)$3); }
    	;

eostmt 
        :  COMMA
        	{ $$ = $1; } 
        |  SEMICOLON
        	{ $$ = $1; }
        |  CR
        	{ $$ = $1; }
        |  eostmt COMMA
        	{ $$ = $1; } 
        |  eostmt SEMICOLON
        	{ $$ = $1; }
        |  eostmt CR
        	{ $$ = $1; }
        ;

opt_eostmt
		:	/* optional */
			{ $$ = null; }
		| 	eostmt
			{ $$ = $1; }
		;
		
opt_cr
		:
			{ $$ = null; }
		|  cr
        	{ $$ = $1; }
        ;

cr
		: CR
			{ $$ = $1; }
		| cr CR
        	{ $$ = $1; }
        ;        
        
        
statement
		: expression
        	{ $$ = new OctaveExpressionStatement((Expression)$1); }
		| command
			{ $$ = $1; }
		;
		
command		
        : declaration_statement
        	{ $$ = $1; }
        | selection_statement
        	{ $$ = $1; }
        | iteration_statement
        	{ $$ = $1; }
        | exception_statement
        	{ $$ = $1; }
        | jump_statement
        	{ $$ = $1; }
        | function_statement
        	{ $$ = $1; }
        ;
        
statement_list
		: /*  empty:  statement_list can be empty  */
			{ $$ = new OctaveASTListNode(); }
		| statement_sublist
			{ $$ = $1; }
		;
		
statement_sublist
		: statement opt_eostmt
        	{ $$ = new OctaveASTListNode(); 
        		((OctaveASTListNode)$$).addNode((ASTNode)$1); }
        | statement_sublist opt_eostmt statement opt_eostmt
        	{ ((OctaveASTListNode)$1).addNode((ASTNode)$3); 
        	  $$ = $1; }
        ;
	
identifier_list
        : IDENTIFIER 
        	{ $$ = new OctaveASTListNode(); 
        		((OctaveASTListNode)$$).addNode(
        		    new OctaveIdentifier((OctaveToken)$1)); }
        | identifier_list COMMA IDENTIFIER
			{ $$ = $1;
			    ((OctaveASTListNode)$1).addNode(
					new OctaveIdentifier((OctaveToken)$3)); }
		| VARARGIN
			{ $$ = new OctaveASTListNode();
			     ((OctaveASTListNode)$$).addNode(
                    new OctaveIdentifier((OctaveToken)$1)); }
		| identifier_list COMMA VARARGIN
			{ $$ = $1;
			     ((OctaveASTListNode)$1).addNode(
                    new OctaveIdentifier((OctaveToken)$3));  }
        ;

declaration
		: IDENTIFIER
			{ $$ = new OctaveASTListNode(); 
        		((OctaveASTListNode)$$).addNode(new OctaveVariableDeclaration(
        			new OctaveIdentifier((OctaveToken)$1))); }
		| IDENTIFIER ASSIGN expression
			{ $$ = new OctaveASTListNode(); 
        		((OctaveASTListNode)$$).addNode(new OctaveVariableDeclaration(
        			new OctaveIdentifier((OctaveToken)$1),(Expression)$3)); }
		;

declaration_list
		: declaration
			{ $$ = $1; }
		| declaration_list declaration
			{ $$ = $1;
				Iterator i = ((OctaveASTListNode)$2).getChilds().iterator();
				while(i.hasNext()) { 
					((OctaveASTListNode)$1).addNode((ASTNode)i.next());
				}
			}
		;

declaration_statement
		: GLOBAL declaration_list 
        	{ $$ = new OctaveGlobalStatement((OctaveASTListNode)$2); 
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	}
        | PERSISTENT declaration_list
        	{ $$ = new OctavePersistentStatement((OctaveASTListNode)$2); 
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
			}
        ;      

colon
		: COLON
			{ $$ = new OctaveConstant((OctaveToken)$1); }
		;
		
array_element_end
		: END	
			{ $$ = new OctaveConstant((OctaveToken)$1); }
		;
			
array_list
        : array_sublist 
        	{ $$ = $1; }
        | array_sublist SEMICOLON 
        	{ $$ = $1; }
        ;

array_sublist
		: array_row
        	{ $$ = $1;  }
        | array_sublist SEMICOLON array_row
        	{ $$ = $1;
        		((OctaveASTListNode)$$).getChilds()
        			.addAll(((OctaveASTListNode)$3).getChilds()); }
        ;	

array_row
		: array_element_list
			{ $$ = $1; }
		| array_element_list COMMA
			{ $$ = $1; }
		;
        
array_space
		:
			{ $$ = null; }
		;

array_comma
		: COMMA
			{ $$ = $1; }
		| array_space 
			{ $$ = $1; }
		
		;        
        
array_element_list	
		: expression
		  { $$ = new OctaveASTListNode(); 
		  		if ($1 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$1); 
        		} }
		| colon
		  { $$ = new OctaveASTListNode();
        		if ($1 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$1); 
        		} }
        | array_element_end
		  { $$ = new OctaveASTListNode();
        		if ($1 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$1); 
        		} }
		| array_element_list array_comma colon
		  {
		    $$ = $1; 
        		if ($3 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$3); 
        		} }
		| array_element_list array_comma expression
		  {
		    $$ = $1; 
        		if ($3 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$3); 
        		} }
		| array_element_list array_comma array_element_end
		  {
		    $$ = $1; 
        		if ($3 != null) {
        			((OctaveASTListNode)$$).addNode((Expression)$3); 
        		} }
		;           		
		;        
        
if_list
		: if_sublist
			{ $$ = $1; }
		| if_sublist else_clause
			{ $$ = $1;
			  ((OctaveIfStatement)$$).addElseClause((ASTNode)$2); }
		;
		
if_sublist
		: expression opt_eostmt statement_list
			{ $$ = new OctaveIfStatement((Expression)$1, (OctaveASTListNode)$3, new OctaveASTListNode()); }
		| if_sublist elseif_clause
			{ $$ = $1;
			  ((OctaveIfStatement)$$).addElseClause((ASTNode)$2); }
		;
		
 
selection_statement
		: IF if_list end_if
			{ $$ = $2; 
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  	((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
		| SWITCH expression opt_eostmt case_list end_switch
        	{ $$ = new OctaveSwitchStatement((Expression)$2, (OctaveASTListNode)$4, new OctaveASTListNode()); 
        	  	((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  	((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); }
		| SWITCH expression opt_eostmt case_list otherwise_statement end_switch
			{ $$ = new OctaveSwitchStatement((Expression)$2, (OctaveASTListNode)$4, (OctaveASTListNode)$5); 
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$6).getCharacter() + ((OctaveToken)$6).toString().length()); }
        ;

elseif_clause
        : ELSEIF opt_eostmt expression opt_eostmt statement_list
        	{ $$ = new OctaveElseIfClause((Expression)$3, (OctaveASTListNode)$5); 
        	  ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  if (((OctaveASTListNode)$5).getChilds().isEmpty()) {
        	  	((ASTNode)$$).setEnd(((Expression)$3).sourceEnd());
        	  } else {
        	  	((ASTNode)$$).setEnd(((OctaveASTListNode)$5).sourceEnd());
        	  }
        	}
        ;
        
else_clause
		: ELSE opt_eostmt statement_list
			{ $$ = new OctaveElseClause((OctaveASTListNode)$3); 
        	  ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  if (((OctaveASTListNode)$3).getChilds().isEmpty()) {
        	  	((ASTNode)$$).setEnd(((OctaveToken)$1).getCharacter());
        	  } else {
        	  	((ASTNode)$$).setEnd(((OctaveASTListNode)$3).sourceEnd());
        	  }
        	}
		;
	
iteration_statement
        : WHILE expression opt_eostmt statement_list end_while
        	{ $$ = new OctaveWhileStatement((Expression)$2, (OctaveASTListNode)$4); 
        	  	((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        	  	((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); }
        | DO opt_eostmt statement_list UNTIL expression
        	{ $$ = new OctaveDoStatement((OctaveASTListNode)$3, (Expression)$5); 
        	  	((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter()); 
        	  	((ASTNode)$$).setEnd(((Expression)$5).sourceEnd()); }
        | FOR simple_expression ASSIGN expression opt_eostmt statement_list end_for
        	{ $$ = new OctaveForStatement((Expression)$2, (Expression)$4, (OctaveASTListNode)$6);
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter()); 
        		((ASTNode)$$).setEnd(((OctaveToken)$7).getCharacter() + ((OctaveToken)$7).toString().length()); }
        | FOR LPAREN simple_expression ASSIGN expression RPAREN opt_eostmt statement_list end_for
        	{ $$ = new OctaveForStatement((Expression)$3, (Expression)$5, (OctaveASTListNode)$8);
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        		((ASTNode)$$).setEnd(((OctaveToken)$9).getCharacter() + ((OctaveToken)$9).toString().length()); } 
        ;

end_if	
		: ENDIF
			{ $$ = $1; }
		| END
			{ $$ = $1; }  
end_while
		: ENDWHILE
			{ $$ = $1; }
		| END
			{ $$ = $1; }
		;
		
end_for
		: ENDFOR
			{ $$ = $1; }
		| END
			{ $$ = $1; }
		;
		
end_switch
		: ENDSWITCH
			{ $$ = $1; }
		| END
			{ $$ = $1; }
		;
		
end_try
		: ENDTRYCATCH
			{ $$ = $1; }
		| END	
			{ $$ = $1; }
		;

end_unwind
		: ENDUNWINDPROTECT
			{ $$ = $1; }
		| END
			{ $$ = $1; }
		;
		
otherwise_statement	
		: OTHERWISE opt_eostmt statement_list
			{ $$ = $3; 
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				if (((OctaveASTListNode)$3).getChilds().isEmpty()) {
        	  		((ASTNode)$$).setEnd(((OctaveToken)$1).getCharacter());
        	  	} else {
        	  		((ASTNode)$$).setEnd(((OctaveASTListNode)$3).sourceEnd());
        	  	}
        	}
		;
		
case_list
		: CASE expression opt_eostmt statement_list
			{ $$ = new OctaveASTListNode(); 
				((OctaveASTListNode)$$).addNode((Expression)$2);
				((OctaveASTListNode)$$).getChilds().addAll(((OctaveASTListNode)$4).getChilds()); }
		| case_list CASE expression opt_eostmt statement_list
			{ $$ = $1;
				((OctaveASTListNode)$$).addNode((Expression)$3);
				((OctaveASTListNode)$$).getChilds().addAll(((OctaveASTListNode)$5).getChilds()); }
		;
		
exception_statement
		: TRY opt_eostmt statement_list CATCH opt_eostmt statement_list end_try
			{ $$ = new OctaveExceptionStatement.OctaveTryStatement((OctaveASTListNode)$3, (OctaveASTListNode)$6); 
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$7).getCharacter() + ((OctaveToken)$7).toString().length()); }
		| UNWIND opt_eostmt statement_list CLEANUP opt_eostmt statement_list end_unwind
			{ $$ = new OctaveExceptionStatement.OctaveUnwindStatement((OctaveASTListNode)$3, (OctaveASTListNode)$6);
				((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$7).getCharacter() + ((OctaveToken)$7).toString().length()); }
		;

jump_statement
        : BREAK
        	{ $$ = new OctaveJumpStatement((OctaveToken)$1); }
        | RETURN
        	{ $$ = new OctaveJumpStatement((OctaveToken)$1); }
        | CONTINUE
        	{ $$ = new OctaveJumpStatement((OctaveToken)$1); }
        ;

start_function
		: FUNCTION
			{ lexer.increaseFunctionDepth(); 
			  lexer.enableVarArgOut();
			  lexer.enableVarArgIn();
			  $$ = $1; }
		;

function_statement
		: start_function function_declare eostmt statement_list end_function
			{ $$ = new OctaveFunctionStatement((OctaveFunctionDeclaration)$2, (OctaveASTListNode)$4);
			  ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
			  if ($5 != null) {
			  	((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); 
			  } else if (!((OctaveASTListNode)$4).getChilds().isEmpty()) { 
			  	((ASTNode)$$).setEnd(((OctaveASTListNode)$4).sourceEnd());
			  } else {
			  	((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length());
			  } }
		;

translation_unit
        : statement_list EOF
        	{ $$ = new OctaveTranslationUnit((OctaveASTListNode)$1); }
        | opt_cr statement_list EOF
        	{ $$ = new OctaveTranslationUnit((OctaveASTListNode)$2); }
        | statement_list
        	{ $$ = new OctaveTranslationUnit((OctaveASTListNode)$1); }
        | opt_cr statement_list
        	{ $$ = new OctaveTranslationUnit((OctaveASTListNode)$2); }
        ;

end_function
		: EOF
			{ lexer.decreaseFunctionDepth();  
			  $$ = null; }
		| ENDFUNCTION 
			{ lexer.decreaseFunctionDepth();  
			  $$ = $1; }
		| END 
			{ lexer.decreaseFunctionDepth();  
			  $$ = $1; }
		;

func_return_list
        : LBRACKET RBRACKET
			{ $$ = new OctaveASTListNode(); 
			((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$2).getCharacter() + ((OctaveToken)$2).toString().length()); }
        | LBRACKET identifier_list RBRACKET 
        	{ $$ = $2;
        	    ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }
        | LBRACKET VARARGOUT RBRACKET
        	{ $$ = new OctaveASTListNode(); 
        	    ((OctaveASTListNode)$$).addNode(new OctaveIdentifier((OctaveToken)$2));    
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length());}
        | LBRACKET identifier_list COMMA VARARGOUT RBRACKET
        	{ $$ = $2;
        	    ((OctaveASTListNode)$$).addNode(new OctaveIdentifier((OctaveToken)$4));
        	    ((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
				((ASTNode)$$).setEnd(((OctaveToken)$5).getCharacter() + ((OctaveToken)$5).toString().length()); }
        ;

function_declare_rhs
        : IDENTIFIER 
        	{ $$ = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)$1), new OctaveASTListNode()); }
        | IDENTIFIER LPAREN RPAREN
        	{ $$ = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)$1), new OctaveASTListNode()); 
        		((ASTNode)$$).setEnd(((OctaveToken)$3).getCharacter() + ((OctaveToken)$3).toString().length()); }        	 
        | IDENTIFIER LPAREN identifier_list RPAREN 
        	{ $$ = new OctaveFunctionDeclaration(new OctaveIdentifier((OctaveToken)$1), (OctaveASTListNode)$3);
        		((ASTNode)$$).setEnd(((OctaveToken)$4).getCharacter() + ((OctaveToken)$4).toString().length()); }         	
        ;

function_declare
        : function_declare_rhs
        	{ $$ = $1;
        	  lexer.disableVarArgOut();
			  lexer.disableVarArgIn(); }
        | IDENTIFIER ASSIGN function_declare_rhs
        	{ OctaveASTListNode list = new OctaveASTListNode(); 
				list.addNode(
					new OctaveIdentifier((OctaveToken)$1));
        		((OctaveFunctionDeclaration)$3).setReturnList(list); 
        		$$ = $3;
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        		((ASTNode)$$).setEnd(((ASTNode)$3).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
        | VARARGOUT ASSIGN function_declare_rhs
        	{ OctaveASTListNode list = new OctaveASTListNode(); 
        		((OctaveFunctionDeclaration)$3).setReturnList(list);
        		$$ = $3;
        		((ASTNode)$$).setStart(((OctaveToken)$1).getCharacter());
        		((ASTNode)$$).setEnd(((ASTNode)$3).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }
        | func_return_list ASSIGN function_declare_rhs
        	{ ((OctaveFunctionDeclaration)$3).setReturnList((OctaveASTListNode)$1); 
        		$$ = $3;
        		((ASTNode)$$).setStart(((ASTNode)$1).sourceStart());
        		((ASTNode)$$).setEnd(((ASTNode)$3).sourceEnd());
        		lexer.disableVarArgOut();
			    lexer.disableVarArgIn(); }        
        ;
      
%%

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
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
  