package collection

import utils.PlUtils

/**
  * Created by li on 2017/10/11.
  * 并行
  */
object ParallelInScala extends App{

  val coll = List(1,2,3,4,5)

  PlUtils.pri(coll.par.sum)

  PlUtils.pri(coll.par.count(_ % 2==0))


  for(i<- (0 until 100).par) println(i + " ")

  val a = for(i<- (0 until 100).par) yield i + " " //如果使用了yield,并行是无效的

  PlUtils.pri(a)
}
