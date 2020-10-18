package part1basics

object ValuesVariableTypes extends App {
  val x: Int = 42
  println(x)

// VALS are immuatable - cannot be reassigned. With thrown an error
//error:  reassignment to val

  // val x: Int ==> Int is optional - complier with figure out
  // var ====> are mutable


  val y = 50
  println(y)

  val aString: String = "New string"
  val another_string = "Another String"

  println(aString)
  println(another_string)

  var basha = "Khadhar Basha"
  println(basha)

  basha = "Changed the name"
  println(basha)
}
