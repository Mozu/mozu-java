/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Summary properties of an unpublished document draft.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDraftSummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  DateTime activeUpdateDate;

	public DateTime getActiveUpdateDate() {
		return this.activeUpdateDate;
	}

	public void setActiveUpdateDate(DateTime activeUpdateDate) {
		this.activeUpdateDate = activeUpdateDate;
	}

	/**
	 * The unique identifier of the user that last updated the content or document draft.
	 */
	protected  String activeUpdatedBy;

	public String getActiveUpdatedBy() {
		return this.activeUpdatedBy;
	}

	public void setActiveUpdatedBy(String activeUpdatedBy) {
		this.activeUpdatedBy = activeUpdatedBy;
	}

	/**
	 * The unique identifier for the product catalog. Catalogs are part of a master catalog.
	 */
	protected  Integer catalogId;

	public Integer getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	/**
	 * Fully qualified name of the document type.
	 */
	protected  String documentTypeFQN;

	public String getDocumentTypeFQN() {
		return this.documentTypeFQN;
	}

	public void setDocumentTypeFQN(String documentTypeFQN) {
		this.documentTypeFQN = documentTypeFQN;
	}

	protected  DateTime draftUpdateDate;

	public DateTime getDraftUpdateDate() {
		return this.draftUpdateDate;
	}

	public void setDraftUpdateDate(DateTime draftUpdateDate) {
		this.draftUpdateDate = draftUpdateDate;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The fully qualified name of the document list.
	 */
	protected  String listFQN;

	public String getListFQN() {
		return this.listFQN;
	}

	public void setListFQN(String listFQN) {
		this.listFQN = listFQN;
	}

	/**
	 * Unique identifier for the master catalog.
	 */
	protected  Integer masterCatalogId;

	public Integer getMasterCatalogId() {
		return this.masterCatalogId;
	}

	public void setMasterCatalogId(Integer masterCatalogId) {
		this.masterCatalogId = masterCatalogId;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The unique identifier of the publish set.
	 */
	protected  String publishSetCode;

	public String getPublishSetCode() {
		return this.publishSetCode;
	}

	public void setPublishSetCode(String publishSetCode) {
		this.publishSetCode = publishSetCode;
	}

	protected  String publishType;

	public String getPublishType() {
		return this.publishType;
	}

	public void setPublishType(String publishType) {
		this.publishType = publishType;
	}

	/**
	 * Unique identifier for the site. This IDÂ is used at all levels of a store, catalog, and tenant to associate objects to a site.
	 */
	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	protected  String updatedBy;

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


}
