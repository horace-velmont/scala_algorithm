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
    println(string+":"+thisYear)
  }
}