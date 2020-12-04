package OOPconcepts

import java.sql.ResultSetMetaData

object OOBasics extends App {

  val candidateBasha = new Resume("Khadhar Basha", 28)
  //println(candidateBasha)
  println(candidateBasha.x)

  val candidateFarheen = new Resume("Farheen", 25)
  println(candidateFarheen.name)
  println(candidateFarheen.age)

  println("without using This")
  candidateFarheen.greet("Momola")

  println(" using This")
  candidateFarheen.greet_this("Momola")
  candidateFarheen.greet_this()


  //Constructor  - built every time the object is instantiated
  //whatever inside the class brackets runs everytime the class is instantiated

  /* class resume(name:String, age:Int)
     val x = new resume("basja",90)
     cannot get resume.name ==> because its not declared as val in class constrctor
     these are not class member, but class parameters --> only class members can be reference

   */
  class Resume(val name: String, val age: Int){
    val x = 2
    println("I run everytime, when class is instantiated " + (1+5+6+7))

    //Metods
    def greet(name:String): Unit = println(s"$name, says hi to, $name ")
    def greet_this(name:String): Unit = println(s"${this.name}, says hi to, $name ")

    //method overloading
    def greet_this(): Unit = println(s"I am method overloading, where this word is implied by default, $name")


  }

}

/* Output

I run everytime, when class is instantiated 19
2
I run everytime, when class is instantiated 19
Farheen
25
without using This
Momola, says hi to, Momola
 using This
Farheen, says hi to, Momola
I am method overloading, where this word is implied by default, Farheen

 */