const http = require('http')

const server = http.createServer((request, response) => {

  const path = request.url
  const method = request.method

  if (path == '/category') {
    if (method == 'GET') {
      console.log('select * from category')
    } else if (method == 'POST') {
      console.log('insert into category')
    } else if (method == 'PUT') {
      console.log('update category')
    } else if (method == 'DELETE') {
      console.log('delete from category')
    }
  }

  response.end('sending a dummy data from server')
})

server.listen(4000, '0.0.0.0', () => {
  console.log(`server stared listening on port 4000`)
})