package com.mozu.base.models;


public class BaseAppConfiguration {
	protected static String applicationId;
	protected static String sharedSecret;
	protected static String baseUrl;
	
	public static String getApplicationId() {
		return applicationId;
	}
	
	public static String getSharedSecret() {
		return sharedSecret;
	}
	
	public static String getBaseUrl() {
		return baseUrl;
	}
	
	
	public static void setApplicationId(String applicationId) {
		BaseAppConfiguration.applicationId = applicationId;
	}
	
	public static void setSharedSecret(String sharedSecret) {
		BaseAppConfiguration.sharedSecret = sharedSecret;
	}
	
	public static void setBaseUrl(String baseUrl) {
		BaseAppConfiguration.baseUrl = baseUrl;
	}
	
	
}
