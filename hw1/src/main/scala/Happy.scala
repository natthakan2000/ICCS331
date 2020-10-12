object Happy extends App {
  def sumOfDigitsSquared(n: Int):Int = {
    if (n == 0) 0
    else ((n%10)*(n%10)+sumOfDigitsSquared(n/10))
  }
  @scala.annotation.tailrec
  def isHappy(n: Int):Boolean = {
    if (n == 1) true
    else if (n == 4) false
    else isHappy(sumOfDigitsSquared(n))
  }
  def kThHappy(k: Int):Int = {
    @scala.annotation.tailrec
    def subFunc(k: Int, nHappy: Int, i: Int):Int = {
      if (k != nHappy){
        if (isHappy(i)){
          subFunc(k,nHappy+1,i+1)
        }else{
          subFunc(k,nHappy,i+1)
        }
      }else{
        i-1
      }
    }
    subFunc(k,0,1)
  }
}
