package org.hpccsystems.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import org.eclipse.ui.console.MessageConsoleStream;

public class CmdArgs {
	String cmd;
	String baseArgs;
	String QUOTE = "";
	protected Map<String, Set<String> > args;
	
	public CmdArgs(String cmd, String baseArgs) {
		QUOTE = OS.isWindowsPlatform() ? "\"" : "";

		this.cmd = cmd;
		this.baseArgs = baseArgs;
		args = new TreeMap<String, Set<String>>();
	}
	
	public void Append(String key) {
		if (!args.containsKey(key))
			args.put(key, new HashSet<String>());
	}

	public void Append(String key, String value) {
		if (!args.containsKey(key))
			args.put(key, new HashSet<String>());
		
		args.get(key).add(value);
	}
	
	public List<String> Get(boolean eclplusArgs) {
		List<String> retVal = new Vector<String>();
		retVal.add(cmd);
		retVal.add(baseArgs);
		for(Map.Entry<String, Set<String> > entry : args.entrySet()) {
			Set<String> values = entry.getValue();
			if (values.isEmpty())
				retVal.add(eclplusArgs ? entry.getKey() : "-" + entry.getKey());
			else {
				Iterator<String> iter = values.iterator();
			    while (iter.hasNext()) {
			    	String value = QUOTE + iter.next() + QUOTE;
					retVal.add(eclplusArgs ? entry.getKey() + "=" + value : "-" + entry.getKey() + value);
				}
			}
		}			

		return retVal;
	}
	
	public void Print(MessageConsoleStream console, boolean eclplusArgs) {
		List<String> cmd = Get(eclplusArgs);
		for (int i = 0; i < cmd.size(); ++i) {
			if (i> 0)
				console.print(" ");
			console.print(cmd.get(i));
		}
	}
}

