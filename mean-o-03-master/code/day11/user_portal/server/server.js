const express = require("express");
const cors = require("cors");
const bodyParser = require("body-parser");
const mongoose = require("mongoose");
const config = require("./config");
const jwt = require("jsonwebtoken");
const utils = require("./utils");

// connect to the db
mongoose.connect(config.dbConnection);

const app = express();
app.use(cors("*"));
app.use(bodyParser.json());

app.use((request, response, next) => {
  console.log("checking token.... ", request.url);
  if (
    request.url == "/user/signup" ||
    request.url.startsWith("/product/image") ||
    request.url == "/user/signin"
  ) {
    next();
  } else {
    try {
      const token = request.headers["token"];
      console.log(`token: ${token}`);
      if (!token) {
        response.send(utils.createResult("unauthorized"));
        return;
      }

      const payload = jwt.verify(token, config.secret);
      request.userId = payload.id;
      next();
    } catch (ex) {
      response.send(utils.createResult("unauthorized"));
    }
  }
});

// routers
const routerUsers = require("./routes/users");
const routerProducts = require("./routes/products");
const routerOrders = require("./routes/orders");
const routerCategory = require("./routes/categories");
const routerCart = require("./routes/cart");
const routerPayment = require("./routes/payments");

app.use("/user", routerUsers);
app.use("/product", routerProducts);
app.use("/order", routerOrders);
app.use("/category", routerCategory);
app.use("/cart", routerCart);
app.use("/payment", routerPayment);

app.get("/", (request, response) => {
  response.send("welcome to the user portal web APIs");
});

app.listen(3000, "0.0.0.0", () => {
  console.log("server started on port 3000");
});
