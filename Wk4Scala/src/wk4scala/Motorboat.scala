package wk4scala

/**
  * Created by geoff_000 on 30/01/2016.
  */
class Motorboat {

  def start(): String={
    "motor on!"
  }

  def off(): String={
    "motor off"
  }

  def signal(): String={
    val flare = new Flare()
    val signal = flare.light()
    signal
  }

}
