package classargs

/**
  * Created by geoff_000 on 17/02/2016.
  */
class Item(name:String, price:Double) {

  val n = name
  val p = price
  var g = false
  var m = false
  var t = 0.10
  val totalCost = p * (1+t)

  def cost(grocery:Boolean = false,medication:Boolean = false, rate:Double = 0.10 ): Double ={
    g = grocery
    m = medication
    t = rate
    totalCost
  }



}
