package OOPconcepts

object Objects {

  //SCALA DOES NOT HAVE CLASS - LEVEL FUNCTIONALITY
  //Difference between class and object declaration is OBJECT cannot receive parameters

  object student {
    val name = "Khadhar Basha"
    def canFly:Boolean = false
  }
  class student {

  }

  def main(args: Array[String]): Unit = {
      println("First Line")
      //Object and Class has same name called ==> COMPANIONS
      // so whatever we write resides inside class or singleton object and are also called from it

      //SCALA object = SINGLETON INSTANCE
      val mary = student
      val bala = student
      println(mary==bala) //prints true because mary and bala points to same instance
      //BUT !!!!!!!!!
      val far = new student
      val foo = new student
      println(far == foo) //prints false because far and foo are different instances

      println(mary.name) //prints Khadhar Basha
      println(bala.name) //prints Khadhar Basha

      println(student.name)
      println(student.canFly)
  }

}

/* output
First Line
true
false
Khadhar Basha
Khadhar Basha
Khadhar Basha
false
 */
