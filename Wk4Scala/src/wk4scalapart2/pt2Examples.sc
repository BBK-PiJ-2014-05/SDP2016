import java.lang
import java.lang.Number

import scala.math.Numeric

42 //int (32 bits) val ==42
123L //Long (64 bits) val ==123
true //Boolean (1 bit) val == 1
42.0 //Double (64 bits) val ==42.0
'a' // Char (16 bits) val == a
"a" // String (32 bits) val == a
"Hello world!" //String
println("Hello world!") //no value
//'Hello World' error
val a = 1
val b = 2
if(a>b) "alien" else "predator" //String (after Boolean check)
if(a>b) "alien" else 2001 //Any, like Object in Java, the superclass?
if(true) "Hello"
1+2+3 //no difference to 6, Int, (could be Var, not Val)
6
def square(x: Double): Double={x * x}
val y = square(4)
def cube(squareVal: Double): Double={ square(squareVal)* squareVal}
val cubeVal = cube(4)

def square[T : Numeric] (x: T): T = implicitly[Numeric[T]].times(x,x)
val genericSquareDouble = square(22.0)
val genericSquareInt = square(22)

class Person{
 var firstName = ""
  var lastName = ""
}





















