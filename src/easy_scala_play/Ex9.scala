package easy_scala_play

object Ex_9_1 {
  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 40, 55)

    def foreach(list: List[Int]) = {
      def add(list: List[Int], total: Int): Int = {
        list match {
          case List() => total
          case List(item) => total + item
          case head :: tail => add(tail, total + head)
        }
      }

      add(list, 0)
    }

    println(foreach(list))
  }
}

object Ex_9_2 {
  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 40, 55)
    val result = list.foldLeft(0)((total, item) => total + item)
    println(result)
  }
}

object Ex_9_4 {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("값을 입력하세요 : ")
    val result: Either[String, Int] = try {
      Right(input.toInt)
    } catch {
      case e: Exception => Left(input)
    }
    println(result.getClass)
  }
}

import java.io.{File, PrintWriter}

import scala.io.StdIn.readLine

object Ex_9_5 {
  def main(args: Array[String]): Unit = {
    val fileName = "Ex_9_4_result.txt"
    var input = readLine("파일 내용 입력  : ")

    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close()

    println("입력하신 " + input + " 텍스트를 " + fileName + "에 저장했습니다.")
  }
}

object Ex_9_6 {

  object Object1 {
    private def ma = {}

    def mb = {}
  }

  object Object2 {
    //val a = Object.ma // 컴파일 에러
    val b = Object1.mb // 정상
  }

  def main(args: Array[String]): Unit = {
    println(Object1.mb)
    println(Object2.b)
  }
}