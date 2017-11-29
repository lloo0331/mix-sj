package quickscala.chapter4

import utils.PlUtils

import scala.collection.mutable

object LearnScala4 {

  def main(args: Array[String]): Unit = {

    learn7


  }

  private def learn1 = {
    //1.设计1个映射，其中包含你需要的一些装备，以及他们的价格
    //然后构建另一组映射，采用同样的键，但在价格上打九折
    val items = Map[String, Double]("回复药"->2.0,"短剑"->100.0,"草鞋"->50.0)

    val items2 = items.map((x) => (x._1, x._2 * 0.9))

    PlUtils.pri(items)
    PlUtils.pri(items2)
  }

  private def learn2 = {

    //2.编写一段程序，从文件中读取单词；用一个可变的映射清点单词出现的频率


  }


  //7.打印java系统属性表格
  def learn7():Unit = {
//    val props = System.getProperties()
//
//    val keys = props.keySet()
//
//    for(key <- keys) {
//      print(key)
//      print(" | ")
//      println(props.getProperty(key))
//    }
  }

  //返回最小最大值
  def minmax(values:Array[Int]) ={
    (values.min,values.max)
  }


}
