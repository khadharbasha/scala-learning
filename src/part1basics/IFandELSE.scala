package part1basics

object IFandELSE {

  var x = 0
  while (x < 10 ){
    println("x= " + x)
    x += 1
  }

  var i = 9
  for (i <- 1 to 5){
    println("i is " + i)
  }
  for (i <- 1 until 9){
    println("i is " + i)
  }

  val lst = List(11,12,13,4,56,78,345,54)
  for (i <- lst; if i < 20) {
    println("lst element is " + i)
  }

  val lst1 = List(1,2,3,4,56,78,345,54)
  val squares = for (i <- lst; if i < 20) yield {
    i*i
  }

  val age = 20
  age match {
    case 20 => {
      println("Age is " + age)
    }
    case 40 => {
      println("Age is " + age)
    }
    case 50 => {
      println("Age is " + age)
    }
    case 60 => {
      println("Age is " + age)
    }
    case _ => {
      println("There is not case for age " + age)
    }
  }

      val age1 = 20
      val res2 = age1 match {
        case 20 => age1
        case 40 => age1
        case 50 => age1
        case 60 => age1
        case _ => age1
      }
      println("the res ===== " + res2)

  def main(args: Array[String]): Unit = {
    val x = 30;
    var res = ""
    if (x==20){
      println("x==20")
      res="x==20"
    }
    else{
      println("x!=20")
      res=("x!=20")
    }
    println(res)
  }

}
