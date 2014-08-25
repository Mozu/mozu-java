package com.mozu.api;

public class ApiException extends RuntimeException {
    /** Default Serial Version UID  */
    private static final long serialVersionUID = 1L;
    protected ApiError apiError = null;
    protected int HttpStatusCode;
    
    public ApiException(String message) {
        super(message);
    }
    
    public ApiException(String message, ApiError apiError) {
        super(message);
        this.apiError = apiError;
    }

    public ApiException(String message, ApiError apiError, int httpStatusCode) {
        super(message);
        this.apiError = apiError;
        this.HttpStatusCode = httpStatusCode;
    }

    public ApiException(String message, int httpStatusCode) {
        super(message);
        this.HttpStatusCode = httpStatusCode;
    }

    public ApiError getApiError() {
        return apiError;
    }

    public int getHttpStatusCode() {
        return HttpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        HttpStatusCode = httpStatusCode;
    }
}