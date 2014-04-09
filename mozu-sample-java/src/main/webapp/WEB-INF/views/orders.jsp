<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Mozu Sample Application</title>
</head>
<body>
	<img alt="Mozu" src="resources/images/logo_new.png"/>
	<h1>Orders for ${tenantAuthorization.activeScope.name}</h1>
	
   	<table border="1" cellpadding="10">
   		<input type="button" onclick="location='<c:url value="tenants?tenantId=${tenantAuthorization.activeScope.id}"/>'" value="Back"/>
   		<tr><th>Order Number</th><th>Submitted Date</th><th>Customer ID</th><th>Total</th><th>Status</th></tr>
		<c:forEach var="order" items="${orders}">
        <tr><td align="right">${order.orderNumber}</td><td align="center">${order.submittedDate}</td><td align="center">${order.customerAccountId}</td><td align="right">$ ${order.total}</td><td align="center">${order.status}</td>
        </c:forEach>
    </table>
</body>
</html>
              
  		