package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 5:55 PM
 */
class Chicken extends Meat {
  override def name: String = "Chicken"

  override def flavor: Map[Taste, Int] = Map(Taste.Sweet -> 1, Taste.Salty -> 20, Taste.Umami -> 20)

  // calculate(sweet, sour, bitter, salty, umami)
  override protected def calculateYummyness: PartialFunction[(Int, Int, Int, Int, Int), Int] = {
    case (i, _, _, j, k) => normalizeYammyness(i + j + k)
    case r => super.calculateYummyness(r)
  }
}