class Employee {
    empId: number;
    firstName: string;
    lastName: string;
    email: string;
    type: string

    getFullName () {
        console.log(`${this.firstName} ${this.lastName} - ${this.type}`);        
    }
}

class FullTimeEmployee extends Employee {
    annualSalary: number
}

class PartTimeEmployee extends Employee {
    hourSalary: number
}

let fte = new FullTimeEmployee();
fte.firstName = 'Peter';
fte.lastName = 'Apostle';
fte.type = 'FTE'

let pte = new PartTimeEmployee();
pte.firstName = 'Paul';
pte.lastName = 'Apostle';
pte.type = 'PTE'

fte.getFullName()
pte.getFullName()
