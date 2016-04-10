package traitsinheritance

/**
  * Created by geoff_000 on 10/04/2016.
  */
sealed trait Publication
case class Book(val title:String,val author:Author) extends Publication
case class Periodical(val title:String,val editor:String) extends Publication


case class Author(val name:String)


case class Issue(val periodical:Periodical,val issueNum:Int,val vol:Int)

case class Manuscript(val author:Author, val length:Int)



object Publication extends App{

  val auth = Author("Hemmingway")
  val book = Book("The Old Man and the Sea",auth)
  val periodical = Periodical("Cooking Weekly","R Stein")
  val issue = Issue(periodical,1,1)

}