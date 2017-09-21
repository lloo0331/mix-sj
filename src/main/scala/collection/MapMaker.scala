package collection
import utils.PlUtils

import scala.collection.mutable
import scala.collection.mutable.{HashMap, Map, SynchronizedMap}
object MapMaker {

  //创建一个同步hashmap,并且在取不到数据的时候返回Why do you want to know?
  def makeMap:Map[String,String] ={

    new HashMap[String,String] with SynchronizedMap[String,String]{

      override def default(key:String) ={
        "Why do you want to know?"
      }
    }

  }

  def main(args: Array[String]): Unit = {

    val capital = MapMaker.makeMap

    capital ++= List("US"->"Washington","Paris"->"France","Japan"->"Tokyo")

    PlUtils.pri(capital)

    PlUtils.pri(capital("Japan"))

    PlUtils.pri(capital("New Zealand"))

    capital += ("New Zealand"->"Wellington")

    PlUtils.pri(capital("New Zealand"))


  }

}
