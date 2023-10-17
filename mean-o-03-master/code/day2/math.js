
function add_func(p1, p2) {
  console.log(`addition = ${p1 + p2}`)
}

function subtract(p1, p2) {
  console.log(`subtraction = ${p1 - p2}`)
}

function divide(p1, p2) {
  console.log(`division = ${p1 / p2}`)
}

function multiply(p1, p2) {
  console.log(`multiplication = ${p1 * p2}`)
}

const pi = 3.14

// export the entities
module.exports = {
  add: add_func,
  subtract: subtract,
  divide: divide,
  multiply: multiply,
  pi: pi
}

// console.log(module)

// module.exports = () => {
//   console.log('inside exported function')
// }
