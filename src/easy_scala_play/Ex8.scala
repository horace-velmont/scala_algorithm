package easy_scala_play

object Ex_8_1 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    println(o)

    val n = o.map(i => i * 10)
    println(n)
  }
}

object Ex_8_2 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.filter(i => i >= 3).map(i => i * 2)
    println(n)
  }
}

object Ex_8_3 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.foldLeft(0)((i, j) => i + j);

    println(n)
  }
}

object Ex_8_4 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.partition(i => i < 3)
    println(n)
  }
}

object Ex_8_5 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val oo = List(5, 6, 7, 8, 9)

    val n = o zip oo
    val nn = o ::: oo

    println(n)
    println(nn)
  }
}

object Ex_8_6 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.find(i => i >= 2)
    val nn = o.find(i => i == 9)
    println(n)
    println(nn)
  }
}

object Ex_8_7 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4, 5, 6, 0)
    val n = o.drop(4)
    val nn = o.dropWhile(i => i < 3)

    println(n)
    println(nn)
  }
}

object Ex_8_8 {
  def main(args: Array[String]): Unit = {
    val o = List(List(1, 2, 3, 4), List(5, 6))
    val n = o.flatten
    println(n)
  }
}