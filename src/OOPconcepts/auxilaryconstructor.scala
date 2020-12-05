package OOPconcepts

object auxilaryconstructor extends App {
  val DefaultCrustSize = 12
  val DefaultCrustType = "THIN"

  // the primary constructor
  class Pizza(var crustSize: Int, var crustType: String) {

    // one-arg auxiliary constructor
    def this(crustSize: Int) = {
      this(crustSize, DefaultCrustType)
    }

    // one-arg auxiliary constructor
    def this(crustType: String) = {
      this(DefaultCrustSize, crustType)
    }

    // zero-arg auxiliary constructor
    def this() = {
      this(DefaultCrustSize, DefaultCrustType)
    }

    override def toString = s"A $crustSize inch pizza with a $crustType crust"

  }


  /* output
scala> val p1 = new Pizza(DefaultCrustSize, DefaultCrustType)
val p1: Pizza = A 12 inch pizza with a THIN crust

scala> val p2 = new Pizza(DefaultCrustSize)
val p2: Pizza = A 12 inch pizza with a THIN crust

scala> val p3 = new Pizza(DefaultCrustType)
val p3: Pizza = A 12 inch pizza with a THIN crust

scala> val p4 = new Pizza
val p4: Pizza = A 12 inch pizza with a THIN crust
 */


  class Socket(var timeout: Int = 2000, var linger: Int = 3000) {
    override def toString = s"timeout: $timeout, linger: $linger"
  }

  println(new Socket()) // timeout: 2000, linger: 3000
  println(new Socket(1000)) //timeout: 1000, linger: 3000
  println(new Socket(4000, 6000)) //timeout: 4000, linger: 6000
/* print

 */
}