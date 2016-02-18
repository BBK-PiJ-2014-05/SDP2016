package parameratisedtypes

/**
  * Created by geoff_000 on 18/02/2016.
  */
import com.atomicscala.AtomicTest._


object VectorEx extends App {

  def inferred(c1:Char, c2:Char, c3:Char) ={

    Vector(c1,c2,c3)

  }

  def explicit(c1:Char,c2:Char,c3:Char): Vector[Char]={
    Vector(c1,c2,c3)

  }

  def explicitDouble(c1:Double,c2:Double,c3:Double): Vector[Double]={
    Vector(c1,c2,c3)
  }

  def explicitList(c1:Vector[Double]): List[Double]={
    val list = c1.toList
    list
  }

  def explicitSet(c1:Vector[Double]): Set[Double]={
    val set = c1.toSet
    set
  }

  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicit('a', 'b', 'c') is "Vector(a, b, c)"

  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)
  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

  explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
  explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)

  val dogYears = (x:Int)=>x*7

  dogYears(10) is 70

  var s = ""
  val v = Vector(1, 5, 7, 8)
  v.foreach((i:Int)=>s = s + dogYears(i) + " ")
  s is "7 35 49 56 "

  val squareThem = (x:Int)=>x * x
  var t = ""
  val numbers = Vector(1,2,5,3,7)
  numbers.foreach((i:Int)=>t = t + squareThem(i) + " ")
  t is "1 4 25 9 49 "










}
