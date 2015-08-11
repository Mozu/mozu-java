package com.mozu.api.cache.db;

import java.io.Serializable;


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