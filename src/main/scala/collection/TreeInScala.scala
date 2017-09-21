package collection

import utils.PlUtils

import scala.collection.immutable.TreeMap
import scala.collection.immutable.TreeSet

/**
  * 有序容器
  */
object TreeInScala {

  def main(args: Array[String]): Unit = {

    val ts = TreeSet(9,3,1,8,0,2,7,5,4,6,5);

    val cs = TreeSet('f','u','n')

    PlUtils.pri(ts)

    PlUtils.pri(cs)

    var tm = TreeMap(3->'x',1->'x',4->'x')

    PlUtils.pri(tm)

    tm += (2->'x')

    PlUtils.pri(tm,"tm += (2->'x')")

  }


}
