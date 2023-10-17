// import http module
const http = require('http')

// create a server object
const server = http.createServer((request, response) => {
  console.log(`request received`)

  // process request
  console.log(`path = ${request.url}`)
  console.log(`method = ${request.method}`)

  if (request.url == '/product') {
    // execute product queries

    if (request.method == 'GET') {
      console.log(`select * from product`)
    } else if (request.method == 'POST') {
      console.log(`insert into product (...) values (...)`)
    } else if (request.method == 'PUT') {
      console.log(`update product set ......`)
    } else if (request.method == 'DELETE') {
      console.log(`delete from product where ....`)
    }

  } else if (request.url == '/user') {
    // execute user queries

    if (request.method == 'GET') {
      console.log(`select * from user`)
    } else if (request.method == 'POST') {
      console.log(`insert into user (...) values (...)`)
    } else if (request.method == 'PUT') {
      console.log(`update user set ......`)
    } else if (request.method == 'DELETE') {
      console.log(`delete from user where ....`)
    }

  } else if (request.url == '/category') {
    // execute category queries

    if (request.method == 'GET') {
      console.log(`select * from category`)
    } else if (request.method == 'POST') {
      console.log(`insert into category (...) values (...)`)
    } else if (request.method == 'PUT') {
      console.log(`update category set ......`)
    } else if (request.method == 'DELETE') {
      console.log(`delete from category where ....`)
    }
  }

  // send the response
  response.end()
})

// start the server
server.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})