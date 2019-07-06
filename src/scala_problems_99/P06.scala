package scala_problems_99

object P06 {
  def main(args: Array[String]): Unit = {
    println(isPalindrome(List(1, 2, 3, 2, 1)))
  }

  def isPalindrome[A](list: List[A]) = list == list.reverse
}
