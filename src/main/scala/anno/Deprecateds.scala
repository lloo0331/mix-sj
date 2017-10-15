package anno

import utils.PlUtils

/**
  * Created by li on 2017/10/15.
  * 过期注解
  */
object Deprecateds {

  @deprecated(message = "Use factorial(n: BigInt) instead")
  def factorial(n:Int):Int = {
    1
  }


  def draw(@deprecatedName('sz) size:Int,style:Int = 1) ={

  }


  def main(args: Array[String]): Unit = {

    PlUtils.pri(factorial(1))

    PlUtils.pri(draw(2))

  }



}
