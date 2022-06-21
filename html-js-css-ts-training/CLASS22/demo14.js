class Employee {
    empId;
    firstName;
    lastName;
    email;
    annualSallary;

    getFullName() {
        console.log(`${this.firstName} ${this.lastName}`)
    }
}

class FullTimeEmployee extends Employee {
    annualSallary;
}

class PartTimeEmployee extends Employee {
    hourSallary;
}

let fte = new FullTimeEmployee();
fte.firstName = 'Mathew';
fte.lastName = 'Evangelist';

let pte = new PartTimeEmployee();
pte.firstName = 'Luke';
pte.lastName = 'EvangelistToo'

fte.getFullName()
pte.getFullName()