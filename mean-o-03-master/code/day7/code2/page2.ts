class Person {
  // property
  name: string
  address: string
  age: number

  // method
  printInfo() {
    console.log(`name: ${this.name}`)
    console.log(`address: ${this.address}`)
    console.log(`age: ${this.age}`)
  }
}