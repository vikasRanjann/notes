// class declaration
var Person = /** @class */ (function () {
    // constructor
    function Person(name, age, address) {
        if (name === void 0) { name = ''; }
        if (age === void 0) { age = 0; }
        if (address === void 0) { address = ''; }
        console.log("inside constructor");
        this._name = name;
        this._address = address;
        this._age = age;
    }
    Object.defineProperty(Person.prototype, "name", {
        // accessors
        get: function () {
            console.log('inside get name()');
            return this._name;
        },
        set: function (name) {
            console.log('inside set name()');
            this._name = name;
        },
        enumerable: false,
        configurable: true
    });
    // facilitator
    Person.prototype.printInfo = function () {
        console.log("name: " + this._name);
        console.log("age: " + this._age);
        console.log("address: " + this._address);
    };
    return Person;
}());
var p1 = new Person('person1', 30, 'pune');
p1.name = "person3";
p1.printInfo();
console.log("name: " + p1.name);
