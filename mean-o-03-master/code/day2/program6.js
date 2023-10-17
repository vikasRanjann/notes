// importing the exported members of math module
const math = require('./math')
const persons = require('./persons')

console.log(math)
console.log(persons)

// making call to exported members
math.add(10, 20)
math.subtract(50, 30)
math.divide(10, 5)
math.multiply(4, 5)

console.log(`pi = ${math.pi}`)

// console.log(module)