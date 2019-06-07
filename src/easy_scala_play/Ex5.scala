package easy_scala_play

object Ex_5_4 {
  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(n: Int) = {
    println("탑승 시작~")
    n
  }

  def dropship(n: => Int) = {
    println("드랍십 준비 : " + n)
    println(n + "명 탑승");
  }
}

object Ex_5_5 {
  def main(args: Array[String]): Unit = {
    val thisYear = 2016
    // _ 와일드카드를 이용해 어느 String 값이든 들어올 수 있다고 선언
    val fixedValueFunction = go(thisYear, _: String)

    // go() 가 아닌 fixedValueFunction 형태로 호출
    fixedValueFunction("test1")
    fixedValueFunction("test2")
    fixedValueFunction("test3")
  }

  def go(thisYear: Int, string: String) = {
    println(string + ":" + thisYear)
  }
}

object Ex_5_6 {
  def main(args: Array[String]): Unit = {
    val g = f _
    println(f(1))
    println(g(2))
  }

  def f(i: Int) = i
}

object Ex_5_7 {
  def main(args: Array[String]): Unit = {
    val result = calc(x => x * x, 2, 5)
    println(result)
  }

  def calc(f: Int => Int, start: Int, end: Int) = {
    def loop(index: Int, sum: Int): Int = {
      if (index > end) sum
      else loop(index + 1, f(index) + sum)
    }

    loop(start, 0)
  }
}

object Ex_5_8 {
  def main(args: Array[String]): Unit = {
    printlnStrings("string1", "string2", "string3")
  }

  def printlnStrings(args: String*) = {
    for (arg <- args) {
      println(arg)
    }
  }
}

object Ex_5_9 {
  def main(args: Array[String]): Unit = {
    println("기본값은 " + default())
  }

  def default(a: Int = 4, b: Int = 5): Int = a + b
}

object Ex_5_10 {

  class SomeClass {
    def apply(m: Int) = method(m)

    def method(i: Int) = i + i

    def method2(s: String) = s
  }

  def main(args: Array[String]): Unit = {
    val something = new SomeClass
    println(something(2))
  }
}