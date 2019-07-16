object StringUtilV1 {
  def joiner(strings: String*): String = strings.mkString("-")

  def joiner(strings: List[String]) = joiner(strings: _*)
}

def makeList(strings: String*) = {
  if (strings.length == 0)
    List()
  else
    strings.toList
}

val list: List[String] = makeList()