/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.sitesettings.order.LocalizedContent;

/**
 *	Mozu.SiteSettings.Order.Contracts.VocabularyValue ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VocabularyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.For search synonym definitions, refer to [Synonym Expansion Types](https://www.mozu.com/docs/Developer/api-guides/search-settings.htm#synonym_expansion_types) for more information about the key usage.
	 */
	protected  String key;

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Contents of the vocabulary values that have been defined for an attribute.
	 */
	protected List<LocalizedContent> contents;
	public List<LocalizedContent> getContents() {
		return this.contents;
	}
	public void setContents(List<LocalizedContent> contents) {
		this.contents = contents;
	}


}
