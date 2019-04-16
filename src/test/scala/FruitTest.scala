import org.scalatest.FunSuite

class FruitTest extends FunSuite {

  test("add to list") {
    val f = new Fruit()
    val m: List[String] = f.append("manzana")
    print(m)
    print(f)
    assert(f.get(0) == "manzana")
  }

}