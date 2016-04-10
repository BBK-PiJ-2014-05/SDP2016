package mastermind

/**
  * Created by geoff_000 on 06/03/2016.
  */
object FeeedBack{
  def peg(x:Char): String = x match{

    case 'b' => "Black"
    case 'w' => "White"
  }

}
