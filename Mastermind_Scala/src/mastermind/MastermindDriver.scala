package mastermind

/**
  * This is the main class. It is responsible for starting ganes and creating the text based display
  */

import org.springframework.context.support.ClassPathXmlApplicationContext

object MastermindDriver {

  def main(args: Array[String]) {

    val list = List()
    val result = ColourSetMap.getCode(list)
    println(result)

  }
}
