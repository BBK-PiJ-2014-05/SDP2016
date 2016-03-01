package recursion

/**
  * Created by geoff_000 on 27/02/2016.
  */
object Recursion extends App {

  def sum(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else loop(a + 1, f(a) + acc)

    loop(a, 0)
  }
println(sum(x=>x*x,3,5))
}
