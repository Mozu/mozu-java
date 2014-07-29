mozu-integrations-template
==========================

This directory contains a 'starter' project for creating a Mozu Integrations web application.  

This project contains code for:
- Skeleton web application that uses Spring, Spring MVC, and ThymeLeaf template engine.
- Mozu Event Handling
- Mozu Event Security
- Mozu application security
- Code for setting the application to "initialized" in Mozu
- Mozu Integrations UI Look and Feel, including css and standard layout.
- Gradle builds

To run the example follow the following steps:
1. Create an extension application in Mozu Dev Center.  Be sure to set the behaviors you'll need.
2. Copy the Application ID and shared secret to src\main\resources\mozu_config.properties
3. Start the web application using Gradle and Jetty: gradlew jettyRun
4. The web application needs to running on a server that can be reached from the Mozu server.  You can use Runscope Passageway (https://www.runscope.com/docs/passageway) to make your server public.
5. Add the Configuration URL of the server you started in the Mozu Dev Center application definition you created in step 1.
6. If you have not created a sandbox, create one in the Mozu Dev Center.
7. Install the application to a sandbox.
8. "View" the sandbox you installed the application. This brings up the Mozu Site Builder.
9. Under "Settings | Applications" you should see your application listed.  Click on it.
10. Click "Configuration" and the "Mozu Template Example Connector" application should appear in a modal window.    

 
 
