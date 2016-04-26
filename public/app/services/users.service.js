angular.module('githubProxy').service('usersService', function ($http) {

    this.search = function(value){
        return $http.get('/api/users?q=' + value).then(function (response) {
            return response.data;
        });
    }

});