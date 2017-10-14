package gennerics

/** 类型变量界定 >:
  * Created by li on 2017/10/16.
  * 给泛型指定下界 类似于 T extends X
  */
class Pair1[T](val first:T, val second:T) {

  def replaceFirst[R >: T](newFirst:R) = new Pair1[R](newFirst,second)

  def replaceFirst1[R](newFirst:R) = new Pair1(newFirst,second)

}


object Pair1{

  def main(args: Array[String]): Unit = {

    val p = new Pair1("Fred","Brooks")

    //println(p.smaller)

    //val s = new Pair(4,2)

    //println(s.smaller)

    val p1 = new Pair1("Fred","Brooks")

    println(p.replaceFirst(p1))

    println(p1.replaceFirst(p))

    println(11)

    //println(p1.replaceFirst1(p))

  }


}

