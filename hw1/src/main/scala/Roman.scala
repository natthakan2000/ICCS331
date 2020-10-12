object Roman extends App {
  def toRoman(n: Int): String = {
    val numeralsFor100s = List("C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    val numeralsFor10s = List("X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    val numeralsFor1s = List("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    "M" * (n / 1000) + {
      if (n % 1000 > 99) numeralsFor100s(n % 1000 / 100 - 1) else ""
    } + {
      if (n % 100 > 9) numeralsFor10s(n % 100 / 10 - 1) else ""
    } + {
      if (n % 10 > 0) numeralsFor1s(n % 10 - 1) else ""
    }
  }
}
