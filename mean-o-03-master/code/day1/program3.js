// creating an object using JSON
// JSON: JavaScript Object Notation
const person = {
  name: "person1",
  age: 20,
  email: "person1@test.com"
}

// console.log(person)



// creating an object using Object
// Object: function provided by JS
//         for creating object
const mobile = new Object()

// add new properties
mobile.model = "iPhone XS"
mobile.price = 144000
// console.log(mobile)



// creating an object using constructor function
// constructor function
function Car(model, company, price) {

  // add new properties
  this.model = model
  this.company = company
  this.price = price
}

const car1 = new Car('i20', 'hyundai', 7.5)
console.log(car1)

const car2 = new Car('i10', 'hyundai', 5.5)
console.log(car2)