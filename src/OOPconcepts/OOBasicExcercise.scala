package OOPconcepts

object OOBasicExcercise extends App{

  /*
  Novel and the writer

  Writer should have
    FirstName
    SurName
    YearofBirth
    method : Fullname = Firstname + surname

   Novel: name, year of release, author
   method : AuthorAge
   isWrittenBy(author)
   copy: (new year of release = new instance of Novel
   */

  val author = new Writer("Chetan", "Bhagat", 1982)
  val novel = new Novel("room103", 2012, author)

  println(novel.author_age) //30
  println(novel.isWrittenBy(author))
  novel.copy(2015)
  println(novel.author_age)

  class Writer(FirstName:String, SurName:String, val YearofBirth:Int) {
    def fullname:String = FirstName + ' ' + SurName
  }

  class Novel(name:String, year:Int, author: Writer){
    def author_age:Int = year - author.YearofBirth
    def isWrittenBy(author:Writer) = author == this.author
    def copy(newYear: Int):Novel = new Novel(name, newYear, author)
  }

  /*
  Counter class
    - receives - Int has a method
    - Method - current count
    - Method to increament and decrement method to return ==> new counter
   */

}
