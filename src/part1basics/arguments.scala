package part1basics

object arguments extends App {

  def trFact(n:Int=10, acc:Int = 1): Int =
    if(n<=1) acc
    else trFact(n-1, n*acc)

  val fac10of2time = trFact(10, 2)
  val fac10of1time = trFact(10)
  val fac = trFact(n=10)

  println(fac10of2time)
  println(fac10of1time)
  println(fac)


}
