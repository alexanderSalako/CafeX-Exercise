package CafeX

/**
  * Created By alex on 10/18/2019.
  */
object Solution {
  /** The function takes the items as an argument and returns the total bill
    * Total bill is calculated by the following conditions:
    * 1. If all of the items are drink then no service charges.
    * 2. When purchased items include any food apply a service charge of 10% to the
    * total bill (rounded to 2 decimal places)
    * 3. When purchased items include any hot food apply a service charge of 20% to
    * the total bill
    * 4. A total of £20 service charge can be added in the total bill.
    *
    * @param items the list of all the items
    * @return the bill including the service charges for the items.
    */
  def billing(items: List[String]) = {
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
    print(billing(List("Cola", "Coffee")))
  }
}
