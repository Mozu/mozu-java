package com.mozu.test.framework.helper;

import java.util.ArrayList;
import java.util.List;

import com.mozu.api.contracts.core.Measurement;
import com.mozu.api.contracts.productadmin.AttributeInProductType;
import com.mozu.api.contracts.productadmin.LocationInventory;
import com.mozu.api.contracts.productadmin.LocationInventoryAdjustment;
import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductExtra;
import com.mozu.api.contracts.productadmin.ProductExtraValue;
import com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;
import com.mozu.api.contracts.productadmin.ProductLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductLocalizedImage;
import com.mozu.api.contracts.productadmin.ProductLocalizedSEOContent;
import com.mozu.api.contracts.productadmin.ProductOption;
import com.mozu.api.contracts.productadmin.ProductOptionValue;
import com.mozu.api.contracts.productadmin.ProductPrice;
import com.mozu.api.contracts.productadmin.ProductProperty;
import com.mozu.api.contracts.productadmin.ProductPropertyValue;
import com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductType;
import com.mozu.api.contracts.productadmin.PublishingScope;


public class ProductGenerator {

    public static Product generate(ProductType productType)
    {
        ArrayList<String> attributeFQNs = new ArrayList<String>();
        ArrayList<ProductExtra> extras = null;
        ArrayList<ProductProperty> properties = null;
        ArrayList<ProductOption> options = null;
        if (productType.getExtras() != null)
        {
            for (int i = 0; i < productType.getExtras().size(); i++)
            {
                if (!attributeFQNs.contains(productType.getExtras().get(i).getAttributeFQN()))
                {
                    if (extras == null)
                        extras = new ArrayList<ProductExtra>();
                    extras.add(generateProductExtra(productType.getExtras().get(i), null, null));
                    attributeFQNs.add(productType.getExtras().get(i).getAttributeFQN());
                }
            }
        }
        
        if (productType.getProperties() != null)
        {
        	for (int i = 0; i < productType.getProperties().size(); i++)
            {
        		if (!attributeFQNs.contains(productType.getProperties().get(i).getAttributeFQN()))
                {
                    if (properties == null)
                        properties = new ArrayList<ProductProperty>();
                    properties.add(generateProductProperty(productType.getProperties().get(i)));
                    attributeFQNs.add(productType.getProperties().get(i).getAttributeFQN());
                }
            }
        }
        
        if (productType.getOptions() != null)
        {
        	for (int i = 0; i < productType.getOptions().size(); i++)
            {
        		if (!attributeFQNs.contains(productType.getOptions().get(i).getAttributeFQN()))
                {
                    if (options == null)
                        options = new ArrayList<ProductOption>();
                    options.add(generateProductOption(productType.getOptions().get(i)));
                    attributeFQNs.add(productType.getOptions().get(i).getAttributeFQN());
                }
            }
        }
        return generate(productType.getId(), extras, options, properties);
    }

    public static Product generate(String productName, ProductType productType)
    {
    	Product product = generate(productType);
    	product.getContent().setProductName(productName);
    	return product;
    }
    
    public static Product generate(Integer productTypeId, List<ProductExtra> extras, List<ProductOption> options, List<ProductProperty> properties)
    {
    	Product pObj = new Product();
    	pObj.setProductCode(Generator.randomString(5,  Generator.AlphaChars));
    	pObj.setPrice(generateProductPrice(Generator.randomDecimal(50., 100.), null));
    	pObj.setSeoContent(generateProductLocalizedSEOContent());
    	pObj.setContent(generateProductLocalizedContent(Generator.randomString(6, Generator.AlphaChars), null));
    	pObj.setExtras(extras);
    	pObj.setOptions(options);
    	pObj.setProperties(properties);
    	pObj.setProductTypeId(productTypeId);
    	pObj.setProductUsage("Standard");
    	pObj.setPackageWeight(generateMeasurement("lbs", Generator.randomDecimal(50., 200.)));
    	return pObj;
    }

    public static ProductExtra generateProductExtra(AttributeInProductType attr, Boolean isMultiSelect, Boolean isRequired)
    {
    	ProductExtra extra = new ProductExtra();
    	extra.setAttributeFQN(attr.getAttributeFQN());
    	extra.setIsMultiSelect(isMultiSelect);
    	extra.setIsRequired(isRequired);
        if (attr.getVocabularyValues() != null)
        {
            for( int i = 0; i < attr.getVocabularyValues().size(); i++)
            {
                if (extra.getValues().isEmpty())
                {
                    extra.setValues(new ArrayList<ProductExtraValue>());
                }
                extra.getValues().add(generateProductExtraValue(Generator.randomDecimal(10., 20.),
                		attr.getVocabularyValues().get(i).getValue(), null, null));
            }
        }
        return extra;
    }

    public static ProductProperty generateProductProperty(AttributeInProductType attr)
    {
    	ProductProperty property = new ProductProperty();
    	property.setAttributeFQN(attr.getAttributeFQN());
        if (attr.getVocabularyValues() != null)
        {
            for( int i = 0; i < attr.getVocabularyValues().size(); i++)
            {
                if (property.getValues() == null)
                {
                	property.setValues(new ArrayList<ProductPropertyValue>());
                }
                property.getValues().add(generateProductPropertyValue(attr.getVocabularyValues().get(i).getValue(), generateProductPropertyValueLocalizedContent(Generator.randomString(10,  Generator.AlphaChars))));
                if (attr.getIsMultiValueProperty() != null && attr.getIsMultiValueProperty() == false)
                    break;
            }
        }
        return property;
    }

    public static ProductOption generateProductOption(AttributeInProductType attr)
    {
    	ProductOption option = new ProductOption();
    	option.setAttributeFQN(attr.getAttributeFQN());
        if (attr.getVocabularyValues() != null)
        {
            for( int i = 0; i < attr.getVocabularyValues().size(); i++)
            {
                if (option.getValues().isEmpty())
                {
                	option.setValues(new ArrayList<ProductOptionValue>());
                }
                option.getValues().add(generateProductOptionValue(attr.getVocabularyValues().get(i).getValue()));
            }
        }
        return option;
    }

    public static ProductExtraValue generateProductExtraValue(Double price, Object value, Double weight, Boolean isDefault)
    {
    	ProductExtraValue eValue = new ProductExtraValue();
    	eValue.setDeltaPrice(generateProductExtraValueDeltaPrice(price));
    	eValue.setValue(value);
    	eValue.setDeltaWeight(weight);
    	eValue.setIsDefaulted(isDefault);
    	return eValue;
    }
    
    public static ProductExtraValueDeltaPrice generateProductExtraValueDeltaPrice(Double price)
    {
    	ProductExtraValueDeltaPrice dprice = new ProductExtraValueDeltaPrice();
    	dprice.setCurrencyCode(Constants.Currency);
    	dprice.setDeltaPrice(price);
        return dprice; 
    }
    
    public static ProductPropertyValue generateProductPropertyValue(Object value, ProductPropertyValueLocalizedContent content)
    {
    	ProductPropertyValue pvalue =  new ProductPropertyValue();
    	pvalue.setContent(content);
    	pvalue.setValue(value);
    	return pvalue;
    }

    public static ProductPropertyValueLocalizedContent generateProductPropertyValueLocalizedContent(String value)
    {
    	ProductPropertyValueLocalizedContent content = new ProductPropertyValueLocalizedContent();
    	content.setLocaleCode(Constants.LocaleCode);
    	content.setStringValue(value);
    	return content;
    }

    public static ProductOptionValue generateProductOptionValue(Object value)
    {
    	ProductOptionValue vv =  new ProductOptionValue();
    	vv.setValue(value);
    	return vv;
    }

    public static ProductPrice generateProductPrice(Double price, Double salePrice)
    {
    	ProductPrice pPrice = new ProductPrice();
    	pPrice.setIsoCurrencyCode(Constants.Currency);
    	pPrice.setPrice(price);
    	pPrice.setSalePrice(salePrice);
        return pPrice;
    }

    public static ProductLocalizedSEOContent generateProductLocalizedSEOContent()
    {
    	ProductLocalizedSEOContent content =  new ProductLocalizedSEOContent();
    	content.setLocaleCode(Constants.LocaleCode);
    	content.setMetaTagDescription(Generator.randomString(10, Generator.AlphaChars));
    	content.setMetaTagKeywords(Generator.randomString(4,  Generator.AlphaChars));
    	content.setMetaTagTitle(Generator.randomString(5,  Generator.AlphaChars));
    	content.setTitleTagTitle(Generator.randomString(8, Generator.AlphaChars));
    	content.setSeoFriendlyUrl(Generator.randomURL());
    	return content;
    }

    public static ProductLocalizedContent generateProductLocalizedContent(String name, List<ProductLocalizedImage> imageList)
    {
    	ProductLocalizedContent content = new ProductLocalizedContent();
    	content.setLocaleCode(Constants.LocaleCode);
    	content.setProductFullDescription(Generator.randomString(10, Generator.AlphaChars));
    	content.setProductImages(imageList);
    	content.setProductName(name);
    	content.setProductShortDescription(Generator.randomString(5, Generator.AlphaChars));
    	return content;
    }
    
    public static Measurement generateMeasurement(String unit, Double value)
    {
    	Measurement mea = new Measurement();
    	mea.setUnit(unit);
    	mea.setValue(value);
    	return mea;
    }
    
    public static PublishingScope generatePublishingScope(Boolean allPending, List<String> productCodes)
    {
        PublishingScope scope = new PublishingScope();
        scope.setAllPending(allPending);
        scope.setProductCodes(productCodes);
        return scope;
    }

    
    public static ProductInCatalogInfo generateProductInCatalogInfo(Integer catalogId, List<ProductCategory> cates, String name, Double price, Boolean isActive,
            Boolean isContentOverridden, Boolean isPriceOverridden, Boolean isSEOContentOverridden)
    {
    	ProductInCatalogInfo info = new ProductInCatalogInfo();
    	info.setContent(generateProductLocalizedContent(name, null));
    	info.setSeoContent(generateProductLocalizedSEOContent());
    	info.setIsActive(isActive);
    	info.setIsContentOverridden(isContentOverridden);
    	info.setIsPriceOverridden(isPriceOverridden);
    	info.setIsseoContentOverridden(isSEOContentOverridden);
    	info.setPrice(generateProductPrice(Generator.randomDecimal(50., 100.), null));
    	info.setProductCategories(cates);
    	info.setCatalogId(catalogId);
    	return info;
    }

    public static ProductCategory generateProductCategory(int cateId)
    {
    	ProductCategory cat =  new ProductCategory();
    	cat.setCategoryId(cateId);
    	return cat;
    }
    
    public static LocationInventoryAdjustment generateLocationInventoryAdjustment(String locationCode, String productCode, String type, Integer value)
    {
    	LocationInventoryAdjustment adj =  new LocationInventoryAdjustment();
    	adj.setLocationCode(locationCode);
    	adj.setProductCode(productCode);
    	adj.setType(type);
    	adj.setValue(value);
    	return adj;
    }
    
    public static LocationInventory generateLocationInventory(String locationCode, String productCode, Integer stockOnHand)
    {
    	LocationInventory inv =  new LocationInventory();
    	inv.setLocationCode(locationCode);
    	inv.setProductCode(productCode);
    	inv.setStockOnHand(stockOnHand);
    	return inv;
    }

}
