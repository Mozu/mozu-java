/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of the publishing status of the product, including its current state and the details of the last product change published to the catalog.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPublishingInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String lastPublishedBy;

	public String getLastPublishedBy() {
		return this.lastPublishedBy;
	}

	public void setLastPublishedBy(String lastPublishedBy) {
		this.lastPublishedBy = lastPublishedBy;
	}

	protected  DateTime lastPublishedDate;

	public DateTime getLastPublishedDate() {
		return this.lastPublishedDate;
	}

	public void setLastPublishedDate(DateTime lastPublishedDate) {
		this.lastPublishedDate = lastPublishedDate;
	}

	protected  String publishedState;

	public String getPublishedState() {
		return this.publishedState;
	}

	public void setPublishedState(String publishedState) {
		this.publishedState = publishedState;
	}

	/**
	 * The unique identifier of the publish set the pending product draft is assigned to. This field is not valid if the product is live.
	 */
	protected  String publishSetCode;

	public String getPublishSetCode() {
		return this.publishSetCode;
	}

	public void setPublishSetCode(String publishSetCode) {
		this.publishSetCode = publishSetCode;
	}


}
