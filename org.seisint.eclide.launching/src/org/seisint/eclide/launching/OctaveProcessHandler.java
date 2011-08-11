/********************************************************************************
 * Copyright 2008 Jae Gangemi, with modifications (c) 2008 Ryan Rusaw
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 ********************************************************************************/
package org.seisint.eclide.launching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.launching.IScriptProcessHandler;
import org.seisint.eclide.core.OctclipsePlugin;

/**
 */
public class OctaveProcessHandler implements IScriptProcessHandler
{
    private final Object lock = new Object();

    public ScriptResult handle(Process process, char[] stdin) throws CoreException
    {
        ScriptOutputReader stdoutReader = new ScriptOutputReader(process.getInputStream());
        ScriptOutputReader stderrReader = new ScriptOutputReader(process.getErrorStream());

        Thread stdoutThread = new Thread(stdoutReader);
        Thread stderrThread = new Thread(stderrReader);

        stdoutThread.start();
        stderrThread.start();

        OutputStreamWriter stdinWriter = new OutputStreamWriter(process.getOutputStream());

        try
        {
        	if (stdin != null)
        	{
        		stdinWriter.write(new String(stdin));
        		stdinWriter.flush();
        	}
        }
        catch (IOException e)
        {
            throw new CoreException(new Status(Status.ERROR, OctclipsePlugin.PLUGIN_ID,
                    "unable to write to script stdout", e));
        }
        finally
        {
            closeWriter(stdinWriter);
        }

        synchronized (lock)
        {
            try
            {
                lock.wait();
                process.waitFor();
            }
            catch (InterruptedException e)
            {
                // do nothing
            }
        }

        process.destroy();

        return buildResult(process, stdoutReader, stderrReader);
    }

    private ScriptResult buildResult(Process process, ScriptOutputReader stdoutReader,
        ScriptOutputReader stderrReader)
    {
        ScriptResult result = new ScriptResult();
        result.exitValue = process.exitValue();

        result.stdout = stdoutReader.getBuffer();
        result.stderr = stderrReader.getBuffer();

        return result;
    }

    private void closeWriter(OutputStreamWriter writer)
    {
        if (writer != null)
        {
            try
            {
                writer.close();
            }
            catch (IOException e)
            {
                
            }
        }
    }

    /**
     */
    class ScriptOutputReader implements Runnable
    {
        private StringBuffer buffer = new StringBuffer();
        private InputStream stream;
        ScriptOutputReader(InputStream stream)
        {
            this.stream = stream;
        }
        public void run()
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

            try
            {
                int count = 0;
                char[] bytes = new char[1024];
                while ((count = reader.read(bytes)) >= 0)
                {
                    buffer.append(bytes, 0, count);
                }
                synchronized (lock)
                {
                    lock.notifyAll();
                }
            }
            catch (IOException e)
            {
                buffer.setLength(0);
            }
        }
        String getBuffer()
        {
            return buffer.toString();
        }
    }
}
