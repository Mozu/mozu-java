/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productadmin.Expression;

/**
 *	The expression you want for the target rule. Refer to [Product Rules](https://www.mozu.com/docs/Guides/settings/shipping.htm#product_rules) in the Shipping Settings guides topic for more information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Expression implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The expression field you wish to target. For example, if you wish to target the productCode field, this value would be productCode.Refer to [Dynamic Category Expressions](../../../developer/api-guides/dynamic-category-exp.htm) for more information about the supported expression fields.
	 */
	protected  String left;

	public String getLeft() {
		return this.left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	/**
	 * The logical operator you wish to perform on the nodes within the dynamic expression. Valid values are: "And", and "Or".
	 */
	protected  String logicalOperator;

	public String getLogicalOperator() {
		return this.logicalOperator;
	}

	public void setLogicalOperator(String logicalOperator) {
		this.logicalOperator = logicalOperator;
	}

	/**
	 * The operator you wish to perform on the left field. The valid values of this field are dependent on the left expression field. Refer to [Dynamic Category Expressions](../../../developer/api-guides/dynamic-category-exp.htm) for more information about the supported expression field operators.
	 */
	protected  String operator;

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * The literal values of the predicate that is validated against the combined values of the left and operator fields. For example, you wish to validate on products that have a product code of "shoe". You would write the following expression:`"type": "predicate",
			"left": "productCode",
			"operator": "eq",
			"right": "shoe".`
	 */
	protected  Object right;

	public Object getRight() {
		return this.right;
	}

	public void setRight(Object right) {
		this.right = right;
	}

	/**
	 * Specifies either the container of the dynamic expression, or the predicate of the node. Depending on where this is specified in the dynamic expression, the valid values are "container", and "predicate".Refer to [Dynamic Category Expressions](../../../../developer/api-guides/dynamic-category-exp.htm) for more information about using the type field.
	 */
	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * The node or container of the self-contained dynamic expression. The node contains the following expression fields in order: "type", "left", "operator", and "right".For example, a dynamic expression that specifies to include all products that are in the apparel category  would have the following node:`"type": "predicate",
			"left": "Categories.CategoryCode",
			"operator": "eq",
			"right": "apparel".`
	 */
	protected List<Expression> nodes;
	public List<Expression> getNodes() {
		return this.nodes;
	}
	public void setNodes(List<Expression> nodes) {
		this.nodes = nodes;
	}


}
