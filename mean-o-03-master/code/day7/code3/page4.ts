abstract class Animal {

  // force subclasses to override the method
  public abstract walk()

  // non-abstract method
  public eat() {
    console.log('animal eating..')
  }
}

class Lion extends Animal {

  public walk() {
    console.log(`Lion is walking..`)
  }

}

class Human extends Animal {

  public walk() {
    console.log(`Human is walking..`)
  }

  public eat() {
    console.log(`Human is eating..`)
  }
}

const l1 = new Lion()
l1.walk()
l1.eat()

const h1 = new Human()
h1.walk()
h1.eat()