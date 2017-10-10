package quickscala.chapter3

import utils.PlUtils

object Example3 {

  def main(args: Array[String]): Unit = {

    val arr = Array(1,2,3,4,5)

    val arr1 = moveArrayByYield(arr)

    PlUtils.pri(arr1.mkString("(",",",")"))

    PlUtils.pri(arr.mkString("(",",",")"))//可以看到,数组没有发生变化
  }


  /* 3.3 重复前一个练习，不过这次生成一个新的值交换过的数组。用for/yield。*/
  def moveArrayByYield(arr: Array[Int]) = {
    for (i <- 0 until arr.length) yield {
      if (i % 2 == 0) {
        if (i + 1 < arr.length) arr(i + 1) else arr(i)
      }
      else {
        arr(i - 1)
      }
    }
  }

}
