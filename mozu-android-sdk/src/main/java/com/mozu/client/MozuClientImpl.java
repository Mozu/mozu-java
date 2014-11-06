package com.mozu.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiError;
import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuConfig;
import com.mozu.api.MozuUrl;
import com.mozu.api.ApiError.Item;
import com.mozu.api.Version;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.CustomerAuthenticator;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

@SuppressWarnings("deprecation")
public class MozuClientImpl<TResult> implements MozuClient<TResult> {

       private static final ObjectMapper mapper = JsonUtils.initObjectMapper();

//       static private HttpHost proxyHttpHost = HttpHelper.getProxyHost();

       private ApiContext apiContext = null;
       private String baseAddress = null;
       private HttpResponse httpResponseMessage = null;
       private String httpContent = null;
       private InputStream streamContent = null;
       private String verb = null;
       private MozuUrl resourceUrl = null;
       private HashMap<String, String> headers = new HashMap<String, String>();
       private final Class<TResult> responseType;

       public MozuClientImpl() {
           this.responseType = null;
       }

       public MozuClientImpl(Class<TResult> responseType) throws Exception {
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
               
               if (apiContext.getLocale() != null) {
                   addHeader(Headers.X_VOL_LOCALE, String.valueOf(apiContext.getLocale()));
               }
    
               if (apiContext.getCurrency() != null) {
                   addHeader(Headers.X_VOL_CURRENCY, String.valueOf(apiContext.getCurrency()));
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
               AppAuthenticator appAuthenticator = AppAuthenticator.getInstance();
               if (appAuthenticator == null) {
                   throw new ApiException("Application has not been authorized to access Mozu.");
               } else if (StringUtils.isBlank(MozuConfig.getBaseUrl())) {
                   throw new ApiException("Authentication.Instance.BaseUrl is missing");
               }

               baseAddress = MozuConfig.getBaseUrl();
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

//           if (proxyHttpHost != null && StringUtils.isNotBlank(proxyHttpHost.getHostName())) {
//               client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxyHttpHost);
//           }

           httpResponseMessage = client.execute(httpHost, request);
           ensureSuccess(httpResponseMessage, mapper);
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
                   StringEntity entity = new StringEntity(httpContent, Consts.UTF_8);
                   request.setEntity(entity);
               } else if (this.streamContent != null) {
                   InputStreamEntity entity = new InputStreamEntity(this.streamContent, -1);
                   request.setEntity(entity);
               }
           }

           request.setHeader("Accept", "application/json");
           if (!headers.containsKey(Headers.CONTENT_TYPE)) {
               request.setHeader("Content-type", "application/json; charset=utf-8");
           }
           if (apiContext != null && apiContext.getUserAuthTicket() != null) {
               setUserClaims();
           }

           Iterator<Entry<String, String>> i = headers.entrySet().iterator();
           while (i.hasNext()) {
               Entry<String, String> header = i.next();
               request.addHeader(header.getKey(), header.getValue());
           }

           AppAuthenticator.addAuthHeader();
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

    @Override
    public TResult executePostRequest(Object bodyObject, String resourceUrl,
            Map<String, String> headers) throws ApiException {
        return this.executeRequest(bodyObject, new HttpPost(resourceUrl), headers);
    }

    @Override
    public TResult executePutRequest(Object bodyObject, String resourceUrl,
            Map<String, String> headers) throws ApiException {
        return this.executeRequest(bodyObject, new HttpPut(resourceUrl), headers);
    }

    @Override
    public void executeDeleteRequest(String resourceUrl,
            Map<String, String> headers) throws ApiException {
        HttpDelete delete = new HttpDelete(resourceUrl);
        delete.setHeader("Accept", "application/json");
        delete.setHeader("Content-type", "application/json");
        if (headers!=null) {
            for (Map.Entry<String, String> entry: headers.entrySet()) {
                delete.addHeader(entry.getKey(), entry.getValue());
            }
        }
        try {
            executeRequest(delete);
        } catch (Exception ioe) {
            throw new ApiException("Exception occurred while authenticating user: "
                    + ioe.getMessage());
        }
    }

    @Override
    public void cleanupHttpConnection() throws Exception {
    }

    private TResult executeRequest(Object bodyObject, HttpEntityEnclosingRequestBase request, Map<String, String> headers) {
        TResult result = null;

        try {
            String body = mapper.writeValueAsString(bodyObject);
            StringEntity se = new StringEntity(body);
            request.setEntity(se);
            request.setHeader("Accept", "application/json");
            request.setHeader("Content-type", "application/json");
            if (headers!=null) {
                for (Map.Entry<String, String> entry: headers.entrySet()) {
                    request.addHeader(entry.getKey(), entry.getValue());
                }
            }
        } catch (UnsupportedEncodingException uee) {
            throw new ApiException("JSON error proccessing authentication: " + uee.getMessage());
        } catch (JsonProcessingException jpe) {
            throw new ApiException("JSON error proccessing authentication: " + jpe.getMessage());
        }

        try {
            executeRequest(request);
            result = getResult();
        } catch (Exception ioe) {
            throw new ApiException("Exception occurred while authenticating application: "
                    + ioe.getMessage());
        }

        return result;
    }

    private void executeRequest(HttpRequestBase request) throws Exception {

        HttpClient client = new DefaultHttpClient();

        httpResponseMessage = client.execute(request);
        try {
            ensureSuccess(httpResponseMessage, mapper);
        } catch (Exception e) {
            // make sure on exception that that response is closed
            EntityUtils.consume(httpResponseMessage.getEntity());
            throw e;
        }
    }
    protected void ensureSuccess(HttpResponse response, ObjectMapper mapper) throws ApiException {
        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode < 200 || statusCode > 300) {
            try {
                ApiError apiError = mapper.readValue(response.getEntity().getContent(), ApiError.class);
                apiError.setCorrelationId(getHeaderValue(Headers.X_VOL_CORRELATION, response));
                throw new ApiException(getMozuErrorMessage(apiError), apiError, statusCode);
            } catch (JsonProcessingException jpe) {
                throw new ApiException("An error has occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase(), statusCode);
            } catch (IOException ioe) {
                throw new ApiException("An error occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase(), statusCode);
            }
        }
    }
    
    private static String getMozuErrorMessage(ApiError apiError) {
        StringBuilder errorMessage = new StringBuilder("Error returned from Mozu. Correlation ID: ");
        
        errorMessage.append(apiError.getCorrelationId());
        errorMessage.append(".  Message: ");
        
        if (StringUtils.isNotBlank(apiError.getMessage())) {
            errorMessage.append(apiError.getMessage());
        } else if (apiError.getExceptionDetail() != null && StringUtils.isNotBlank(apiError.getExceptionDetail().getMessage())) {
            errorMessage.append(apiError.getExceptionDetail().getMessage());
        } else if (apiError.getItems().size() > 0) {
            for (Item item : apiError.getItems()) {
                errorMessage.append(item.getMessage());
                errorMessage.append(". Error Code: ").append(item.getErrorCode());
            }
        } else {
            errorMessage.append("No error message returned from Mozu.");
        }
        
        return errorMessage.toString();
    }
  
    private String getHeaderValue(String header, HttpMessage httpMessage) {
      if (httpMessage.containsHeader(header))
          return (httpMessage.getFirstHeader(header)).getValue();
      else
          return null;
    }
}
