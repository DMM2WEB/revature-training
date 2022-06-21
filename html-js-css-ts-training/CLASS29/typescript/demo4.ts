let a;
a = 10;
a = 'A';
a = true;
a = 10.0

let b: number;
b = 10;
//b = 'A';

let c = 10;
c = 20;
//c = 'A';

let d: number;
let e: string;
let f: boolean;
let g: any;
let h: any[] =[1, true, 'A', 10.00]
let k: number[] = [1, 2, 3]

const colorRed = 10
const colorBlue = 20

enum Colors{
    Red,
    Blue,
    Green
}

console.log(Colors.Blue);

enum Days{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday
}

Days.Friday;

enum Gender{
    Male = 100,
    Female = 200
}

console.log(Gender.Male);
