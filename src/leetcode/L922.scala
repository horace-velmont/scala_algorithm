package leetcode

object L922 {
  def main(args: Array[String]): Unit = {
    sortArrayByParityII(Array(1, 2, 4, 3))

  }

  def sortArrayByParityII(A: Array[Int]): Array[Int] = {
    var oddIdx = 0
    var evenIdx = 0
    var eachLength = A.length / 2
    while (oddIdx < eachLength && evenIdx < eachLength) {
      while (oddIdx < eachLength && A(oddIdx * 2 + 1) % 2 == 1) {
        oddIdx += 1
      }
      while (evenIdx < eachLength && A(evenIdx * 2) % 2 == 0) {
        evenIdx += 1
      }
      if (oddIdx < eachLength && evenIdx < eachLength) {
        val tmp = A(evenIdx * 2)
        A(evenIdx * 2) = A(oddIdx * 2 + 1)
        A(oddIdx * 2 + 1) = tmp
        evenIdx += 1
        oddIdx += 1
      }
    }
    A
  }
}