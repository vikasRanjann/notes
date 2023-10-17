// class declaration
var Person = /** @class */ (function () {
    // methods
    // - constructor
    // - destructor
    // - setter/mutator
    // - getter/inspector
    // - facilitator
    function Person(name, age, address) {
        if (name === void 0) { name = ''; }
        if (age === void 0) { age = 0; }
        if (address === void 0) { address = ''; }
        console.log("inside constructor");
        this.name = name;
        this.address = address;
        this.age = age;
    }
    // facilitator
    Person.prototype.printInfo = function () {
        console.log("name: " + this.name);
        console.log("age: " + this.age);
        console.log("address: " + this.address);
    };
    return Person;
}());
var p1 = new Person('person1', 40, 'pune');
p1.printInfo();
var p2 = new Person();
p2.printInfo();
