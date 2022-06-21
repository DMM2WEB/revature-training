class Users {
    constructor (
        public id?: number,
        public firsName?: string,
        public lastName?: string
    ) {}

    getFullName () {
        console.log(`${this.firsName} ${this.lastName}`);
    }
}

let users = new Users (1, 'Peter');
let users2 = new Users ();