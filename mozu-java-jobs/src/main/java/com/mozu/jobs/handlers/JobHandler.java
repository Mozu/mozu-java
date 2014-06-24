/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */

package com.mozu.jobs.handlers;

import java.util.Set;

import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mozu.jobs.dao.JobExecutionDao;

/**
 * Handler for Spring Batch Jobs. Glue class between QRTZ scheduled
 * jobs and Spring Batch jobs, allows for the autowired Spring batch
 * data structures.
 * @author john_gatti
 *
 */
@Service
public class JobHandler {
    private static final Logger logger = LoggerFactory.getLogger(JobHandler.class);

    public static final String TENANT_ID_PARAM = "tenantId";
    public static final String SITE_ID_PARAM = "siteId";

    @Autowired
    JobRegistry jobRegistry;
    
    @Autowired
    JobRepository jobRepository;
    
    @Autowired
    JobLauncher jobLauncher;
    
    @Autowired
    JobExplorer jobExplorer;

    @Autowired
    JobExecutionDao jobExecutionDao;

    /**
     * Read the file from the Bazaarvoice server and initiate 
     * processing of the file
     * 
     * @param tenantId Id of the tenant for this job. Used in the trigger and job keys
     * @param siteId Id of the site on this tenant (optional)
     */
    public JobExecution executeJob(Integer tenantId, Integer siteId, JobParameters jobParams, String jobName)
            throws JobExecutionException {
        JobExecution jobExecution = null;
        
        Job job;
        try {
            job = jobRegistry.getJob(jobName);
            // check to see if there is a current running job for this site.
            jobExecution = getRunningJobExecution(tenantId.longValue(), siteId.longValue(), jobName);

            if (jobExecution == null) {
                jobExecution = jobLauncher.run(job, jobParams);
            }
            
        } catch (NoSuchJobException e) {
            logger.error("NoSuchJobException: " + e.getMessage());
        } catch (JobExecutionAlreadyRunningException e) {
            logger.error("JobExecutionAlreadyRunningException: " + e.getMessage());
        } catch (JobRestartException e) {
            logger.error("JobRestartException: " + e.getMessage());
        } catch (JobInstanceAlreadyCompleteException e) {
            logger.error("JobInstanceAlreadyCompleteException: " + e.getMessage());
        } catch (JobParametersInvalidException e) {
            logger.error("JobParametersInvalidException: " + e.getMessage());
        }
        return jobExecution;
    }
    

    private JobExecution getRunningJobExecution(Long tenantId, Long siteId, String jobName) {
        JobExecution runningJobExecution = null;

        // get running jobs to see if the site is currently running
        Set<JobExecution> jobExecutions = jobExplorer.findRunningJobExecutions(jobName);
        for (JobExecution jobExecution : jobExecutions) {
            JobParameters jobParameters = jobExecution.getJobParameters();
            if ((tenantId.equals(jobParameters.getLong(TENANT_ID_PARAM))
                    && siteId != null && siteId.equals(jobParameters
                    .getLong(SITE_ID_PARAM)))

            ||

            (tenantId.equals(jobParameters.getLong(TENANT_ID_PARAM)) && siteId == null)) {
                if (!jobExecution.isStopping())
                    runningJobExecution = jobExecution;
                break;
            }
        }

        return runningJobExecution;
    }

    public JobExecution getJobExecution(Long executionId) {
        return jobExplorer.getJobExecution(executionId);
    }
    
    public JobRegistry getJobRegistry() {
        return jobRegistry;
    }
}
