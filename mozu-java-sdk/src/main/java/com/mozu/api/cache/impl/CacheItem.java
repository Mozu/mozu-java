package com.mozu.api.cache.impl;

import java.io.Serializable;

import org.apache.http.HttpMessage;

public class CacheItem implements Serializable {
	String key;
    String content;
    String eTag;
    
    
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String geteTag() {
		return eTag;
	}
	public void seteTag(String eTag) {
		this.eTag = eTag;
	}
    
    
}
