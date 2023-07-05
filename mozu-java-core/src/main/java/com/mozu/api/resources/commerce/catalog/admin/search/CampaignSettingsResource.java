/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.search;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CampaignSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CampaignSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettings campaignSettings = campaignsettings.getCampaignSetting( campaignId);
	 * </code></pre></p>
	 * @param campaignId 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettings getCampaignSetting(String campaignId) throws Exception
	{
		return getCampaignSetting( campaignId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettings campaignSettings = campaignsettings.getCampaignSetting( campaignId,  responseFields);
	 * </code></pre></p>
	 * @param campaignId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettings getCampaignSetting(String campaignId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CampaignSettings> client = com.mozu.api.clients.commerce.catalog.admin.search.CampaignSettingsClient.getCampaignSettingClient( campaignId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettingsCollection campaignSettingsCollection = campaignsettings.getCampaignSettings( pagesize,  startindex);
	 * </code></pre></p>
	 * @param pagesize 
	 * @param startindex 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettingsCollection
	 * @see com.mozu.api.contracts.productadmin.CampaignSettingsCollection
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettingsCollection getCampaignSettings(String pagesize, String startindex) throws Exception
	{
		return getCampaignSettings( pagesize,  startindex,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettingsCollection campaignSettingsCollection = campaignsettings.getCampaignSettings( pagesize,  startindex,  responseFields);
	 * </code></pre></p>
	 * @param pagesize 
	 * @param responseFields 
	 * @param startindex 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettingsCollection
	 * @see com.mozu.api.contracts.productadmin.CampaignSettingsCollection
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettingsCollection getCampaignSettings(String pagesize, String startindex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CampaignSettingsCollection> client = com.mozu.api.clients.commerce.catalog.admin.search.CampaignSettingsClient.getCampaignSettingsClient( pagesize,  startindex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettings campaignSettings = campaignsettings.addCampaignSetting( settings);
	 * </code></pre></p>
	 * @param settings 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettings addCampaignSetting(com.mozu.api.contracts.productadmin.CampaignSettings settings) throws Exception
	{
		return addCampaignSetting( settings,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettings campaignSettings = campaignsettings.addCampaignSetting( settings,  fromSystemDefault,  responseFields);
	 * </code></pre></p>
	 * @param fromSystemDefault 
	 * @param responseFields 
	 * @param settings 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettings addCampaignSetting(com.mozu.api.contracts.productadmin.CampaignSettings settings, Boolean fromSystemDefault, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CampaignSettings> client = com.mozu.api.clients.commerce.catalog.admin.search.CampaignSettingsClient.addCampaignSettingClient( settings,  fromSystemDefault,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettings campaignSettings = campaignsettings.updateCampaignSetting( settings,  campaignId);
	 * </code></pre></p>
	 * @param campaignId 
	 * @param settings 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettings updateCampaignSetting(com.mozu.api.contracts.productadmin.CampaignSettings settings, String campaignId) throws Exception
	{
		return updateCampaignSetting( settings,  campaignId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettings campaignSettings = campaignsettings.updateCampaignSetting( settings,  campaignId,  responseFields);
	 * </code></pre></p>
	 * @param campaignId 
	 * @param responseFields 
	 * @param settings 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettings updateCampaignSetting(com.mozu.api.contracts.productadmin.CampaignSettings settings, String campaignId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CampaignSettings> client = com.mozu.api.clients.commerce.catalog.admin.search.CampaignSettingsClient.updateCampaignSettingClient( settings,  campaignId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CampaignSettings campaignsettings = new CampaignSettings();
	 *	CampaignSettings campaignSettings = campaignsettings.deleteCampaignSetting( campaignId);
	 * </code></pre></p>
	 * @param campaignId 
	 * @return com.mozu.api.contracts.productadmin.CampaignSettings
	 * @see com.mozu.api.contracts.productadmin.CampaignSettings
	 */
	public com.mozu.api.contracts.productadmin.CampaignSettings deleteCampaignSetting(String campaignId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CampaignSettings> client = com.mozu.api.clients.commerce.catalog.admin.search.CampaignSettingsClient.deleteCampaignSettingClient( campaignId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}


