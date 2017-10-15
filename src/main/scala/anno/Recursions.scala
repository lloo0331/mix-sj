package anno

import utils.PlUtils

import scala.util.control.TailCalls._

/**
  * Created by li on 2017/10/14.
  * 递归优化
  */


class Recursions {



}


object Recursions{

  //序列的长度是否为复数
  def evenLength(xs : Seq[Int]):TailRec[Boolean] =
    if(xs.isEmpty) done(true) else tailcall(oddLength(xs.tail))

  //序列的长度是否为单数
  def oddLength(xs : Seq[Int]): TailRec[Boolean] =
    if(xs.isEmpty) done(false) else tailcall(evenLength(xs.tail))

  def main(args: Array[String]): Unit = {

    val a = evenLength(List(1,2,3))

    val b = evenLength(Array(1,2))

    PlUtils.pri(a.result)

    PlUtils.pri(b.result)

  }

}

