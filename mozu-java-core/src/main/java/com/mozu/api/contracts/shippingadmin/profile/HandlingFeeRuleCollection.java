/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin.profile;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HandlingFeeRuleCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	protected List<HandlingFeeRule> items;
	public List<HandlingFeeRule> getItems() {
		return this.items;
	}
	public void setItems(List<HandlingFeeRule> items) {
		this.items = items;
	}

}
