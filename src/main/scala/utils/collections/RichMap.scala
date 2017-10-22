package utils.collections

import utils.PlUtils
import scala.collection.mutable.ListBuffer

/**
  * Created by li on 2017/10/22.
  */
class RichMap[K,V](map:Map[K,V]) {

   def mapValuesToList(): List[V] ={
     var buffer = new ListBuffer[V]
     map.valuesIterator.foreach(buffer += _)
     buffer.toList
   }

}

object RichMap{
  //Map的Value转成List
  implicit def mapValuesToList[K,V](m:Map[K,V]) = new RichMap(m)
}

object UseCase{

  def main(args: Array[String]): Unit = {

    import utils.collections.RichMap._

    val map = Map[Int,String](1->"a",2->"b",3->"c",4->"d")

    val list = map.mapValuesToList()

    PlUtils.pri(list)

  }

}