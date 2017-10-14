package gennerics

/**
  * Created by li on 2017/10/16.
  * 给泛型指定上界 类似于 T extends X
  */
class Pair[T <: Comparable[T] ](val first:T,val second:T) {

  def smaller = if(first.compareTo(second)<0) first else second

}


object Pair{

  def main(args: Array[String]): Unit = {

    val p = new Pair("Fred","Brooks")

    println(p.smaller)

  }


}
