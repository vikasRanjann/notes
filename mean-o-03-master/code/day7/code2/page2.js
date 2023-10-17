var Person = /** @class */ (function () {
    function Person() {
    }
    // method
    Person.prototype.printInfo = function () {
        console.log("name: " + this.name);
        console.log("address: " + this.address);
        console.log("age: " + this.age);
    };
    return Person;
}());
