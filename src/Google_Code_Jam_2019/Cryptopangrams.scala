package Google_Code_Jam_2019

import scala.io.StdIn

object Cryptopangrams extends App {

  def unzip(initial: BigInt, pairs: List[BigInt]): List[BigInt] = pairs match {
    case Nil => Nil
    case x :: xs =>
      val next = x / initial
      next :: unzip(next, xs)
  }

  def solve(n: BigInt, cipherText: IndexedSeq[BigInt]): String = {

    (0 until cipherText.size - 1).find(i => cipherText(i) != cipherText(i + 1)) match {
      case Some(x) =>
        val gcd = cipherText(x) gcd cipherText(x + 1)
        val (front, back) = cipherText splitAt x + 1
        val primeSeq: List[BigInt] = unzip(gcd, front.toList.reverse).reverse ::: gcd :: unzip(gcd, back.toList)
        (primeSeq map (primeSeq.distinct.sorted zip ('A' to 'Z')).toMap).mkString
      case None => throw new RuntimeException("None")
    }
  }

  val cases = StdIn.readLine().toInt
  (1 to cases) foreach { i => {
    val Array(n, _) = StdIn.readLine().split(" ").map(BigInt.apply)
    val cypherText = StdIn.readLine().split(" ").map(BigInt.apply)
    val answer = solve(n, cypherText.toVector)
    println(s"Case #$i: $answer")
  }
  }
}
