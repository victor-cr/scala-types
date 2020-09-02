package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 1:08 AM
 */
class Rice extends Grain {
  override def name: String = "Rice"

  override def ingredients: Set[Food] = Set(this)

  override def flavor: Map[Taste, Int] = Map(Taste.Sweet -> 5, Taste.Salty -> 50, Taste.Umami -> 20)
}
