<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title></title>

    <!-- Bootstrap -->
    <link href="resources/vendors/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/vendors/font-awesome-4.5.0/css/font-awesome.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
  </head>
  <body>
    
    <h1>Hello, world!</h1>
    
    
    <div class="container">
		<form>
			<!-- Start Requester -->
			<h3 class=""><i class="fa fa-user"></i> - <span class="glyphicon glyphicon-user"></span> Requester </h3>
			<div class="panel panel-danger">
				<div class="panel-body">
					<h5>Informe bla bla bla</h5>
					<div class="row">
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										placeholder="Search for Requester Id">
								<span id="helpBlock" class="help-block">Search by id or Requester Name</span>
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										placeholder="Name">
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										placeholder="Phone Extention">
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										placeholder="Cell Phone">
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<select size="1" class="form-control" 
										placeholder="Approver">
									<option value=""></option>
									<option value="Bisso">Bisso</option>
								</select>
							</div>
						</div>
					
					</div>
				</div>	
			</div>
		</form>
	</div>
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/vendors/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
</body>
</html>