package com.mozu.api.events.model;

public class EventHandlerStatus {
    
    private String message;
    private int status;
    
    public EventHandlerStatus(String message, int status) {
        this.message = message;
        this.status = status;
    }
    
    public EventHandlerStatus(int status) {
        this.message = null;
        this.status = status;
    }
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
}
