package org.example


trait Animal {
  def doSound():String
}

private class Dog extends Animal {
  override def doSound(): String = "BARK"
}

private class Cat extends Animal {
  override def doSound(): String = "MEOW"
}

object Animal {
  val DOG = "dog"
  val CAT = "cat"

  /* Allows to get current realization of Animal using constants */
  def apply(kind: String): Animal = kind match {
    case DOG => new Dog
    case CAT => new Cat
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val cat: Animal = Animal(Animal.CAT)
    val dog: Animal = Animal(Animal.DOG)

    println(cat.doSound())
    println(dog.doSound())

  }
}
