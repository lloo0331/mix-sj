package traits.queue

/**
  * Created by li on 2017/9/16.
  */
abstract class IntQueue {

  def get(): Int
  def put(x: Int)

}

trait Doubling extends IntQueue {

  abstract override def put(x: Int) { super.put(2 * x) }

}

trait NotSingleQueue extends IntQueue {

  abstract override def put(x: Int) {
    if (x % 2 == 0) super.put(x)
  }
}
