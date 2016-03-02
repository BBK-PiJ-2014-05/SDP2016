package mastermind

/**
  * Created by geoff_000 on 02/03/2016.
  */
trait CodeFactory {

  def apply():List // returns a gameCode using the methods below as an immutable List

  def getColourSet(): Set // reads the colours from a properties file and creates a Set

  def getGameCode(colourSet:Set): List

  /**
    * read the variable codeLength from props file (the number of colours in the code = 4)
    * generate a random int in the range 0 - colourSet.length and get the colour in the colourSet
    * corresponding to the position given by the random int. Add this colour to a mutable ListBuffer.
    * Repeat codeLength number of times.
    * The codeSet has been created. Now create a List (immutable) and add the contents of the ListBuffer to it.
    * return the immutable gameCode List
    *
     */







}
