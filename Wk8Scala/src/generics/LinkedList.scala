package generics

/**
  * Created by geoff_000 on 27/02/2016.
  */
sealed trait LinkedList[+T] {


  def isEmpty: Boolean
  def length: Int
  def h: T
  def t: LinkedList[T]
  def contains(x:Any):Boolean // why not T instead of Any??




  //def contains(x:LinkedList): Boolean
}




final case object End extends LinkedList[Nothing] {


  override def isEmpty = true


    def h: Nothing = throw new NoSuchElementException("head of empty list")

    def t: Nothing = throw new NoSuchElementException("tail of empty list")

     def length: Int = 0


  override def contains(x:Any) = false


}

final case class Pair[T](head: T, tail:LinkedList[T]) extends LinkedList[T]{

  override def isEmpty = false
  override def length: Int = if(isEmpty) 0 else 1 + t.length
  def h = head
  def t = tail
  override def contains(x:Any):Boolean={
    if(head == x) true
    tail.contains(x)
  }

}
















