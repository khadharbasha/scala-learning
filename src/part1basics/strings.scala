package part1basics

object strings extends App{

  val str: String = "      Hello am i learning scala        "

  println(str)                     //      Hello am i learning scala
  println(str.charAt(20))          //r
  println(str.strip())            //Hello am i learning scala
  println(str.split(" ").toList) //List(, , , , , , Hello, am, i, learning, scala)


  /* scala interplotation

 */
  // s - interplotation
  val name = "Khadhar Basha"
  val age = 28
  val greeting = s"Hello, My name is $name, and I am $age old"
  val greeting2 = s"Hello, My name is $name, and I am ${age + 1} old"

  println(greeting) //Hello, My name is Khadhar Basha, and I am 28 old
  println(greeting2) //Hello, My name is Khadhar Basha, and I am 29 old


  // F - interplotation
  val speed = 1.2
  val myth = f"$name%s can eat $speed%2.5f burgers per min"
  println(myth) //Khadhar Basha can eat 1.20000 burgers per min

  //raw-interplotator

  println(raw"This is a \n line") //This is a \n line
  val escaped = "This is a \n line"
  println(raw"$escaped") //This is a
                         // line
}
