package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 1:08 AM
 */
class Shark extends Fish with Terefah {
  override def name: String = "Shark"

  override def ingredients: Set[Food] = Set(this)

  override def flavor: Map[Taste, Int] = Map(Taste.Sweet -> 1, Taste.Salty -> 40, Taste.Umami -> 10)
}
