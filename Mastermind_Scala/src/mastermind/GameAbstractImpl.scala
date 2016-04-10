package mastermind

/**
  * Created by geoff_000 on 02/03/2016.
  */
abstract class gameAbstractImpl extends Game {

  private var showCode: Boolean = false

  /**
    * Create a Game object.
    *
    * @param easy If easy is true the secret code will be
    *             revealed at all times when playing the game. If easy is
    *             false the secret code is not revealed until correctly guessed
    *             or the player runs out of turns.
    */
  def this(easy: Boolean) {
    this()
    showCode = easy
  }




}
