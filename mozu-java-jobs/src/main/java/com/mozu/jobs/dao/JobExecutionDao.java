/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */
package com.mozu.jobs.dao;

import java.util.List;

public interface JobExecutionDao {
    List<Long> getRecentJobExecutionIds (Long tenantId,String jobName);
}
