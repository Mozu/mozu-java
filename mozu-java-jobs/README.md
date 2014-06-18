SUMMARY

The Mozu Job JAR simplifies and provides the base code for Spring Batch jobs and
for periodic scheduled jobs using the Quartz job scheduling package. The package
provides the following:
* Quartz job scheduler instance
* Base class for Quartz scheduled jobs
* A standard job handler for Spring batch jobs
* Base class for Spring batch jobs
* Access classes to the Spring batch data for visibility
  into current or previous batch executions
  
INCLUSION INTO GRADLE BUILD

Insert the following into your build.gradle file as a dependency:
	compile ("com.mozu.api:mozu-api-jobs:1.0.0")

CONFIGURATION

The package assumes the use of the standard Mozu integrations configuration 
scheme where properties are available in the mozu_configuration.properties file. 

The package requires the following configuration items be added to the 
mozu_config.properties file:

	db_url=jdbc:jtds:{YOUR SPRING BATCH DATABASE URL HERE}
	db_username={YOUR SPRING BATCH DATABASE USERNAME HERE}
	db_password={YOUR SPRING BATCH DATABASE PASSWORD HERE}

	#Quartz
	org.quartz.scheduler.instanceName={YOUR INTEGRATION NAME HERE}

	org.quartz.jobStore.class = org.quartz.impl.jdbcjobstore.JobStoreTX
	org.quartz.jobStore.driverDelegateClass = org.quartz.impl.jdbcjobstore.MSSQLDelegate
	org.quartz.jobStore.dataSource=bvconversation

	org.quartz.threadPool.class=org.quartz.simpl.SimpleThreadPool
	org.quartz.threadPool.threadCount=5

	org.quartz.dataSource.bvconversation.driver=net.sourceforge.jtds.jdbc.Driver
	org.quartz.dataSource.bvconversation.URL=jdbc:jtds:{YOUR QRTZ DATABASE URL HERE}
	org.quartz.dataSource.bvconversation.user={YOUR QRTZ DATABASE USERNAME HERE}
	org.quartz.dataSource.bvconversation.password={YOUR QRTZ DATABASE PASSWORD HERE}
	org.quartz.dataSource.bvconversation.maxConnections=8

GENERAL FLOW

An application defines a scheduled job that can be scheduled at an hourly frequency
or on a daily basis. This application is responsible for calling the appropriate
method in the package to schedule the job (JobScheduler.addJob(....) or
JobScheduler.updateJob(...)). The application is also responsible for deleting 
these jobs when they are no longer needed, such as when the app is disabled. 
Jobs are persistent across server or app restarts.

When a job is triggered, the job parameters are retrieved from the job and used 
to start a Spring Batch job using the job name given when the job was created. 
The Spring batch job is defined using the standard Spring batch job definition 
xml, typically in a file in the resources/jobs directory. The batch job may have
multiple steps, each conforming to the Spring batch format. Helper classes are
provided to ease some of the housekeeping.
	
USAGE

Creating a scheduled job
To create a scheduled job, extend the class com.mozu.jobs.scheduler.ScheduledJob.
This class provides a default buildJobParams method that adds the tenant id, site
id and timestamp to the scheduled job parameters. If your application needs more
than this, override the default method and add the additional parameters to the
job builder.

Creating a batch job
The package adds a default JobHandler. This class is autowired into the scheduler
and includes all the Spring Batch structures. The default JobHandler is used to 
execute Spring batch jobs. This is a Spring service and is wired into the 
application. When a scheduled job is executed, JobHandler is autowired into the
scheduled job so it can be accessed.

There are cases where a Spring batch job needs to be executed outside of the 
Quartz scheduled job method. Batch jobs can be executed directly by getting the
job parameters from the scheduled job created above (in Creating a scheduled job
section). These parameters are then used in a direct call to the JobHandler.executeJobs
method.

This package provides a helper class to get the base job parameters that are
needed for each Mozu batch job - job name, tenant id and site id. Application 
batch jobs can extend this class (BaseBatchJob). Any custom parameters can be 
added to the application batch job in a similar manner.

TRACKING/REPORTING ON JOBS
This package provides helper classes to retrieve the state of jobs that are
currently executing or have already been executed. These classes retrieve data
from the Spring batch data structures. These helper classes are in the package
com.mozu.jobs.dao
