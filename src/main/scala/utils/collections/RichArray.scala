package utils.collections

import utils.PlUtils

import scala.collection.mutable

/**
  * Created by li on 2017/10/22.
  */
class RichArray[V](array:Array[V]) {

  def arrayToMap[K](func:V => K):mutable.HashMap[K,V] ={
    var map = new mutable.HashMap[K,V]()

    for(elem<-this.array){
      map += func(elem)->elem
    }

    map
  }

}

object RichArray{

  implicit def arrayToMap[K,V](array:Array[V]) = new RichArray(array)

}

object TestRichArray extends App{

  import utils.collections.RichArray._

  val aa = Array(1,2,3,4)

  val map = aa.arrayToMap(_.toString+"11")

  PlUtils.pri(map)

}

