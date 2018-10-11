/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productadmin.PublishSet;

/**
 *	Mozu.ProductAdmin.Contracts.PublishSetCollection ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublishSetCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The total number of items in the list.
	 */
	protected  Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * A list of requested items. All returned data is provided in an items array.For a failed request, the returned response may be success with an empty item array.
	 */
	protected List<PublishSet> items;
	public List<PublishSet> getItems() {
		return this.items;
	}
	public void setItems(List<PublishSet> items) {
		this.items = items;
	}


}
