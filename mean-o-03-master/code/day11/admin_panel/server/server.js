const express = require("express");
const cors = require("cors");
const bodyParser = require("body-parser");
const mongoose = require("mongoose");
const config = require("./config");
const jwt = require("jsonwebtoken");

// connect to the db
mongoose.connect(config.dbConnection);

const app = express();
app.use(cors("*"));
app.use(bodyParser.json());

app.use((request, response, next) => {
  console.log("checking token.... ", request.url);
  if (
    request.url == "/admin/signup" ||
    request.url.startsWith("/product/image") ||
    request.url == "/admin/signin"
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
const routerAdmin = require("./routes/admins");
const routerCategory = require("./routes/categories");

const utils = require("./utils");

app.use("/user", routerUsers);
app.use("/product", routerProducts);
app.use("/order", routerOrders);
app.use("/admin", routerAdmin);
app.use("/category", routerCategory);

app.get("/", (request, response) => {
  response.send("welcome to the admin panel web APIs");
});

app.listen(4000, "0.0.0.0", () => {
  console.log("server started on port 4000");
});
