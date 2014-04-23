package com.mozu.api;

public class MozuUrl {
    public enum UrlLocation {
        HOME_POD, TENANT_POD
    }

    public String url = null;
    public UrlLocation location = null;

    public MozuUrl() {
    }

    public MozuUrl(String url, UrlLocation location) {
        this.url = url.toLowerCase();
        this.location = location;
    }

   public String getUrl() {
        return url;
    }

    public UrlLocation getLocation() {
        return location;
    }

}
