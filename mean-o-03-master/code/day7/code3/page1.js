// aggregation
var Address = /** @class */ (function () {
    function Address(_city, _state, _country) {
        this._city = _city;
        this._state = _state;
        this._country = _country;
    }
    Address.prototype.printAddress = function () {
        console.log("city = " + this._city);
        console.log("state = " + this._state);
        console.log("country = " + this._country);
    };
    return Address;
}());
// Person has-a address
var Person = /** @class */ (function () {
    function Person(_name, _address) {
        this._name = _name;
        this._address = _address;
    }
    Person.prototype.printInfo = function () {
        console.log("name: " + this._name);
        this._address.printAddress();
    };
    return Person;
}());
// House has-a address
var House = /** @class */ (function () {
    function House(_address, _rooms) {
        this._address = _address;
        this._rooms = _rooms;
    }
    House.prototype.printInfo = function () {
        console.log("room = " + this._rooms);
        this._address.printAddress();
    };
    return House;
}());
var p1 = new Person('person1', new Address('pune', 'MH', 'india'));
p1.printInfo();
console.log('');
var h1 = new House(new Address('mumbai', 'MH', 'india'), 3);
h1.printInfo();
