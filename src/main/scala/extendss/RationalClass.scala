package extendss

import traits.RationalTrait
import utils.PlUtils

class RationalClass(n:Int,d:Int) extends {
  val numerArg = n
  val denomArg = d
}with RationalTrait{
  def + (that: RationalClass) = new RationalClass(
    numer * that.denom + that.numer * denom,denom * that.denom
  )
}


object RationalClass{

  def main(args: Array[String]): Unit = {

    val r1 = new RationalClass(1,2)

    val r2 = new RationalClass(2,3)

    val r3 = new RationalClass(1,2)

    PlUtils.pri(r1+r2)

    PlUtils.pri(r1+r3)

    Demo

    PlUtils.pri(Demo.x)

  }

}

object Demo{
  val x = {println("initializing x");"done"}
}