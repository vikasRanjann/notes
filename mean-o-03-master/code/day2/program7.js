// import os module
const os = require('os')

// os related
console.log(`platform = ${os.platform()}`)
console.log(`hostname = ${os.hostname()}`)

// hardware information
console.log(`cpu architecture = ${os.arch()}`)
console.log(`total memory = ${os.totalmem() / (1024 * 1024 * 1024)} GB`)
console.log(`free memory = ${os.freemem() / (1024 * 1024 * 1024)} GB`)

const cpus = os.cpus()
for (const cpu of cpus) {
  console.log(`${cpu.model} - ${cpu.speed}`)
}

// user related
console.log(`home directory: ${os.homedir()}`)