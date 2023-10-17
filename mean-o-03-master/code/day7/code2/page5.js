var Person = /** @class */ (function () {
    // constructor
    function Person(name, age, address) {
        console.log("inside constructor");
        this.name = name;
        this.address = address;
        this.age = age;
    }
    // getter
    Person.prototype.getName = function () { return this.name; };
    Person.prototype.getAddress = function () { return this.address; };
    Person.prototype.getAge = function () { return this.age; };
    // setter
    Person.prototype.setName = function (name) { this.name = name; };
    Person.prototype.setAge = function (age) {
        if ((age < 0) || (age > 60)) {
            throw new Error('invalid age');
        }
        this.age = age;
    };
    Person.prototype.setAddress = function (address) { this.address = address; };
    // facilitator
    Person.prototype.printInfo = function () {
        console.log("name: " + this.name);
        console.log("age: " + this.age);
        console.log("address: " + this.address);
    };
    return Person;
}());
var p1 = new Person('person1', 40, 'pune');
// p1.age = -30
p1.setAge(30);
// p1.printInfo()
console.log("name: " + p1.getName());
console.log("age: " + p1.getAge());
