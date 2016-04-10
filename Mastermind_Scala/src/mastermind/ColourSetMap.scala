package mastermind

/**
  * Created by geoff_000 on 06/03/2016.
  */
object ColourSetMap {

  val COLOURSET: Map[String, String] = Map("B" -> "Black", "O" -> "Orange", "R" -> "Red", "G" -> "Green", "P" -> "Purple", "W" -> "White")
  val NUMBEROFGUESEES = 12
  val CODELENGTH = 4
  var gameWon = false


  def getColourKeys: Set[String] = COLOURSET.keySet

  def colourValues: Iterable[String] = COLOURSET.values

  def generateRan: Int = {
    val r = scala.util.Random
    val result = r.nextInt(getColourKeys.size - 1)
    result
  }

  def getCode(list: List[String]): List[String] = {
    val colourList = getColourKeys.toList
    if (list.length == CODELENGTH) {
      list
    } else {
      val r = generateRan
      val randomColour = colourList(r)
      val buildList = randomColour :: list
      getCode(buildList)
    }
  }




}
