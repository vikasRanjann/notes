var Human = /** @class */ (function () {
    function Human() {
    }
    Human.prototype.runSlow = function () {
        console.log('human is running slow');
    };
    Human.prototype.runFast = function () {
        console.log('human is running fast');
    };
    return Human;
}());
var Animal = /** @class */ (function () {
    function Animal() {
    }
    Animal.prototype.runSlow = function () {
        console.log('Animal is running slow');
    };
    Animal.prototype.runFast = function () {
        console.log('Animal is running fast');
    };
    return Animal;
}());
function run(object) {
    object.runSlow();
    object.runFast();
}
var h1 = new Human();
run(h1);
var a1 = new Animal();
run(a1);
