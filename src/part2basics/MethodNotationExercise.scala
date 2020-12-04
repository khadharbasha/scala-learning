package part2basics
import scala.language.postfixOps

object MethodNotationExercise extends App{
/*
1. Overload the + operator
  mary + "the rock star" ==> new person "Mary (the rockstar)"
 */

  class Person(val name:String, val age: Int = 0){
    def +(nickname:String) = s"${this.name} nick name is $nickname"
    def unary_+ : Int = age + 1
    def learns : String = s"${this.name} learns Scala"
    def apply(howmanytime:Int): String = s"$name watched titanic $howmanytime"

  }
  val basha = new Person("Basha")
  println(basha + "Khadhar")
  println(basha.age)
  println(+basha)
  println(basha learns)
  println(basha.apply(5))
  println(basha(9))


}
