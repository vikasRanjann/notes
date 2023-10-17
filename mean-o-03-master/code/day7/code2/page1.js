// usig JSON
const person = { name: 'person1', age: 30 }
console.log(`type = ${typeof (person)}`, person)

// using Object
const mobile = new Object()
mobile.model = 'iPhone'
mobile.company = 'Apple'
mobile.price = 144000
console.log(`type = ${typeof (mobile)}`, mobile)


// using constructor function
function Car(model, company, price) {
  this.model = model
  this.company = company
  this.price = price
}

Car.prototype.printInfo = function () {
  console.log(`model: ${this.model}`)
  console.log(`company: ${this.company}`)
  console.log(`price: ${this.price}`)
}

const c1 = new Car('i20', 'hyundai', 7.5)
console.log(`type = ${typeof (c1)}`, c1)
c1.printInfo()

const c2 = new Car('i10', 'hyundai', 5.5)
console.log(`type = ${typeof (c2)}`, c2)
c2.printInfo()

const c3 = new Car('nano', 'tata', 2.5)
console.log(`type = ${typeof (c3)}`, c3)
c3.printInfo()
