
function funtion1() {
  const cryptoJs = require('crypto-js')

  const password = 'test'
  console.log(`encrypte password: ${cryptoJs.SHA1(password)}`)
  console.log(`encrypte password: ${cryptoJs.SHA256(password)}`)
  console.log(`encrypte password: ${cryptoJs.SHA512(password)}`)
  console.log(`encrypte password: ${cryptoJs.MD5(password)}`)
}

// function1()

function funcion2() {
  const nodemailer = require('nodemailer')

  const transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
      user: 'express123mean@gmail.com',
      pass: 'sunbeam123'
    }
  });

  var mailOptions = {
    from: 'express123mean@gmail.com',
    to: 'pythoncpp@gmail.com',
    subject: 'Sending Email using Node.js[nodemailer]',
    text: 'That was easy!'
  };

  transporter.sendMail(mailOptions, function (error, info) {
    if (error) {
      console.log(error);
    } else {
      console.log('Email sent: ' + info.response);
    }
  });
}

funcion2()