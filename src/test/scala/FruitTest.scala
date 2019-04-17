import org.scalatest.FunSuite

class FruitTest extends FunSuite {

  test("add  to list at first") {
    val f = new Fruit()
    var o:List[String] = List("uno", "dos", "tres")
    var t = f.addBegin("perro", o)

    assert(t(0) == "perro")
  }
  test("basic union of two lists") {
    val f = new Fruit()
    var o:List[String] = List("uno", "dos", "tres")
    var t = f.union(List("perro", "gato", "animal"), o)


    assert(t.length == 6)
  }

}