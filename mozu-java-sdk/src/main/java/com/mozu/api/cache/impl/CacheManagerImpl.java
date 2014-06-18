package com.mozu.api.cache.impl;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;
import org.apache.jcs.engine.control.CompositeCache;
import org.apache.jcs.engine.control.CompositeCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.cache.CacheManager;
import com.mozu.api.cache.CacheManagerFactory;

public class CacheManagerImpl<T> implements CacheManager<T> {
    private static final Logger logger = LoggerFactory.getLogger(CacheManagerImpl.class);
    private static final String CACHE_NAME = "mozuCache";
	private JCS jcsCache;
	private boolean _isInitialized = false;
	
    public CacheManagerImpl() {
    }
    
    public void startCache() {
        try {
          // Loading the cache using the configuration file
          jcsCache = JCS.getInstance(CACHE_NAME);
          _isInitialized = true;
        } catch (CacheException e) {
            logger.warn("Cache initialization failed");
            e.printStackTrace();
        }
        CacheManagerFactory.setCacheManager(this);
        logger.info("Cache manager initialized");
    }

    public void put(String id, T cacheObject) {
    	if (!_isInitialized) return;
        try {
              jcsCache.put(id, cacheObject);
        } catch (CacheException e) {
              e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
	public T get(String id) {
    	if (!_isInitialized) return null;
    	return (T)jcsCache.get(id);
    }
	
	public void remove(String id) {
		if (!_isInitialized) return;
		try {
	        jcsCache.remove(id);
		} catch (CacheException e) {
	        e.printStackTrace();
		}
	}
	
    public void stopCache() {
        CompositeCacheManager.getInstance().freeCache(CACHE_NAME);
        CompositeCache.elementEventQ.destroy();
        CompositeCacheManager.getInstance().shutDown();
        logger.debug("Cache cleanup complete");
    }
}
