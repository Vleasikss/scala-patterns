package org.example

/**
 * Example of Partial function execution
 */
object Main {

  case class Event(source: String)

  type EventHandler = PartialFunction[Event, Unit]

  val events: List[Event] = List(
    Event("keyboard"), Event("mouse"), Event("dadsa"))

  val keyboardHandler: EventHandler = {
    case Event("keyboard") => println("Do keyboard")
  }
  val mouseHandler: EventHandler = {
    case Event("mouse") => println("Do mouse")
  }
  val defaultHandler: EventHandler = {
    case _ => println("Default handler")
  }

  def main(args: Array[String]): Unit = {

    //tries to call main keyboard handler, if event is not about its, go next ...
    //if event wasn't found (in our case, event is not 'mouse' and not 'keyboard'), go to default handler
    events.foreach(event => keyboardHandler
      .orElse(mouseHandler)
      .orElse(defaultHandler)
      .apply(event))

  }
}
