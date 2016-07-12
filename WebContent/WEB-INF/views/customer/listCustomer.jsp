<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>List for registered Customers</title>
</head>
<body>
	<h2>List for registered Customers</h2>
 
	<c:if test="${not empty customers}">
		<table>
			<tr>
				<td>firstName</td>
				<td>lastName</td>
				<td>street</td>
				<td>district</td>
				<td>city</td>
				<td>phone</td>
				<td>email</td>
				
			</tr>
 
		
			<c:forEach var="listValue" items="${customers}">
				
				<tr>
					<td>${listValue.firstName}</td>
					<td>${listValue.lastName}</td>
					<td>${listValue.address.street}</td>
					<td>${listValue.address.district}</td>
					<td>${listValue.address.city}</td>
					<td>${listValue.contactInfo.phone}</td>
					<td>${listValue.contactInfo.email}</td>
				</tr>
			</c:forEach>
		
		</table>
 
	</c:if>
	<a href="/Rental-X/customer/customer">Register</a>
	
</body>
</html>