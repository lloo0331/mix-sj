package extractor

import utils.PlUtils

import scala.collection.JavaConversions.propertiesAsScalaMap

/**
  * Created by li on 2017/10/12.
  */
object ExtractorInScala extends App{

  val pattern = "([0-9]+) ([a-z]+)".r

//  "99 bottles" match {
//    case pattern(num,item) => (num,item)
//  }

  val a = pattern.unapplySeq("\"99 bottles\"")

  PlUtils.pri(a)

  val (x,y) = (1,2)

  val (q,r) = BigInt(10) /% 3

  val arr = Array(1,2,5,6,7,8)

  val Array(first,second,_*) = arr

  PlUtils.pri(first)

  PlUtils.pri(second)

  for((k,v)<-System.getProperties)
    println(k+"->"+v)

  for((k,"")<- System.getProperties)
    println(k)

  for((k,v)<-System.getProperties() if v == "")
    println(k)

}
