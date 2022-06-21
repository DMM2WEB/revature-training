var Users = /** @class */ (function () {
    function Users(id, firsName, lastName) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
    }
    Users.prototype.getFullName = function () {
        console.log("".concat(this.firsName, " ").concat(this.lastName));
    };
    return Users;
}());
var users = new Users(1, 'Peter');
var users2 = new Users();
