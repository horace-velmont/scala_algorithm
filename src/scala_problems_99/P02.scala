package scala_problems_99

object P02 {
  def main(args: Array[String]): Unit = {
    println(penultimate(List(1, 2, 3, 4, 5, 6)))
    println(lastRecursive(List(1, 2, 3, 4, 5, 6)))
  }

  def penultimate[A](list: List[A]) = list(list.length - 2)

  def lastRecursive[A](ls: List[A]): A = ls match {
    case a :: b :: Nil => a
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
