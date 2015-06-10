package com.mozu.api.security;

import java.util.Date;

import org.joda.time.DateTime;

public class AuthTicket extends com.mozu.api.contracts.appdev.AuthTicket {
    private static final long serialVersionUID = 1L;
    
    private AuthenticationScope userScope;
    private Integer siteId = null;
    
    public AuthTicket () {
        super();
    }

    public AuthTicket(String accessToken, DateTime accessTokenExpiration, String refreshToken, DateTime refreshTokeExpiration, AuthenticationScope userScope) {
        this.accessToken = accessToken;
        this.accessTokenExpiration = accessTokenExpiration;
        this.refreshToken = refreshToken;
        this.refreshTokenExpiration = refreshTokeExpiration;
        this.userScope = userScope;
    }
    
    public AuthTicket(String accessToken, Date accessTokenExpiration, String refreshToken, Date refreshTokeExpiration, AuthenticationScope userScope) {
        this.accessToken = accessToken;
        this.accessTokenExpiration = new DateTime(accessTokenExpiration);
        this.refreshToken = refreshToken;
        this.refreshTokenExpiration = new DateTime (refreshTokeExpiration);
        this.userScope = userScope;
    }

    
    public AuthenticationScope getScope() {
        return userScope;
    }
    public void setScope(AuthenticationScope scope) {
        this.userScope = scope;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }
    
}
