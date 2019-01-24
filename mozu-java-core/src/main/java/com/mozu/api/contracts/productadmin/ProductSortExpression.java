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
 *	Mozu.ProductRuntime.Contracts.ProductSortExpression ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSortExpression implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * ASC or DESC. Represents a product that is positioned out of its normal sort position. It can be boosted to the top of the list, positioned exactly or buried at the bottom.
	 */
	protected  String direction;

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * The name of the field to sort on. A known sort field or sortable attribute.
	 */
	protected  String field;

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}


}
