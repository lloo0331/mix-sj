package func

import utils.PlUtils

object MulBy {

  //先接收一个数值,然后接收一个参数,返回他们的乘积
  def mulBy(factor:Double) = (x:Double) => factor * x

  def main(args: Array[String]): Unit = {

    val quintuple = mulBy(5)

    PlUtils.pri(quintuple)

    PlUtils.pri(quintuple(20))

    PlUtils.pri(quintuple(20))//注意了,没有变化,不是闭包
  }


}
