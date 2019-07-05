package scala_problems_99

import scala.collection.immutable.{List, Nil}

object P05 {
  def main(args: Array[String]): Unit = {
    println(reverse1(List(1, 1, 2, 3, 5, 8)))
    println(reverse2(List(1, 1, 2, 3, 5, 8)))
    println(reverse3(List(1, 1, 2, 3, 5, 8)))
    println(reverse4(List(1, 1, 2, 3, 5, 8)))
    println(reverse5(List(1, 1, 2, 3, 5, 8)))
  }

  def reverse1[A](list: List[A]) = list.reverse

  def reverse2[A](list: List[A]) = {
    var copy = list
    var result: List[A] = Nil
    while (!copy.isEmpty) {
      result = copy.head :: result
      copy = copy.tail
    }
    result
  }

  def reverse3[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case h :: tail => reverse3(tail) ::: List(h)
  }

  def reverse4[A](list: List[A]): List[A] = {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil => result
      case h :: tail => reverseR(h :: result, tail)
    }

    reverseR(Nil, list)
  }

  def reverse5[A](list: List[A]): List[A] = {
    list.foldLeft(List[A]()) { (r, h) => h :: r }
  }
}
