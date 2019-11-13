/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general.general;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Set whether you require users to be authenticated to preview content or view the live site.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewAuthorizations implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Specifies whether to enable secure communication across your entire site, using the SSL (Secure Socket Layer) security protocol. Every page on your site will display as an HTTPS page and contain an SSL certificate.
	 */
	protected  Boolean enforceSitewideSSL;

	public Boolean getEnforceSitewideSSL() {
		return this.enforceSitewideSSL;
	}

	public void setEnforceSitewideSSL(Boolean enforceSitewideSSL) {
		this.enforceSitewideSSL = enforceSitewideSSL;
	}

	/**
	 * Require log in to view live storefront site.
	 */
	protected  Boolean requireAuthForLive;

	public Boolean getRequireAuthForLive() {
		return this.requireAuthForLive;
	}

	public void setRequireAuthForLive(Boolean requireAuthForLive) {
		this.requireAuthForLive = requireAuthForLive;
	}

	/**
	 * Require log in to view pending storefront site.
	 */
	protected  Boolean requireAuthForPending;

	public Boolean getRequireAuthForPending() {
		return this.requireAuthForPending;
	}

	public void setRequireAuthForPending(Boolean requireAuthForPending) {
		this.requireAuthForPending = requireAuthForPending;
	}


}
