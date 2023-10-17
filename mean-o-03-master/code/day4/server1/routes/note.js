const express = require('express')
const db = require('../db')
const utils = require('../utils')
const router = express.Router()

router.post('/:userId', (request, response) => {
  const { contents } = request.body
  const { userId } = request.params

  const statement = `insert into note (userId, contents) 
    values ('${userId}', '${contents}')`
  db.query(statement, (error, data) => {
    response.send(utils.sendResult(error, data))
  })
})

router.get('/:userId', (request, response) => {
  const { userId } = request.params

  const statement = `select * from note where userId = ${userId}`
  db.query(statement, (error, data) => {
    response.send(utils.sendResult(error, data))
  })
})

router.put('/:noteId', (request, response) => {
  const { noteId } = request.params
  const { contents } = request.body

  const statement = `update note set contents = '${contents}' where id = ${noteId}`
  db.query(statement, (error, data) => {
    response.send(utils.sendResult(error, data))
  })
})

router.delete('/:noteId', (request, response) => {
  const { noteId } = request.params

  const statement = `delete from note where id = ${noteId}`
  db.query(statement, (error, data) => {
    response.send(utils.sendResult(error, data))
  })
})

module.exports = router