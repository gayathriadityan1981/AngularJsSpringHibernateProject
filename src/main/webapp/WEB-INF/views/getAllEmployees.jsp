
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
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-resource.min.js"></script>
    
   <!--
   <script type="text/javascript" src="app.js"></script>
    <script type="text/javascript" src="route-config.js"></script>  --> 
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 </head> 


<body >
<div  ng-controller="employeeController">
<div class="panel panel-default">
	<div class="panel-heading">Employees</div>
	<div class="panel-body">
		<form class="col-md-4"  name="empForm">
		<div class="form-group">
			<label for="employeeName">Employee ID</label>
			<input type="text" ng-model="employee.id" class="form-control" id="employeeId" placeholder="Enter employee id">
		</div>		
		<div class="form-group">
			<label for="employeeName">Employee Name</label>
			<input type="text" ng-model="employee.empName" class="form-control" id="employeeName" placeholder="Enter employee name">
		</div>
		<div class="form-group">
			<label for="employeeSalary">Employee Salary</label>
			<input type="text" ng-model="employee.empAddress" class="form-control" id="employeeSalary" placeholder="Enter employee salary">
		</div>	
		<div class="form-group">
			<label for="employeeDepartment">Employee Department</label>
			<input type="text" ng-model="employee.empMobileNos" class="form-control" id="employeeDepartment" placeholder="Enter employee department">
		</div>
		<button type="submit" class="btn btn-default" ng-click="saveEmployee()">Register</button>
		<button type="submit" class="btn btn-default" ng-click="refresh()">Refresh</button>
	</form>
	<p class="bg-info info-msg">{{Message}}</p>
	<div class="table-responsive col-md-8">
		<table class="table table-striped">
			<tr>
				<th>Name</th>
				<th>Address</th>
				<th>Mobile Numbers</th>
				
			</tr>
			<tr ng-repeat="employee in employees">
				
				<td>{{employee.empName}}</td>
				<td>{{employee.empAddress}}</td>
				<td>{{employee.empMobileNos}}</td>
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
</div>
</div>
<script>

//var app=angular.module("myApp",'[ngResource]');
var app=angular.module("myApp",'[]');
console.log("------------0----------");
app.controller('employeeController', [
    '$scope', 'empService',
    function employeeController($scope, empService) {
    	console.log("------------1----------");
        var vm = this;
        vm.employees = [];

        vm.getEmployees = function() {
            empService.getEmployees("/getAllEmployees")
                .then(function(employees) {
                    vm.employees = employees;
                 	console.log("------------1----------"+employees);
                    console.log('employees returned to controller.');
                },
                function(data) {
                    console.log('employees retrieval failed.')
                });
        };
        
        vm.getEmployees();
    }
]);

/*
app.controller('myCtrl',function($scope,$http){    
	 $scope.insertData=function(){      
	 $http.post("insert.php", {
	    'bname':$scope.bname,
	    'bphone':$scope.bphone})        

	 .success(function(data,status,headers,config){
	 console.log("Data Inserted Successfully");
	 });
	    }
	     });*/


	</script>
</body>
</html>