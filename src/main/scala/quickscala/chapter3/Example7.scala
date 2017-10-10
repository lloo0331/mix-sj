package quickscala.chapter3

import utils.PlUtils

//数组去重
object Example7 {

  def main(args: Array[String]): Unit = {

    val arr = Array(1,1,1,3,4,5,6,2,1,2,3)

    PlUtils.priArr(distantArray(arr))

  }


  def distantArray[B](array: Array[B]):Array[B] ={
    array.distinct
  }

}
