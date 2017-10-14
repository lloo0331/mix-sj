package lazyval

import utils.PlUtils

/**
  * Created by li on 2017/9/24.
  */
trait LazyRationalTrait {

  val numerArg:Int
  val denomArg:Int
  lazy val numer = numerArg/g
  lazy val denom = denomArg/g
  override def toString = numer + "/" + denom
  private lazy val g = {
    require(denomArg!=0)
    gcd(numerArg,denomArg)
  }

  private def gcd(a:Int,b:Int):Int ={
    if(b==0) a else gcd(b,a % b)
  }

}


object TestLazyRationTrait{

  def main(args: Array[String]): Unit = {

    val a = new LazyRationalTrait {
      override val numerArg: Int = 1
      override val denomArg: Int = 2
    }

    PlUtils.pri(a)

  }

}
