package part2basics
import scala.language.postfixOps

object MethodNotation extends App{

  class Person(val name:String, favmovie:String) {
    def likes(movie:String): Boolean = movie == favmovie
    def handOutWith(otherperson: Person): String = s"${this.name} is hanging out with ${otherperson.name}"
    def +(otherperson: Person): String = s"${this.name} is hanging out with ${otherperson.name}"
    def unary_- : String = s"Testing the unary operator $name"
    def isAlive: Boolean = true // a method that does not take any parameters
    def apply() : String = s"Hi, my name is $name and I like onions" //apply is a spl function
  }

  val basha = new Person("Basha", "Titanic")
  println(basha.likes("Titanic"))
  println(basha likes "Titanic") //this is equal to the upper line
  // infix notation = operator notation ==> applicable only with method having only one parameter

  /* Operators in scala
   */
  val tom = new Person("Tom", "Peterson")
  println(basha handOutWith tom) // this way of writing code is called syntatic sugar
  println(basha + tom) //actually we can use +,/,*,- operators as method names
  println(basha.+(tom))

  println(1+2)
  println(6.+(2))

  // ALL OPERATORS ARE METHODS.



  //prefix notations - unary operator
  val x = -1
  println(x)
  println(-basha)

  //post notations
  println(basha.isAlive)
  println(basha isAlive)

  //apply
  println(basha.apply())
  println(basha()) //same as above --> calling object as a method

}
