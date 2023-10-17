// spread and rest operation

function function1() {
  // reference type
  const person1 = {
    name: 'person1',
    age: 40,
    address: 'pune'
  }

  // const person2 = new Object()
  // person2.name = person1.name
  // person2.age = person1.age
  // person2.address = person1.address
  // person2.phone = '+9123424324'

  // console.log(person1)
  // console.log(person2)


  const person2 = {
    ...person1,
    phone: '+9123422324'
  }

  console.log(person1)
  console.log(person2)

  // const person3 = new Object();
  // can not modify person1 as it is a constant reference
  // person1 = person3
}

// function1()

function function2() {
  const numbers1 = [10, 20, 30, 40, 50]
  const numbers2 = [...numbers1, 60, 70, 80, 90, 100]
  console.log(numbers1)
  console.log(numbers2)
}

// function2()

// variable length arguments function
// rest operator
function add(...args) {
  // console.log(args)
  const sum = args.reduce((x, y) => { return x + y })
  console.log(`sum = ${sum}`)
}

add(10, 20)
add(10, 20, 30, 40)
add(10, 20, 30, 40, 50, 60)
add(10, 20, 30, 40, 50, 60, 70, 80)

