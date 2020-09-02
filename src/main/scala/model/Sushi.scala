package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 1:08 AM
 */
class Sushi(fish: Fish, rice: Rice, extra: Food*) extends Food {
  override def name: String = "Sushi"

  override def ingredients: Set[Food] = Set(extra: _*) + fish + rice

  override def flavor: Map[Taste, Int] = Map(Taste.Sweet -> 5, Taste.Salty -> 50, Taste.Umami -> 20)
}
