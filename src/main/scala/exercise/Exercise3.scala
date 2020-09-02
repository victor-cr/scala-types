package exercise

import model._

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 12:06 AM
 */
object Exercise3 extends App {
  class Contravariant[-T] {
    def eat(food: T): Unit = println(food)

//    def getOrElse(default: T): T = ???
  }

  val contravariant = new Contravariant[Fish]

  contravariant.eat(new Salmon)
  contravariant.eat(new Shark)

  def toFood: Contravariant[Food] = ???

  def toSalmon: Contravariant[Salmon] = contravariant

  def toShark: Contravariant[Shark] = contravariant
}
