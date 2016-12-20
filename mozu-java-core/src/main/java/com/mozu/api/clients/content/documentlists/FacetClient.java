/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content.documentlists;

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
 * Use the facets subresource to allow a merchant to add information for product indexing and searching.
 * </summary>
 */
public class FacetClient {
	
	/**
	 * Retrieves the properties of facets that aid in indexing and searching.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.content.Facet>> mozuClient=GetFacetsClient( documentListName,  propertyName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param propertyName The property name associated with the facets to retrieve.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.content.Facet>>
	 * @see com.mozu.api.contracts.content.Facet
	 */
	public static MozuClient<List<com.mozu.api.contracts.content.Facet>> getFacetsClient(String documentListName, String propertyName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.FacetUrl.getFacetsUrl(documentListName, propertyName);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.content.Facet>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.content.Facet>> mozuClient = (MozuClient<List<com.mozu.api.contracts.content.Facet>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



