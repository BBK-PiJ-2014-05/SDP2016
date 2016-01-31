package wk4scala



/**
  * Created by geoff_000 on 30/01/2016.
  */
object ScalaApp {

  def main(args: Array[String]){
    val sky = "sunny"
    val temp = 19


    println(sky=="sunny" || temp>80)

    println((sky=="sunny"|| sky=="partly cloudy") || temp>80)

    println((sky=="sunny" || sky=="partly cloudy")|| (temp>80 || temp <20))




    def FahrenheitToCelcius(f: Double): Double={
      return (f- 32) * 5.0/9.0
    }

    def CelciusToFahrenheit(c: Double): Double = {
      return c*9.0/5.0 + 32
    }

    println(FahrenheitToCelcius(70))
    println(CelciusToFahrenheit(21))

    def getSquare(x: Int): Int={
      return x * x
    }

    val a = getSquare(3)
    assert(a==9)

    val b = getSquare(6)
    assert(b==36)

    val c = getSquare(5)
    assert(c==25)

    def IsArg1GreaterThanArg2(arg1: Double,arg2: Double): Boolean = {
      return arg1>arg2
    }

    val t1 = IsArg1GreaterThanArg2(4.1,4.12)
    assert(t1 == false)

    val t2 = IsArg1GreaterThanArg2(2.1,1.2)
    assert(t2==true)

    def manyTimesString(str: String, x: Int): String= {
      var i = 0
      var res = ""
      for (i <- 1 to x) {
        res += str
      }
      return res
    }

    assert(manyTimesString("abc",3)=="abcabcabc","Unexpected result!")

    val m2 = manyTimesString("123",3)

    assert(m2=="123123123","Mismatch")


    val range = List(1,2,3,4,5,6,7,8,9,10)

    for (i <- range){
      println(i)
    }

    for (i <- range){
      if(i%2 != 0){
        println(i)
      }
    }

    var s1 = "Sally"
    var s2 = "Sally"

    if(s1.equals(s2)){
      println("s1 and s2 are equal")
    } else {
      println("s1 and s2 are NOT equal")
    }

    val gir = new Giraffe()
    val hip = new Hippo()
    val mon = new Monkey()
    val tig = new Tiger()
    println(gir+","+hip+","+mon+","+tig)

    val hip2 = new Hippo()
    val mon2 = new Monkey()
    val mon3 = new Monkey()
    println(hip2+","+mon2+","+mon3)

    val motorboat = new Motorboat()
    var v1 = motorboat.start()
    assert(v1=="motor on!","Expected motor on!, Got" + v1)

    val sailboat = new Sailboat()
    val g1 = sailboat.raiseSails()
    assert(g1=="Sails raised!","Expected Sails raised!, Got" + g1)

    val g2 = sailboat.lowerSails()
    assert(g2=="Sails lowered!", "Expected Sails lowered!, Got" + g2)

    val v2 = motorboat.off()
    assert(v2=="motor off", "Expected motor off, Got"+ v2)

    val flare = new Flare()
    val f1 = flare.light()

    assert(f1=="Flare used!", "Expected Flare used!, Got" + f1)

    val sailboat2 = new Sailboat()
    val signal = sailboat2.signal()
    assert(signal=="Flare used!", "Expected Flare used!, Got" + signal)

    val motoboat2 = new Motorboat()
    val signal2 = motoboat2.signal()
    assert(signal2=="Flare used!","Expected Flare used!, Got" + signal2)

    val cup = new Cup()

    cup.add(50)
    cup.add(-20)

    var bal = cup.add(-40)
    println(bal)

    //var test = new AtomicTest[Cup]()

    val cup1 = new Cup()
    cup1.add(20)
    cup1.add(-12)
    cup1.add(-12)
    assert(cup1.percentFull ==0,"Expected 0, Got: " + cup1.percentFull)

    cup1.percentFull = 200
    println(cup1.percentFull) // yes the field percentFull can be accessed from outside the class

    println(cup.get())
    cup.set(22)
    println(cup.get())

    import AtomicTest._

    val cup3 = new Cup
    cup3.add(22) is 22
    cup3.add(12) is 32


    val myVector1 = Vector(1,2,3,4,5,6)
    val myVEctor2 = Vector(1,2,3,4,5,6)

    myVector1 is myVEctor2 //the two vectors appear to be equal
    








  }


}
