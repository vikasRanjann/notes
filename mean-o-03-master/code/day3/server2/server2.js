const express = require('express')

const app = express()

// middleware
function myLog1(request, response, next) {
  // process the request
  // log the request
  console.log('inside myLog1')
  console.log(`------------------------`)

  // call the next function
  next()
}

const myLog2 = (request, response, next) => {
  // processing ...
  console.log('inside myLog2')
  console.log(`------------------------`)

  next()
}

app.use(myLog1)
app.use(myLog2)

app.use((request, response, next) => {
  // processing ...
  console.log('inside myLog3')
  console.log(`------------------------`)

  next()
})

app.get('/', (request, response) => {
  console.log('inside GET /')
  response.end('dummy response')
})

app.get('/category', (request, response) => {
  console.log('inside GET /category')
  response.end('dummy response')
})

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started listening on port 4000`)
})