package com.mozu.api.security;

import org.joda.time.DateTime;

public class RefreshInterval {
    private long accessTokenExpirationInterval;
    private long refreshTokenExpirationInterval;
    private DateTime accessTokenExpiration;
    private DateTime refreshTokenExpiration;

    public RefreshInterval (long accessTokenExpirationInterval, long refreshTokenExpirationInterval) {
    	this.accessTokenExpirationInterval = accessTokenExpirationInterval;
    	this.refreshTokenExpirationInterval = refreshTokenExpirationInterval; 
    }
    
    public long getAccessTokenExpirationInterval() {
		return accessTokenExpirationInterval;
	}
	public void setAccessTokenExpirationInterval(long accessTokenExpirationInterval) {
		this.accessTokenExpirationInterval = accessTokenExpirationInterval;
	}
	public long getRefreshTokenExpirationInterval() {
		return refreshTokenExpirationInterval;
	}
	public void setRefreshTokenExpirationInterval(
			long refreshTokenExpirationInterval) {
		this.refreshTokenExpirationInterval = refreshTokenExpirationInterval;
	}
	public DateTime getAccessTokenExpiration() {
		return accessTokenExpiration;
	}
	public void setAccessTokenExpiration(DateTime accessTokenExpiration) {
		this.accessTokenExpiration = accessTokenExpiration;
	}
	public DateTime getRefreshTokenExpiration() {
		return refreshTokenExpiration;
	}
	public void setRefreshTokenExpiration(DateTime refreshTokenExpiration) {
		this.refreshTokenExpiration = refreshTokenExpiration;
	}
	
    public void updateExpirationDates(boolean updateRefreshTokenInterval)
    {
       setAccessTokenExpiration(new DateTime().plus(getAccessTokenExpirationInterval()));

       if (updateRefreshTokenInterval) {
           setRefreshTokenExpiration(new DateTime().plus(getRefreshTokenExpirationInterval()));
       }
    }
}
