package com.mozu.api.cache;


import android.support.v4.util.LruCache;

public class CacheManagerImpl<T> implements CacheManager<T> {
    int cacheSize = 4 * 1024 * 1024; // 4MiB
    LruCache cache;
    public CacheManagerImpl() {

    }

    public void put(String id, T cacheObject) {

    }

	public T get(String id) {
        return null;
    }
	
	public void remove(String id) {

	}
}
