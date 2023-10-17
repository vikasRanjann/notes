const express = require('express')
const { stack } = require('.')

const router = express.Router()

const categories = [
  { id: 1, title: 'category 1', description: 'description 1' },
  { id: 2, title: 'category 2', description: 'description 2' },
  { id: 3, title: 'category 4', description: 'description 3' }
]

router.get('/', (request, response) => {
  console.log('inside GET /category')
  response.send(categories)

  // const strCategories = JSON.stringify(categories)
  // response.setHeader('Content-Type', 'application/json')
  // response.end(strCategories)
})

router.post('/', (request, response) => {
  const { id, title, description } = request.body

  // add new object
  categories.push({
    id: id,
    title: title,
    description: description
  })

  console.log('inside POST /category')
  response.end('POST /category')
})

module.exports = router