package traitsinheritance

/**
  * Created by geoff_000 on 24/02/2016.
  */
sealed trait Colour {

  var r: Int = 0
  var g: Int = 0
  var b: Int = 0
  def shadeValue: Int = r + g + b


  case class Red(val red: Int, val green:Int, val blue:Int) extends Colour{
    r = red
    g = green
    b = blue

  }


}
