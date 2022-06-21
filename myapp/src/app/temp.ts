// Without Dependency Injection

// class Engine {

// }

// class Tyre {

// }

// class Car {
//     engine: Engine = ''
//     tyre: Tyre = ''

//     constructor() {
//         this.engine = new Engine()
//         this.tyre = new Tyre()
//     }
// }


// With Dependency Injection

// class Engine {
//     constructor(type: string) {

//     }

// }

// class Tyre {
//     constructor(type: string) {

//     }

// }

// let engine = new Engine()
// let tyre = new Tyre()


// class Car {
//     engine: Engine = ''
//     tyre: Tyre = ''

//     constructor(engine: Engine, tyre: Tyre) {
//         this.engine = engine;
//         this.tyre = tyre;
//     }
// }
