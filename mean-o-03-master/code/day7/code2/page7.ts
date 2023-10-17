// class declaration
class Person {

  // constructor
  constructor(
    private _name: string = '',
    private _age: number = 0,
    private _address: string = '') {

    console.log(`inside constructor`)
  }

  // accessors
  public get name(): string {
    console.log('inside get name()')
    return this._name
  }

  public set name(name: string) {
    console.log('inside set name()')
    this._name = name
  }

  public get address(): string { return this._address }
  public set address(address: string) { this._address = address }

  public get age(): number { return this._age }
  public set age(age: number) {
    if ((age < 18) || (age > 60)) {
      throw new Error('invalid age')
    }
    this._age = age
  }

  // facilitator
  printInfo() {
    console.log(`name: ${this._name}`)
    console.log(`age: ${this._age}`)
    console.log(`address: ${this._address}`)
  }
}

const p1 = new Person('person1', 30, 'pune')
p1.name = "person3"
p1.printInfo()
console.log(`name: ${p1.name}`)
