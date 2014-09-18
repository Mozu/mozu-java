package com.mozu.api.utils;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import com.mozu.api.MozuConfig;

public class MozuHttpClientPool {
    
    private static MozuHttpClientPool mozuHttpClientPool = null;
    private HttpClient httpClient = null;
    
    private MozuHttpClientPool() {
        HttpParams httpParams = MozuConfig.getHttpParams();
        if (httpParams == null) {
            httpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpParams, MozuConfig.getHttpClientTimeoutMillis());
            HttpConnectionParams.setSoTimeout(httpParams,  MozuConfig.getHttpClientTimeoutMillis());
        }

        ClientConnectionManager connectionManager = MozuConfig.getClientConnectionManager(); 
        if (connectionManager == null) {
             connectionManager = new PoolingClientConnectionManager();
             ((PoolingClientConnectionManager)connectionManager).setDefaultMaxPerRoute(MozuConfig.getDefaultHttpClientMaxPerRoute());
             ((PoolingClientConnectionManager)connectionManager).setMaxTotal(MozuConfig.getMaxHttpClientConnections());
        }
        httpClient = new DefaultHttpClient(connectionManager, httpParams);
    }
    
    static public MozuHttpClientPool getInstance () {
        if (mozuHttpClientPool == null) {
            synchronized (MozuHttpClientPool.class) {
                if (mozuHttpClientPool == null) {
                    mozuHttpClientPool = new MozuHttpClientPool();
                }
            }
        }
        return mozuHttpClientPool;
    }
    
    /** 
     * Get the http client to use for connecting to an HTTP server.  
     * @return HttpClient
     */
    public HttpClient getHttpClient () {
        return this.httpClient;
    }
    
    /**
     * Call once when destroying process to clean up http connections.
     */
    public void shutdown () {
        httpClient.getConnectionManager().shutdown();
    }
}
