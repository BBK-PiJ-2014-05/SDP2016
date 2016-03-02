package traitsinheritance




/**
  * Created by geoff_000 on 24/02/2016.
  */
sealed trait Shape {

  def area:Double
  def perimeter:Double
  def sides: Int




  final case class Circle(val radius: Int) extends Shape{
    def area: Double = {Math.PI * radius * radius}
    def perimeter: Double = {Math.PI * radius * 2}
    def sides: Int = 1

  }

  final case class Rectangle(val length: Int, val width: Int) extends Shape{
    def this(length: Int){
      this(length,width = length)
    }
    def area: Double = width * length
    def perimeter: Double = 2 * width + 2 * length
    def sides = 4
  }



object Draw extends App{

  def apply(shape: Shape) = shape match {
    case Circle(int) => "A circle with radius:" + int
    case Rectangle(int1, int2) => "A rectangle with length " + int1 + " and width of " + int2


  }

  Draw(Circle(28))
  Draw(Rectangle(3, 4))
}




}



