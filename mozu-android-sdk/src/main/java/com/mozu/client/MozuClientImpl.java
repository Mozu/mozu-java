package com.mozu.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiError;
import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuConfig;
import com.mozu.api.MozuUrl;
import com.mozu.api.Version;
import com.mozu.api.ApiError.Item;
import com.mozu.api.cache.db.CacheItem;
import com.mozu.api.cache.db.CacheManager;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.CustomerAuthenticator;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

       private String mCacheKey;

       /**
        * Charset for request.
        */
       private static final String PROTOCOL_CHARSET = "utf-8";

       /**
        * Content type for request.
        */
       private static final String PROTOCOL_CONTENT_TYPE =
               String.format("application/json; charset=%s", PROTOCOL_CHARSET);


       private static final String HEADER_CONTENT_TYPE = "Content-Type";

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
                   CacheItem cacheItem;
                   if (mCacheKey != null && (cacheItem = CacheManager.checkAndGetCache(mCacheKey)) != null) {
                       tResult = deserialize(cacheItem.getContent(), responseType);
                   } else {
                       tResult = deserialize(getStringResult(), responseType);
                   }

               }
              }
           return tResult;
       }

       public HttpResponse getResponse() {
           return httpResponseMessage;
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
           } else if (resourceUrl.getLocation() == MozuUrl.UrlLocation.HOME_POD) {
               AppAuthenticator appAuthenticator = AppAuthenticator.getInstance();
               if (appAuthenticator == null) {
                   throw new ApiException("Application has not been authorized to access Mozu.");
               } else if (StringUtils.isBlank(MozuConfig.getBaseUrl())) {
                   throw new ApiException("Authentication.Instance.BaseUrl is missing");
               }

               baseAddress = MozuConfig.getBaseUrl();
           } else if (resourceUrl.getLocation() == MozuUrl.UrlLocation.PCI_POD) {
               if (apiContext == null || apiContext.getTenantId() < 0) {
                   throw new ApiException("TenantId is missing");
               }
               if (StringUtils.isBlank(MozuConfig.getBasePciUrl())) {
                   throw new ApiException("Authentication.Instance.BasePciUrl is missing");
               }
               baseAddress = MozuConfig.getBasePciUrl();
           }
       }

       private String getCacheKey(URL url, Map<String, String> requestHeaders) {
           StringBuilder key = new StringBuilder();
           key.append(url);
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

                   String dataViewMode = requestHeaders.get(Headers.X_VOL_DATAVIEW_MODE);
                   if (!StringUtils.isEmpty(dataViewMode))
                       key.append(dataViewMode);
               }
               return key.toString();
       }

       /**
        * Create an {@link HttpURLConnection} for the specified {@code url}.
        */
       protected HttpURLConnection createConnection(URL url) throws IOException {
              return (HttpURLConnection) url.openConnection();
       }

       /**
        * Opens an {@link java.net.HttpURLConnection} with parameters.
        *
        * @param url
        * @return an open connection
        * @throws IOException
        */
       private HttpURLConnection openConnection(URL url) throws IOException {
              HttpURLConnection connection = createConnection(url);
              connection.setUseCaches(true);
              connection.setDoInput(true);
              return connection;
       }

       private static HttpEntity entityFromConnection(HttpURLConnection connection) {
              BasicHttpEntity entity = new BasicHttpEntity();
              InputStream inputStream;
              try {
                     inputStream = connection.getInputStream();
              } catch (IOException ioe) {
                     inputStream = connection.getErrorStream();
              }
              entity.setContent(inputStream);
              entity.setContentLength(connection.getContentLength());
              entity.setContentEncoding(connection.getContentEncoding());
              entity.setContentType(connection.getContentType());
              return entity;
       }


       @SuppressWarnings("unchecked")
       private void setCache() throws Exception {
              CacheItem cacheItem = CacheManager.checkAndGetCache(mCacheKey);
              String eTag = getHeaderValue("ETag", httpResponseMessage);
              if (cacheItem != null && httpResponseMessage.getStatusLine().getStatusCode() == 304) {

              } else if (StringUtils.isNotEmpty(eTag) && httpResponseMessage.getStatusLine().getStatusCode() != 404) {
                     CacheManager.insertCacheItem(eTag, mCacheKey, stringContent());
              }
       }

       public void executeRequest() throws Exception {
              validateContext();
              String url = baseAddress + resourceUrl.getUrl();

              if (apiContext != null && apiContext.getUserAuthTicket() != null) {
                setUserClaims();
              }

              addHeader(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
              addHeader(Headers.X_VOL_VERSION, Version.API_VERSION);
              httpResponseMessage = performRequest(url, headers);
              ensureSuccess(httpResponseMessage, mapper);
              setCache();
       }

       private HttpResponse performRequest(String url, Map<String, String> requestHeaders) throws Exception {
              URL parsedURL = new URL(url);
              HttpURLConnection connection = openConnection(parsedURL);

              buildConnection(connection, requestHeaders);
              // Initialize HttpResponse with data from the HttpURLConnection.
              ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
              int responseCode = connection.getResponseCode();
              if (responseCode == -1) {
                     // -1 is returned by getResponseCode() if the response code could not be retrieved.
                     // Signal to the caller that something was wrong with the connection.
                     throw new IOException("Could not retrieve response code from HttpUrlConnection.");
              }
              StatusLine responseStatus = new BasicStatusLine(protocolVersion, connection.getResponseCode(), connection.getResponseMessage());
              BasicHttpResponse response = new BasicHttpResponse(responseStatus);
              response.setEntity(entityFromConnection(connection));
              for (Entry<String, List<String>> header : connection.getHeaderFields().entrySet()) {
                     if (header.getKey() != null) {
                            Header h = new BasicHeader(header.getKey(), header.getValue().get(0));
                            response.addHeader(h);
                     }
              }
              return response;
       }

       private void buildConnection(HttpURLConnection connection, Map<String, String> requestHeaders) throws Exception {
              if (requestHeaders != null) {
                 Iterator<Entry<String, String>> i = requestHeaders.entrySet().iterator();
                 while (i.hasNext()) {
                     Entry<String, String> header = i.next();
                            connection.setRequestProperty(header.getKey(), header.getValue());
                     }

                     if (!requestHeaders.containsKey(Headers.CONTENT_TYPE)) {
                            connection.setRequestProperty(Headers.CONTENT_TYPE, PROTOCOL_CONTENT_TYPE);
                     }
              }
              connection.setRequestProperty("Accept", "application/json");
              mCacheKey = getCacheKey(connection.getURL(), requestHeaders);
              CacheItem cacheItem = CacheManager.checkAndGetCache(mCacheKey);
              if (cacheItem != null) {
                     connection.setRequestProperty("If-None-Match", cacheItem.geteTag());
              }

              connection.setRequestMethod(verb);
              if (verb.equals("POST") || verb.equals("PUT")) {
                     if (StringUtils.isNotBlank(httpContent)) {
                            addBodyIfExists(connection, httpContent);
                     } else if (this.streamContent != null) {
                            addBodyIfExists(connection, streamContent);
                     }
              }
       }


       private TResult executeRequest(Object bodyObject, String url, String verb, Map<String, String> additionalHeaders) {
              TResult result = null;
              try {
                     String body = mapper.writeValueAsString(bodyObject);
                     setBody(body);
                     setVerb(verb);
                     httpResponseMessage = performRequest(url, additionalHeaders);
                     ensureSuccess(httpResponseMessage, mapper);
                     result = getResult();
              } catch (MalformedURLException e) {
                     e.printStackTrace();
              } catch (JsonProcessingException e) {
                     e.printStackTrace();
              } catch (Exception e) {
                     e.printStackTrace();
              }
              return result;
       }


       private TResult deserialize(String jsonString, Class<TResult> cls) throws Exception {
              return mapper.readValue(jsonString, cls);
       }

       private String stringContent() throws Exception {
           HttpEntity httpEntity = httpResponseMessage.getEntity();
           InputStream stream = (InputStream) httpEntity.getContent();
           return org.apache.commons.io.IOUtils.toString(stream, "UTF-8");
       }


       public byte[] getBody(String mRequestBody) {
              try {
                     return mRequestBody == null ? null : mRequestBody.getBytes(PROTOCOL_CHARSET);
              } catch (UnsupportedEncodingException uee) {
                     return null;
              }
       }


       private void addBodyIfExists(HttpURLConnection connection, String body)
               throws IOException {
              byte[] requestBody = getBody(body);
              if (requestBody != null) {
                     connection.setDoOutput(true);
                     if (connection.getRequestProperty(HEADER_CONTENT_TYPE) == null) {
                            connection.addRequestProperty(HEADER_CONTENT_TYPE, PROTOCOL_CONTENT_TYPE);
                     }
                     DataOutputStream out = new DataOutputStream(connection.getOutputStream());
                     out.write(requestBody);
                     out.close();
              }
       }

       private void addBodyIfExists(HttpURLConnection connection, InputStream body)
               throws IOException {
              byte[] requestBody = IOUtils.toByteArray(body);
              if (requestBody != null) {
                     connection.setDoOutput(true);
                     DataOutputStream out = new DataOutputStream(connection.getOutputStream());
                     out.write(requestBody);
                     out.close();
              }
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
              return this.executeRequest(bodyObject, resourceUrl, "POST", headers);
    }

    @Override
    public TResult executePutRequest(Object bodyObject, String resourceUrl,
            Map<String, String> headers) throws ApiException {
              return this.executeRequest(bodyObject, resourceUrl, "PUT", headers);
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

    private void executeRequest(HttpRequestBase request) throws Exception {

        HttpClient client = new DefaultHttpClient();

        httpResponseMessage = client.execute(request);
        try {
            ensureSuccess(httpResponseMessage, mapper);
        } catch (Exception e) {
            // make sure on exception that that response is closed
            throw e;
        }
    }
    protected void ensureSuccess(HttpResponse response, ObjectMapper mapper) throws ApiException {
        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode != 304 && (statusCode < 200 || statusCode > 300)) {
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

       private String getHeaderValue(String header, HttpURLConnection connection) {
              return connection.getHeaderField(header);
    }

    private String getHeaderValue(String header, HttpMessage httpMessage) {
      if (httpMessage.containsHeader(header))
          return (httpMessage.getFirstHeader(header)).getValue();
      else
          return null;
    }
}
