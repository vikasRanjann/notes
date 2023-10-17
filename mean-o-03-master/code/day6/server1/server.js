const express = require('express')
const bodyParser = require('body-parser')

const routerEmp = require('./routes/emp')

const app = express()
app.use(bodyParser.json())

app.use('/emp', routerEmp)

app.listen(3000, '0.0.0.0', () => {
  console.log('server started on port 3000')
})