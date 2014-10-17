package com.mozu.test.framework.helper;

import org.apache.commons.lang.RandomStringUtils;

import com.mozu.api.contracts.productadmin.Attribute;
import com.mozu.api.contracts.productadmin.AttributeLocalizedContent;
import com.mozu.api.contracts.productadmin.AttributeValidation;

public class ProductAttributeGenerator {

    public static Attribute generate(String name, String inputType, String valueType,
            String dataType, boolean isOption, boolean isExtra, boolean isProperty) {
        Attribute attribute = new Attribute();
        attribute.setAttributeCode(name.replaceAll("\\s+",""));
        AttributeLocalizedContent content = new AttributeLocalizedContent();
        content.setName(name);
        content.setLocaleCode(Constants.LocaleCode);
        attribute.setContent(content);
        attribute.setAdminName (name);
        attribute.setInputType(inputType);
        attribute.setValueType(valueType);
        attribute.setDataType (dataType);
        attribute.setIsOption (isOption);
        attribute.setIsExtra (isExtra);
        attribute.setIsProperty (isProperty);
        return attribute;
    }

}
