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

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCollectionInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String collectionName;

	public String getCollectionName() {
		return this.collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	protected  String collectionProductCode;

	public String getCollectionProductCode() {
		return this.collectionProductCode;
	}

	public void setCollectionProductCode(String collectionProductCode) {
		this.collectionProductCode = collectionProductCode;
	}

	protected  Boolean isPrimaryCollection;

	public Boolean getIsPrimaryCollection() {
		return this.isPrimaryCollection;
	}

	public void setIsPrimaryCollection(Boolean isPrimaryCollection) {
		this.isPrimaryCollection = isPrimaryCollection;
	}


}
