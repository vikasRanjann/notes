const num = 100
console.log(`num = ${num}, type = ${typeof (num)}`)

const firstName = 'steve'
console.log(`firstName = ${firstName}, type = ${typeof (firstName)}`)

const canVote = true
console.log(`canVote = ${canVote}, type = ${typeof (canVote)}`)

// JSON
const person = { name: "person1", age: 40 }
console.log(`person = ${person}, type = ${typeof (person)}`)

// Object
const mobile = new Object()
mobile.model = 'iphone 10 xs max'
mobile.price = 144000
mobile.company = 'Apple'
console.log(mobile)

// constructor function
function Car(model, company) {
  this.model = model
  this.company = company
}

const car1 = new Car('i20', 'hyundai')
console.log(car1)
