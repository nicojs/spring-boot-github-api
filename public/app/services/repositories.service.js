angular.module('githubProxy').service('repositoriesService', function ($http) {


    this.search = function (value) {
        return $http.get('/api/repositories?q=' + value).then(function (response) {
            return response.data;
        });
    }
});