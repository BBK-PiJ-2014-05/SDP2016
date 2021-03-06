package sml

/**
  * Created by geoff_000 on 16/02/2016.
  *
  * This class ....
  * <p>
  * An instance contains 32 registers and methods to access and change them
  *
  */
case class Registers(size: Int) {
  val registers: Array[Int] = new Array(size)

  override def toString(): String =
  registers.mkString(" ")


  // Set register i to v.
  // Precondition: 0 <= i <= NUMBEROFREGISTERS

  def update(k: Int, v: Int) = registers(k) = v

  def apply(k: Int) = registers(k)


}
