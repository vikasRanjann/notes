// require the module so that we can create a server
const http = require('http')

// console.log(http.METHODS)
// console.log(http.STATUS_CODES)

// create a server instance
const server = http.createServer((request, response) => {
  console.log(`server has received a request`)
  // process request

  // send response to client
  // response.end('hello world!!!!')


  function sendHTML() {
    // change the content type to html
    response.setHeader('Content-Type', 'text/html')

    response.end('<h1>hello world!!!!</h1>')
  }

  sendHTML()


  function sendJSON() {
    // JSON object
    const persons = [
      { name: 'person1', age: 20, address: 'pune' },
      { name: 'person2', age: 21, address: 'mumbai' },
      { name: 'person3', age: 22, address: 'nashik' }
    ]

    // object to string
    const strPerson = JSON.stringify(persons)

    // change the content type to JSON
    response.setHeader('Content-Type', 'application/json')

    // send only string or buffer
    response.end(strPerson)
  }

  // sendJSON()

})

// start server process on a port
// internally starts a socket
server.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})