package part1basics

object Expressions extends App {

  val x = 1 + 3 //expressions
  println(x)

  // evaluating expressions

  println(1 == x) //prints false
  // == != >= <=

  var aVariable = 2
  aVariable += 3
  println(aVariable) //prints 5
  // use -= *= /*

  aVariable -= 2
  println(aVariable) // print 5-2 ==> 3

  //Instruction vs Expression

  //IF expression
  val aCondition = true
  println(aCondition) //print true

  val aCondValue = if (aCondition) 5 else 3 //assigned with 5
  println(aCondValue) //prints 5
  println(if (aCondition) 9889 else 3) //prints 9889


  //while
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  } //prints 0 1 2 3 4 5 6 7 8 9 ==> which should not be done in scala
  // scala expects everything to be expressions


  //EVERYTHING in scala is expression

  var aWeirdvalue = (aVariable = 3) //aWeirdvalue - is a unit ==> a special type in scala
  println(aWeirdvalue) //Unit === void


  val aCodeBlock = {
    val y = 2
    val z = 10
    println(y, z)
  }
  // println(z) // z which is defined inside the block is not available outside


  ////////////// instruction -- do something
  /////////////  expressions -- evaluate something (scala)

  //examples:
  val somevalue = {
    2 < 3
  } //true

  val someothervalue = {
    if (somevalue) 238 else 99
  } //238
  println(somevalue)
  println(someothervalue)

}