package com.mozu.api;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.CustomerAuthenticator;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

public class MozuClient<TResult> {
    private static final ObjectMapper mapper = JsonUtils.initObjectMapper();

    static private HttpHost proxyHttpHost = HttpHelper.getProxyHost();

    private ApiContext apiContext = null;
    private String baseAddress = null;
    private HttpResponse httpResponseMessage = null;
    private String httpContent = null;
    private InputStream streamContent = null;
    private String verb = null;
    private MozuUrl resourceUrl = null;
    private HashMap<String, String> headers = new HashMap<String, String>();
    private final Class<TResult> responseType;

    public MozuClient() {
        this.responseType = null;
    }

    public MozuClient(Class<TResult> responseType) throws Exception {
        this.responseType = responseType;
    }

    public void setContext(ApiContext apiContext) {
        this.apiContext = apiContext;

        if (apiContext != null) {
            if (apiContext.getTenantId() > 0) {
                addHeader(Headers.X_VOL_TENANT, String.valueOf(apiContext.getTenantId()));
            }
    
            if (apiContext.getSiteId() != null && apiContext.getSiteId() > 0) {
                addHeader(Headers.X_VOL_SITE, String.valueOf(apiContext.getSiteId()));
            }
    
            if (apiContext.getMasterCatalogId() != null && apiContext.getMasterCatalogId() > 0) {
                addHeader(Headers.X_VOL_MASTER_CATALOG, String.valueOf(apiContext.getMasterCatalogId()));
            }
    
            if (apiContext.getCatalogId() != null && apiContext.getCatalogId() > 0) {
                addHeader(Headers.X_VOL_CATALOG, String.valueOf(apiContext.getCatalogId()));
            }
        }
    }

    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }

    public void addHeader(String header, String value) {
        headers.put(header, value);
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public void setResourceUrl(MozuUrl resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public <TBody> void setBody(TBody body) throws JsonProcessingException {
        httpContent = mapper.writeValueAsString(body);
    }

    public void setBody(InputStream body) throws JsonProcessingException {
        streamContent = body;
    }

    public void setBody(String body) {
        httpContent = body;
    }

    public String getStringResult() throws Exception {
        return stringContent();
    }

    @SuppressWarnings("unchecked")
    public TResult getResult() throws Exception {
        TResult tResult = null;
        if (responseType != null) {
            String className = responseType.getName();
            if (className.equals(java.io.InputStream.class.getName())) {
                tResult = (TResult) httpResponseMessage.getEntity().getContent();
            } else {
                tResult = deserialize(getStringResult(), responseType);
            }
        }
        return tResult;
    }

    public HttpResponse getResponse() {
        return httpResponseMessage;
    }

    public BasicHttpEntityEnclosingRequest getRequest() throws Exception {
        return buildRequest();
    }

    protected void validateContext() throws Exception {
        if (resourceUrl.getLocation() == MozuUrl.UrlLocation.TENANT_POD) {
            if (apiContext == null || apiContext.getTenantId() <= 0)
                throw new ApiException("TenantId is missing");

            if (StringUtils.isBlank(apiContext.getTenantUrl())) {
                TenantResource tenantResource = new TenantResource();
                Tenant tenant = tenantResource.getTenant(apiContext.getTenantId());

                if (tenant == null)
                    throw new ApiException("Tenant " + apiContext.getTenantId() + " Not found");
                baseAddress = HttpHelper.getUrl(tenant.getDomain());
            } else {
                baseAddress = apiContext.getTenantUrl();
            }
        } else {
            if (StringUtils.isBlank(AppAuthenticator.getInstance().getBaseUrl()))
                throw new ApiException("Authentication.Instance.BaseUrl is missing");

            baseAddress = AppAuthenticator.getInstance().getBaseUrl();
        }
    }

    public void executeRequest() throws Exception {
        validateContext();

        HttpClient client = new DefaultHttpClient();
        BasicHttpEntityEnclosingRequest request = buildRequest();
        URL url = new URL(baseAddress);
        String hostNm = url.getHost();
        int port = url.getPort();
        String sche = url.getProtocol();
        HttpHost httpHost = new HttpHost(hostNm, port, sche);

        if (proxyHttpHost != null && StringUtils.isNotBlank(proxyHttpHost.getHostName())) {
            client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxyHttpHost);
        }

        httpResponseMessage = client.execute(httpHost, request);
        HttpHelper.ensureSuccess(httpResponseMessage, mapper);
    }

    private TResult deserialize(String jsonString, Class<TResult> cls) throws Exception {
        return mapper.readValue(jsonString, cls);
    }

    private String stringContent() throws Exception {
        HttpEntity httpEntity = httpResponseMessage.getEntity();
        InputStream stream = (InputStream) httpEntity.getContent();
        return org.apache.commons.io.IOUtils.toString(stream, "UTF-8");
    }

    private BasicHttpEntityEnclosingRequest buildRequest() throws Exception {
        String url = baseAddress + resourceUrl.getUrl();
        BasicHttpEntityEnclosingRequest request = new BasicHttpEntityEnclosingRequest(verb, url);

        if (verb.equals("POST") || verb.equals("PUT")) {
            if (StringUtils.isNotBlank(httpContent)) {
                StringEntity entity = new StringEntity(httpContent);
                request.setEntity(entity);
            } else if (this.streamContent != null) {
                InputStreamEntity entity = new InputStreamEntity(this.streamContent, -1);
                request.setEntity(entity);
            }
        }

        request.setHeader("Accept", "application/json");
        if (!headers.containsKey(Headers.CONTENT_TYPE)) {
            request.setHeader("Content-type", "application/json");
        }
        if (apiContext != null && apiContext.getUserAuthTicket() != null) {
            setUserClaims();
        }

        Iterator<Entry<String, String>> i = headers.entrySet().iterator();
        while (i.hasNext()) {
            Entry<String, String> header = i.next();
            request.addHeader(header.getKey(), header.getValue());
        }

        AppAuthenticator.addAuthHeader(request);
        request.addHeader(Headers.X_VOL_VERSION, Version.API_VERSION);

        return request;
    }

    private void setUserClaims() {
        AuthTicket newAuthTicket = null;
        if (apiContext.getUserAuthTicket().getScope() == AuthenticationScope.Customer)
            newAuthTicket = CustomerAuthenticator.ensureAuthTicket(apiContext.getUserAuthTicket());
        else
            newAuthTicket = UserAuthenticator.ensureAuthTicket(apiContext.getUserAuthTicket());
        if (newAuthTicket != null) {
            apiContext.getUserAuthTicket().setAccessToken(newAuthTicket.getAccessToken());
            apiContext.getUserAuthTicket().setAccessTokenExpiration(
                    newAuthTicket.getAccessTokenExpiration());
        }

        addHeader(Headers.X_VOL_USER_CLAIMS, apiContext.getUserAuthTicket().getAccessToken());
    }

    protected Map<String, String> getHeaders() {
        return headers;
    }
}
