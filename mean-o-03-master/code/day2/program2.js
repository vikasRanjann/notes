function function1() {
  const numbers = [1, 2, 3, 4, 5]
  console.log(numbers)

  // add a new value
  numbers.push(6)
  console.log(numbers)

  // remove the last value
  numbers.pop()
  console.log(numbers)

  // remove in between value
  numbers.splice(1, 1)
  console.log(numbers)

  console.log(`is 5 there in the array? ${numbers.includes(5)}`)
  console.log(`is 5 there in the array? ${numbers.indexOf(5)}`)

  console.log(`is 10 there in the array? ${numbers.includes(10)}`)
  console.log(`is 10 there in the array? ${numbers.indexOf(10)}`)

  console.log(numbers.join(','))
}

// function1()

function function2() {
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  // traditional for loop
  for (let index = 0; index < numbers.length; index++) {
    const value = numbers[index];
    console.log(`value = ${value}`)
  }

  console.log('------------------------------------------------------------')

  // for..of loop
  for (const value of numbers) {
    console.log(`value = ${value}`)
  }

  console.log('------------------------------------------------------------')

  // for ... each loop
  numbers.forEach(value => {
    console.log(`value  = ${value}`)
  });
}

// function2()


function function3() {
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  // square of every numbers
  const squares = numbers.map(value => {
    console.log(`value = ${value}`)
    return value ** 2
  })
  console.log(squares)

  // find the even numbers
  const evens = numbers.filter(value => {
    console.log(`value = ${value}`)
    return value % 2 == 0
  })
  console.log(evens)

  // add all the numbers
  const addition = numbers.reduce((x, y) => {
    return x + y
  })
  console.log(`addition = ${addition}`)

}

function3()
