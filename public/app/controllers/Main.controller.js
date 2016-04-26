angular.module('githubProxy')
    .controller('Main', function (repositoriesService, usersService) {
        this.searchPattern = '';
        var ctrl = this;
        this.searchClicked = function (event) {
            repositoriesService.search(this.searchPattern).then(function (repositories) {
                ctrl.repositories = repositories;
            });
            usersService.search(this.searchPattern).then(function (users) {
                ctrl.users = users;
            });
        };

    });