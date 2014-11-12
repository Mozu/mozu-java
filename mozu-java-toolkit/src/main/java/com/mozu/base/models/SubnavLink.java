package com.mozu.base.models;

public class SubnavLink {
	
	private ExtensionParent parent;
	private String[] path;
	private String href;
	private String appId;
	private String windowTitle;
	
	public ExtensionParent getParentId() {
		return parent;
	}
	public void setParentId(ExtensionParent parent) {
		this.parent = parent;
	}
	public String[] getPath() {
		return path;
	}
	public void setPath(String[] strings) {
		this.path = strings;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getWindowTitle() {
		return windowTitle;
	}
	public void setWindowTitle(String windowTitle) {
		this.windowTitle = windowTitle;
	}
}
