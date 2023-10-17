const express = require('express')

const app = express()

const routerCategory = require('./routes/category')

app.use('/category', routerCategory)

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})