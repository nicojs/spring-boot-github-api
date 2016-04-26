
angular.module('githubProxy', ['ngRoute'])
    .config(function($routeProvider){
        $routeProvider.when('/users/:id', {
            controller: 'Users',
            templateUrl: '/app/controllers/users.view.html',
            controllerAs: 'ctrl'
        }).when('/', {
            controller: 'Main',
            templateUrl: '/app/controllers/main.html',
            controllerAs: 'ctrl'
        }).otherwise('/');

    });