package org.example

object Main {
  type Strategy = (Int, Int) => Int

  class Context(computer: Strategy) {
    def use(a: Int, b: Int): Unit = {
      computer(a, b)
    }
  }

  def main(args: Array[String]): Unit = {
    // (val1, val2) => val1 + val2
    val add: Strategy = _ + _
    val multiply: Strategy = _ * _

    new Context(multiply).use(2, 3)
  }
}
