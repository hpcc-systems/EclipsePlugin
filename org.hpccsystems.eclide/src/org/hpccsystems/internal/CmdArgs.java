/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

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

