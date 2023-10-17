// functions demo

// named function
function add1(p1, p2) {
  const addition = p1 + p2
  console.log(`addition = ${addition}`)
}

// add1(10, 20)


// anonymous function
const add2 = function (p1, p2) {
  const addition = p1 + p2
  console.log(`addition = ${addition}`)
}

// console.log(`add2 = ${add2}, type = ${typeof (add2)}`)
// add2(10, 20)


// arrow function
// fat arrow function
const add3 = (p1, p2) => {
  const addition = p1 + p2
  console.log(`addition = ${addition}`)
}
add3(10, 20)