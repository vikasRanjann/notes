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
var Animal = /** @class */ (function () {
    function Animal() {
    }
    // non-abstract method
    Animal.prototype.eat = function () {
        console.log('animal eating..');
    };
    return Animal;
}());
var Lion = /** @class */ (function (_super) {
    __extends(Lion, _super);
    function Lion() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Lion.prototype.walk = function () {
        console.log("Lion is walking..");
    };
    return Lion;
}(Animal));
var Human = /** @class */ (function (_super) {
    __extends(Human, _super);
    function Human() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Human.prototype.walk = function () {
        console.log("Human is walking..");
    };
    Human.prototype.eat = function () {
        console.log("Human is eating..");
    };
    return Human;
}(Animal));
var l1 = new Lion();
l1.walk();
l1.eat();
var h1 = new Human();
h1.walk();
h1.eat();
