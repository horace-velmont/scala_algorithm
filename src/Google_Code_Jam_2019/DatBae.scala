package Google_Code_Jam_2019


import scala.io.StdIn

object DatBae extends App {

  val cases = StdIn.readLine().toInt
  (1 to cases) foreach { i => {
    println(solve(i))
    StdIn.readLine()
  }
  }


  def answer(qna: Seq[(String, String)], i: Int, n: Int, acc: Vector[Int]): String = {
    if (i == n) {
      acc.mkString(" ")
    } else {
      val answerIdx = i - acc.size
      val isValid = qna.forall { case (q, a) => answerIdx < a.length && q(i) == a(answerIdx) }
      if (isValid) {
        answer(qna, i + 1, n, acc)
      } else {
        answer(qna, i + 1, n, acc :+ i)
      }
    }
  }

  def solve(i: Int): String = {
    val Array(n, _, f) = StdIn.readLine().split(" ").map(_.toInt)
    val qna = for (j <- 0 until f) yield {
      val ask = question(n, j)
      println(ask)
      val res = StdIn.readLine()
      (ask, res)
    }
    answer(qna, 0, n, Vector())
  }

  def question(n: Int, i: Int): String = {
    val seqNum = Math.pow(2, i).toInt
    (0 until n).map(j => j / seqNum % 2).mkString
  }
}
