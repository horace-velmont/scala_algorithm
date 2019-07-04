package scala_problems_99

object P04 {
  def main(args: Array[String]): Unit = {
    println(length(List(1,1,2,3,5,8)))
  }

  def length(list: List[Int])=  list.length

  def length2[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + length2(tail)
  }
}
