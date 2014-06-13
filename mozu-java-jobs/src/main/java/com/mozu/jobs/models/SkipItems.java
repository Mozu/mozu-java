/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */
package com.mozu.jobs.models;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;


public class SkipItems implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String jobName;
    private String type;
    private String item;
    private String msg;
    private Long runId;
    private Long jobExecutionId;
    private Long stepExecutionId;

    public SkipItems () {
    }
 
    public SkipItems (String type, String item, String msg, 
            Long jobExecutionId, Long stepExecutionId, String jobName) {
        setType(type);
        setItem(item);
        setMsg(StringUtils.abbreviate(msg, 999));
        setJobExecutionId(jobExecutionId);
        setStepExecutionId(stepExecutionId);
        setJobName(jobName);
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
   
    public String getJobName() {
        return jobName;
    }
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Long getRunId() {
        return runId;
    }
    public void setRunId(Long runId) {
        this.runId = runId;
    }
    public Long getJobExecutionId() {
        return jobExecutionId;
    }
    public void setJobExecutionId(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }
    public Long getStepExecutionId() {
        return stepExecutionId;
    }
    public void setStepExecutionId(Long stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }
 
}