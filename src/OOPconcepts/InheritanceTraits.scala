package OOPconcepts

object InheritanceTraits extends App{

  //Single class inheritance
  //         Animal is Super class
  //           Cat is sub class
  //              cat can access all non private members of a super class
  class Animal {
    def eat = println("milk")
    private def drinks= print("Water")
    protected def thinks=println("Nothing") //protected can only be called in sub class, but not outside class
    def cansee: Boolean = true
  }
  class Cat extends Animal{
    thinks
    println("Inside Cat extends Animals")
  }

  val cat = new Cat
  cat.eat                   // prints milk
  // cat.drinks --> not accessible since drinks is a private member
  //cat.thinks --> Access to protected method thinks not permitted because


  // CONSTRUCTORS
  class Person(name:String, age:Int){
  }

  // class Adult(name:String,age:Int,IdCard:Int) extends Person --> Person will not work because there is no constructor
  class Adult(name:String,age:Int,IdCard:Int) extends Person("Basha", 28)

  //overriding
  class Dog extends Animal{
    override def eat = println("ChumChum")
  }

  val dog = new Dog
  dog.eat //ChumChum --> works same for val var

  //type substitution unknownanimal has type Animal : Polimorphism
  val unknownanimal: Animal = new Dog
  unknownanimal.eat
  println(unknownanimal.cansee)

  //prevent overriding
  /*
  1. use final keyword on the member
    final def eat --> it prevent override def eat

  2. use final keyword on the class
    final class Animal prevent all sub class Dog and Cat from extending --> extending not possible

  3. sealed --> If a class is sealed, it can be used only in this file, not on other files
    eg. object basha extends App { } --> if App is sealed it cannot be used anywhere

   */

}
