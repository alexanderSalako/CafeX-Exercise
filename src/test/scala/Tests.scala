import org.scalatest.FunSuite

/**
  * Created By alex on 10/18/2019.
  */
class test extends FunSuite{
  test("['Cola', 'Coffee', 'Cheese Sandwich'] returns 3.85"){
    assert(CafeX.Solution.billing(List("Cola", "Coffee", "Cheese Sandwich")) == 3.85)
  }
  test("['Cola'] returns 0.5"){
    assert(CafeX.Solution.billing(List("Cola")) == 0.5)
  }
  test("['Cola','Coffee'] returns 1.5"){
    assert(CafeX.Solution.billing(List("Cola","Coffee")) == 1.5)
  }

  test("['Coffee'] returns 1.0"){
    assert(CafeX.Solution.billing(List("Coffee")) == 1.0)

  }

  test("Cheese Sandwich returns 2.2") {
    assert(CafeX.Solution.billing(List("Cheese Sandwich")) == 2.20)
  }
  test("['Cheese Sandwich, 'Cola'] returns 2.75"){
    assert(CafeX.Solution.billing(List("Cheese Sandwich","Cola")) == 2.75)
  }

  test("Items whose service is greater than 20 should return 20"){
    assert(CafeX.Solution.billing(List.fill(25)("Steak Sandwich")) == 132.5)
  }

}
