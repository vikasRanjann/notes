// contract between service provider and service consumer
interface Runnable {
  runSlow()
  runFast()
}


// service provider
class Human implements Runnable {

  runSlow() {
    console.log('human is running slow')
  }
  runFast() {
    console.log('human is running fast')
  }

}

// service provider
class Animal implements Runnable {

  runSlow() {
    console.log('Animal is running slow')
  }
  runFast() {
    console.log('Animal is running fast')
  }

}


// service consumer
function run(object: Runnable) {
  object.runSlow()
  object.runFast()
}

const h1 = new Human()
run(h1)

const a1 = new Animal()
run(a1)