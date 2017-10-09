package quickscala.chapter2

import utils.PlUtils

/**
  * Created by li on 2017/9/24.
  */
object ChangeNum {

  def signNum(num:Int):Int={
    if(num>0)
      1
    else if(num<0)
      -1
    else
      0
  }


}


object TestChangeNum{

  def main(args: Array[String]): Unit = {
    PlUtils.pri(ChangeNum.signNum(5))
    PlUtils.pri(ChangeNum.signNum(0))
    PlUtils.pri(ChangeNum.signNum(-5))
  }
}