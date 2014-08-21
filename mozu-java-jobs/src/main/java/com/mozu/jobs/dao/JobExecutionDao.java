/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */
package com.mozu.jobs.dao;

import java.sql.Timestamp;
import java.util.List;

public interface JobExecutionDao {
    List<Long> getRecentJobExecutionIds(Long tenantId, List<String>jobNames);
    
    List<Long> getRecentJobExecutionIds (Long tenantId,String jobName);

    Timestamp getLastExecutionDate(Long tenantId, String jobName);

}
