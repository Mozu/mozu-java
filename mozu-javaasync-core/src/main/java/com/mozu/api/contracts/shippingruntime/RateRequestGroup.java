/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingruntime.RateRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RateRequestGroup implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected List<RateRequest> rateRequests;
	public List<RateRequest> getRateRequests() {
		return this.rateRequests;
	}
	public void setRateRequests(List<RateRequest> rateRequests) {
		this.rateRequests = rateRequests;
	}


}