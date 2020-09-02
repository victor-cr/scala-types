package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 1:08 AM
 */
class Beef extends Meat {
  override def name: String = "Beef"

  override def flavor: Map[Taste, Int] = Map(Taste.Sweet -> 1, Taste.Salty -> 50, Taste.Umami -> 20)

  // calculate(sweet, sour, bitter, salty, umami)
  override protected def calculateYummyness: PartialFunction[(Int, Int, Int, Int, Int), Int] = {
    case (i, _, _, j, k) if k > 50 => normalizeYammyness(i + (j*j - k*k) / 100)
    case r => super.calculateYummyness(r)
  }
}
