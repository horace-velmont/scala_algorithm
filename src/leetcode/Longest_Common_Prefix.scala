object Longest_Common_Prefix {
  def main(args: Array[String]): Unit = {
    println(longestCommonPrefix(Array("flower", "flow", "flight")))
  }

  def longestCommonPrefix(strs: Array[String]): String = {
    strs.foldLeft(if (strs.length == 0) "" else strs(0))((m: String, n: String)
    => m.toCharArray.zipWithIndex.takeWhile(tup => n.length > tup._2 && tup._1 == n.charAt(tup._2)).foldLeft(new String) { (s, tup) =>
        s + m.charAt(tup._2)
      })
  }

  def longestCommonPrefix2(strs: Array[String]): String = {
    if (strs.isEmpty) ""
    else
      (strs.min, strs.max).zipped.takeWhile(v => v._1 == v._2).unzip._1.mkString
  }
}
