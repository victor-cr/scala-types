package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 1:08 AM
 */
class Salmon extends Fish {
  override def name: String = "Salmon"

  override def ingredients: Set[Food] = Set(this)

  override def flavor: Map[Taste, Int] = Map(Taste.Sweet -> 5, Taste.Salty -> 50, Taste.Umami -> 20)
}
