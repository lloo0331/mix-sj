package hello

class GreetingInScala {
  def greet: Unit = {
    val delegate: GreetingInJava = new GreetingInJava
    delegate.greet
  }
}