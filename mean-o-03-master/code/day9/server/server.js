const express = require('express')
const bodyParser = require('body-parser')
const cors = require('cors')

// list of routers
const productRouter = require('./routes/products')

const app = express()

// expose the app
app.use(cors())

app.use(bodyParser.json())

// add the routers
app.use('/product', productRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})