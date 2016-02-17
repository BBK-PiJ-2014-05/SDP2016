package classargs

/**
  * Created by geoff_000 on 16/02/2016.
  */
class Planet(name:String,desc:String,moons:Int=1) {

  val n = name
  val d = desc
  val mo = moons

  def hasMoon(): Unit ={
    mo > 0
  }

}
