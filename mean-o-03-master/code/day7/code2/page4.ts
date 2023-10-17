// class declaration
class Person {
  // properties
  name: string
  age: number
  address: string

  // methods
  // - constructor
  // - destructor
  // - setter/mutator
  // - getter/inspector
  // - facilitator

  constructor(name: string = '', age: number = 0, address: string = '') {
    console.log(`inside constructor`)
    this.name = name
    this.address = address
    this.age = age
  }

  // facilitator
  printInfo() {
    console.log(`name: ${this.name}`)
    console.log(`age: ${this.age}`)
    console.log(`address: ${this.address}`)
  }
}

const p1 = new Person('person1', 40, 'pune')
p1.printInfo()

const p2 = new Person()
p2.printInfo()
