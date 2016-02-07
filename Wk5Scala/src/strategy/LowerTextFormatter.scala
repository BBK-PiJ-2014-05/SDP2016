package strategy

/**
  * Created by geoff_000 on 05/02/2016.
  */
class LowerTextFormatter extends TextFormatter {

  def format(text:String): Unit ={
    println(text.toLowerCase())
  }

}
