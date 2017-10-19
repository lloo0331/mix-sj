package collection

import utils.PlUtils

object Test1 extends App{

  val c = List.fill(3)("aa")

  PlUtils.pri(c)

  val a = List.fill(3,3)("aa")

  PlUtils.pri(a)

  val b = List.iterate(1,5)(_+1)

  PlUtils.pri(b)

}
