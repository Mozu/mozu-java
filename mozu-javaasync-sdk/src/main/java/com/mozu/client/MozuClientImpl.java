package com.mozu.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CountDownLatch;

import org.apache.commons.lang.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiError;
import com.mozu.api.ApiException;
import com.mozu.api.AsyncCallback;
import com.mozu.api.Headers;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuConfig;
import com.mozu.api.MozuUrl;
import com.mozu.api.Version;
import com.mozu.api.ApiError.Item;
import com.mozu.api.cache.CacheManager;
import com.mozu.api.cache.CacheManagerFactory;
import com.mozu.api.cache.impl.CacheItem;
import com.mozu.api.contracts.appdev.AuthTicket;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.CustomerAuthenticator;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;
import com.mozu.api.utils.MozuHttpClientPool;

public class MozuClientImpl <TResult> implements MozuClient<TResult> {
    private static final ObjectMapper mapper = JsonUtils.initObjectMapper();

    private final Class<TResult> responseType;
    private ApiContext apiContext = null;
    private String baseAddress = null;
    private HashMap<String, String> headers = new HashMap<String, String>();
    private String verb = null;
    private MozuUrl resourceUrl = null;
    private String httpContent = null;
    private InputStream streamContent = null;
    private CacheItem cacheItem = null;
    private String cacheKey = null;
    
    private TResult syncResult = null;
    private Exception syncException = null;
    private HttpResponse syncResponse = null;
    
    public MozuClientImpl() {
        this.responseType = null;
    }

    public MozuClientImpl(Class<TResult> responseType) throws Exception {
        this.responseType = responseType;
    }

    @Override
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

    @Override
    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }

    @Override
    public void addHeader(String header, String value) {
        headers.put(header, value);
    }

    @Override
    public void setVerb(String verb) {
        this.verb = verb;
    }

    @Override
    public void setResourceUrl(MozuUrl resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    @Override
    public <TBody> void setBody(TBody body) throws JsonProcessingException {
        httpContent = mapper.writeValueAsString(body);
    }

    @Override
    public void setBody(InputStream body) throws JsonProcessingException {
        streamContent = body;
    }

    @Override
    public void setBody(String body) {
        httpContent = body;
    }

    @Override
    public String getStringResult() throws Exception {
        // TODO: Fix This!
        return syncResponse!=null?stringContent(syncResponse):null;
    }

    @Override
    public TResult getResult() throws Exception {
        return syncResult;
    }
    
    @SuppressWarnings("unchecked")
    public TResult getResult(HttpResponse httpResponse) throws Exception {
        TResult tResult = null;
        try {
            if (httpResponse.getStatusLine().getStatusCode() == 404)
                return null;

            if (responseType != null) {
                String className = responseType.getName();
                if (className.equals(java.io.InputStream.class.getName())) {
                    tResult = (TResult) httpResponse.getEntity().getContent();
                } else {
                    
                    
                    if (cacheItem != null)
                        tResult = deserialize(cacheItem.getContent(), responseType);
                    else
                        tResult = deserialize(stringContent(httpResponse), responseType);
                }
            }
        } finally {
            EntityUtils.consume(httpResponse.getEntity());
        }
        return tResult;
    }

    @Override
    public void executeRequest() throws Exception {
        // Old style request, make a psuedo synchronous request
        syncException = null;
        AsyncCallback<TResult> callbackHandler = new DefaultCallbackHandler();
        CountDownLatch latch = executeRequest(callbackHandler);
        latch.await();
        
        if (syncException!=null) {
            throw syncException;
        }
    }

    @Override
    public TResult executePostRequest(Object bodyObject, String resourceUrl,
            Map<String, String> headers) throws ApiException {
        // Old style request, make a psuedo synchronous request
        syncException = null;
        AsyncCallback<TResult> callbackHandler = new DefaultCallbackHandler();
        CountDownLatch latch = executePostRequest(bodyObject, resourceUrl, headers, callbackHandler);
        try {
            latch.await();
        } catch (Exception e) {
            throw new ApiException("ASync I/O Exception: " + e.getMessage());
        }
        
        if (syncException!=null) {
            throw new ApiException("ASync I/O Exception: " + syncException.getMessage());
        }
        return syncResult;
    }

    @Override
    public TResult executePutRequest(Object bodyObject, String resourceUrl,
            Map<String, String> headers) throws ApiException {
        // Old style request, make a psuedo synchronous request
        syncException = null;
        AsyncCallback<TResult> callbackHandler = new DefaultCallbackHandler();
        CountDownLatch latch = executePutRequest(bodyObject, resourceUrl, headers, callbackHandler);
        try {
            latch.await();
        } catch (Exception e) {
            throw new ApiException("ASync I/O Exception: " + e.getMessage());
        }
        
        if (syncException!=null) {
            throw new ApiException("ASync I/O Exception: " + syncException.getMessage());
        }
        return syncResult;
    }

    @Override
    public void executeDeleteRequest(String resourceUrl,
            Map<String, String> headers) throws ApiException {
        // Old style request, make a psuedo synchronous request
        syncException = null;
        AsyncCallback<TResult> callbackHandler = new DefaultCallbackHandler();
        CountDownLatch latch = executeDeleteRequest(resourceUrl, headers, callbackHandler);
        try {
            latch.await();
        } catch (Exception e) {
            throw new ApiException("ASync I/O Exception: " + e.getMessage());
        }
        
        if (syncException!=null) {
            throw new ApiException("ASync I/O Exception: " + syncException.getMessage());
        }
    }

    @Override
    public void cleanupHttpConnection() throws Exception {
    }

    @SuppressWarnings("unchecked")
    @Override
    public CountDownLatch executeRequest(final AsyncCallback<TResult> callback) throws Exception {
        validateContext();

        CloseableHttpAsyncClient client = MozuHttpClientPool.getInstance().getHttpClient();
        
        final BasicHttpEntityEnclosingRequest request = buildRequest();
        URL url = new URL(baseAddress);
        String hostNm = url.getHost();
        int port = url.getPort();
        String sche = url.getProtocol();
        HttpHost httpHost = new HttpHost(hostNm, port, sche);

        setCacheKey(request);
        CacheManager<CacheItem> cache = (CacheManager<CacheItem>) CacheManagerFactory.getCacheManager();
        if (cache != null) {
            cacheItem = cache.get(cacheKey);
            if (cacheItem != null)
                request.addHeader("If-None-Match", cacheItem.geteTag());
        }

        final CountDownLatch latch = new CountDownLatch(1);
        
        BaseCallbackHandler futureCallback = new BaseCallbackHandler(callback, latch, request);
        
        client.execute(httpHost, request, futureCallback);
        return latch;
    }

    @Override
    public CountDownLatch executePostRequest(Object bodyObject, String resourceUrl,
            Map<String, String> headers, AsyncCallback<TResult> callback) throws ApiException {
        return executeRequest(bodyObject, new HttpPost(resourceUrl), headers, callback);
    }

    @Override
    public CountDownLatch executePutRequest(Object bodyObject, String resourceUrl,
            Map<String, String> headers, AsyncCallback<TResult> callback) throws ApiException {
        return executeRequest(bodyObject, new HttpPut(resourceUrl), headers, callback);
    }

    @Override
    public CountDownLatch executeDeleteRequest(String resourceUrl,
            Map<String, String> headers, AsyncCallback<TResult> callback) throws ApiException {
        return executeRequest(new HttpDelete(resourceUrl), headers, callback);
    }

    private CountDownLatch executeRequest(HttpRequestBase request, Map<String, String> headers, AsyncCallback<TResult> callback) {
        try {
            request.setHeader("Accept", "application/json");
            request.setHeader("Content-type", "application/json");
            if (headers!=null) {
                for (Map.Entry<String, String> entry: headers.entrySet()) {
                    request.addHeader(entry.getKey(), entry.getValue());
                }
            }
            return execute(request, callback);
        } catch (IOReactorException iore) {
            throw new ApiException("Async I/O error: " + iore.getMessage());
        }
    }

    private CountDownLatch executeRequest(Object bodyObject, HttpEntityEnclosingRequestBase request, Map<String, String> headers, AsyncCallback<TResult> callback) {
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
            return execute(request, callback);
        } catch (UnsupportedEncodingException uee) {
            throw new ApiException("JSON error proccessing authentication: " + uee.getMessage());
        } catch (JsonProcessingException jpe) {
            throw new ApiException("JSON error proccessing authentication: " + jpe.getMessage());
        } catch (IOReactorException iore) {
            throw new ApiException("Async I/O error: " + iore.getMessage());
        }
    }

    private CountDownLatch execute(final HttpEntityEnclosingRequestBase request, final AsyncCallback<TResult> callback) throws IOReactorException {
        final CountDownLatch latch = new CountDownLatch(1);
        
        CloseableHttpAsyncClient client = MozuHttpClientPool.getInstance().getHttpClient();
        BaseCallbackHandler futureCallback = new BaseCallbackHandler(callback, latch, request);
        client.execute(request, futureCallback);
        return latch;

    }

    private CountDownLatch execute(final HttpRequestBase request, final AsyncCallback<TResult> callback) throws IOReactorException {
        final CountDownLatch latch = new CountDownLatch(1);
        
        CloseableHttpAsyncClient client = MozuHttpClientPool.getInstance().getHttpClient();
        BaseCallbackHandler futureCallback = new BaseCallbackHandler(callback, latch, request);
        client.execute(request, futureCallback);
        return latch;

    }

    private TResult deserialize(String jsonString, Class<TResult> cls) throws Exception {
        return mapper.readValue(jsonString, cls);
    }

    private String stringContent(HttpResponse responseMessage) throws Exception {
        HttpEntity httpEntity = responseMessage.getEntity();
        InputStream stream = (InputStream) httpEntity.getContent();
        return org.apache.commons.io.IOUtils.toString(stream, "UTF-8");
    }

    private BasicHttpEntityEnclosingRequest buildRequest() throws Exception {
        String url = baseAddress + resourceUrl.getUrl();
        BasicHttpEntityEnclosingRequest request = new BasicHttpEntityEnclosingRequest(verb, url);

        if (verb.equals("POST") || verb.equals("PUT")) {
            if (StringUtils.isNotBlank(httpContent)) {
                request.setHeader("Accept", "application/json");
                StringEntity entity = new StringEntity(httpContent, Consts.UTF_8);
                request.setEntity(entity);
            } else if (this.streamContent != null) {
                long length = -1;
                if (streamContent instanceof FileInputStream) {
                    if (((FileInputStream)streamContent).getChannel() != null) {
                        length = ((FileInputStream)streamContent).getChannel().size();
                    }
                } else {
                    throw new UnsupportedOperationException ("The InputStream is not supported. It must be an instance of FileInputStream.");
                }
                InputStreamEntity entity = new InputStreamEntity(this.streamContent, length);
                request.setEntity(entity); 
            }
        }

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

        request.addHeader(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
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

    protected void validateContext() throws Exception {
        AppAuthenticator appAuthenticator = AppAuthenticator.getInstance();
        if (appAuthenticator == null) {
           throw new ApiException("Application has not been authorized to access Mozu.");
        } 
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
        }else if (resourceUrl.getLocation() == MozuUrl.UrlLocation.HOME_POD){
            if (StringUtils.isBlank(MozuConfig.getBaseUrl())) {
                throw new ApiException("Authentication.Instance.BaseUrl is missing");
             }

            baseAddress = MozuConfig.getBaseUrl();
         }else if(resourceUrl.getLocation() == MozuUrl.UrlLocation.PCI_POD){
            if(apiContext == null ||apiContext.getTenantId() < 0){
                 throw new ApiException("TenantId is missing");
            }
            if (StringUtils.isBlank(MozuConfig.getBasePciUrl())) {
                throw new ApiException("Authentication.Instance.BasePciUrl is missing");
             }
            baseAddress = MozuConfig.getBasePciUrl();
        }
    }

    protected Map<String, String> getHeaders() {
        return headers;
    }

    protected void ensureSuccess(HttpResponse response, RequestLine requestLine ) throws ApiException {
        int statusCode = response.getStatusLine().getStatusCode();
        String correlationId = getHeaderValue(Headers.X_VOL_CORRELATION, response);
        if (statusCode == 304 || statusCode >= 200 && statusCode <= 300) return;
        
        
        ApiError apiError = new ApiError();
        apiError.setCorrelationId(correlationId);
        
        if (statusCode == 404 && StringUtils.isEmpty(correlationId))
            apiError.setMessage(requestLine.getUri().toString() +" not found");
        else if (!StringUtils.isEmpty(correlationId)) {
            try {
                apiError = mapper.readValue(stringContent(response), ApiError.class);
                apiError.setCorrelationId(correlationId);
                if (apiError.getErrorCode().equals("ITEM_NOT_FOUND") && statusCode == 404  && StringUtils.endsWithIgnoreCase("get",requestLine.getMethod())) return;
            } catch (JsonProcessingException jpe) {
                throw new ApiException("An error has occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase(), statusCode);
            } catch (IOException ioe) {
                throw new ApiException("An error occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase(), statusCode);
            } catch (Exception e) {
                throw new ApiException("An error occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase(), statusCode);
            }
        } else
            apiError.setMessage("Unknown Error");
        throw new ApiException(getMozuErrorMessage(apiError), apiError, statusCode);
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
    
    private void setCacheKey(BasicHttpEntityEnclosingRequest request) {
        StringBuilder key = new StringBuilder();
        key.append(request.getRequestLine().getUri().toString());
         if (apiContext != null) {
             if (apiContext.getSiteId() != null)
                 key.append(apiContext.getSiteId());

             if (!StringUtils.isEmpty(apiContext.getCurrency()))
                 key.append(apiContext.getCurrency());
             if (!StringUtils.isEmpty(apiContext.getLocale()))
                 key.append(apiContext.getLocale());
             if (apiContext.getMasterCatalogId() != null)
                 key.append(apiContext.getMasterCatalogId());
             if (apiContext.getCatalogId() != null)
                 key.append(apiContext.getCatalogId());
             
            String dataViewMode = getHeaderValue(Headers.X_VOL_DATAVIEW_MODE, request);
            if (!StringUtils.isEmpty(dataViewMode))
                key.append(dataViewMode);
         }
         cacheKey =  key.toString();
    }
    
    @SuppressWarnings("unchecked")
    private void setCache(HttpResponse httpResponseMessage) throws Exception {
        String eTag = getHeaderValue("ETag", httpResponseMessage);
        if (cacheItem != null && httpResponseMessage.getStatusLine().getStatusCode() == 304)
        {
            //Do nothing
            //httpResponseMessage = (CloseableHttpResponse) cacheItem.getItem();
        }
        else if (StringUtils.isNotEmpty(eTag) && httpResponseMessage.getStatusLine().getStatusCode() != 404)
        {
            com.mozu.api.cache.CacheManager<CacheItem> cache = (com.mozu.api.cache.CacheManager<CacheItem>) com.mozu.api.cache.CacheManagerFactory.getCacheManager();
            if (cache != null) {
                cacheItem = new CacheItem();
                cacheItem.seteTag(eTag);
                cacheItem.setKey(cacheKey);
                cacheItem.setContent(stringContent(httpResponseMessage));
                
                cache.put(cacheKey, cacheItem);
            }
        }
    }

    protected class DefaultCallbackHandler implements AsyncCallback<TResult> {

        @Override
        public void success(TResult result) {
            syncResult = result;
        }

        @Override
        public void failure(Exception exception) {
            syncException = exception;
        }

        @Override
        public void cancelled() {
        }
    }
    
    protected class BaseCallbackHandler implements FutureCallback<HttpResponse> {
        AsyncCallback<TResult> callback;
        CountDownLatch latch;
        HttpRequest request;
        
        public BaseCallbackHandler(AsyncCallback<TResult> callback, CountDownLatch latch, HttpRequest request) {
            this.callback = callback;
            this.latch = latch;
            this.request = request;
        }
            
        @Override
        public void failed(Exception ex) {
            callback.failure(ex);
            latch.countDown();
        }
        
        @Override
        public void completed(HttpResponse response) {
            // TODO: FIX THIS! 
            // This is for backwards compatability to support getStringContent. 
            // The contents of syncResponse are transient and cannot be relied on
            // to be correct if async mode is used
            syncResponse = response;
            try {
                ensureSuccess(response, request.getRequestLine());
                setCache(response);
                callback.success(getResult(response));
            } catch (ApiException ae) {
                // make sure on exception that that response is closed
                try {
                    EntityUtils.consume(response.getEntity());
                } catch (IOException e1) {
                    // Ignore and move on
                }
                callback.failure(ae);
            } catch (Exception e) {
                callback.failure(e);
            } finally {
                latch.countDown();
            }

        }
        
        @Override
        public void cancelled() {
            callback.cancelled();
            latch.countDown();
        }
    }
}
