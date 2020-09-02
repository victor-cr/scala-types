package model

/**
 * JavaDoc here
 *
 * @author Victor Polischuk
 * @since 9/2/2020 12:12 AM
 */
trait Food {
  def name: String

  def ingredients: Set[Food]

  def flavor: Map[Taste, Int]

  def yummyScore: Int = {
    val flavors = flavor

    val sweet = flavors.getOrElse(Taste.Sweet, 0)
    val sour = flavors.getOrElse(Taste.Sour, 0)
    val bitter = flavors.getOrElse(Taste.Bitter, 0)
    val salty = flavors.getOrElse(Taste.Salty, 0)
    val umami = flavors.getOrElse(Taste.Umami, 0)

    calculateYummyness(sweet, sour, bitter, salty, umami)
  }

  protected def calculateYummyness: PartialFunction[(Int, Int, Int, Int, Int), Int] = {
    case (0, 0, 0, 0, 0) => 0
    case (i, 0, 0, 0, 0) => normalizeYammyness(i)
    case (0, i, 0, 0, 0) => normalizeYammyness(i)
    case (0, 0, i, 0, 0) => normalizeYammyness(i)
    case (0, 0, 0, i, 0) => normalizeYammyness(i)
    case (0, 0, 0, 0, _) => 0
  }

  protected final def normalizeYammyness(i: Int): Int = Math.min(i, 100)
}
