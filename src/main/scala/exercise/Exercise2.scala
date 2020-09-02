package exercise

import model._

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 12:06 AM
 */
object Exercise2 extends App {

  class Covariant[+T](val value: T) {
//    def getOrElse(default: T): T = ???
  }

  val covariant = new Covariant[Fish](new Salmon)

  println(covariant.value)

  def toFood: Covariant[Food] = covariant

  def toSalmon: Covariant[Salmon] = ???

  def toShark: Covariant[Shark] = ???

}
