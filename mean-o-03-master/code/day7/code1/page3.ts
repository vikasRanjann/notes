function function1() {
  // implicit declaraion
  // type infrerence 

  // number
  let num = 100
  console.log(`num = ${num}, type = ${typeof (num)}`)

  // num = 'test'
  // num = true
  // num = { name: 'person' }

  // string
  let firstName = 'steve'
  let lastName = "Jobs"
  let address = `USA`
  console.log(`firstName = ${firstName}, type = ${typeof (firstName)}`)


  // boolean
  let canVote = true
  console.log(`canVote = ${canVote}, type = ${typeof (canVote)}`)

  // object
  let person = { name: 'person1', age: 40 }
  console.log(`person = ${person}, type = ${typeof (person)}`)
}

// function1()

function function2() {
  // explicit declaration

  // number
  const num: number = 10

  // string
  const firstName: string = 'steve'
  const lastName: string = "jobs"
  const address: string = `USA`

  // boolean
  const canVote: boolean = false

  // object
  const person: object = { name: 'person1', age: 40, address: 'pune' }
  const mobile: { model: string, company: string, price: number } =
    { model: 'iPhone', company: 'Apple', price: 144000 }

}

// function2()


function function3() {
  // union
  let response: number | string = 10
  response = 'ok'
  response = 100

  // response = true
  // response = { name: 'person1' }

  // union
  let response2: number | string | boolean | object
  response2 = 10
  response2 = 'test'
  response2 = false
  response2 = { name: 'person1' }

  let response3: any
  response3 = 10
  response3 = 'test'
  response3 = false
  response3 = { name: 'person1' }
}

// function4()

