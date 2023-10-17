const express = require('express')
const db = require('../db')
const utils = require('../utils')

const router = express.Router()

router.get('/', (request, response) => {
  console.log('GET / is called')
  const statement = `select * from product`
  db.query(statement, (error, products) => {
    response.send(utils.sendResult(error, products))
  })
})

router.post('/', (request, response) => {
  const { title, description, price } = request.body
  const statement = `insert into product (title, description, price) values
      ('${title}', '${description}', '${price}')`
  db.query(statement, (error, products) => {
    response.send(utils.sendResult(error, products))
  })
})

module.exports = router