package quickscala.chapter3

import utils.PlUtils

import scala.util.Random

/*
 * 3.1
 * 编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。
 */
object Example1 {

  def main(args: Array[String]): Unit = {

    val arr = randomNum(5)

    PlUtils.pri(arr.mkString("[",",","]"))

  }


  def randomNum(n:Int): Array[Int] ={
    require(n>0)
    (for(i<- 0 to n)yield {Random.nextInt(n)}).toArray
  }

}
