/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.seisint.eclide.internal.console;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.console.ConsoleRequest;

public class OctaveScriptConsoleServer implements Runnable {

	public static final int DEFAULT_PORT = 25000;

	private static OctaveScriptConsoleServer instance;

	public static OctaveScriptConsoleServer getInstance() {
		if (instance == null) {
			instance = new OctaveScriptConsoleServer(DEFAULT_PORT);
		}
		return instance;
	}

	private final int port;

	private final Map<String, ConsoleRequest> handlers;

	protected OctaveScriptConsoleServer(int port) {
		this.port = port;

		handlers = new HashMap<String, ConsoleRequest>();

		(new Thread(this)).start();
	}

	public String register(ConsoleRequest request) {
		String id = new Long(System.currentTimeMillis()).toString();
		register(id, request);
		return id;
	}

	public void register(String id, ConsoleRequest request) {
		synchronized (handlers) {
			handlers.put(id, request);
			handlers.notifyAll();
		}
	}

	public int getPort() {
		return port;
	}

	public void run() {
		try {
			ServerSocket server = new ServerSocket(port);

			while (true) {
				final Socket client = server.accept();

				Thread clientHandler = new Thread(new Runnable() {
					public void run() {
						try {
							OctaveSocketScriptConsoleIO proxy = new OctaveSocketScriptConsoleIO(
									client);

							String id = proxy.getId();

							ConsoleRequest request = null;

							synchronized (handlers) {
								request = (ConsoleRequest) handlers.get(id);
								while (request == null) {
									try {
										handlers.wait();
									} catch (InterruptedException e) {

									}
								}

								handlers.remove(id);
							}

							request.consoleConnected(proxy);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});

				clientHandler.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
