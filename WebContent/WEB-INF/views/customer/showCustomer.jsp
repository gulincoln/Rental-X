<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Show Details from Customer</title>
</head>
<body>

<h2>Details from registered Customer</h2>
   <table>
    <tr>
        <td>firstName:</td>
        <td>${firstName}</td>
    </tr>
    <tr>
        <td>lastName:</td>
        <td>${lastName}</td>
    </tr>
    <tr>
        <td>street:</td>
        <td>${street}</td>
    </tr>
    <tr>
        <td>district:</td>
        <td>${district}</td>
    </tr>    
    <tr>
        <td>city:</td>
        <td>${city}</td>
    </tr>    
    <tr>
        <td>phone:</td>
        <td>${phone}</td>
    </tr>
    <tr>
        <td>email:</td>
        <td>${email}</td>
    </tr>     
</table>  
<a href="/Rental-X/customer/customer">Register</a>
<a href="/Rental-X/customer/listCustomer">List</a>

</body>
</html>