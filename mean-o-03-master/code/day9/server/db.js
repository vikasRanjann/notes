const mysql = require('mysql2')

const pool = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: 'root',
  database: 'mean_03',
  port: 3306,
  waitForConnections: true,
  connectionLimit: 10
})

module.exports = pool