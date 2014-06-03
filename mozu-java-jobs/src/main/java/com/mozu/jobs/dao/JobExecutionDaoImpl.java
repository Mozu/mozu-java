/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */
package com.mozu.jobs.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.core.repository.dao.AbstractJdbcBatchMetadataDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class JobExecutionDaoImpl extends AbstractJdbcBatchMetadataDao implements JobExecutionDao {
    private DataSource dataSource;

    public final String JOB_EXECUTION_BY_TENANT = "SELECT TOP 20 ex.JOB_EXECUTION_ID "
                                                    + "from BATCH_JOB_EXECUTION ex  "
                                                    + "JOIN BATCH_JOB_EXECUTION_PARAMS param on param.JOB_EXECUTION_ID = ex.JOB_EXECUTION_ID AND param.KEY_NAME = 'tenantId' and param.LONG_VAL = ? "
                                                    + "JOIN BATCH_JOB_INSTANCE inst on inst.JOB_INSTANCE_ID = ex.JOB_INSTANCE_ID AND inst.JOB_NAME = ? "
                                                    + "ORDER BY JOB_EXECUTION_ID DESC";
    
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        setJdbcTemplate(new JdbcTemplate(dataSource));
    }

    public List<Long> getRecentJobExecutionIds(Long tenantId, String jobName) {
        return getJdbcTemplate().queryForList(JOB_EXECUTION_BY_TENANT, Long.class, tenantId, jobName);
    }

}
