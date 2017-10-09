package func

import utils.PlUtils

//柯里化
object Currying {

  def mul(x:Int,y:Int) = x*y

  def mulOneAtATime(x:Int) = (y:Int) => x*y

  def mulOneAtATime1(x:Int)(y:Int) = x*y

  def main(args: Array[String]): Unit = {

    PlUtils.pri(mulOneAtATime(6)(7))

    val a = Array("Hello","World")

    val b = Array("hello","world")

    PlUtils.pri(a.corresponds(b)(_.equalsIgnoreCase(_)))

  }


}
