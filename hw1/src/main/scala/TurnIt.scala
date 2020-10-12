object TurnIt extends App {
  def transpose(A: List[List[Int]]): List[List[Int]] = {
    if (A.head.isEmpty) Nil
    else A.map(_.head) :: transpose(A.map(_.tail))
  }
  println(transpose(List(List(1,2),List(3,4),List(5,6))))
}
