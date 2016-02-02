package wk4scalapart2
import threetrivialclasses.Trivial1
import threetrivialclasses.Trivial2
import threetrivialclasses.Trivial3
import wk4scala.AtomicTest
/**
  * Created by geoff_000 on 31/01/2016.
  */
object Person {
  val firstName = "Geoff"
  val lastName = "Watson"

object Alien{
  val p = Person.firstName
  def greet(p: String){
    println("Hello " + p)


  }
}
// Methods have no value unlike functions. No object, no instance. Methods are a function type.

  def main(args: Array[String]) {
    println(Person.firstName)
    Alien.greet(Person.firstName)
    val triv1 = new Trivial1()
    val triv2 = new Trivial2()
    val triv3 = new Trivial3()

    //13.

    val range = Range(1,10)

    val r1 = range
    import AtomicTest._

    r1 is range

    //14.
    var i = 0 // must be var not val since this variable will change as it iterates
    var sum = 0 // as above
    for (i <- 1 to 10){

        sum += i

    }
    assert(sum==55,"Expected 55, got: " + sum)

    //15.
    var totalEvens = 0
    for (i <- 1 to 10){
      if(i%2 ==0){
        totalEvens += i
      }
    }
    assert(totalEvens==30,"Expected 30, Got: " + totalEvens)
    totalEvens is 30

    //16.

    totalEvens = 0
    var totalOdds = 0
    for (i <- 1 to 10){
      if(i%2==0){
        totalEvens += i
      } else {
        totalOdds += i
      }
    }
    totalEvens is 30
    totalOdds is 25

    val words = Vector("the","dog","visited","the","firehouse")
    var str = ""
    for (i <- words){
      str += i + " "
    }
    assert(str=="the dog visited the firehouse ", "Expected: the dog visited the firehouse , Got:" + str)
    str.toString() is "the dog visited the firehouse "

    val str1 = str.replace("firehouse ","firehouse!")
    println(str1)

    for (i <- 0 to str.length()-1){
      print(str(str.length()-1-i))
    }
    println(" ")

    //19.

    val str3 = str.split(" ")

    val len = str3.length
    for (i <- 0 to str3.length-1){
      print(str3(str3.length-1-i)+" ")
    }

    //20.
    println(" ")
    val intVector = Vector(1,2,3,4,5,6)
    val doubleVector = Vector(2.0,3.4,5.4,6.0)

    val intSum = intVector.sum
    val doubleSum = doubleVector.sum
    val intMax = intVector.max
    val doubleMax = doubleVector.max
    val intMin = intVector.min
    val doubleMin = doubleVector.min

    println("intSum: " + intSum)
    println("doubleSum: " + doubleSum)
    println("int Max: " + intMax)
    println("double Max: " + doubleMax)
    println("int Min: " + intMin)
    println("double Min: " + doubleMin)

    val strVec = Vector("hi","bye","cheers")
    //println("String sum: " + strVec.sum)  does not work because sum works only on number type
    println("String max: " + strVec.max)  // works because the ASCII value can be evaluated for each string object in the vector
    println("String min: " + strVec.min) // e.g. uppercase has a higher value than lowercase


    //21.

    val ranger = Range(1,10)
    val sumR = ranger.sum
    println(sumR)

    //22.

    def isPalindrome(str:String): Boolean={
      val strBack = str.reverse
      val result = strBack==str
      result
    }

      val testString = "dad"
      testString is true

      assert(true==isPalindrome(testString))
      assert(true==isPalindrome("mum"))
      assert(false==isPalindrome("street"))

      def forecast(pc:Int): String= pc match {
        case 100=> "Sunny"
        case 80=> "Mostly sunny"
        case 50=> "Partly sunny"
        case 20=> "Mostly cloudy"
        case 0=> "Cloudy"
        case _=> "unknown"
      }

      forecast(100) is "Sunny"
      forecast(80) is "Mostly sunny"
      forecast(50) is "Partly sunny"
      forecast(20) is "Mostly cloudy"
      forecast(0) is "Cloudy"
      forecast(15) is "unknown"

    //24 & 25

    class SimpleTime(hours:Int=0,mins:Int=0){
      val h: Int = hours
      val m: Int = mins

    }

    val simpleTime = new SimpleTime(12,30)
    simpleTime.h is 12
    simpleTime.m is 30
    val simpleTime2 = new SimpleTime(22)
    simpleTime2.h is 22
    simpleTime2.m is 0

    //26.

    class Planet(name:String,desc:String,moons:Int=1) {
      val n = name
      val d = desc
      val p = moons


      def hasMoon(): Boolean = {
        p > 0
      }
    }

    val myPlanet = new Planet("Mercury","A small planet that's very hot",0)
    myPlanet.hasMoon() is false


    //27.
    class Person(f:String,l:String,e:String){
      val first:String = f
      val last:String = l
      val email:String = e
    }

    val pers = new Person("Jane","Smile","jane@smile.com")
    pers.first is "Jane"
    pers.last is "Smile"
    pers.email is "jane@smile.com"


    val pers1 = new Person("j","w","r")
    val people = Vector(pers,pers1)
    people(0) is pers
    





  }
}