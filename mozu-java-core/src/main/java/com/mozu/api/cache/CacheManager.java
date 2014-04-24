package com.mozu.api.cache;

public interface CacheManager<T> {
	void put(String id, T cacheObject);
	T get(String id);
	void remove(String id);
}
