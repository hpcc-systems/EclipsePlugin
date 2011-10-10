package org.hpccsystems.internal;

public class OS {
	public static final String WIN_ID = "Windows";
	
	public static boolean isWindowsPlatform()
    {
        String os = System.getProperty("os.name");
        if ( os != null && os.startsWith(WIN_ID))
            return true;
        else
            return false;
    }
}
