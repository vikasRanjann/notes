// class declaration
var Person = /** @class */ (function () {
    function Person() {
    }
    // methods
    Person.prototype.printInfo = function () {
        console.log("name: " + this.name);
        console.log("age: " + this.age);
        console.log("address: " + this.address);
    };
    return Person;
}());
// instantiate a class
var p1 = new Person();
p1.name = "person1";
p1.address = "pune";
p1.age = 40;
p1.printInfo();
var p2 = new Person();
p2.name = 'person2';
p2.address = 'mumbai';
p2.age = 50;
p2.printInfo();
