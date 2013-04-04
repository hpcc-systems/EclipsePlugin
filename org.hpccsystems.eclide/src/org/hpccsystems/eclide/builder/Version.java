package org.hpccsystems.eclide.builder;

public class Version implements Comparable<Version> {
	public String versionString = ""; 
	public String prefix = ""; 
	public int major = 0; 
	public int minor = 0; 
	public int point = 0; 
	public String postfix = "";
	
	public Version(String versionString) {
		//3.6.1
		//community_3.10.0-7rc
		this.versionString = versionString;
		String[] parts = versionString.split("(_|-)");
		if (parts.length == 1) {
			calcVersion(parts[0]);
		} else if (parts.length >= 3) {
			prefix = parts[0];
			calcVersion(parts[1]);
			postfix = parts[2];
		}
	}
	
	void calcVersion(String version) {
		major = 0;
		minor = 0;
		point = 0;
		try {
			String[] parts = version.split("\\.");
			if (parts.length >= 1) {
				major = Integer.parseInt(parts[0]);
			}
			if (parts.length >= 2) {
				minor = Integer.parseInt(parts[1]);
			}
			if (parts.length >= 3) {
				point = Integer.parseInt(parts[2]);
			}
		} catch (Exception e) {
		}
	}

	@Override
	public String toString() {
		return versionString;
	}
	
	@Override
	public int compareTo(Version other) {
		if (other.major < major) 
			return -1;
		else if (other.major > major)
			return 1;
		
		if (other.minor < minor) 
			return -1;
		else if (other.minor > minor)
			return 1;
		
		if (other.point < point) 
			return -1;
		else if (other.point > point)
			return 1;
		
		int retVal = other.postfix.compareTo(postfix);
		if (retVal != 0)
			return retVal;

		retVal = other.prefix.compareTo(prefix);
		if (retVal != 0)
			return retVal;

		return 0;
	}
}