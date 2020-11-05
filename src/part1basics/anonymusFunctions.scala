package part1basics

object anonymusFunctions extends App{
  /* scala anonymous functions are like python lambda

 */

  val add = (x:Int, y: Int) => x + y
  val multi = (x:Int, y: Int) => x * y

  println(add(9,9))
  println(multi (9,9))


}
