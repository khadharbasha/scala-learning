package part1basics

object recurssion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

  println(factorial(10))
  // println(factorial(5000))


  def anotherFact(n: Int): BigInt = {
    def facthelper(x: Int, accumalator: BigInt): BigInt = {
      if (x <= 1) accumalator
      else facthelper(x - 1, x * accumalator)
    }

    facthelper(n, 1)
  }

  println("Using rec helper " + anotherFact(500000))
}