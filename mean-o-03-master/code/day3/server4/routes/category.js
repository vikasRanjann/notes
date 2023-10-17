const express = require('express')
const mysql2 = require('mysql2')

const router = express.Router()

router.get('/', (request, response) => {
  const connection = mysql2.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    port: 3306,
    database: 'mean_03'
  })

  const sql = 'select * from category'
  connection.query(sql, (error, result) => {
    connection.close()
    console.log(result)
    response.send(result)
  })
})


module.exports = router