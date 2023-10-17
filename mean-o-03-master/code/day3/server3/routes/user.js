const express = require('express')

const router = express.Router()

router.get('/', (request, response) => {
  console.log('GET /user')
  response.end('GET /user')
})

module.exports = router