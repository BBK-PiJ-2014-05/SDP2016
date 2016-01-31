package wk4scala

/**
  * Created by geoff_000 on 30/01/2016.
  */
class Sailboat {

  def raiseSails(): String = {
    "Sails raised!"


  }

  def lowerSails(): String = {
    "Sails lowered!"

  }

  def signal(): String={
      val flare = new Flare()
    val signal = flare.light()
    signal
  }

}
