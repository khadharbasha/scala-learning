package part2basics

object Exceptions extends App{

  // Exceptions are useful to control program crashing

  val x : String = null
  //println(x.length)               //error: Exception in thread "main" java.lang.NullPointerException

  //throwing and catching exceptions
  //Throw on your own
  //throw new NullPointerException    //error: Exception in thread "main" java.lang.NullPointerException

  //throwable classes extends Throwable classes
  // Exception and Error are the major Throwable subtypes


  //2. catch exception

  def summa(boolenvalue: Boolean): Int = {
    if (boolenvalue) throw new RuntimeException("Ahhhha some error inside summa method")
    else 42
  }

  try {
    //Some code to execute
    summa(true)
  } catch {  // if there are errors - catch and do something based on the error
    case e: RuntimeException => println("I am in RuntimeException")
  } finally { //execute NO MATTER WHAT
          println("Finally")
  }

  /* output
  I am in RuntimeException
  Finally
 */

  def division(x:Int, y:Int):Int = {
    x/y
  }
  try {
    //Some code to execute
    val a = division(5,0)
    println(a)
  } catch {  // if there are errors - catch and do something based on the error
    case a: ArithmeticException => println("Arithematic exception ")
  } finally {
    println("Inside finally")
  }

  // 3. How to define your own exceptions
  class MyException extends Exception
  val exception = new MyException

  // throw new MyException --> my own exception

  val a = Array.ofDim(Int.MaxValue)

}
