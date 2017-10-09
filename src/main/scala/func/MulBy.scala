package func

import utils.PlUtils

//闭包
object MulBy {

  //先接收一个数值,然后接收一个参数,返回他们的乘积
  def mulBy(factor:Double) = (x:Double) => factor * x

  def main(args: Array[String]): Unit = {

    val quintuple = mulBy(5)

    val triple = mulBy(3)

    val half = mulBy(0.5)

    PlUtils.pri(quintuple)

    PlUtils.pri(quintuple(20))

    PlUtils.pri("triple",triple(14))//闭包,triple函数保存了自己的私有变量3,java8之前的函数只有局部变量,没有私有变量

    PlUtils.pri("half",half(14))//闭包,half函数保存了自己的私有变量0.5,java8之前的函数只有局部变量,没有私有变量

  }


}
