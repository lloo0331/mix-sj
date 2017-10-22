package collection

import scala.collection.JavaConversions.propertiesAsScalaMap
/**
  * Created by li on 2017/10/11.
  */
object JavaCollection extends App{


  val props: scala.collection.mutable.Map[String,String] = System.getProperties()

  props("com.horstmann.scala") = "impatient"


  val scores = new scala.collection.mutable.HashMap[String,Int] with scala.collection.mutable.SynchronizedMap[String,Int]




}
