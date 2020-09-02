package exercise

import model._

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 12:06 AM
 */
object Exercise1 extends App {
  class Invariant[T](var value: T) {
    def getOrElse(default: T): T = if (value == null) default else value
  }

  val invariant = new Invariant[Fish](new Salmon)

  invariant.value = new Shark

  def toFood: Invariant[Food] = ???

  def toSalmon: Invariant[Salmon] = ???

  def toShark: Invariant[Shark] = ???
}
