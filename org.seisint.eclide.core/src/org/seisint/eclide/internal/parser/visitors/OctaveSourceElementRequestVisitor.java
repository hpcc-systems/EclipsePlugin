<<<<<<< HEAD
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
package org.seisint.eclide.internal.parser.visitors;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.compiler.SourceElementRequestVisitor;
import org.seisint.eclide.ast.OctaveASTConstants;
import org.seisint.eclide.ast.OctaveAnonFunctionHandleExpression;
import org.seisint.eclide.ast.OctaveAssignmentLHSExpression;
import org.seisint.eclide.ast.OctaveIdentifier;
import org.seisint.eclide.ast.OctaveSymbolCallExpression;
import org.seisint.eclide.ast.OctaveSymbolReference;
import org.seisint.eclide.ast.OctaveVariableDeclaration;
import org.seisint.eclide.ast.OctaveSymbolCallExpression.OctaveDotCallExpression;

public class OctaveSourceElementRequestVisitor extends
		SourceElementRequestVisitor {

	private int handleVariables = 0;
	private List<String> fields = new ArrayList<String>();
	OctaveSymbolCallExpression tmp = null;

	public OctaveSourceElementRequestVisitor(ISourceElementRequestor requesor) {
		super(requesor);
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public boolean visit(Statement statement) throws Exception {
		if (statement instanceof OctaveVariableDeclaration) {
			makeVariable(((OctaveVariableDeclaration)statement).getId(), 
					((OctaveVariableDeclaration)statement).getModifiers());
		} 
		return super.visit(statement);
	}
	
	private OctaveIdentifier getStructElmtId(ASTNode node) {
		OctaveIdentifier oi = null;
		if (node instanceof OctaveSymbolReference) {
			oi = ((OctaveSymbolReference)node).getId();
		} else if (node instanceof OctaveIdentifier) {
			oi = (OctaveIdentifier)node;
		} else if (node instanceof OctaveSymbolCallExpression) {
			ASTNode rcvr = ((OctaveSymbolCallExpression)node).getReceiver();
			oi = getStructElmtId(rcvr);
		} 
		return oi;
	}
	
	private void makeStruct(OctaveDotCallExpression expr) throws Exception
	{
		ISourceElementRequestor.FieldInfo fi = new ISourceElementRequestor.FieldInfo();
		ASTNode node = expr.getReceiver();
		OctaveIdentifier oi = getStructElmtId(node);
		if (oi == null) {
			return;
		}
		fi.name = oi.getText();
		fi.nameSourceStart = oi.sourceStart();
		fi.nameSourceEnd = oi.sourceEnd() - 1;
		fi.declarationStart = oi.sourceStart();
		fi.modifiers = OctaveASTConstants.ASSIGN_ST;
		fRequestor.enterField(fi);
		expr.setSkipReceiver(true);
	}

	private void makeVariable(OctaveIdentifier i, int modifier) {
		String name = i.getText();
		int start = 0;
		int end = 0;
		if (name != null) {
			start = i.sourceStart();
			end = i.sourceEnd();
			if (!fields.contains(name))
			{
				ISourceElementRequestor.FieldInfo fi = new ISourceElementRequestor.FieldInfo();
				fi.name = name;
				fi.nameSourceStart = start;
				fi.nameSourceEnd = end - 1;
				fi.declarationStart = start;
				fi.modifiers = modifier;
				fRequestor.exitField(end);
				fields.add(name);
			} else {
				fRequestor.acceptFieldReference(name, start);
			}
		}
	}

	private void makeAnonFunction(
			OctaveAnonFunctionHandleExpression expression) {
			List args = expression.getChilds();
			String[] parameter = new String[args.size()-1];
			for (int a = 0; a < args.size()-1; a++) {
				ASTNode arg = (ASTNode) args.get(a);
				parameter[a] = arg.toString();
			}
			ISourceElementRequestor.MethodInfo mi = new ISourceElementRequestor.MethodInfo();
			mi.parameterNames = parameter;
			mi.name = expression.getName();
			mi.modifiers = Modifiers.AccDefault;
			mi.nameSourceStart = expression.sourceStart();
			mi.nameSourceEnd = expression.sourceEnd();
			mi.declarationStart = expression.sourceStart();
			fRequestor.enterMethod(mi);
			fRequestor.exitMethod(expression.sourceEnd());
		}
	
	public boolean visit(Expression expression) throws Exception {
		if (expression instanceof OctaveSymbolReference) {
			if (handleVariables > 0)
				makeVariable(((OctaveSymbolReference)expression).getId(),
						Modifiers.AccDefault);
		} else if (expression instanceof OctaveDotCallExpression) {
			if (handleVariables > 0) 
				makeStruct((OctaveDotCallExpression) expression);
		} else if (expression instanceof OctaveAnonFunctionHandleExpression) {
			makeAnonFunction((OctaveAnonFunctionHandleExpression)expression);
		} else if (expression instanceof OctaveAssignmentLHSExpression) {
			handleVariables++;
		} else if (expression instanceof OctaveSymbolCallExpression) {
			OctaveSymbolCallExpression methOrArr = (OctaveSymbolCallExpression)expression;
			if (methOrArr.getReceiver() instanceof OctaveSymbolReference)
			{
				OctaveSymbolReference sym = (OctaveSymbolReference)methOrArr.getReceiver();
				if (!isField(sym.getName())) {
					fRequestor.acceptMethodReference(methOrArr.getName(), 
							methOrArr.getArgs().getChilds().size(), methOrArr
							.sourceStart(), methOrArr.sourceEnd());
				} else {
					fRequestor.acceptFieldReference(methOrArr.getName(), 
							methOrArr.sourceStart());
				}
			}
		}
		return super.visit(expression);
	}
	
	private boolean isField(String name) {
		if (fields.contains(name))
			return true;
		return false;
	}

	public boolean endvisit(Expression expression) throws Exception {
		if (expression instanceof OctaveDotCallExpression) {
			fRequestor.exitField(((OctaveDotCallExpression)expression).getArgs().sourceEnd());
			((OctaveDotCallExpression)expression).setSkipReceiver(false);
		} else if (expression instanceof OctaveAssignmentLHSExpression) {
			handleVariables--;
		}
		return super.endvisit(expression);
	}

	public boolean visit(ModuleDeclaration declaration) throws Exception {
		return super.visit(declaration);
	}
	
	

}
=======
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
package org.seisint.eclide.internal.parser.visitors;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.compiler.SourceElementRequestVisitor;
import org.seisint.eclide.ast.OctaveASTConstants;
import org.seisint.eclide.ast.OctaveAnonFunctionHandleExpression;
import org.seisint.eclide.ast.OctaveAssignmentLHSExpression;
import org.seisint.eclide.ast.OctaveIdentifier;
import org.seisint.eclide.ast.OctaveSymbolCallExpression;
import org.seisint.eclide.ast.OctaveSymbolReference;
import org.seisint.eclide.ast.OctaveVariableDeclaration;
import org.seisint.eclide.ast.OctaveSymbolCallExpression.OctaveDotCallExpression;

public class OctaveSourceElementRequestVisitor extends
		SourceElementRequestVisitor {

	private int handleVariables = 0;
	private List<String> fields = new ArrayList<String>();
	OctaveSymbolCallExpression tmp = null;

	public OctaveSourceElementRequestVisitor(ISourceElementRequestor requesor) {
		super(requesor);
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public boolean visit(Statement statement) throws Exception {
		if (statement instanceof OctaveVariableDeclaration) {
			makeVariable(((OctaveVariableDeclaration)statement).getId(), 
					((OctaveVariableDeclaration)statement).getModifiers());
		} 
		return super.visit(statement);
	}
	
	private OctaveIdentifier getStructElmtId(ASTNode node) {
		OctaveIdentifier oi = null;
		if (node instanceof OctaveSymbolReference) {
			oi = ((OctaveSymbolReference)node).getId();
		} else if (node instanceof OctaveIdentifier) {
			oi = (OctaveIdentifier)node;
		} else if (node instanceof OctaveSymbolCallExpression) {
			ASTNode rcvr = ((OctaveSymbolCallExpression)node).getReceiver();
			oi = getStructElmtId(rcvr);
		} 
		return oi;
	}
	
	private void makeStruct(OctaveDotCallExpression expr) throws Exception
	{
		ISourceElementRequestor.FieldInfo fi = new ISourceElementRequestor.FieldInfo();
		ASTNode node = expr.getReceiver();
		OctaveIdentifier oi = getStructElmtId(node);
		if (oi == null) {
			return;
		}
		fi.name = oi.getText();
		fi.nameSourceStart = oi.sourceStart();
		fi.nameSourceEnd = oi.sourceEnd() - 1;
		fi.declarationStart = oi.sourceStart();
		fi.modifiers = OctaveASTConstants.ASSIGN_ST;
		fRequestor.enterField(fi);
		expr.setSkipReceiver(true);
	}

	private void makeVariable(OctaveIdentifier i, int modifier) {
		String name = i.getText();
		int start = 0;
		int end = 0;
		if (name != null) {
			start = i.sourceStart();
			end = i.sourceEnd();
			if (!fields.contains(name))
			{
				ISourceElementRequestor.FieldInfo fi = new ISourceElementRequestor.FieldInfo();
				fi.name = name;
				fi.nameSourceStart = start;
				fi.nameSourceEnd = end - 1;
				fi.declarationStart = start;
				fi.modifiers = modifier;
				fRequestor.exitField(end);
				fields.add(name);
			} else {
				fRequestor.acceptFieldReference(name, start);
			}
		}
	}

	private void makeAnonFunction(
			OctaveAnonFunctionHandleExpression expression) {
			List args = expression.getChilds();
			String[] parameter = new String[args.size()-1];
			for (int a = 0; a < args.size()-1; a++) {
				ASTNode arg = (ASTNode) args.get(a);
				parameter[a] = arg.toString();
			}
			ISourceElementRequestor.MethodInfo mi = new ISourceElementRequestor.MethodInfo();
			mi.parameterNames = parameter;
			mi.name = expression.getName();
			mi.modifiers = Modifiers.AccDefault;
			mi.nameSourceStart = expression.sourceStart();
			mi.nameSourceEnd = expression.sourceEnd();
			mi.declarationStart = expression.sourceStart();
			fRequestor.enterMethod(mi);
			fRequestor.exitMethod(expression.sourceEnd());
		}
	
	public boolean visit(Expression expression) throws Exception {
		if (expression instanceof OctaveSymbolReference) {
			if (handleVariables > 0)
				makeVariable(((OctaveSymbolReference)expression).getId(),
						Modifiers.AccDefault);
		} else if (expression instanceof OctaveDotCallExpression) {
			if (handleVariables > 0) 
				makeStruct((OctaveDotCallExpression) expression);
		} else if (expression instanceof OctaveAnonFunctionHandleExpression) {
			makeAnonFunction((OctaveAnonFunctionHandleExpression)expression);
		} else if (expression instanceof OctaveAssignmentLHSExpression) {
			handleVariables++;
		} else if (expression instanceof OctaveSymbolCallExpression) {
			OctaveSymbolCallExpression methOrArr = (OctaveSymbolCallExpression)expression;
			if (methOrArr.getReceiver() instanceof OctaveSymbolReference)
			{
				OctaveSymbolReference sym = (OctaveSymbolReference)methOrArr.getReceiver();
				if (!isField(sym.getName())) {
					fRequestor.acceptMethodReference(methOrArr.getName(), 
							methOrArr.getArgs().getChilds().size(), methOrArr
							.sourceStart(), methOrArr.sourceEnd());
				} else {
					fRequestor.acceptFieldReference(methOrArr.getName(), 
							methOrArr.sourceStart());
				}
			}
		}
		return super.visit(expression);
	}
	
	private boolean isField(String name) {
		if (fields.contains(name))
			return true;
		return false;
	}

	public boolean endvisit(Expression expression) throws Exception {
		if (expression instanceof OctaveDotCallExpression) {
			fRequestor.exitField(((OctaveDotCallExpression)expression).getArgs().sourceEnd());
			((OctaveDotCallExpression)expression).setSkipReceiver(false);
		} else if (expression instanceof OctaveAssignmentLHSExpression) {
			handleVariables--;
		}
		return super.endvisit(expression);
	}

	public boolean visit(ModuleDeclaration declaration) throws Exception {
		return super.visit(declaration);
	}
	
	

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
