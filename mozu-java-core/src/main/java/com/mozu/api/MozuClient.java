package com.mozu.api;

import java.io.InputStream;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mozu.api.ApiContext;
import com.mozu.api.MozuUrl;

public interface MozuClient<TResult> {
    public void setContext(ApiContext apiContext);

    public void setBaseAddress(String baseAddress);

    public void addHeader(String header, String value);

    public void setVerb(String verb);

    public void setResourceUrl(MozuUrl resourceUrl);

    public <TBody> void setBody(TBody body) throws JsonProcessingException;

    public void setBody(InputStream body) throws JsonProcessingException;

    public void setBody(String body);

    public String getStringResult() throws Exception;

    public TResult getResult() throws Exception;

    public void executeRequest() throws Exception;

    public TResult executePostRequest(Object bodyObject, String resourceUrl, Map<String, String> headers) throws ApiException;

    public TResult executePutRequest(Object bodyObject, String resourceUrl, Map<String, String> headers) throws ApiException;

    public void executeDeleteRequest(String resourceUrl, Map<String, String> headers) throws ApiException;

    public void cleanupHttpConnection () throws Exception;
}
