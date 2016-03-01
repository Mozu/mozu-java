package com.mozu.api.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class UrlFormatterTest {
    @Test
    public void testUrlFormat () {
        UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productId}/locationinventory?filter={filter}&searchFilter={searchFilter}")  ;
        formatter.formatUrl("productId", "Lowrise pants-002");
        formatter.formatUrl("filter", "id eq 1111");
        formatter.formatUrl("searchFilter", null);
        
        assertEquals ("/api/commerce/catalog/storefront/products/Lowrise%20pants-002/locationinventory?filter=id%20eq%201111", formatter.getResourceUrl());
    }
    
    @Test
    public void testUrlFormat2 () {
        UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productId}/locationinventory?filter={filter}&searchFilter={searchFilter}")  ;
        formatter.formatUrl("productId", "Lowrise pants-002");
        formatter.formatUrl("filter", null);
        formatter.formatUrl("searchFilter", null);
        
        assertEquals ("/api/commerce/catalog/storefront/products/Lowrise%20pants-002/locationinventory", formatter.getResourceUrl());
    }

    @Test
    public void testUrlFormat3 () {
        UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productId}/locationinventory?filter={filter}&searchFilter={searchFilter}")  ;
        formatter.formatUrl("productId", "Lowrise pants-002");
        formatter.formatUrl("filter", "id eq 1111");
        formatter.formatUrl("searchFilter", "ratings > 3.5");
        
        assertEquals ("/api/commerce/catalog/storefront/products/Lowrise%20pants-002/locationinventory?filter=id%20eq%201111&searchfilter=ratings%20%3E%203.5", formatter.getResourceUrl());
    }
}
