package generics



/**
  * Created by geoff_000 on 01/03/2016.
  */
object LinkedListTest extends App{

  val example = Pair(2,Pair(3,Pair(4,End)))
  assert(example.length == 3)
  assert(example.tail.length == 2)
  assert(End.length == 0)
  //assert(example.contains(3) == true) // why doesn't this work??


}
