package part1basics

object ExceptionHandling {
    /*Pattern matching is a way of checking the given sequence of tokens for the presence of the
     * specific pattern.
     * It is a technique for checking a value against a pattern.
    */

    def main(args:Array[String]):Unit =
    {

      /*Exception handling is a mechanism which is used to handle abnormal conditions.
    * Avoid termination of your program unexpectedly.
   */

      try
        {


          val y = 10/1
          println("first statement executed and result is : " + y);
          val z=Array(0,20,30);
          println(z.size)
          if( z.size < 3)
          {
            println("Siz of z array is not < 0")
            val arrval=z(3);
            val yy=z.length;
            println(arrval)
          }
          // Custom exception handling
          if(z(0)==0)
          {
            println("Calling custom exception")
            throw new Exception()
          }
          val x = 10/1
          println("All statements executed");
          //println(y)


        }
      catch
        {
          case a:java.lang.ArrayIndexOutOfBoundsException =>
          {
            println("array index exception occured" + a)
            println("I will be executed when error occured");
            println("calling test method with param as 2")
            println(testmatch(2));

          }
          case a:java.lang.Exception =>
          {
            println("Some exception occured" + b)
            println("I will be executed when error occured");
            println("calling test method with param as 2")
            //println(testmatch(2));

          }

        }



    }
    // method containing match keyword
    def testmatch(x:Int) = x match
    {
      // if value of x is 0,
      // this case will be executed
      case 0  => "Hello, Techies"

      // if value of x is 1,
      // this case will be executed
      case 1 => "Are you learning Scala?"

      // if x doesnt match any sequence,
      // then this case will be executed
      case _ => "Good Luck!!"
    }


    def calcuator(a:Int,b:Int,op:String):Any =
      op match
      {

        case "add" | "addition" =>
        {
          println("Add Numbers")
          a + b
        }
        case "sub" | "subtract" =>
        {
          println("Sub Numbers")
          a - b
        }
        case "mul" | "multiply" =>
        {
          println("Multiply Numbers")
          a * b
        }
        case _ =>
        {
          println("Operation Not matched")
          "No Match"
        }
      }

    val a = 100
    val b = 100


    // Case with multiple expressions
    def testcaseconditional(x:Int) = x match
    {

      // if value of x is 0,
      // this case will be executed
      case aa if x == 0  => {if (a == b) {println(a)}}

      // if value of x is 1,
      // this case will be executed
      case multiplecondition if (x > 0 & x < 10) => {if (a != b) {println(b)}}

      case notmatches2 if x > 10 & x < 100 => {if (a != b) {println(b+a)}}

      // if x doesnt match any sequence,
      // then this case will be executed
      case _ => "Good Luck!!"


  }


}
