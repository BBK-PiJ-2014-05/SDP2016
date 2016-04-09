package traitsinheritance

/**
  * Created by geoff_000 on 24/02/2016.
  */
sealed trait Colour {


  def r: Int
  def g: Int
  def b: Int

}

case object Red extends Colour{
  def r = 255
  def g = 0
  def b = 0
}

case object Yellow extends Colour {
  def r = 255
  def g = 255
  def b = 0
}

case object Pink extends Colour {
  def r = 255
  def g = 192
  def b = 203
}

case class customColour(r:Int,g:Int,b:Int) extends Colour {

}






