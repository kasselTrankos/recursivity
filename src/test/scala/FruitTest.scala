import org.scalatest.FunSuite

class FruitTest extends FunSuite {

  test("add to list") {
    val f = new Fruit()
    var o:List[String] = List("uno", "dos", "tres")
    val l:List[String] = List("gato") ++ o.map(x=>x)
    //print(s"The list is : ($l)")
    var t = f.addBegin("perro", l)
    //print(s"The list is : ($t)")

    assert(t(0) == "perro")
  }

}