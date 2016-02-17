package classargs

/**
  * Created by geoff_000 on 16/02/2016.
  */
import com.atomicscala.AtomicTest._

class TestArgs extends App {



    var family1 = new Family("John", "kevin", "Dad", "Mum")
    family1.familySize() is 4


    var family2 = new Family("Dad", "Mom", "Rachel")
    family2.familySize() is 3

    var family3 = new Family("dad", "mum", "Sten")
    family3.familySize() is 3

    def squareThem(args: Int*): Int = {
      def sqr(x: Int) = x * x
      var sum = 0
      for (x <- args) {
        sum = sum + sqr(x)
      }
      sum
    }

    squareThem(3) is 9
    squareThem(2, 4, 5) is 45
    squareThem(3, 5, 9) is 115

    val j = new SimpleTime(hours = 6, mins = 89)
    j.h is 6
    j.m is 89
    val m = new SimpleTime(hours = 8)
    m.h is 8
    m.m is 0

    val earth = new Planet("Earth", "3rd planet from the sum")
    earth.hasMoon() is true
    val mercury = new Planet("Mercury", "1st planet from the sun", 0)
    mercury.hasMoon() is false

    val mars = new Planet(moons = 0, name = "Mars", desc = "Big red planet")
    mars.hasMoon() is false







}
