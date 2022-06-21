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

class Customer{
    constructor(private firstName: string, private lastName: string) {
    }

    getFullName () {
        console.log(`${this.firstName} ${this.lastName}`);
    }
}

let customer = new Customer ('Paul', 'Apostle');
customer.getFullName()