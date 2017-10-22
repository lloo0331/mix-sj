package func

import utils.PlUtils

/**
  * Created by li on 2017/10/22.
  */
object UseFunc extends App{

  def useFunc(f:Function1[Int,Int]): Int ={
    1
  }

  useFunc(_=>1+2)

  val list = List("1","2","3","4","3","4")

  PlUtils.pri(list.filter(_=="3"))

  list.foreach(_+"")


  val e = list.find(_=="3")

  PlUtils.pri(e.get)

  val map = Map[Int,String](1->"a",2->"b",3->"c",4->"d")

  val map2 = map.mapValues(_+"sssss")

  val set1 = map.keySet

  PlUtils.pri(map2)

  PlUtils.pri(set1)

  //val list1:List = map.values






}
