package strategy

/**
  * Created by geoff_000 on 05/02/2016.
  */

/** the strategy pattern uses an interface and some concrete classes implementing the interface; each concrete class
* implements some different way of describing the same interface
* Use the strategy pattern when the concrete class of an interface type is determined at run time
*/

object TestStrategyPattern{
  def main (args:Array[String]) {
    val capTextFormatter = new CapTextFormatter()
    var editor = new TextEditor(capTextFormatter)
    editor.publishText("This text should be in uppercase")
    val lowerTextFormatter = new LowerTextFormatter()
    editor = new TextEditor(lowerTextFormatter)
    editor.publishText("This text should be in lower case")
  }

}
