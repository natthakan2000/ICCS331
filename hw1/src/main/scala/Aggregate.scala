object Aggregate extends App {
  def myMin(p: Double, q:Double, r:Double): Double = {
    if (p <= q && p <= r) p
    else if (p <= r && p <= q) q
    else r
  }
  def myMean(p: Double, q:Double, r:Double): Double = {
    return (p+q+r)/3
  }
  def myMed(p: Double, q:Double, r:Double): Double = {
    val min = myMin(p,q,r)
    val max = -myMin(-p,-q,-r)
    if (p != min && p!= max) return p
    else if (q != min && q != max) return q
    else return r
  }
}
