package com.mozu.api.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class UrlFormatterTest {
    @Test
    public void testUrlFormat () {
        UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productId}/locationinventory")  ;
        formatter.formatUrl("productId", "Lowrise pants-002");
        assertEquals ("/api/commerce/catalog/storefront/products/Lowrise%20pants-002/locationinventory", formatter.getResourceUrl());
    }
}
