package quickscala.chapter3

import utils.PlUtils

object Example2 {

  def main(args: Array[String]): Unit = {

    val arr = Array(1,2,3,4,5)

    PlUtils.pri(arr.mkString("(",",",")"))

  }

  //3.2将整数数组中相邻的元素置换
  def moveArray(array:Array[Int]){

    require(array!=null)

    if(array.length>2){

      val length = if(array.length%2==0)array.length else array.length-1

      for(i<-0 until(length,1)){
        val temp = array(i)
        array(i) = array(i+1)
        array(i+1) = temp
      }

    }

  }

}
