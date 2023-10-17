const express = require('express')
const bodyParser = require('body-parser')

const jwt = require('jsonwebtoken')

// list of routers
const routerUser = require('./routes/user')
const routerNote = require('./routes/note')

const app = express()

app.use(bodyParser.json())

app.use((request, response, next) => {

  if (request.url == '/user/register') {
    // skip checking for token
    next()
  } else {
    const token = request.headers['x-auth-token']
    try {
      const data = jwt.verify(token, '13122424234232323saasdfsdsd')
      request.userId = data['id']
      // if everything looks okay, go to the real handler
      next()
    } catch (ex) {
      // send 401 to the user
      response.status = 401
      response.send('you are not authorized to access this api')
    }
  }

})

// add the routers
app.use('/user', routerUser)
app.use('/note', routerNote)

app.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})