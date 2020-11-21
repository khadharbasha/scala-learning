package part1basics

object Closure extends App{
  val bonus = 0.04
  def wage(salary:Int): Double = {
    val final_sal = salary * bonus
    final_sal
  }

  println(wage(1000))

/* the external parameter set outside the def has the effect on def */
  }

