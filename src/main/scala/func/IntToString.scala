package func

import utils.PlUtils

/**
  * Created by li on 2017/10/22.
  */
object IntToString extends App{

  def convertIntToString(f:Int =>String)=f(4)



  convertIntToString( stringToInt)

  private def stringToInt = {
    (x: Int) => x + " s"
  }

  def addInt(value:Int)={
    value+1
  }



  def stringFromInt(func:Int):Unit ={
    var a = func + "HelloWorld"
  }


  val fun1 = 1+(_:Double)

  val fun2:(Double)=>Double = 1+_

  PlUtils.pri(fun1(5))

  PlUtils.pri(fun2(2))


}
