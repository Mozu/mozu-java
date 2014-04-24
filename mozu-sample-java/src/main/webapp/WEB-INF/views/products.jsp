<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Mozu Sample Application</title>
</head>
<body>
	<img alt="Mozu" src="resources/images/logo_new.png"/>
	
	<h1>Product for ${tenantAuthorization.activeScope.name}</h1>
	
   	<table>
   		<input type="button" onclick="location='<c:url value="tenants?tenantId=${tenantAuthorization.activeScope.id}"/>'" value="Back"/>
   		<tr><th>Product ID</th><th>Product Name</th><th>Price</th></tr>
		<c:forEach var="product" items="${products}">
        <tr><td>${product.productCode}</td><td>${product.content.productName}</td><td>${product.price.price}</td>
        </c:forEach>
    </table>
</body>
</html>
              
  		