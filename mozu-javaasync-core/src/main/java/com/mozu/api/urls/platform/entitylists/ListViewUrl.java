/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform.entitylists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ListViewUrl
{

	/**
	 * Get Resource Url for GetViewEntity
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB (Mozu Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return   String Resource Url
	 */
	public static MozuUrl getViewEntityUrl(String entityId, String entityListFullName, String responseFields, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views/{viewName}/entities/{entityId}?responseFields={responseFields}");
		formatter.formatUrl("entityId", entityId);
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetViewEntities
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return   String Resource Url
	 */
	public static MozuUrl getViewEntitiesUrl(String entityListFullName, String filter, Integer pageSize, String responseFields, Integer startIndex, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views/{viewName}/entities?pageSize={pageSize}&startIndex={startIndex}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetViewEntityContainer
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB (Mozu Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return   String Resource Url
	 */
	public static MozuUrl getViewEntityContainerUrl(String entityId, String entityListFullName, String responseFields, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views/{viewName}/entityContainers/{entityId}?responseFields={responseFields}");
		formatter.formatUrl("entityId", entityId);
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetViewEntityContainers
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return   String Resource Url
	 */
	public static MozuUrl getViewEntityContainersUrl(String entityListFullName, String filter, Integer pageSize, String responseFields, Integer startIndex, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views/{viewName}/entityContainers?pageSize={pageSize}&startIndex={startIndex}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetEntityListView
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return   String Resource Url
	 */
	public static MozuUrl getEntityListViewUrl(String entityListFullName, String responseFields, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views/{viewName}?responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetEntityListViews
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getEntityListViewsUrl(String entityListFullName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views?responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateEntityListView
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createEntityListViewUrl(String entityListFullName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views/?responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateEntityListView
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateEntityListViewUrl(String entityListFullName, String responseFields, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views/{viewName}?responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteEntityListView
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteEntityListViewUrl(String entityListFullName, String viewName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/views/{viewName}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("viewName", viewName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

