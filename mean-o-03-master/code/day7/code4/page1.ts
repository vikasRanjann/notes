function function1() {
  // implicit declaration of an array
  const numbers = [10, 20, 30, 40, 50]
  console.log(numbers)

  numbers.push(60)
  console.log(numbers)

  numbers.splice(3, 1)
  console.log(numbers)

}

// function1()

function function2() {
  // explicit declaration of an array
  const numbers: number[] = [10, 20, 30, 40, 50]
  console.log(numbers)

  numbers.push(60)
  console.log(numbers)

  numbers.splice(3, 1)
  console.log(numbers)

  const number2 = numbers.map(value => {
    return value + 100
  })

  console.log(number2)

  const numbers3 = numbers.filter(value => {
    return value > 30
  })

  console.log(numbers3)

  const sum = numbers.reduce((x, y) => {
    return x + y
  })

  console.log(sum)
}

function2()