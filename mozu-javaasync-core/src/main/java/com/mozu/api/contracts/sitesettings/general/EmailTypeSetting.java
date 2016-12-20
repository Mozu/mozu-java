/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.SiteSettings.General.Contracts.EmailTypeSetting ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailTypeSetting implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Email Address used to bcc in emails
	 */
	protected  String bccEmailAddressOverride;

	public String getBccEmailAddressOverride() {
		return this.bccEmailAddressOverride;
	}

	public void setBccEmailAddressOverride(String bccEmailAddressOverride) {
		this.bccEmailAddressOverride = bccEmailAddressOverride;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Email address to display on email messages sent from your site.
	 */
	protected  String replyToEmailAddressOverride;

	public String getReplyToEmailAddressOverride() {
		return this.replyToEmailAddressOverride;
	}

	public void setReplyToEmailAddressOverride(String replyToEmailAddressOverride) {
		this.replyToEmailAddressOverride = replyToEmailAddressOverride;
	}

	/**
	 * Email address used in emails sent to your shoppers
	 */
	protected  String senderEmailAddressOverride;

	public String getSenderEmailAddressOverride() {
		return this.senderEmailAddressOverride;
	}

	public void setSenderEmailAddressOverride(String senderEmailAddressOverride) {
		this.senderEmailAddressOverride = senderEmailAddressOverride;
	}

	/**
	 * Email Alais used in emails sent to your shoppers
	 */
	protected  String senderEmailAliasOverride;

	public String getSenderEmailAliasOverride() {
		return this.senderEmailAliasOverride;
	}

	public void setSenderEmailAliasOverride(String senderEmailAliasOverride) {
		this.senderEmailAliasOverride = senderEmailAliasOverride;
	}


}
