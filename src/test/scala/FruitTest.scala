import org.scalatest.FunSuite

class FruitTest extends FunSuite {

  test("add to list") {
    val f = new Fruit()
    f.append("manzana")
    assert(f.get(0) == "manzana")
  }

}