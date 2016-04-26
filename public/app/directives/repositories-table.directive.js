angular.module('githubProxy')
    .directive('repositoriesTable', function () {
        return {

            restrict: 'E',
            templateUrl: '/app/directives/repositories-table.html',
            scope: {
                repositories: '=repositories',
            },
            link: function (scope) {
                scope.title = 'Something else';
            }
        };
    });