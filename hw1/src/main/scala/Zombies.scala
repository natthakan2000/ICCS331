//collaborator: Parm
object Zombies extends App {
  def countBad(hs: List[Int]): Int = {
    @scala.annotation.tailrec
    def merge(left: (Int,List[Int]), right: (Int,List[Int]), ans :Int, merged: List[Int]): (Int,List[Int]) =
      (left._2, right._2) match {
        case (_, Nil) => (ans,merged:::left._2)
        case (Nil, _) => (ans,merged:::right._2)
        case (leftHead :: leftTail, rightHead :: rightTail) =>
          if (leftHead < rightHead) {
            val temp = left._1 + right._1 + left._2.length
            println (temp)
            merge((0, left._2), (0, rightTail), ans + temp, merged:::List(rightHead))
          }
          else {
            merge((left._1, leftTail), right, ans, merged:::List(leftHead))
          }
      }
    def mergeSort(hs: List[Int]): (Int,List[Int]) = {
      val n = hs.length / 2
      if (n == 0) (0, hs)
      else {
        val (left, right) = hs.splitAt(n)
        merge(mergeSort(left), mergeSort(right),0, List())
      }
    }
    val ans = mergeSort(hs)
    ans._1
  }
  println(countBad(List(3,1,4,2)))
}
