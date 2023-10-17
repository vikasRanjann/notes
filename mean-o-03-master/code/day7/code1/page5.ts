function function1(): void {
  // not known the value at the time of declaration
  let myVar: unknown
  myVar = 10
  myVar = 'test'
  myVar = true
  myVar = undefined

  // let myStr: string = myVar

  if (typeof (myVar) == 'string') {
    console.log('myVar is a string')
  } else {
    console.log('myVar is a not string')
  }

  let myVar2: any
  myVar2 = 'test'
  myVar2 = true
  myVar2 = 100
  myVar2 = { name: 'person2' }

  let myStr2: string = myVar2

  if (typeof (myVar2) == 'string') {
    console.log('myVar2 is a string')
  } else {
    console.log('myVar2 is a not string')
  }

}

function1()

function function2(): never {
  throw new Error('this function is not supposed to return any value')
}

// function2()

function function3() {

  // declaration
  enum Color {
    red, green, blue, yellow, black
  }

  // explicit
  const redColor: Color = Color.red
  const greenColor: Color = Color.green

  // implicit
  const blackColor = Color.black
  const yellowColor = Color.yellow

}

function function4() {
  enum Response {
    success = 0, error = 1
  }

  enum StatusCode {
    FileNotFound = 404,
    OK = 200,
    BadRequest = 400
  }

}