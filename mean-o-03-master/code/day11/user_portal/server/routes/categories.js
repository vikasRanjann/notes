const express = require("express");
const Category = require("../models/category");
const utils = require("../utils");

const router = express.Router();

router.get("/", (request, response) => {
  Category.find(
    { deleted: false },
    { __v: 0, deleted: 0, isActive: 0, createdTimestamp: 0 }
  ).exec((error, categories) => {
    response.send(utils.createResult(error, categories));
  });
});

module.exports = router;
