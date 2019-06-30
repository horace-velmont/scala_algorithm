package easy_scala_play

object Ex_10_1 {
  def convertInputs(input: String): Option[Seq[Int]] = {
    val REGEX = "([0-9])([0-9])([0-9])".r
    input match {
      case REGEX(n1, n2, n3) =>
        if (n1 != n2 && n2 != n3 && n1 != n3)
          Some(Seq(n1.toInt, n2.toInt, n3.toInt))
        else
          None
      case _ => None
    }
  }
}

object Ex_10_2 {
  def calcBallCount(ballList: Seq[Int], inputList: Seq[Int]): BallCount = {
    var strikes = 0;
    var balls = 0;
    var outs = 0;

    for {
      (ball, indexBall) <- ballList.zipWithIndex
      (input, indexInput) <- inputList.zipWithIndex
    } {
      if ((ball, indexBall) == (input, indexInput)) strikes = strikes + 1
      else if (ball == input) balls = balls + 1
    }
    BallCount(strikes, balls, outs)
  }

  case class BallCount(strikes: Int, balls: Int, outs: Int)

}

object Ex_10_3 {
  def calcBallCountSeq(ballList: Seq[Int], inputList: Seq[Int]): BallCount = {
    var strikes = 0;
    var balls = 0;
    var outs = 0;
    for (i <- 0 until ballList.length) {
      if (ballList(i) == inputList(i)) strikes = strikes + 1
      else if (inputList.contains(ballList(i))) balls = balls + 1
    }
    BallCount(strikes, balls, outs)
  }

  case class BallCount(strikes: Int, balls: Int, outs: Int)

}