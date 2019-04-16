class Fruit extends App {
  val list: List[String] = List()

  def cube(x: Int) = {
    x * x * x
  }

  def get(xs:Int) : String =
    if(list(xs) == Nil) throw new NullPointerException("No element in this position")
    else list(xs)

  def append(xs:String) : List[String] =
    if (xs == Nil) throw new NullPointerException("Can't have null string!")
    else list :+ xs
}