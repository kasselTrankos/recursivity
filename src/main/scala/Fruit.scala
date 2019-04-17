

class Fruit  {

  var list: List[String] = List("radiohead")

  override def toString: String =
    s"The list is : ($list)"


  def union(that: List[String]): List[String] = {
    list union that
  }
  def get(xs:Int) : String =
    if(list eq null) throw new NullPointerException("Can't be null the list")
    else if(list(xs) eq null) throw new NullPointerException("No element in this position")
    else list(xs)

  def append[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }
  def addBegin(x: String, xs: List[String]): List[String] =
    if (x eq null) throw new NullPointerException("give'me a real value")
    else if (xs eq null) x :: List()
    else x :: xs

}