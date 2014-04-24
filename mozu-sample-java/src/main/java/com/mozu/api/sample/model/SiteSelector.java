package com.mozu.api.sample.model;

public class SiteSelector {
    private String tenant;
    private String site;
    public String getTenant () {
        return tenant;
    }
    public void setTenant(String tenant) {
        this.tenant = tenant;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
}
