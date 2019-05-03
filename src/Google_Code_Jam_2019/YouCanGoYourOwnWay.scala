package Google_Code_Jam_2019

import java.io.FileInputStream

import scala.io.StdIn

object YouCanGoYourOwnWay extends App {
  Console.setIn(new FileInputStream("example.in"))

  def solve(tcNumber: BigInt, path: String): String = {
    path.map {
      case 'E' => 'S'
      case _ => 'E'
    }
  }

  val cases = StdIn.readLine().toInt
  (1 to cases) foreach { i => {
    val mazeSize = StdIn.readLine().toInt
    val preventedPath = StdIn.readLine()
    val answer = solve(mazeSize, preventedPath)
    println(s"Case #$i: $answer")
  }
  }
}
