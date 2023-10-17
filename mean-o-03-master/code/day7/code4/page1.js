function function1() {
    // implicit declaration of an array
    var numbers = [10, 20, 30, 40, 50];
    console.log(numbers);
    numbers.push(60);
    console.log(numbers);
    numbers.splice(3, 1);
    console.log(numbers);
}
// function1()
function function2() {
    // explicit declaration of an array
    var numbers = [10, 20, 30, 40, 50];
    console.log(numbers);
    numbers.push(60);
    console.log(numbers);
    numbers.splice(3, 1);
    console.log(numbers);
    var number2 = numbers.map(function (value) {
        return value + 100;
    });
    console.log(number2);
    var numbers3 = numbers.filter(function (value) {
        return value > 30;
    });
    console.log(numbers3);
    var sum = numbers.reduce(function (x, y) {
        return x + y;
    });
    console.log(sum);
}
function2();
