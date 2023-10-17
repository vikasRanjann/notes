// class declaration
class Person {
  // properties
  name: string
  age: number
  address: string

  // methods
  printInfo() {
    console.log(`name: ${this.name}`)
    console.log(`age: ${this.age}`)
    console.log(`address: ${this.address}`)
  }
}

// instantiate a class
const p1 = new Person()
p1.name = "person1"
p1.address = "pune"
p1.age = 40
p1.printInfo()

const p2 = new Person()
p2.name = 'person2'
p2.address = 'mumbai'
p2.age = 50
p2.printInfo()