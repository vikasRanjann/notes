// inheritance => is-a
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// superclass
// - parent class
// - base class
var Person = /** @class */ (function () {
    function Person(name, address, age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    Person.prototype.printPersonInfo = function () {
        console.log("name: " + this.name);
        console.log("address: " + this.address);
        console.log("age: " + this.age);
    };
    return Person;
}());
// subclass
// - child class
// - derrived class
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee(id, name, address, age) {
        var _this = _super.call(this, name, address, age) || this;
        _this.id = id;
        return _this;
    }
    Employee.prototype.printEmployeeInfo = function () {
        console.log("id: " + this.id);
        console.log("name: " + this.name);
        console.log("address: " + this.address);
        console.log("age: " + this.age);
    };
    return Employee;
}(Person));
var p1 = new Person('person1', 'pune', 30);
p1.printPersonInfo();
console.log('');
var e1 = new Employee(1, 'emp1', 'mumbai', 40);
e1.printEmployeeInfo();
