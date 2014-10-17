package com.mozu.test.framework.helper;

import com.mozu.api.contracts.productadmin.Attribute;
import com.mozu.api.contracts.productadmin.Category;
import com.mozu.api.contracts.productadmin.CategoryLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;

public class ProductCategoryGenerator {
    public static Category generate(String name, Boolean isDisplayed, Integer parentCategoryId) {
        Category cat = new Category();
        cat.setContent(generateCategoryLocalizedContent(name));
        cat.setIsDisplayed(isDisplayed);
        return cat;
    }

    public static CategoryLocalizedContent generateCategoryLocalizedContent(String name) {
    	CategoryLocalizedContent content = new CategoryLocalizedContent();
    	content.setName(name);
    	content.setDescription(Generator.randomString(10, Generator.AlphaChars));
    	content.setLocaleCode(Constants.LocaleCode);
    	content.setMetaTagDescription(Generator.randomString(10, Generator.AlphaChars));
    	content.setMetaTagKeywords(Generator.randomString(5, Generator.AlphaChars));
    	content.setMetaTagTitle(Generator.randomString(5, Generator.AlphaChars));
    	content.setPageTitle(Generator.randomString(5, Generator.AlphaChars));
    	content.setSlug(Generator.randomString(4,  Generator.AlphaChars));
        return content;
    }
}
