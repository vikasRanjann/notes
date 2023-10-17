// inheritance => is-a

// superclass
// - parent class
// - base class
class Person {
  constructor(
    protected name: string,
    protected address: string,
    protected age: number) {
  }

  printInfo() {
    console.log(`name: ${this.name}`)
    console.log(`address: ${this.address}`)
    console.log(`age: ${this.age}`)
  }
}


// subclass
// - child class
// - derrived class
class Employee extends Person {

  constructor(
    protected id: number,
    name: string,
    address: string,
    age: number) {

    super(name, address, age)
  }

  // method override
  printInfo() {
    console.log(`id: ${this.id}`)
    console.log(`name: ${this.name}`)
    console.log(`address: ${this.address}`)
    console.log(`age: ${this.age}`)
  }
}

const p1 = new Person('person1', 'pune', 30)
p1.printInfo()

console.log('')

const e1 = new Employee(1, 'emp1', 'mumbai', 40)
e1.printInfo()