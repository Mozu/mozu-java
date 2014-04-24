package com.mozu.api;

public class ApiException extends RuntimeException {
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;
	protected ApiError apiError = null;
	
	public ApiException(String message) {
		super(message);
	}
	
	public ApiException(String message, ApiError apiError) {
		super(message);
		this.apiError = apiError;
	}

	public ApiError getApiError() {
		return apiError;
	}

}
