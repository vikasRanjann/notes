const { request } = require('express')
const express = require('express')

const app = express()

// middleware
function log1(request, response, next) {
  console.log(`inside log 1`)
  console.log(`method = ${request.method}`)
  console.log(`url or path = ${request.url}`)
  console.log(`---------------------------`)

  // call the next logical function
  // request handler
  next()
}

// add the log1 to the app so that,
// app can call the function before
// calling the actual request handler
app.use(log1)

app.get('/', (request, response) => {
  console.log(`inside GET /`)
  response.end('dummy GET response')
})

app.post('/', (request, response) => {
  console.log(`inside POST /`)
  response.end('dummy POST response')
})

app.put('/', (request, response) => {
  console.log(`inside PUT /`)
  response.end('dummy PUT response')
})

app.delete('/', (request, response) => {
  console.log(`inside DELETE /`)
  response.end('dummy DELETE response')
})

app.get('/category', (request, response) => {
  console.log('inside GET /category')
  response.end('dummy GET /category response')
})

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started listening on port 4000`)
})