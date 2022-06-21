// class Customer {
//     firstName: string;
//     lastName: string;
//     constructor(firstName: string, lastName: string) {
//         console.log('constructor called');
//         this.firstName = firstName;
//         this.lastName = lastName;
//     }
//     getFullName() {
//         console.log(`${this.firstName} ${this.lastName}`);
//     }
// }
// let customer = new Customer ('Paul', 'Apostle');
// customer.firstName = 'Peter';
// customer.lastName = 'Apostle';
// customer.getFullName()
var Customer = /** @class */ (function () {
    function Customer(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Customer.prototype.getFullName = function () {
        console.log("".concat(this.firstName, " ").concat(this.lastName));
    };
    return Customer;
}());
var customer = new Customer('Paul', 'Apostle');
customer.getFullName();
