package func

import utils.PlUtils

/**
  * Created by li on 2017/10/22.
  * 函数字面量（function literal），
  * 也称值函数（function values），指的是函数可以赋值给变量。
  */
object FuncValues extends App{

  val increase=(x:Int)=>x+1

  PlUtils.pri(increase)

  PlUtils.pri(increase(10))



}
