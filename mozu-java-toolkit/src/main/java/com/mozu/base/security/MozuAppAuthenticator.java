package com.mozu.base.security;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.base.models.BaseAppConfiguration;

@Component
public class MozuAppAuthenticator {
	private static final Logger logger = LoggerFactory.getLogger(MozuAppAuthenticator.class);
	
	@Value("${ApplicationId}")
	String applicationId;
    @Value("${SharedSecret}")
    String sharerdSecret;
    @Value("${BaseAuthAppUrl}")
    String baseAppAuthUrl;
	
	@PostConstruct
	public void appAuthentication() {
		
		logger.info("Authenticating Application in Mozu...");
		try {
			
			BaseAppConfiguration.setApplicationId(applicationId);
			BaseAppConfiguration.setSharedSecret(sharerdSecret);
			BaseAppConfiguration.setBaseUrl(baseAppAuthUrl);
	
			AppAuthInfo appAuthInfo = new AppAuthInfo();
			appAuthInfo.setApplicationId(BaseAppConfiguration.getApplicationId());
			appAuthInfo.setSharedSecret(BaseAppConfiguration.getSharedSecret());
			AppAuthenticator.initialize(appAuthInfo);
			logger.info("Auth ticket : "+AppAuthenticator.getInstance().getAppAuthTicket().getAccessToken());
			logger.info("Application authenticated");
		} catch(Exception exc) {
			logger.error(exc.getMessage(), exc);
		}
		
	}

}
