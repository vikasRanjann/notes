const express = require('express')
const bodyParser = require('body-parser')

// get the router from different modules
const routerIndex = require('./routes/index')
const routerCategory = require('./routes/category')
const routerUser = require('./routes/user')

const app = express()

// add bodypaser's json parser to parse the 
// request body and convert it into JSON object
app.use(bodyParser.json())

// app.use(bodyParser.urlencoded())

// add all the routes defined in routerIndex
// for the path /
app.use('/', routerIndex)

// add all the routes defined in routerIndex
// for the path /category
app.use('/category', routerCategory)

// add all the routes defined in routerIndex
// for the path /user
app.use('/user', routerUser)

app.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})