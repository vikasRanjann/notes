// import module
const fs = require('fs')

// synchronous
// sequential
// blocking API
function syncFileRead() {

  try {

    // step 1
    console.log(`file read started`)

    // step 2
    const data = fs.readFileSync('./myfile1.txt')

    // step 3
    console.log(`file read completed`)

    // step 4
    console.log(`data = ${data}`)

  } catch (ex) {
    console.log(ex.errno)
  }

  console.log(`executing maths equation started`)
  const result = 13234982342342 * 23422424242234
  console.log(`result = ${result}`)
  console.log(`executing maths equation finished`)
}

// syncFileRead()


// asynchronous
// non-blocking APIs
function asyncFileRead() {
  console.log(`file read started`)

  // starts a thread for reading the contents 
  // of the file
  // when it finishes reading the contents
  // it calls the callback function (second param)
  fs.readFile('./myfile1.txt', (error, data) => {
    console.log(`file read completed`)

    if (error) {
      // error has occurred
      console.log(`error = ${error.errno}`)
    } else {
      // no error, data is valid
      console.log(`data = ${data}`)
    }

  })

  console.log(`executing maths equation started`)
  const result = 13234982342342 * 23422424242234
  console.log(`result = ${result}`)
  console.log(`executing maths equation finished`)
}

asyncFileRead()