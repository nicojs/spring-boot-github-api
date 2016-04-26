angular.module('githubProxy').controller('Users', function (usersService, $routeParams) {
    var ctrl = this;
    usersService.get($routeParams['id']).then(function(user) {
        ctrl.user = user;
    });
});