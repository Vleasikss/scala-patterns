package org.example



object Main {
  type Strategy[T <: AnyVal] = (T, T) => T


  class Context[T <: AnyVal](implicit computer: Strategy[T]) {
    def use(a: T, b: T): Unit = {
      computer(a, b)
    }
  }

  def main(args: Array[String]): Unit = {
    // (val1, val2) => val1 + val2
//    val add: Strategy = _ + _
    implicit val add: Strategy[Int] = _ + _
    implicit val addStrings: Strategy[Float] = _ + _

    new Context[Int]().use(2, 3)

  }
}
