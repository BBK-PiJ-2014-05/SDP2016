package traitsinheritance

/**
  * Created by geoff_000 on 10/04/2016.
  */
sealed trait LinkedList[A]{
  def head: A
  def tail: LinkedList[A]


  def length: Int =
    this match {
      case Pair(h,t) => 1 + t.length
      case Empty() => 0
  }

  def apply[T](n:Int)= {
    if(n > this.tail.length || n < 0){
      throw IndexOutOfBoundsException
    } else {
      if (n == 0){
        this.head
      } else {
        this.tail(n-1)
      }
    }
  }

  def contains[T](x:T): Boolean =
    this match {
      case Pair(h,t) => if(this.head.equals(x)) {
        true
      } else t.contains(x)
      case Empty() => false
      }
    }

  }

}

final case class Pair[A](head:A,tail:LinkedList[A]) extends LinkedList[A]
final case class Empty[A]() extends LinkedList[A] //Empty should have a head and a tail??


object ListTest extends App{

  val list: LinkedList[Int] = (Pair(1,Pair(2,Pair(3,Pair(4,Empty())))))

  list.isInstanceOf[LinkedList[Int]] // returns true

  list.head // returns 1 as an Int
  list.tail.head // returns 2 as an Int
  list.tail.tail // returns Pair(3, Empty()) as a LinkedList[Int]



}


