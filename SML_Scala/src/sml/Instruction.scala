package sml

/**
  * Created by geoff_000 on 16/02/2016.
  */
abstract class Instruction(label: String, opcode: String) {

  override def toString(): String = label + ": " + opcode

  def execute(m: Machine): Unit


}
