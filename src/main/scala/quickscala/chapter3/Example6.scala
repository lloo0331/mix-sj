package quickscala.chapter3

import utils.PlUtils

import scala.collection.mutable.ArrayBuffer

//数组反转
object Example6 {

  def main(args: Array[String]): Unit = {

    val array = Array(1,2,0,-2,3,4,-3,7)

    val array1 = reserveArray(array)

    PlUtils.pri(array1.mkString("[",",","]"))

  }

  def reserveArray(array: Array[Int]): Array[Int]={
    array.reverse
  }

  def reserveArrayBuffer(arrayBuffer: ArrayBuffer[Int]): ArrayBuffer[Int]={
    arrayBuffer.reverse
  }

}
