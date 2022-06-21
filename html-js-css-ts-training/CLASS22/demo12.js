class Person {
    firstName;
    lastName;

    getFullName() {
        console.log(`${this.firstName} ${this.lastName}`)
    }
}

let person = new Person();
person.firstName = 'Mathew';
person.lastName = 'Evangelist';
person.getFullName();