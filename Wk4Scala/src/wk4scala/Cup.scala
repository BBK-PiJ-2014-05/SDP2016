package wk4scala

/**
  * Created by geoff_000 on 30/01/2016.
  */
class Cup {

  var percentFull = 0
  val max = 100

  def add(percent: Int): Int = {
    percentFull += percent
    if (percentFull > max){
      percentFull = max
    } else if (percentFull < 0){
      percentFull = 0
    }
    percentFull

  }

  def get(): Int = {
    percentFull
  }

  def set(percent: Int){
    percentFull = percent
  }
}
