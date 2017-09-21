package traits

import utils.PlUtils

//特质,类似于java的接口,该例子实现了分数运算
trait RationalTrait {
  //分子
  val numerArg:Int
  //分母
  val denomArg:Int

  require(denomArg!=0)
  private val g = gcd(numerArg,denomArg)
  val numer =numerArg/g
  val denom = denomArg/g

  private def gcd(a:Int,b:Int):Int = {
    if(b==0) a else gcd(b,a%b)
  }

  override def toString = numer+"/"+denom

}

object RationalTraitTest {

  def main(args: Array[String]): Unit = {

    PlUtils.pri(
      new {
        val numerArg = 1
        val denomArg = 2
      }with RationalTrait
    )
  }

}