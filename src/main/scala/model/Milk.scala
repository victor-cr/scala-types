package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 1:08 AM
 */
class Milk extends Food {
  override def name: String = "Milk"

  override def ingredients: Set[Food] = Set(this)

  override def flavor: Map[Taste, Int] = Map(Taste.Sweet -> 15, Taste.Salty -> 5, Taste.Umami -> 5)

  // calculate(sweet, sour, bitter, salty, umami)
  override protected def calculateYummyness: PartialFunction[(Int, Int, Int, Int, Int), Int] = {
    case (i, _, _, j, k) => normalizeYammyness(i + j + k)
    case r => super.calculateYummyness(r)
  }
}
