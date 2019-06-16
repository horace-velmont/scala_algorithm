package easy_scala_play

object Ex_6_1 {
  def main(args: Array[String]): Unit = {
    println(matchFunction(100))
    println(matchFunction("hundred"))
    println(matchFunction(1000))
    println(matchFunction(1000.5))
    println(matchFunction("thousand"))
  }

  def matchFunction(input: Any): Any = input match {
    case 100 => "hundred"
    case "hundred" => 100
    case etcNumber: Int => "입력값은 100이 아닌 Int형 정수입니다"
    case _ => "기타"
  }
}

object Ex_6_2 {

  case class Person(name: String, age: Int, rank: String)

  def main(args: Array[String]): Unit = {
    val person1 = Person("이멋남", 47, "부회장")
    val person2 = Person("김쾌남", 73, "회장")
    val person3 = Person("김솔로", 27, "사원")

    matchAndhi(person1)
    matchAndhi(person2)
    matchAndhi(person3)
  }

  def matchAndhi(person: Person): Unit = person match {
    case Person("이멋남", 47, "부회장") => println("부회장님 오심")
    case Person("김쾌남", 73, "회장") => println("회장님 오심")
    case Person("김솔로", _, _) => println("솔로님 오심")
    case _ => println("예외 케이스")
  }
}

object Ex_6_3 {
  def main(args: Array[String]): Unit = {
    val number1 = "010-222-2222"
    val number2 = "119"
    val number3 = "포도먹은 돼지"
    val number4 = "1119"
    val numberList = List(number1, number2, number3, number4)

    for (number <- numberList) {
      number match {
        case Emergency() => println("긴급전화입니다")
        case Normal(number) => println("일반전화입니다 - " + number)
        case _ => println("판단 불가입니다")
      }
    }
  }
}

object Emergency {
  def unapply(number: String): Boolean = {
    if (number.length == 3 && number.forall(_.isDigit)) true
    else false
  }
}

object Normal {
  def unapply(number: String): Option[Int] = {
    try {
      val o = number.replaceAll("-", "")
      Some(number.replaceAll("-", "").toInt)
    } catch {
      case _: Throwable => None
    }
  }
}