package strategy

/**
  * Created by geoff_000 on 05/02/2016.
  */
class TextEditor(formatter:TextFormatter){


  val f:TextFormatter = formatter

 def publishText(text:String): Unit ={
    f.format(text)
 }




}
