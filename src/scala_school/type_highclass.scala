package scala_school

object type_highclass {
  implicit def strToInt(x: String) = x.toInt

  def main(args: Array[String]): Unit = {
    println((new Container2(123)).addIt)
    println((new Container3("123")).addIt)

    val container4 = new Container4[List] {
      def put[A](x: A) = List(x);

      def get[A](m: List[A]) = m.head
    }

    container4.put("hey")
    container4.put(123)
  }
}

class Container[A <% Int] {
  def addIt(x: A) = 123 + x
}

class Container2[A](value: A) {
  def addIt(implicit evidence: A =:= Int) = 123 + value
}

class Container3[A](value: A) {
  def addIt(implicit evidence: A => Int) = 123 + value

  def foo(x: {def get : Int}) = 123 + x.get
}

trait Container4[M[_]] {
  def put[A](x: A): M[A]

  def get[A](m: M[A]): A
}



