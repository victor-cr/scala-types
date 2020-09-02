package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 6:04 PM
 */
abstract class Grain extends Food {
  override def name: String = "Grain"

  override def ingredients: Set[Food] = Set(this)

  // calculate(sweet, sour, bitter, salty, umami)
  override protected def calculateYummyness: PartialFunction[(Int, Int, Int, Int, Int), Int] = {
    case (i, j, k, l, m) if (i + j + k + l + m) > 50 => normalizeYammyness(i + j + k + l + m)
    case r => super.calculateYummyness(r)
  }
}
