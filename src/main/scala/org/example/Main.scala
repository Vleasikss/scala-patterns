package org.example

object Invoker {

  private var history: Seq[() => Unit] = Seq.empty

  def invoke(command: => Unit): Unit = {
    command
    history :+= command _

  }
}

object Main {

  def main(args: Array[String]): Unit = {
    Invoker.invoke(println("command1"))
    // block function
    Invoker.invoke {
      println("command2")
      println("command3")
    }
  }
}
