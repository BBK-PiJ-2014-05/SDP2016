package traitsinheritance




/**
  * Created by geoff_000 on 24/02/2016.
  */
sealed trait Shape {

  def area:Double
  def perimeter:Double
  def sides: Int
  def colour: Colour




  final case class Circle(val radius: Int, val c: Colour) extends Shape{
    def area: Double = {Math.PI * radius * radius}
    def perimeter: Double = {Math.PI * radius * 2}
    def sides: Int = 1
    def colour = c

  }

  final case class Rectangle(val length: Int, val width: Int, val c: Colour) extends Shape{
    def this(length: Int){
      this(length,width = length)
    }
    def area: Double = width * length
    def perimeter: Double = 2 * width + 2 * length
    def sides = 4
    def colour = c
  }



object Draw extends App{

  def apply(shape: Shape) = shape match {
    case Circle(int,c) => "A circle with radius:" + int + " and colour: " + c
    case Rectangle(int1, int2, c) => "A rectangle with length " + int1 + " and width of " + int2 + " and colour: " + c



  }

  Draw(Circle(28,Red))
  Draw(Rectangle(3, 4,Pink))
}




}



