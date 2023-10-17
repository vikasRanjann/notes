// functional programming
// - functions are considered as first class citizens
//   - create variables of functions
// - a function can be passed a parameter to another function
// - a function can be returned from a function as a return value

function function1(p1) {
  // p1 = function3
  console.log('inside function1')
  console.log(`p1 = ${p1}, type = ${typeof (p1)}`)
}

// p1 = number
// function1(10)

// p1 = string
// function1("test")

// p1 = boolean
// function1(true)

// p1 = number
const num = 100
// function1(num)

// function alias
// function pointer in c
const function2 = function1
// function2(5000)

const function3 = () => {
  console.log('inside function3')
}
// function1(function3)

function execute(func) {
  // function alias
  console.log(`inside execute`)
  console.log(func)
  console.log(`type of func = ${typeof (func)}`)

  func(10, 20)
}

function add(p1, p2) {
  console.log(`addition = ${p1 + p2}`)
}

execute(add)

// arrow function
const subtract = (p1, p2) => {
  console.log(`subtraction = ${p1 - p2}`)
}

execute(subtract)

// const divide = function (p1, p2) {
//   console.log(`division = ${p1 / p2}`)
// }

execute(function (p1, p2) {
  console.log(`division = ${p1 / p2}`)
})

execute((p1, p2) => {
  console.log(`multiplication = ${p1 * p2}`)
})