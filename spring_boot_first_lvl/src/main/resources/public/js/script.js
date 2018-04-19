var app = angular.module("spring", []);
app.controller("AppSpr", function ($scope, $http) {
    $scope.web = [];
    $http.get("http://localhost:8090/").then(function (response) {
        $scope.web = response.data;
    })
});