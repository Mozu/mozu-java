/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class AttributeVocabularyValueUrl
{

	/**
	 * Get Resource Url for GetAttributeVocabularyValues
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeVocabularyValuesUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttributeVocabularyValueLocalizedContents
	 * @param attributeFQN 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeVocabularyValueLocalizedContentsUrl(String attributeFQN, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttributeVocabularyValueLocalizedContent
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeVocabularyValueLocalizedContentUrl(String attributeFQN, String localeCode, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttributeVocabularyValue
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The actual unique value of the attribute vocabulary to retrieve. A single attribute must have a unique value and match the attribute's data type. If a string value returns null, the system will generate a value. The actual string content displayed shoud be stored as "Content" and actual content is required for string values.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeVocabularyValueUrl(String attributeFQN, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAttributeVocabularyValueLocalizedContent
	 * @param attributeFQN 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl addAttributeVocabularyValueLocalizedContentUrl(String attributeFQN, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/localizedContent?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAttributeVocabularyValue
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addAttributeVocabularyValueUrl(String attributeFQN, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAttributeVocabularyValues
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAttributeVocabularyValuesUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAttributeVocabularyValueLocalizedContents
	 * @param attributeFQN 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAttributeVocabularyValueLocalizedContentsUrl(String attributeFQN, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAttributeVocabularyValueLocalizedContent
	 * @param attributeFQN 
	 * @param localeCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAttributeVocabularyValueLocalizedContentUrl(String attributeFQN, String localeCode, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAttributeVocabularyValue
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The actual unique value of the attribute vocabulary value to update. A single attribute must have a unique value and match the attribute's data type. If a string value returns null, the system will generate a value. The actual string content displayed shoud be stored as "Content" and actual content is required for string values.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAttributeVocabularyValueUrl(String attributeFQN, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAttributeVocabularyValue
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The actual unique value of the attribute vocabulary to delete. A single attribute must have a unique value and match the attribute's data type. If a string value returns null, the system will generate a value. The actual string content displayed shoud be stored as "Content" and actual content is required for string values.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAttributeVocabularyValueUrl(String attributeFQN, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAttributeVocabularyValueLocalizedContent
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAttributeVocabularyValueLocalizedContentUrl(String attributeFQN, String localeCode, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

