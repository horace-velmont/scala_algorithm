package leetcode

import scala.collection.mutable

object TwoSum {
  def main(args: Array[String]): Unit = {
    twoSum(Array(2, 7, 11, 15), 9).foreach(x => println(x))
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for (i <- nums.indices)
      for (j <- nums.indices)
        if (i != j && nums(i) + nums(j) == target)
          return Array(i, j)

    Array()
  }

  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    val indicesByValue = mutable.Map[Int, Int]()
    for (assoc@(x, i) <- nums.zipWithIndex) {
      indicesByValue get (target - x) match {
        case Some(j) => return Array(j, i)
        case None => indicesByValue += assoc
      }
    }
    throw new NoSuchElementException
  }
}
