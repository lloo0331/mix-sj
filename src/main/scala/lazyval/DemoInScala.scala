package lazyval

import utils.PlUtils

object DemoInScala{
  val x = {println("initializing x");"done"}
}

object LazyDemoInScala{
  lazy val x = {println("initialzing x");"done"}
}


object DemoTest{

  def main(args: Array[String]): Unit = {
//    Demo
//
//    PlUtils.pri(Demo.x)

    LazyDemoInScala

    PlUtils.pri(LazyDemoInScala.x)

    PlUtils.pri(LazyDemoInScala.x)

  }


}
