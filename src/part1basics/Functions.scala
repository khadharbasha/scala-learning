package part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " adding " + b
  }
  println(aFunction("Hello", 3)) //prints Hello adding 3

  def Repfunc(aString: String, n: Int): String= {
    if (n==1) aString
    else aString + Repfunc(aString, n-1)
  }
  println(Repfunc("Basha \n", 5))

  //WHEN YOU NEED LOOPS, USE RECURSION

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  print(aBigFunction(8)) //prints 15

  /*
  1. A greeting function (name, age) ==> "Hi, my name is $name and I am $age years old
   */

  def printname(name: String, age : Int): String = {
    "Hi, my name is " + name + " and I am  " + age  + " years old"
  }
  println(printname("Khadhar basha", 28))

/*
  2. A factorial function
 */
  var a = 0
  def aFactorial(n: Int): Int = {
    if (n <= 0) 1
    else
      n * aFactorial(n-1)
  }
  println(aFactorial(10))

  /*
  3. find prime number
   */
  def testPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(testPrime(11))

  /*
  4. fibannacni
   */
  def fibannci(n:Int): Int = {
    //println(n)
    if (n<=2) 1
    else fibannci(n-1) + fibannci(n-2)
  }

  println(fibannci(9))
}

