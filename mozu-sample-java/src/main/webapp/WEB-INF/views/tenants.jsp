<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Mozu Sample Application</title>
</head>
<body>
	<img alt="Mozu" src="resources/images/logo_new.png"/>
	<h1>Welcome, ${user.firstName} ${user.lastName}</h1> 
	You have successfully logged into the Mozu Sample Application!</h1>
	
	<c:if test="${not empty errorString}">
		<tr><td colspan="2"><div style="color : red;">${errorString}</div></td></tr>
	</c:if>
	
	
	<h3>Select a Tenant</h3>
        <form name="tenantSelector" action="products" method="post">
        	<table>
              <tr>
              	<td><label for="appId">Available Tenants:</label></td>
            	<td><select name="tenant" id="tenant" onChange="location='tenants?tenantId='+tenant.options[tenant.selectedIndex].value">
            	
            	        <c:forEach var="tenant" items="${availableTenants}">
            	        	<option <c:if test="${tenant.id == tenantId}">selected</c:if> value="${tenant.id}">${tenant.name}</option>
						</c:forEach>
					</select>
				</td>		            	        
              </tr>	
              <tr>
              	<td><label for="appId">Sites:</label></td>
            	<td><select name="site" id="site">
            	        <c:forEach var="site" items="${sites}">
            	        	<option value="${site.id}">${site.name}</option>
						</c:forEach>
					</select>	
				</td>		            	        
              </tr>	
              <tr>
              	<td>
		            <input type="submit" value="Get Products"/>
		            <input type="button" value="Get Orders" onClick="tenantSelector.action='orders'; tenantSelector.submit();"/>
		            <input type="button" value="Logout" onclick="location='<c:url value="logout"/>';"/>
		        </td>
		      </tr>
              
		   </table
        </form>
</body>
</html>
              
  		