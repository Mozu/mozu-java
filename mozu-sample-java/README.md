mozu-sample-java
================

A sample Java web application that demostrates how to use the Mozu Java API.

To build and run:
* Download the mozu-java-sdk git project.  
* In the mozu-java-sdk root directory run gradlew clean install
* Download the mozu-sample-java project to your machine.
* In the mozu-sample-java directory run gradlew clean build jettyRun.  This will build the application and start a Jetty web service.

In order to access Mozu through the sample application you must do the following steps in the Mozu application:
* Obtain a developer account on mozu.
* Log into Mozu with your mozu developer account.
* Create an "Application" record in Mozu Dev Center.  ( Applications | Create Application) 
* Create a tenant in mozu.
* Return to your application you created in step 3. Click "Install Application" and select the site you want the sample application to access.
* Return to the tenant you created in step 4.  Click "View Tenant" then "Catalog | Inventory" to add products to your catalog.
* Add Orders for the product you created.

Running the Sample application:
* Use a browser to go to the Mozu Sample application (Default: http://localhost:8080/MozuSample)
* Get the Application ID and Shared Secret from the application you installed in step 3.  You can get this from the Applications page in the Mozu Dev Center.
* The user name and password is your development account credentials.
* Once logged in, you can access the tenant and site you created in step 4.  You should be able to see the products and orders you created in step 6 and 7. 
