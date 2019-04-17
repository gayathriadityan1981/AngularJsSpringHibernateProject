<! DOCTYPE html>

<html 
ng-app="routingApp">

<head>

<title>AngularJS Routing</title>

<script

src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.19/angular.js"></script>

<script

src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.19/angular-route.js"></script>

</head>

<body 
ng-controller="routingCtrl">

<ul>

<li><a href="#/">Default Route</a></li>

<li>< a href="#/Spring/JavaInterviewPoint">Spring</a></li>

<li><a
href="#/Angularjs">Angularjs</a></li>

<li><a
href="#/Unknown">Unknown</a></li>

</ul>

<div 
ng-view></div>



<script
type="text/javascript">

var app =
angular .module('routingApp',['ngRoute']);

app.config(function($routeProvider)

{

$routeProvider

.when('/',

{

template : 'This is Default page',

controller : 
'routingCtrl'

})

.when('/Spring/:message',

{

templateUrl : 
'/about.html',

controller : 
'routingCtrl'

})

.when('/Angularjs',

{

template : 'This is Angularjs page'

})

.otherwise(

{

redirectTo : 
'/'

});

});

app.controller('routingCtrl',
function($routeParams,$scope)

{

$scope.message =
$routeParams.message;

});

</script>

</body>

</html>

