// require express
const express = require('express')

// create an instance of express application
const app = express()


// --------------------------------------------------
// ------------------ / routes ----------------------
// --------------------------------------------------

// route for GET /
app.get('/', (request, response) => {
  console.log('GET / request has been received')
  response.end('response from GET /')
})

// route for POST /
app.post('/', (request, response) => {
  console.log('POST / request has been received')
  response.end('response from POST /')
})

// route for PUT /
app.put('/', (request, response) => {
  console.log(`PUT / request has been received`)
  response.end('response from PUT /')
})

// route for DELETE /
app.delete('/', (request, response) => {
  console.log(`DELETE / request has been received`)
  response.end('response from DELETE /')
})

// --------------------------------------------------
// --------------- category routes ------------------
// --------------------------------------------------

// route for GET /category
app.get('/category', (request, response) => {
  console.log('GET /categoty request has been received')
  response.end('response from GET /category')
})

// route for POST /category
app.post('/category', (request, response) => {
  console.log('POST /categoty request has been received')
  response.end('response from POST /category')
})

// route for PUT /category
app.put('/category', (request, response) => {
  console.log(`PUT /categoty request has been received`)
  response.end('response from PUT /category')
})

// route for DELETE /category
app.delete('/category', (request, response) => {
  console.log(`DELETE /categoty request has been received`)
  response.end('response from DELETE /category')
})

// start server on port 4000
app.listen(4000, '0.0.0.0', () => {
  console.log('application started listening on port 4000')
})