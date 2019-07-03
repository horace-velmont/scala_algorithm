package scala_problems_99

object P03 {
  def main(args: Array[String]): Unit = {
    println(nth(2, List(1, 1, 2, 3, 5, 8)))
  }

  def nth[A](n: Int, list: List[A]) = list(n)

  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}
