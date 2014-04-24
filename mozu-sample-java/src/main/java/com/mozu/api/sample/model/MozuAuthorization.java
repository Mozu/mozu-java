package com.mozu.api.sample.model;

public class MozuAuthorization {
    private String environment = null;
    private String appId = null;
    private String sharedSecret = null;
    private String email = null;
    private String password = null;
    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getSharedSecret() {
        return sharedSecret;
    }
    public void setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
