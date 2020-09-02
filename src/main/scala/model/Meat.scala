package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 12:32 AM
 */
abstract class Meat extends Food {
  override def name: String = "Meat"

  override def ingredients: Set[Food] = Set(this)

  override def flavor: Map[Taste, Int] = Map(Taste.Salty -> 50, Taste.Umami -> 20)

  // calculate(sweet, sour, bitter, salty, umami)
  override protected def calculateYummyness: PartialFunction[(Int, Int, Int, Int, Int), Int] = {
      case (_, _, _, i, j) if j > 50 => normalizeYammyness((i*i - j*j) / 100)
      case (_, _, _, i, j) => normalizeYammyness(i*j / 100)
      case r => super.calculateYummyness(r)
  }
}
