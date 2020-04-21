package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A collection of holds placed on product inventory so that the quantities
 * specified are made available for the ordering process.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductReservationCollection implements Serializable {
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer pageCount;

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	protected Integer pageSize;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	protected Integer startIndex;

	public Integer getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	protected List<ProductReservation> items;

	public List<ProductReservation> getItems() {
		return this.items;
	}

	public void setItems(List<ProductReservation> items) {
		this.items = items;
	}

}
