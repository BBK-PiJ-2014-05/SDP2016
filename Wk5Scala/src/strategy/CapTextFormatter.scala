package strategy

/**
  * Created by geoff_000 on 05/02/2016.
  */
class CapTextFormatter extends TextFormatter {

  def format(text:String): Unit ={
    println(text.toUpperCase)
  }

}
