package constructors

/**
  * Created by geoff_000 on 17/02/2016.
  */
class Tea(name:String="Earl Grey",milk:Boolean = false, sugar:Boolean=false,decaf:Boolean=false) {
  val n = name
  var m = milk
  var s = sugar
  var d = decaf
  var c:Int = 0

  def describe: String={
  var result:String = "" + n

    if(d) {
      result = result + " decaf"
    }
    if (m){
      result = result + " + milk"
    }
    if (s) {
      result = result + " + sugar"
    }

    result

  }

  def calories: Int = {
    var result: Int = 0
    if(s){
      result += 16
    }
    if (m){
      result += 100
    }
    result
  }




}
