package quickscala.chapter3

import utils.PlUtils

object Example4 {


  def main(args: Array[String]): Unit = {

    val arr = Array(1,2,1,-1,0,-1,3)

    val arr2 = sortArray(arr)

    PlUtils.pri(arr2.mkString("[",",","]"))

  }

  /*
   * 3.4
   * 给定一个整数数组，产出一个新的数组，包含元数组中的所有正值，
   * 以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。
   */
  def sortArray(array: Array[Int]): Array[Int] ={
    (array filter {_>0}) ++ (array filter {_<=0})
  }

}
