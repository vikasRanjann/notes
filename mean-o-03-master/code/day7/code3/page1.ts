// aggregation

class Address {
  constructor(
    private _city: string,
    private _state: string,
    private _country: string) {

  }

  printAddress() {
    console.log(`city = ${this._city}`)
    console.log(`state = ${this._state}`)
    console.log(`country = ${this._country}`)
  }
}

// Person has-a address
class Person {

  constructor(
    private _name: string,
    private _address: Address) {
  }

  printInfo() {
    console.log(`name: ${this._name}`)
    this._address.printAddress()
  }
}

// House has-a address
class House {
  constructor(
    private _address: Address,
    private _rooms: number) {
  }

  printInfo() {
    console.log(`room = ${this._rooms}`)
    this._address.printAddress()
  }
}

const p1 = new Person('person1', new Address('pune', 'MH', 'india'))
p1.printInfo()

console.log('')

const h1 = new House(new Address('mumbai', 'MH', 'india'), 3)
h1.printInfo()