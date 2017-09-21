package collection

import utils.PlUtils

import scala.collection.mutable.Queue

object QueueInScala {


  def main(args: Array[String]): Unit = {

    val q = Queue(1,2,3)

    PlUtils.pri(q)

    val q1 = q += 4

    PlUtils.pri(q1)

    PlUtils.pri(q)

    PlUtils.pri(q.head)

    PlUtils.pri(q.last)

    PlUtils.pri(q.tail)

    PlUtils.pri(q.init)

  }

}
