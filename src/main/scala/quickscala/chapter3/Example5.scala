package quickscala.chapter3

import utils.PlUtils

//5 如何计算Array[Double]的平均值
object Example5 {

  def main(args: Array[String]): Unit = {

    val arr = Array(1.0d,2.0d,4.0d)

    PlUtils.pri(avgDouble(arr))

  }


  def avgDouble(array: Array[Double]):Double={
    array.sum/array.length
  }

}
