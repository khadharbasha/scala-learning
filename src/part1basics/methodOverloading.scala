package part1basics

object methodOverloading extends App{

  def wage(Salary:Int) = {
    val final_salary = Salary * Salary
    final_salary
  }

  println(wage(8000))


}
