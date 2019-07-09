package leetcode

object Palindrone_Number {
  def main(args: Array[String]): Unit = {
    println(isPalindrome(10))
  }

  def isPalindrome(x: Int): Boolean = {
    val xList = x.toString.split("").toList
    xList == xList.reverse
  }
}
