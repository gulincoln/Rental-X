<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Customer register</title>
</head>
<body>

<h2>Form for Customer register</h2>
<form:form method="POST" action="/Rental-X/customer/addCustomer">
   <table>
    <tr>
        <td><form:label path="firstName">firstName: </form:label></td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td><form:label path="lastName">lastName: </form:label></td>
        <td><form:input path="lastName" /></td>
    </tr>
 		   	<tr>
		        <td><form:label path="address.street">street: </form:label></td>
		        <td><form:input path="address.street" /></td>
		    </tr>
   			<tr>
		        <td><form:label path="address.district">district: </form:label></td>
		        <td><form:input path="address.district" /></td>
		    </tr>    
		    <tr>
		        <td><form:label path="address.city">city: </form:label></td>
		        <td><form:textarea path="address.city" /></td>
		    </tr>
    <tr>
        <td><form:label path="contactInfo.phone">phone: </form:label></td>
        <td><form:input path="contactInfo.phone" /></td>
    </tr>        
    <tr>
        <td><form:label path="contactInfo.email">email: </form:label></td>
        <td><form:textarea path="contactInfo.email" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
<a href="/Rental-X/customer/listCustomer">List</a>

</body>
</html>