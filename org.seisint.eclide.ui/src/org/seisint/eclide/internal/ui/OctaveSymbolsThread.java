package org.seisint.eclide.internal.ui;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.runtime.symbols.OctaveSymbolList;
import org.seisint.eclide.runtime.symbols.Symbol;
import org.seisint.eclide.runtime.symbols.SymbolSerializer;


public class OctaveSymbolsThread extends Thread {

	private static String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?>";
	private static String CONSOLE_SHELL_START = "<console><shell>";
	private static String CONSOLE_SHELL_END = "</shell></console>";

	private ServerSocket sSocket;

	public OctaveSymbolsThread(ServerSocket socket) {
		sSocket = socket;
	}

	public static List<Symbol> parseSymbolsXml(String xml) {
		List<Symbol> completions = new ArrayList<Symbol>();
		if (xml != null && xml.startsWith(XML_HEADER)) {
			xml = xml.substring(XML_HEADER.length());
			if (xml.startsWith(CONSOLE_SHELL_START) && 
					xml.endsWith(CONSOLE_SHELL_END)) 
			{
				xml = xml.substring(CONSOLE_SHELL_START.length(), 
						xml.length() - CONSOLE_SHELL_END.length());			
				completions.addAll(SymbolSerializer.deserializeFromString(xml));
			}
		}
		return completions;
	}
	
	protected String readFixed(int len, InputStream input)
			throws IOException {
		byte[] buffer = new byte[len];
		int from = 0;
		try {
			while (from < buffer.length) {
				int n;
				try {
					n = input.read(buffer, from, buffer.length - from);
				} catch (SocketTimeoutException sxcn) {
					n = input.read(buffer, from, buffer.length - from);
				}
				if (n == -1) {
					return null;
				}
				from += n;
			}
		} catch (SocketTimeoutException sxcn) {
			sxcn.printStackTrace();
		}

		return new String(buffer, 0, from, "UTF-8"); //$NON-NLS-1$
	}

	protected int readLength(InputStream input) throws IOException {
		try {
			String readFixed = readFixed(10, input);
			return Integer.parseInt(readFixed);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	protected String readResponse(InputStream input) throws IOException {
		int len = readLength(input);
		if (len == -1) {
			return null;
		}

		String xml = readFixed(len, input);

		if (xml == null) {
			return null;
		}

		return xml;
	}

	public void run() {
		while (isRun() && !sSocket.isClosed()) {
			Socket clientSocket = null;
			try {
				long type = Symbol.USER_VARIABLE;
				clientSocket = sSocket.accept();
				while (clientSocket.isConnected())
				{
					String xml = readResponse(clientSocket.getInputStream());
					OctaveSymbolList list = OctclipsePlugin.getSymbolList();
					List symbols = parseSymbolsXml(xml);
					for (Iterator it = symbols.iterator(); it.hasNext();) {
						Symbol s = (Symbol)it.next();
						String typeName = s.getTypeName();
						if ("built-in function".equals(typeName))
						{
							type |= Symbol.BUILTIN_FUNCTION;
						}
						else if ("user function".equals(typeName))
						{
							type |= Symbol.USER_FUNCTION;
						}
					}
					list.clearSymbolsNoUpdate(type);
					list.updateSymbolsFromRuntime(symbols, type);
					type = Symbol.USER_VARIABLE;
				}
			} catch (Exception e) {
			}
		}
	}

	private boolean isRun() {
		return true;
	}

}
