/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.installedapplications;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.InstalledApplications.Contracts.ExtensionConfiguration ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtensionConfiguration implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.InstalledApplications.Contracts.ExtensionConfiguration applicationKey ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String applicationKey;

	public String getApplicationKey() {
		return this.applicationKey;
	}

	public void setApplicationKey(String applicationKey) {
		this.applicationKey = applicationKey;
	}

	/**
	 * Mozu.InstalledApplications.Contracts.ExtensionConfiguration configuration ApiTypeMember DOCUMENT_HERE 
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode configuration;

	public com.fasterxml.jackson.databind.JsonNode getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(com.fasterxml.jackson.databind.JsonNode configuration) {
		this.configuration = configuration;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(configuration == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, configuration);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.configuration = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
