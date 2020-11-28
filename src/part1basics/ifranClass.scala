package part1basics

import scala.collection.mutable.ArrayBuffer

object ifranClass extends App{

  val arrsal = Array(1000,2000,3000)
/*
Array is s super class, allows to mutate
Array is a fixed size,

For ex Array(1000,2000,3000) ==> cannot be resized to
  Array(1000,2000,3000,4000) or Array(500,1000,2000,3000)
 */


  /* Multi Dimentional Array */

  val arrsal2 = Array((1,100), (2,200), (3,300))

/* How to access
scala> arrsal2(0)._1
val res5: Int = 1

scala> arrsal2(0)._2
val res7: Int = 100

 */

  /* Array Buffer - resize of array using ArryBuffer*/
  val s1 = Seq(10,20,30,40,50)
  var s2 = scala.collection.mutable.Seq(10,20,30,40,50)
  val s3 = ArrayBuffer(89,90,91,92)
  /*
  scala> s3
val res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(89, 90, 91, 92)

scala> s3+=93
val res7: s3.type = ArrayBuffer(89, 90, 91, 92, 93)
   */

}
