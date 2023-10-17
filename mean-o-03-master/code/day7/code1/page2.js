function function1() {
  // number
  let num = 100
  console.log(`num = ${num}, type = ${typeof (num)}`)

  // string 
  num = 'test'
  console.log(`num = ${num}, type = ${typeof (num)}`)

  // boolean
  num = true
  console.log(`num = ${num}, type = ${typeof (num)}`)

  // object
  num = { name: 'person1', age: 40 }
  console.log(`num = ${num}, type = ${typeof (num)}`)

  // number
  num = 200
  console.log(`num = ${num}, type = ${typeof (num)}`)
}

// function1()


function add(p1, p2) {
  console.log(`${p1} + ${p2} = ${p1 + p2}`)
}

add(10, 20)
add(10, '20')