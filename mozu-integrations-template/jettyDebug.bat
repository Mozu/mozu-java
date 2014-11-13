set GRADLE_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,address=9999,server=y,suspend=n
:: set GRADLE_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,address=9999,server=y,suspend=n -Dhttps.proxyHost=127.0.0.1 -Dhttps.proxyPort=8888
gradlew jettyRun