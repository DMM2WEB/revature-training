const employee = {
    empId: 1,
    firstName: 'Mathew',
    lastName: 'Evangelist',
    email: 'm@mail.com'
}

//let empId = employee.empId;
//let firstName = employee.firstName;
//let lastName = employee.lastName;
//let email = employee.email;

//console.log(firstName + '' + lastName)

//destructuring
let {empId, firstName, lastName, email} = employee;

console.log(firstName + '' + lastName)

let scores = [30, 40, 50, 60];
//let a = scores[0]
//let b = scores[1]
//let c = scores[2]
//let d = scores[3]

let [a, b, c, d] = scores

console.log(a, b, c, d)