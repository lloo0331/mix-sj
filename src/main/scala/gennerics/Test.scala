package gennerics

import utils.PlUtils

/**
  * Created by li on 2017/10/15.
  */
object Test extends App{

  def getMiddle[T](a: Array[T]) = a(a.length/2)

  val b = getMiddle(Array("Marry","had","a","little","lamb"))

  PlUtils.pri(b)

  val f = getMiddle[String] _






}
