package com.mozu.test.framework.helper;

import java.util.ArrayList;
import java.util.List;

import com.mozu.api.contracts.productadmin.Attribute;
import com.mozu.api.contracts.productadmin.AttributeInProductType;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValueInProductType;
import com.mozu.api.contracts.productadmin.ProductType;


public class ProductTypeGenerator {
	
    public static ProductType generate(String productTypeName) {
        ArrayList<Attribute> attrs = new ArrayList<Attribute>();
        return generate(attrs, productTypeName);    	
    }

    public static ProductType generate(Attribute attr, String productTypeName) {
        ArrayList<Attribute> attrs = new ArrayList<Attribute>();
        attrs.add(attr);
        return generate(attrs, productTypeName);    	
    }

    public static ProductType generate(ArrayList<Attribute> attrs, String productTypeName) {
        ArrayList<AttributeInProductType> extras = null;
        ArrayList<AttributeInProductType> properties = null;
        ArrayList<AttributeInProductType> options = null;
        for (int i = 0; i < attrs.size(); i++)
        {
        	AttributeInProductType attrInPT = GenerateAttributeInProductType(attrs.get(i), 0, null, null, null, null);
            if (attrs.get(i).getIsOption() != null)
            {
                if (attrs.get(i).getIsOption())
                {
                    if (options == null)
                        options = new ArrayList<AttributeInProductType>();
                    options.add(attrInPT);
                }
            }
            if (attrs.get(i).getIsExtra() != null)
            {
                if (attrs.get(i).getIsExtra())
                {
                    if (extras == null)
                        extras = new ArrayList<AttributeInProductType>();
                    extras.add(attrInPT);
                }
            }
            if (attrs.get(i).getIsProperty() != null)
            {
                if (attrs.get(i).getIsProperty())
                {
                    if (properties == null)
                    {
                        properties = new ArrayList<AttributeInProductType>();
                    }
                    attrInPT.setIsMultiValueProperty(true);
                    properties.add(attrInPT);
                }
            }
        	
        }
        return generate(productTypeName, options, properties, extras);
    }
    
    public static ProductType generate(String name, ArrayList<AttributeInProductType> options,
            ArrayList<AttributeInProductType> properties, ArrayList<AttributeInProductType> extras) 
    {
    	ProductType prodt = new ProductType();
    	prodt.setName(name);
    	prodt.setOptions(options);
    	prodt.setProperties(properties);
    	prodt.setExtras(extras);
    	List<String> usages = new ArrayList<String>();
    	usages.add("Standard");
    	usages.add("Bundle");
    	prodt.setProductUsages(usages);
        return prodt;
    }

    public static AttributeInProductType GenerateAttributeInProductType(Attribute attr, Integer order, Boolean isHiddenProperty, Boolean isInheritedFromBaseType, Boolean isMultiValueProperty, Boolean IsRequiredByAdmin)
    {
    	AttributeInProductType attrtp = new AttributeInProductType();
    	attrtp.setAttributeFQN(attr.getAttributeFQN());
    	attrtp.setIsHiddenProperty(isHiddenProperty);
    	attrtp.setIsInheritedFromBaseType(isInheritedFromBaseType);
    	attrtp.setIsMultiValueProperty(isMultiValueProperty);
    	attrtp.setIsRequiredByAdmin(IsRequiredByAdmin);
    	attrtp.setOrder(order);
        if (attr.getVocabularyValues() != null)
        {
            attrtp.setVocabularyValues(new ArrayList<AttributeVocabularyValueInProductType>());
        	for (int i = 0; i < attr.getVocabularyValues().size(); i++)
        	{
                attrtp.getVocabularyValues().add(GenerateAttributeVocabularyValueInProductType(attr.getVocabularyValues().get(i).getValue(), null));        		
        	}
        }
        return attrtp;
    }

    public static AttributeVocabularyValueInProductType GenerateAttributeVocabularyValueInProductType(Object value, Integer order)
    {
    	AttributeVocabularyValueInProductType type = new AttributeVocabularyValueInProductType();
    	type.setValue(value);
    	type.setOrder(order);
        return type;
    }

}
