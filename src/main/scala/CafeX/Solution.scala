package CafeX

/**
  * Created By alex on 10/18/2019.
  */
object Solution {
  protected def billing(items: List[String]) = {
    val d = Map(("Cola",0.50),
      ("Coffee", 1.00),
      ("Cheese Sandwich", 2.00),
      ("Steak Sandwich", 4.50)
    )
    val prices = for(item <- items) yield d(item)
    val sum_prices = prices.sum

    if (items.contains("Steak Sandwich"))
      if (sum_prices * 0.2 > 20) sum_prices + 20
      else Math.round((sum_prices + sum_prices * 0.2)* 100)/ 100.0
    else if (items.contains("Cheese Sandwich"))
      if (sum_prices * 0.1 > 20) sum_prices + 20
      else Math.round((sum_prices + sum_prices * 0.1)* 100) / 100.0

    else Math.round(sum_prices * 100)/ 100.0

  }
  def main(args: Array[String]): Unit = {
    print(billing(List("Cola", "Coffee", "Cheese Sandwich")))
  }
}
