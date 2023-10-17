function function1() {
  // array of numbers
  const numbers = [10, 20, 30, 40, 50]

  console.log(numbers)

  // add new number
  numbers.push(60)
  console.log(numbers)

  // remove the last value
  numbers.pop()
  console.log(numbers)

  // remove one value from index 2
  numbers.splice(2, 1)
  console.log(numbers)

  // check if 40 is available in the array
  console.log(`is 40 there? ${numbers.includes(40)}`)
  console.log(`is 30 there? ${numbers.includes(30)}`)

  // get the index of a value
  console.log(`40 is there on index ${numbers.indexOf(40)}`)
  console.log(`30 is there on index ${numbers.indexOf(30)}`)

}

// function1()


function function2() {
  const numbers = [1, 2, 3, 4, 5]

  // calls the parameter function for every 
  // value within the array
  const squares = numbers.map(function (number) {
    return Math.pow(number, 2)
    // return number * number
    // return number ** 2
  })

  console.log(numbers)
  console.log(squares)
}

function2()


























