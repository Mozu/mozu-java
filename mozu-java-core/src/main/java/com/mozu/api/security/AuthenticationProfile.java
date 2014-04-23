package com.mozu.api.security;

import java.util.List;

import com.mozu.api.contracts.core.UserProfile;
import com.mozu.api.contracts.customer.CustomerAccount;

public class AuthenticationProfile {
    private AuthTicket authTicket;
    private List<Scope> authorizedScopes;
    private Scope activeScope;
    private UserProfile userProfile;
    
    public AuthenticationProfile () {
        
    }
    
    public AuthenticationProfile (AuthTicket authTicket, List<Scope> authorizedScope, Scope activeScope,
            UserProfile userProfile) {
        this.authTicket = authTicket;
        this.authorizedScopes = authorizedScope;
        this.activeScope = activeScope;
        this.userProfile = userProfile;
    }
    
    public AuthTicket getAuthTicket() {
        return authTicket;
    }
    public void setAuthTicket(AuthTicket authTicket) {
        this.authTicket = authTicket;
    }
    public List<Scope> getAuthorizedScopes() {
        return authorizedScopes;
    }
    public void setAuthorizedScopes(List<Scope> authorizedScopes) {
        this.authorizedScopes = authorizedScopes;
    }
    public Scope getActiveScope() {
        return activeScope;
    }
    public void setActiveScope(Scope activeScope) {
        this.activeScope = activeScope;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

}
