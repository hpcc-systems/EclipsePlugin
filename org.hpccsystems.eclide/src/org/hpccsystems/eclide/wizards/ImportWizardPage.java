/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.wizards;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.xml.rpc.ServiceException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.ui.PasswordFieldEditor;
import org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
import org.hpccsystems.ws.WsAttributes.ECLAttribute;
import org.hpccsystems.ws.WsAttributes.ECLModule;
import org.hpccsystems.ws.WsAttributes.GetAttribute;
import org.hpccsystems.ws.WsAttributes.GetAttributeResponse;
import org.hpccsystems.ws.WsAttributes.GetAttributes;
import org.hpccsystems.ws.WsAttributes.GetAttributesResponse;
import org.hpccsystems.ws.WsAttributes.GetModules;
import org.hpccsystems.ws.WsAttributes.GetModulesResponse;
import org.hpccsystems.ws.WsAttributes.WsAttributesLocator;
import org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoap;

public class ImportWizardPage extends WizardResourceImportPage {

	protected StringFieldEditor fIPText;
	protected StringFieldEditor fUserText;
	protected PasswordFieldEditor fPasswordText;

	public ImportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle(pageName); //NON-NLS-1
		setDescription(Messages.ImportWizardPage_0); //NON-NLS-1
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createAdvancedControls(org.eclipse.swt.widgets.Composite)
	 */	
	protected void createAdvancedControls(Composite parent) {
	}

	@Override
	protected void createSourceGroup(Composite parent) {
		Composite fileSelectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_HORIZONTAL);
		fileSelectionArea.setLayoutData(fileSelectionData);

		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns = 3;
		fileSelectionLayout.makeColumnsEqualWidth = false;
		fileSelectionLayout.marginWidth = 0;
		fileSelectionLayout.marginHeight = 0;
		fileSelectionArea.setLayout(fileSelectionLayout);

		fIPText = new StringFieldEditor("IPSelect", Messages.ImportWizardPage_2, fileSelectionArea); //$NON-NLS-1$
		fIPText.setStringValue(Messages.ImportWizardPage_3);
		fUserText = new StringFieldEditor("User", Messages.ImportWizardPage_5, fileSelectionArea); //$NON-NLS-1$
		fUserText.setStringValue(""); //$NON-NLS-1$
		fPasswordText = new PasswordFieldEditor("Password", Messages.ImportWizardPage_8, fileSelectionArea); //$NON-NLS-1$
		fPasswordText.setStringValue(""); //$NON-NLS-1$
	}

	@Override
	protected ITreeContentProvider getFileProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ITreeContentProvider getFolderProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	boolean doImport() {
		final IFolder targetFolder = Eclipse.getWorkspaceRoot().getFolder(getContainerFullPath());

		WsAttributesLocator locator = new WsAttributesLocator();
		try {
			final WsAttributesServiceSoap service = locator.getWsAttributesServiceSoap(new URL("http", fIPText.getStringValue(), 8145, "/WsAttributes")); //$NON-NLS-1$ //$NON-NLS-2$
			org.apache.axis.client.Stub stub = (org.apache.axis.client.Stub)service;
			stub.setUsername(fUserText.getStringValue());
			stub.setPassword(fPasswordText.getStringValue());
			GetModules request = new GetModules();
			final GetModulesResponse response = service.getModules(request);
			if (response.getOutModules() != null) {

				Job job = new Job(Messages.ImportWizardPage_12) {
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						monitor.beginTask(Messages.ImportWizardPage_13, response.getOutModules().length);
						for (final ECLModule module : response.getOutModules()) {
							if (module.getName().equalsIgnoreCase(Messages.ImportWizardPage_14)) {
								continue;
							}
							monitor.subTask(module.getName());

							GetAttributes request2 = new GetAttributes();
							request2.setModuleName(module.getName());
							try {
								GetAttributesResponse response2 = service.getAttributes(request2);
								if (response2.getOutAttributes() != null) {
									int MAX_THREAD = 5;
									ExecutorService threadPool = Executors.newFixedThreadPool(MAX_THREAD);
									for (final ECLAttribute attribute : response2.getOutAttributes()) {
										String modPath = attribute.getModuleName();
										modPath.replaceAll(".", "/"); //$NON-NLS-1$ //$NON-NLS-2$
										String attrPath = attribute.getName() + ".ecl"; //$NON-NLS-1$
										IPath targetPath = targetFolder.getLocation();
										IPath fullPath = targetPath.append(modPath + "/" + attrPath).makeAbsolute(); //$NON-NLS-1$
										final File targetFile = new File(fullPath.toOSString());

										try {
											targetFile.getParentFile().mkdirs(); 
											if (targetFile.createNewFile()) {
												threadPool.execute(new Runnable() {
													@Override
													public void run() {
														GetAttribute request3 = new GetAttribute();
														request3.setModuleName(module.getName());
														request3.setAttributeName(attribute.getName());
														request3.setGetText(true);
														try {
															GetAttributeResponse response3 = service.getAttribute(request3);
															if (response3.getOutAttribute() != null) {
																ECLAttribute attribute2 = response3.getOutAttribute();
																try {
																	FileWriter fstream = new FileWriter(targetFile);
																	BufferedWriter out = new BufferedWriter(fstream);
																	out.write(attribute2.getText());
																	out.flush();
																} catch (IOException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
																System.out.println(attribute2.getModuleName() + "." + attribute2.getName()); //$NON-NLS-1$
															}
														} catch (ArrayOfEspException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														} catch (RemoteException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
													}
												});
											}
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
									threadPool.shutdown();
									try {
										while(!threadPool.awaitTermination(300, TimeUnit.MILLISECONDS)) {
											if (monitor.isCanceled()) {
												threadPool.shutdownNow();											
												return Status.CANCEL_STATUS;
											}
										}
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									if (monitor.isCanceled()) {
										return Status.CANCEL_STATUS;
									}
								}
							} catch (ArrayOfEspException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								//return new Status();
							} catch (RemoteException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							monitor.worked(1);
						}
						return Status.OK_STATUS;
					}
				};
				job.schedule();
				return true;	
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayOfEspException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;	
	}
}
