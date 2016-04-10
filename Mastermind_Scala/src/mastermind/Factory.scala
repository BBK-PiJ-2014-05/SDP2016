package mastermind

/**
  * Created by geoff_000 on 02/03/2016.
  */
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


object Factory {

  def getInstance(c: Class[_], b: Boolean): Game ={

    val colours:Set[String] = ColourSetMap.getColourKeys
    val codeLength = ColourSetMap.CODELENGTH
    val r = ColourSetMap.generateRan
    var list = List[String]()
    val m = ColourSetMap.getCode(list)
    for (x <- m) print(" " + x)

    val numberOfGuesses = ColourSetMap.NUMBEROFGUESEES
    val allCorrect:Boolean = false
    var guess = 0
    while (!allCorrect && guess < numberOfGuesses){
      System.out.println("Next Guess: ")

    }







    null



  }





}
