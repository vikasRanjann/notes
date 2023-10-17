class Person {

  // properties
  private name: string
  private age: number
  private address: string

  // constructor
  constructor(name: string, age: number, address: string) {
    console.log(`inside constructor`)
    this.name = name
    this.address = address
    this.age = age
  }

  // getter
  public getName(): string { return this.name }
  public getAddress(): string { return this.address }
  public getAge(): number { return this.age }

  // setter
  public setName(name: string) { this.name = name }
  public setAge(age: number) {
    if ((age < 0) || (age > 60)) {
      throw new Error('invalid age')
    }

    this.age = age
  }
  public setAddress(address: string) { this.address = address }

  // facilitator
  printInfo() {
    console.log(`name: ${this.name}`)
    console.log(`age: ${this.age}`)
    console.log(`address: ${this.address}`)
  }
}

const p1 = new Person('person1', 40, 'pune')
// p1.age = -30
p1.setAge(30)
// p1.printInfo()

console.log(`name: ${p1.getName()}`)
console.log(`age: ${p1.getAge()}`)