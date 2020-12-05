package OOPconcepts

object twomain {
  def add(x:Int, y:Int): Int = x + y
  def sub(x:Int, y:Int): Int =  x - y
}

  object extobj {
    def main(args: Array[String]): Unit = {
      println(twomain.add(5,6))
      println(twomain.sub(9,6))
    }
  }