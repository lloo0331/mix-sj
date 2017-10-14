package collection

import utils.PlUtils

import scala.math._
import scala.collection.JavaConversions._

/**
  * Created by li on 2017/10/11. 懒加载,不缓存
  */
object ViewInScla extends App{

  val powers = (0 until 1000).view.map(pow(10,_))//pow,计算10的X次方

  PlUtils.pri(powers)

  PlUtils.pri(powers(3))

  PlUtils.pri(powers)

  val powers1 = (0 until 1000).map(pow(10,_)).map(1 / _)

  val powers2 = (0 until 1000).view.map(pow(10, _)).map(1 / _).force

  PlUtils.pri(powers1)

  PlUtils.pri(powers2(1))

  val powers3 = (0 to 1000).map(x => pow(10,-x))

  PlUtils.pri(powers3)








}
