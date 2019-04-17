
<!DOCTYPE html>

<html ng-app="myApp">
<head>
	<meta charset="ISO-8859-1">
	<title>Angular Js Spring Project</title>

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script> 
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.19/angular-route.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="app.js"></script>
    <script type="text/javascript" src="route-config.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 </head> 


<body >
<div  ng-controller="bookController">
<div class="table-responsive col-md-8">
		<table class="table table-striped">
			<tr>
				<th>Name</th>
				<th>Author</th>
			</tr>
		<tr ng-repeat="obj in books">
				<td>{{obj.name}}</td>
				<td>{{obj.title}}</td>

				<td>
					<button type="button" class="btn btn-default" ng-click="updateEmployeeInit(employee)">
					<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
					</button>
					<button type="button" class="btn btn-default" ng-click="deleteEmployeeInit(employee)">
					<span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span>
					</button>
				</td>
			</tr>
			
		</table>
	</div>

</div>
<script>



</script>
</body>
</html>