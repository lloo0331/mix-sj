package utils.collections

import utils.PlUtils

import scala.collection.mutable

/**
  * Created by li on 2017/10/22.
  */
class RichList2[Int](list:List[Int]){

  def listToMap[String](f: Int => String):mutable.HashMap[String,Int] ={

    var map = new mutable.HashMap[String,Int]

    for(elem<-this.list){
      val key = f(elem)
      val value = elem
      map += key->value
    }

    map

  }

}

object RichList2{
  implicit def listToMap[String](list:List[Int]) = new RichList2(list)
}


object TestRichList2 extends App{


  import utils.collections.RichList2._

  val aa = List(1,2,3,4)

//  def convertIntToString(f:Int =>String)=f(4)
//
//  convertIntToString(_+"22")

  val map = aa.listToMap(_.toString+"222")

  aa.groupBy(_.toString)

  PlUtils.pri(map)





}