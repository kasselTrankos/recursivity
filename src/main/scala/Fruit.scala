class Fruit  {

  val list: List[String] = List()

  override def toString: String =
    s"The list is : ($list)"

  def cube(x: Int) = {
    x * x * x
  }

  def get(xs:Int) : String =
    if(list eq null) throw new NullPointerException("Can't be null the list")
    else if(list(xs) eq null) throw new NullPointerException("No element in this position")
    else list(xs)

  def append(xs:String) : List[String] =
    if(list eq null) throw new NullPointerException("Can't be null the list")
    else if (xs eq null) throw new NullPointerException("Can't have null string!")
    else xs :: list
}