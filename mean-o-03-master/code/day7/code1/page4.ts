function add1(p1, p2) {
  console.log(`${p1} + ${p2} = ${p1 + p2}`)
}

// add1(10, 20)
// add1(10, '20')

function add2(p1: number, p2: number) {
  console.log(`${p1} + ${p2} = ${p1 + p2}`)
}

// add2(10, 20)
// add2(10, '20')

function multiply(p1: number, p2: number): number {
  return p1 * p2
}

// const multiplication = multiply(4, 5)
// console.log(`multiplication = ${multiplication}`)
// const answer = multiplication + 100
// console.log(`answer = ${answer}`)


const divide = (p1: number, p2: number) => {
  console.log(`division = ${p1 / p2}`)
}

divide(10, 20)