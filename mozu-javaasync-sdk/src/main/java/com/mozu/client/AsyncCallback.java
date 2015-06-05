package com.mozu.client;

public interface AsyncCallback<TResult> {
    
    void success(TResult result);
    
    void failure(Exception exception);
    
    void cancelled();
}
