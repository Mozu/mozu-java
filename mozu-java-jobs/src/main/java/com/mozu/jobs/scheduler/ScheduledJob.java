/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */
package com.mozu.jobs.scheduler;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;

import com.mozu.jobs.handlers.JobHandler;

public class ScheduledJob implements Job {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledJob.class);

    protected Integer tenantId;
    protected Integer siteId;
    protected String jobName;
    
    protected JobHandler jobHandler = null;
    protected JobExecution jobExecution = null;

    public ScheduledJob() {
    }
    
    /**
     * Provided setter for QRTZ to set the tenant id from
     * job data specified at job creation time
     * @param tenantId
     */
    public void setTenantId(final Integer tenantId) {
        this.tenantId = tenantId !=null ? tenantId : null;
    }
    
    /**
     * Provided setter for QRTZ to set the site id from
     * job data specified at job creation time
     * @param siteId
     */
    public void setSiteId(final Integer siteId) {
        this.siteId = siteId != null ? siteId : null;
    }

    /**
     * Provided setter for QRTZ to set the job name from
     * job data specified at job creation time
     * @param jobName
     */
    public void setJobName(final String jobName) {
        this.jobName = jobName != null ? jobName : null;
    }

    /**
     * This is the method that is invoked by the Qrtz scheduler. It in turn
     * invokes the method executeJob method on the JobHandler that was
     * associated with the job when it was scheduled.
     * 
     */
    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        logger.info("Qrtz scheduled ratings import job");
        SchedulerContext schedulerContext = null;
        try {
            schedulerContext = context.getScheduler().getContext();
            jobHandler = (JobHandler)schedulerContext.get("jobHandler");
            JobParameters jobParams = buildJobParams();
            jobExecution = jobHandler.executeJob(tenantId, siteId, jobParams, jobName);
            System.out.println("JobExecutionId " + jobExecution.getId());
        } catch (SchedulerException e1) {
            logger.error("Error executing ratings import job");
        }
    }

    public JobParameters buildJobParams() {
        JobParametersBuilder builder = new JobParametersBuilder();
        builder.addLong("tenantId", tenantId.longValue());
        builder.addLong("siteId", siteId.longValue());
        builder.addLong("timestamp", new Date().getTime());
        return builder.toJobParameters();
    }
}
