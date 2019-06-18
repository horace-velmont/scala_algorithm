package easy_scala_play

object Ex_7_1 {
  def main(args: Array[String]): Unit = {
    val arrayA = Array(1, 2, 3, 4, 5)
    for (x <- arrayA)
      println(x)
    val arrayB = Array("a", "b", "c", "d")
    for (x <- arrayB)
      println(x)
  }
}

object Ex_7_4 {
  def main(args: Array[String]): Unit = {
    val list1 = "a" :: "b" :: "c" :: Nil
    val list2 = "d" :: "e" :: Nil
    val list0 = list1 ::: list2
    for (x <- list0.indices)
      println(list0(x))
  }
}

object Ex_7_8 {
  def main(args: Array[String]): Unit = {
    var basket: Set[String] = Set()
    basket += "딸기"
    basket += "포도"
    println(basket)
  }
}

object Ex_7_10 {
  def main(args: Array[String]): Unit = {
    val list = List("a", "b", "c")
    val i = list.iterator
    while (i.hasNext)
      println(i.next)
  }
}