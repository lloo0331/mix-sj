package anno

import utils.PlUtils

import scala.annotation.switch

/**
  * Created by li on 2017/10/15.
  */
class Switchs {

}

object Switchs{

  def trans(n:Int):String ={
    (n: @switch) match {
      case 0 => "Zero"
      case 1 => "One"
      case _ => "?"
    }

  }

  def main(args: Array[String]): Unit = {

    PlUtils.pri(trans(3))

  }

}
