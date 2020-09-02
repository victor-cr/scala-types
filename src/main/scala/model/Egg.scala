package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 1:08 AM
 */
class Egg extends Food {
  override def name: String = "Egg"

  override def ingredients: Set[Food] = Set(this)

  override def flavor: Map[Taste, Int] = Map(Taste.Sweet -> 5, Taste.Salty -> 50, Taste.Umami -> 20)

  // calculate(sweet, sour, bitter, salty, umami)
  override protected def calculate: PartialFunction[(Int, Int, Int, Int, Int), Int] = {
    case (i, _, _, j, k) if k > 50 => normalize(i + (j*j - k*k) / 100)
    case r => super.calculate(r)
  }
}
