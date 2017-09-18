package hello

/**
  * Created by li on 2017/9/18.
  */
object BootstrapScala{
  def main(args: Array[String]): Unit = {
    val greetingInJava = new GreetingInJava
    greetingInJava.greet()
  }
}
