package OOPconcepts

object InheritanceTraits2 extends App{

  //abstract - fields, methods, classes remain unimplemented is called abstract
  // abstract class cannot be instantiated

  abstract class Animal{
    val creatureType : String // not implemented, but implemented in sub class
    def eat : Unit            // not implemented, but implemented in sub class
    val x = 100
  }

  abstract class house{
    val sqfeet : Int
  }

  // val x = new Animal --> class Animal is abstract; cannot be instantiated

  // class Dog extends Animal with house {
    class Dog extends Animal {
    val creatureType: String = "DoberMan"       //while implementing abstract no need of OVERRIDE keyword
    def eat: Unit =  println("Khadhar Basha")   //while implementing abstract no need of OVERRIDE keyword
  }

  val x = new Dog
  x.eat
  println(x.x)



/* Difference between Abstract class and Traits
1. A class can extend only one abstract class, multiple abstract class is not possile
  class Dog extends Animal with house {
  error:class house needs to be a trait to be mixed in

2. Both abstract and train can have abstract and non abstract methods and values
3. traits cannot be passed with parameters
4. A class can extend multiple traits with the help of with

eg: */
  trait ClassA {
    val a = 10
  }
  trait ClassB {
    val b = 20
  }
  trait ClassC {
    val c = 20
  }

  class lastone extends ClassA with ClassB with ClassC {
    val t = a + b + c
  }

  val tt = new lastone
  println(s"The total of ${tt.a} , ${tt.b} and ${tt.c} is ${tt.t} this is example of traits")
  //The total of 10 , 20 and 20 is 50 this is example of traits

}
