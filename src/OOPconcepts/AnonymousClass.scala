package OOPconcepts

object AnonymousClass extends App{

  case class Person(name:String, age:Int)

 // 1. class paramters are prompted to fields
  val basha = Person("Khadhar Basha", 20)
  println(basha.name)       //Khadhar Basha
  println(basha.age)        //20

  //2. easy for toString
  println(basha.toString)   //Person(Khadhar Basha,20)

  //3. cloning
  val jim = basha.copy()
  println(jim.name)
}
