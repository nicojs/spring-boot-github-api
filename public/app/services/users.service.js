angular.module('githubProxy').service('usersService', function ($http) {

    this.search = function(value){
        return $http.get('/api/users?q=' + value).then(function (response) {
            return response.data;
        });
    };

    this.get = function(id){
        return $http.get('/api/users/' + id).then(function (response) {
            return response.data;
        });
    }

});