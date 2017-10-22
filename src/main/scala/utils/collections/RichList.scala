package utils.collections

import utils.PlUtils
import scala.collection.mutable

/**
  * Created by li on 2017/10/22.
  */
class RichList[V](list:List[V]) {

  def listToMap[K](f: V => K):mutable.HashMap[K,V] ={
    var map = new mutable.HashMap[K,V]()
    for(elem<-this.list){ map += f(elem)->elem }
    map
  }

}

object RichList{
  //List转Map
  implicit def listToMap[V](list:List[V]) = new RichList(list)

}

object TestRichList extends App{

  import utils.collections.RichList._

  val aa = List(1,2,3,4)

  val map = aa.listToMap(_.toString+"222")

  PlUtils.pri(map)

}