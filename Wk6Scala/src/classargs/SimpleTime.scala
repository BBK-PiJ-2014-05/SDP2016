package classargs

/**
  * Created by geoff_000 on 16/02/2016.
  */


class SimpleTime(hours:Int,mins:Int = 0) {

  val h = hours
  val m = mins

}

object SimpleTime{
  new SimpleTime(hours = 5, mins = 7)

}


