package com.mozu.base.models;

public class AppInfo {
	private String NameSpace;
    private String Version;
    private String Package;
    private String buildVersion;
     
	public String getNameSpace() {
		return NameSpace;
	}
	public void setNameSpace(String nameSpace) {
		NameSpace = nameSpace;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public String getPackage() {
		return Package;
	}
	public void setPackage(String package1) {
		Package = package1;
	}
	public String getBuildVersion() {
		return buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}
     
	
	
     
}
