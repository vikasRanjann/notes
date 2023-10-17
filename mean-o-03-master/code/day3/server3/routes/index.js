const express = require('express')

// router add the routes in the routing table
const router = express.Router()

router.get('/', (request, response) => {
  console.log('inside GET /')
  response.end('GET /')
})

router.post('/', (request, response) => {
  console.log('inside port /')
  response.end('POST /')
})

// export the router
module.exports = router