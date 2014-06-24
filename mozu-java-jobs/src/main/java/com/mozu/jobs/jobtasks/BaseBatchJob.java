/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */
package com.mozu.jobs.jobtasks;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

public class BaseBatchJob {

    protected Integer tenantId;
    protected Integer siteId;
    protected String jobName;

    @Value("#{jobParameters['jobName']}")
    public void setJobName(final String jobName) {
        this.jobName = StringUtils.isEmpty(jobName) ? jobName : null;
    }
    
    @Value("#{jobParameters['tenantId']}")
    public void setTenantId(final Long tenantId) {
        this.tenantId = tenantId !=null ? tenantId.intValue() : null;
    }
    
    @Value("#{jobParameters['siteId']}")
    public void setSiteId(final Long siteId) {
        this.siteId = siteId != null ? siteId.intValue() : null;
    }
}
