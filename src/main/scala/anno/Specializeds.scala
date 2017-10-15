package anno

import utils.PlUtils

/**
  * Created by li on 2017/10/15.
  */
object Specializeds {

  def allDifferent[T](x:T,y:T,z:T) ={
    x!=y && x!=z && y!=z
  }


  def allDifferent1[@specialized T](x:T,y:T,z:T) ={
    x!=y && x!=z && y!=z
  }

  def main(args: Array[String]): Unit = {

    PlUtils.pri(allDifferent(1,2,3))

    PlUtils.pri(allDifferent1(1,2,3))

  }


}
