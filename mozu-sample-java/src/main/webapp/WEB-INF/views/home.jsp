<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
	<title>Mozu Sample Application</title>
</head>
<body>
	<img alt="Mozu" src="resources/images/logo_new.png"/>
	<h1>Mozu Java API Sample Application</h1>
        <form action="authorization" method="post">
        	<table>
        		<c:if test="${not empty errorString}">
			  		<tr><td colspan="2"><div style="color : red;">${errorString}</div></td></tr>
			  	</c:if>
              <tr>
              	<td><label for="appId">Environment:</label></td>
            	<td><select name="environment" id="environment">
            	        <c:forEach var="environment" items="${environments}">
            	        	<option value="${environment}">${environment}</option>
						</c:forEach>
				</td>		            	        
              </tr>	
              <tr>
              	<td><label for="appId">Application ID:</label></td>
              	<td><input type="text" id="appId" name="appId"/></td>
              </tr>	
              <tr>
              	<td><label for="sharedSecret">Shared Secret:</label></td>
            	<td><input type="password" id="sharedSecret" name="sharedSecret"/></td>
              </tr>	
              <tr>
              	<td><label for="email">Email:</label></td>
            	<td><input type="text" id="email" name="email"/></td>
              </tr>	
              <tr>
              	<td><label for="password">Password</label></td>
            	<td><input type="password" id="password" name="password"/></td>
              </tr>	
              <tr>
              	<td>
		            <input type="submit" value="Authenticate"/>
		        </td>
		      </tr>
		   </table
        </form>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
