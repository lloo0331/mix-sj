package gennerics

/**
  * Created by li on 2017/10/16.
  * 给泛型指定上界 类似于 T extends X
  */
class Pair[T <: Comparable[T] ](val first:T,val second:T) {

  def smaller = if(first.compareTo(second)<0) first else second

  //def replaceFirst[R >: T](newFirst:R) = new Pair[R](newFirst,second)

  //def replaceFirst1[R](newFirst:R) = new Pair(newFirst,second)

}


object Pair{

  def main(args: Array[String]): Unit = {

    val p = new Pair("Fred","Brooks")

    println(p.smaller)

    //val s = new Pair(4,2)

    //println(s.smaller)

//    val p1 = new Pair("Fred","Brooks")
//
//    println(p1.replaceFirst(p))

    //println(p1.replaceFirst1(p))

  }


}
