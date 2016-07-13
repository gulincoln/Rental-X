<!-- template bisso -->

<%@page import="java.sql.DriverManager, java.sql.Connection"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <link href="customer.css" rel="stylesheet">
    
  </head>
  <body>
    
    <h1>Register Customer</h1>
    
<form:form method="POST" action="/Rental-X/customer/addCustomer">    
<h3 class=""><i class="fa fa-user"></i><span class="glyphicon glyphicon-user"></span></h3>
    <div class="container">
		<form>
			<!-- Start Requester -->
			<div class="panel panel-danger">
				<div class="panel-body">
					<div class="row">
						<div class="col-md-2">
							<div class="form-group">
								<td><form:label path="firstName">First name: </form:label></td>
        						<td><form:input path="firstName" /></td>
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<td><form:label path="lastName">Last name: </form:label></td>
        						<td><form:input path="lastName" /></td>
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<td><form:label path="address.street">Street: </form:label></td>
        						<td><form:input path="address.street" /></td>
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<td><form:label path="address.district">District: </form:label></td>
        						<td><form:input path="address.district" /></td>
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<td><form:label path="address.city">City: </form:label></td>
        						<td><form:input path="address.city" /></td>
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<td><form:label path="contactInfo.phone">Phone: </form:label></td>
        						<td><form:input path="contactInfo.phone" /></td>
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<td><form:label path="contactInfo.email">Email: </form:label></td>
        						<td><form:input path="contactInfo.email" /></td>
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="submit" class="form-control" 
										value="Submit" />
							</div>
						</div>
					
					</div>
				</div>	
			</div>
			
</form:form>
<a href="/Rental-X/customer/listCustomer">List</a>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/vendors/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
</body>
</html>			

