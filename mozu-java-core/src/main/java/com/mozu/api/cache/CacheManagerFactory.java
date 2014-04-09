package com.mozu.api.cache;

public class CacheManagerFactory {
    private static CacheManager<?> manager = null;
    
    private CacheManagerFactory() {}
    
    public static CacheManager<?> getCacheManager() {
        return manager;
    }
    
    public static void setCacheManager(CacheManager<?> mgr) {
        manager = mgr;
    }

}
