package traits.queue

import queue.BasicIntQueue

/**
  * Created by li on 2017/9/16.
  */
object testNoSingle extends App {

  val que = new BasicIntQueue with Doubling with NotSingleQueue

  val que1 = new BasicIntQueue with NotSingleQueue with Doubling

  que.put(1)
  que.put(2)

  que1.put(1)
  que1.put(2)

  println(que)

  println(que1)

}
