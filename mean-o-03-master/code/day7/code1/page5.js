function function1() {
    // not known the value at the time of declaration
    var myVar;
    // myVar = 10
    myVar = 'test';
    // myVar = true
    // myVar = undefined
    if (typeof (myVar) == 'string') {
        console.log('myVar is a string');
    }
    else {
        console.log('myVar is a not string');
    }
    var myVar2;
    myVar2 = 'test';
    if (typeof (myVar2) == 'string') {
        console.log('myVar2 is a string');
    }
    else {
        console.log('myVar2 is a not string');
    }
}
function1();
function function2() {
    throw new Error('this function is not supposed to return any value');
}
// function2()
