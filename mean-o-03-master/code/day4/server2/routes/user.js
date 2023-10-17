const express = require('express')
const cryptoJs = require('crypto-js')
const db = require('../db')
const utils = require('../utils')
const mailer = require('../mailer')
const jwt = require('jsonwebtoken')
const router = express.Router()

router.post('/register', (request, response) => {
  const { firstName, lastName, email, password, mobile } = request.body

  const encryptedPassword = cryptoJs.MD5(password)
  const statement = `insert into user (firstname, lastname, email, password, mobile) 
      values ('${firstName}', '${lastName}', '${email}', '${encryptedPassword}', '${mobile}')`

  db.query(statement, (error, dbResult) => {
    const result = {}
    if (error) {
      // error occurred
      response.send(utils.sendError(error))
    } else {

      const subject = `'welcome to evernote'`
      const body = `
        <h1>Welcome to Evernote</h1>
        <h2>this is a welcome mesage</h2>
      `
      mailer.sendEmail(email, subject, body, (emailError, info) => {
        response.send(utils.sendSuccess(dbResult))
      })
    }

  })
})

router.post('/login', (request, response) => {
  const { email, password } = request.body

  const encryptedPassword = cryptoJs.MD5(password)
  const statement = `select * from user where email = '${email}' and password = '${encryptedPassword}'`
  db.query(statement, (error, users) => {
    console.log(users)
    if (error) {
      response.send(error)
    } else {
      if (users.length == 0) {
        // user does not exist
        response.send({ status: 'error', error: error })
      } else {
        const user = users[0]
        const data = { id: user['id'] }
        const token = jwt.sign(data, '13122424234232323saasdfsdsd')
        response.send({ status: 'success', data: token })
      }
    }
  })

})

router.get('/profile', (request, response) => {
  const token = request.headers['x-auth-token']
  try {
    const data = jwt.verify(token, '13122424234232323saasdfsdsd')
    const userId = data['id']
    const statement = `select id, firstname, lastname, email, mobile from user where id = ${userId}`
    db.query(statement, (error, users) => {
      if (users.length > 0) {
        const user = users[0]
        response.send(utils.sendResult(error, user))
      } else {
        response.send(utils.sendError('there is no user with that id'))
      }
    })
  } catch (ex) {
    response.status = 401
    response.send('you are not authorized to access this api')
  }

})

router.put('/profile/:id', (request, response) => {
  const { id } = request.params
  const { firstname, lastname, mobile } = request.body
  const statement = `update user set 
      firstname = '${firstname}', 
      lastname = '${lastname}',
      mobile = '${mobile}'
    where id = ${id}
  `
  db.query(statement, (error, result) => {
    response.send(utils.sendResult(error, result))
  })
})

module.exports = router