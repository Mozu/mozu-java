package com.mozu.api.sample.model;

import org.springframework.stereotype.Component;

@Component
public class Environment {
    private String key = null;
    private String value = null;
    public Environment () {
        
    }
    
    public Environment (String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
