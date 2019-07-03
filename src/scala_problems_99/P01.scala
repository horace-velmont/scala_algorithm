package scala_problems_99

object P01 {
  def main(args: Array[String]): Unit = {
    println(lastRecursive(List(1, 1, 2, 3, 5, 8)))
  }

  def last(list: List[Int]): Int = list.last

  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
