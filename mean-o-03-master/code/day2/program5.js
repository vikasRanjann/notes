// destructuring

function function1() {
  const person = {
    name: 'person1',
    age: 40,
    email: 'person1@test.com'
  }

  // console.log(`name: ${person.name}`)
  // console.log(`email: ${person.email}`)
  // console.log(`age: ${person.age}`)


  // name, age and email will be created
  // as variables by copying the values
  // from person matching keys name, age
  // and email respectively
  // sequence does not matter
  const { name, email, age } = person

  console.log(`name: ${name}`)
  console.log(`email: ${email}`)
  console.log(`age: ${age}`)
}

// function1()

function function2() {
  const countries = ['india', 'usa', 'uk', 'japan']
  // console.log(countries)

  // sequence matters a lot
  const [c1, c2, c3, c4] = countries
  console.log(`c1 = ${c1}`)
  console.log(`c2 = ${c2}`)
  console.log(`c3 = ${c3}`)
  console.log(`c4 = ${c4}`)
}

function2()


