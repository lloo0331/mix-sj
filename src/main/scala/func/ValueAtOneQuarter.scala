package func

import utils.PlUtils

import scala.math._

object ValueAtOneQuarter {

  //valueAtOneQuarter(f: (Double)=>Double) 表示valueAtOneQuarter接收一个返回值为Double的函数.=>指代函数
  //该方法为,函数f传入0.25,然后输出值.故ceil(0.25) = 1,sqrt(0.25) = 0.5
  def valueAtOneQuarter(f: (Double)=>Double) = f(0.25)

  def main(args: Array[String]): Unit = {

    PlUtils.pri(valueAtOneQuarter(ceil _))

    PlUtils.pri(valueAtOneQuarter(sqrt _))

    val q1 = valueAtOneQuarter1(1.5)

    PlUtils.pri(q1(ceil _))

    PlUtils.pri(q1(sqrt _))

    PlUtils.pri(ceil(1.5))

    PlUtils.pri(sqrt(0.25))

    PlUtils.pri(sqrt(4))

  }

  //对valueAtOneQuarter进行修改,可以自由传入数值,再传入函数,组装结果
  def valueAtOneQuarter1(factor:Double) = (x:(Double)=>Double) => x(factor)/2



}
