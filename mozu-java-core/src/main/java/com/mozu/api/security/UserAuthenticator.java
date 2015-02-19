package com.mozu.api.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.NotImplementedException;
import org.joda.time.DateTime;

import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuConfig;
import com.mozu.api.contracts.adminuser.DeveloperAccount;
import com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket;
import com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl;
import com.mozu.api.urls.platform.developer.DeveloperAdminUserAuthTicketUrl;

public class UserAuthenticator {
    public static AuthenticationProfile setActiveScope(AuthTicket authTicket, Scope scope) {
        return refreshUserAuthTicket(authTicket, scope.getId());
    }

    public static AuthTicket ensureAuthTicket(AuthTicket authTicket) {
        DateTime accessTokenDateTime = new DateTime(authTicket.getAccessTokenExpiration()).minus(180000);
        if (accessTokenDateTime.isBeforeNow())
            return refreshUserAuthTicket(authTicket).getAuthTicket();

        return null;
    }

    public static AuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket) {
        return refreshUserAuthTicket(authTicket, null);
    }

    @SuppressWarnings("unchecked")
    public static AuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket, Integer id)
            throws ApiException {

        String resourceUrl = MozuConfig.getBaseUrl()
                + getResourceRefreshUrl(authTicket, id);
        
        AuthenticationProfile userProfile = null;
        Map<String, String> headers = new HashMap<String, String>();
        
        switch (authTicket.getScope()) {
        case Tenant:
            TenantAdminUserAuthTicket tenantAdminUserAuthTicket = null;
            MozuClient<TenantAdminUserAuthTicket> tenantClient;
            try {
                tenantClient = (MozuClient<TenantAdminUserAuthTicket>) MozuClientFactory.getInstance(TenantAdminUserAuthTicket.class);
            } catch (Exception ioe) {
                throw new ApiException("Exception occurred while authenticating application: "
                        + ioe.getMessage());
            }
            headers.put(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
            tenantAdminUserAuthTicket = tenantClient.executePutRequest(authTicket, resourceUrl.toString(), headers);
            userProfile = getTenantUserProfile(tenantAdminUserAuthTicket, authTicket.getScope());
            break;
        case Developer:
            DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = null;
            MozuClient<DeveloperAdminUserAuthTicket> devClient;
            try {
                devClient = (MozuClient<DeveloperAdminUserAuthTicket>) MozuClientFactory.getInstance(DeveloperAdminUserAuthTicket.class);
            } catch (Exception ioe) {
                throw new ApiException("Exception occurred while authenticating application: "
                        + ioe.getMessage());
            }
            headers.put(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
            developerAdminUserAuthTicket = devClient.executePutRequest(authTicket, resourceUrl.toString(), headers);
            userProfile = getDeveloperUserProfile(developerAdminUserAuthTicket, authTicket.getScope());
            break;
        default:
            break;
        }

        AuthenticationProfile userInfo = setUserAuth(userProfile, authTicket.getScope(), null);

        return userInfo;
    }
    public static AuthenticationProfile authenticate(UserAuthInfo userAuthInfo, AuthenticationScope scope) {
        return authenticate(userAuthInfo, scope, null);
    }

    public static AuthenticationProfile authenticate(UserAuthInfo userAuthInfo, AuthenticationScope scope, Integer id) {
        return authenticate(userAuthInfo, scope, id, null);
    }
    
    @SuppressWarnings("unchecked")
    public static AuthenticationProfile authenticate(UserAuthInfo userAuthInfo, AuthenticationScope scope, Integer id, Integer siteId) {
        String resourceUrl = MozuConfig.getBaseUrl()
                + getResourceUrl(scope, id); // AuthTicketUrl.AuthenticateAppUrl();

        AuthenticationProfile userProfile = null;
        Map<String, String> headers = new HashMap<String, String>();
        
        switch (scope) {
        case Tenant:
            TenantAdminUserAuthTicket tenantAdminUserAuthTicket = null;
            MozuClient<TenantAdminUserAuthTicket> tenantClient;
            try {
                tenantClient = (MozuClient<TenantAdminUserAuthTicket>) MozuClientFactory.getInstance(TenantAdminUserAuthTicket.class);
            } catch (Exception ioe) {
                throw new ApiException("Exception occurred while authenticating application: "
                        + ioe.getMessage());
            }
            headers.put(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
            if (siteId != null) {
                headers.put(Headers.X_VOL_SITE, siteId.toString());
            }
            tenantAdminUserAuthTicket = tenantClient.executePostRequest(userAuthInfo, resourceUrl.toString(), headers);
            userProfile = getTenantUserProfile(tenantAdminUserAuthTicket, scope);
            break;
        case Developer:
            DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = null;
            MozuClient<DeveloperAdminUserAuthTicket> devClient;
            try {
                devClient = (MozuClient<DeveloperAdminUserAuthTicket>) MozuClientFactory.getInstance(DeveloperAdminUserAuthTicket.class);
            } catch (Exception ioe) {
                throw new ApiException("Exception occurred while authenticating application: "
                        + ioe.getMessage());
            }
            headers.put(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
            if (siteId != null) {
                headers.put(Headers.X_VOL_SITE, siteId.toString());
            }
            developerAdminUserAuthTicket = devClient.executePostRequest(userAuthInfo, resourceUrl.toString(), headers);
            userProfile = getDeveloperUserProfile(developerAdminUserAuthTicket, scope);
            break;
        default:
            break;
        }

        AuthenticationProfile userInfo = setUserAuth(userProfile, scope, siteId);
        return userInfo;
    }
    
    public static void logout(AuthTicket authTicket) {
        String resourceUrl = MozuConfig.getBaseUrl()
                + getLogoutUrl(authTicket);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
        
        MozuClient<?> client;
        try {
            client = MozuClientFactory.getInstance();
        } catch (Exception ioe) {
            throw new ApiException("Exception occurred while authenticating application: "
                    + ioe.getMessage());
        }
        headers.put(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
        client.executeDeleteRequest(resourceUrl, headers);
    }

    private static AuthenticationProfile setUserAuth(AuthenticationProfile userProfile, AuthenticationScope userScope, Integer siteId) {

        if (userProfile!=null) {
            AuthTicket authTicket = userProfile.getAuthTicket();
            if (authTicket!=null) {
                    authTicket.setSiteId(siteId);
            } else {
                throw new ApiException("Exception setting user auth, auth ticket not found");
            }
        }
        
        return userProfile;
    }

    private static AuthenticationProfile getTenantUserProfile(TenantAdminUserAuthTicket tenantAdminUserAuthTicket, AuthenticationScope userScope) {

        Scope activeScope = null;
        if (tenantAdminUserAuthTicket.getTenant() != null) {
            activeScope = new Scope(tenantAdminUserAuthTicket.getTenant().getId(),
                    tenantAdminUserAuthTicket.getTenant().getName());
        }
        AuthTicket authTicket = new AuthTicket(tenantAdminUserAuthTicket.getAccessToken(),tenantAdminUserAuthTicket.getAccessTokenExpiration(),
                tenantAdminUserAuthTicket.getRefreshToken(), tenantAdminUserAuthTicket
                        .getRefreshTokenExpiration(), userScope);
        List<Scope> availableScopes = new ArrayList<Scope>();
        if (tenantAdminUserAuthTicket.getAvailableTenants() != null) {
            for (Tenant tenant : tenantAdminUserAuthTicket.getAvailableTenants()) {
                availableScopes.add(new Scope(tenant.getId(), tenant.getName()));
            }
        }
        return new AuthenticationProfile(authTicket, availableScopes, activeScope, tenantAdminUserAuthTicket.getUser());
    }

    private static AuthenticationProfile getDeveloperUserProfile(DeveloperAdminUserAuthTicket developerAdminUserAuthTicket, AuthenticationScope userScope) {
        Scope activeScope = null;
        if (developerAdminUserAuthTicket.getAccount() != null) {
            activeScope = new Scope(developerAdminUserAuthTicket.getAccount().getId(),
                    developerAdminUserAuthTicket.getAccount().getName());
        }
        AuthTicket authTicket = new AuthTicket(developerAdminUserAuthTicket.getAccessToken(),
                developerAdminUserAuthTicket.getAccessTokenExpiration(),
                developerAdminUserAuthTicket.getRefreshToken(), developerAdminUserAuthTicket.getRefreshTokenExpiration(),
                userScope);
        List<Scope> availableScopes = new ArrayList<Scope>();
        if (developerAdminUserAuthTicket.getAvailableAccounts() != null) {
            for (DeveloperAccount devAcct : developerAdminUserAuthTicket.getAvailableAccounts()) {
                availableScopes.add(new Scope(devAcct.getId(), devAcct.getName()));
            }
        }
        return new AuthenticationProfile(authTicket, availableScopes, activeScope, developerAdminUserAuthTicket.getUser());
    }

    private static String getResourceRefreshUrl(AuthTicket authTicket, Integer id) {
        switch (authTicket.getScope()) {
        case Tenant:
            return TenantAdminUserAuthTicketUrl.refreshAuthTicketUrl(null, id).getUrl();
        case Developer:
            return DeveloperAdminUserAuthTicketUrl.refreshDeveloperAuthTicketUrl(id, null).getUrl();
        default:
            throw new NotImplementedException("Invalid User Scope.");
        }
    }

    private static String getResourceUrl(AuthenticationScope scope, Integer id) {
        switch (scope) {
        case Tenant:
            return TenantAdminUserAuthTicketUrl.createUserAuthTicketUrl(null, id).getUrl();
        case Developer:
            return DeveloperAdminUserAuthTicketUrl.createDeveloperUserAuthTicketUrl(id, null).getUrl();
        default:
            throw new NotImplementedException("Invalid User Scope.");
        }
    }

    private static String getLogoutUrl(AuthTicket ticket)
    {
        switch (ticket.getScope())
        {
            case Tenant:
                return TenantAdminUserAuthTicketUrl.deleteUserAuthTicketUrl(ticket.getRefreshToken()).getUrl();
            case Developer:
                return DeveloperAdminUserAuthTicketUrl.deleteUserAuthTicketUrl(ticket.getRefreshToken()).getUrl();
            default:
                throw new NotImplementedException("Invalid User Scope.");
        }
    }
}
