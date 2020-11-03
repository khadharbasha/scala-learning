package part1basics

object callby_value_name extends App{

  //Call by value
  def callbyalue(n:Long): Unit = {
    println(n)
    println(n)
  }

  //call by name
  def callbyname(n: =>Long): Unit ={
    println(n)
    println(n)
  }

  println("Call by value " + callbyalue(System.nanoTime()))
  println("Call by name " + callbyname(System.nanoTime()))
}

/*
result:
22709579583800
22709579583800
Call by value ()
22709585064700
22709585125700
Call by name ()

 How it works: Call by value
  --> value is computed before call
  --> same value used everywhere
   def callbyalue(n:Long): Unit = {
    println(22709579583800)
    println(22709579583800)
  }

  //call by name
  --> expression is passed litteraly
  --> expression is evaluated at every use within

  def callbyname(n: =>Long): Unit ={
    println(System.nanoTime())
    println(System.nanoTime())
  }

  println("Call by value " + callbyalue(System.nanoTime())) = 22709579583800 ==> callbyalue(22709579583800)
  println("Call by name " + callbyname(System.nanoTime()))
}
 */