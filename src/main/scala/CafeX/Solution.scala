package CafeX

/**
  * Created By alex on 10/18/2019.
  */
object Solution {
  protected def billing(items: List[String]):Double = {
    val d = Map(("Cola",0.50),
      ("Coffee", 1.00),
      ("Cheese Sandwich", 2.00),
      ("Steak Sandwich", 4.50)
    )
    val prices = for(item <- items) yield d(item)
    val sum_prices = prices.sum

    sum_prices

  }
  def main(args: Array[String]): Unit = {
    print(billing(List("Cola", "Coffee", "Cheese Sandwich")))
  }
}
