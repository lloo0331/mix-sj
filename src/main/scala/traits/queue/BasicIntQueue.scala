package queue

import traits.queue.IntQueue

import scala.collection.mutable.ArrayBuffer

/**
  * Created by li on 2017/9/16.
  */
class BasicIntQueue extends IntQueue {

  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }

  override def toString: String = buf.toString()
}

object BasicIntQueue {

  def main(arr: Array[String]): Unit = {

    val queue = new BasicIntQueue

    queue.put(10)

    queue.put(20)

    queue.get()

    queue.get()

  }

}
