/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BpmConfiguration implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String shipmentType;

	public String getShipmentType() {
		return this.shipmentType;
	}

	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

	protected  String workflowContainerId;

	public String getWorkflowContainerId() {
		return this.workflowContainerId;
	}

	public void setWorkflowContainerId(String workflowContainerId) {
		this.workflowContainerId = workflowContainerId;
	}

	protected  String workflowProcessId;

	public String getWorkflowProcessId() {
		return this.workflowProcessId;
	}

	public void setWorkflowProcessId(String workflowProcessId) {
		this.workflowProcessId = workflowProcessId;
	}


}
