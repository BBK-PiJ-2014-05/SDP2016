package mapreduce

/**
  * Created by geoff_000 on 24/02/2016.
  */
import com.atomicscala.AtomicTest._

import scala.collection.mutable.ListBuffer

object Various extends App{

  val v = Vector(1,2,3,4)
  v.map(n => n * 11 + 10) is Vector(21,32,43,54)

  println(v.foreach(n => n * 11 + 10)) // nothing is output

  v.foreach(println) // but this works because foreach returns Unit not a new list or Vector

  val buf = scala.collection.mutable.ListBuffer.empty[Int] // use mutable list buffer to hold results
  for(n <- v){
    buf += n *11 + 10
  }
  buf is ListBuffer(21,32,43,54)

  val v1 = Vector(1, 10, 100, 1000)
  v1.reduce((sum, n) => sum + n) is 1111

  var result = 0;
  for (i <- v1){
    result += i
  }
  result is 1111

  def sumInt(list:Int*): Int={
    result = 0
    list.reduceLeft((a,b)=> a + b)


  }
  sumInt(1, 2, 3) is 6
  sumInt(45, 45, 45, 60) is 195

}
