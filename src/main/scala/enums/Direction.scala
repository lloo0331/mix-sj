package enums

import utils.PlUtils

/**
  * Created by li on 2017/9/24.
  */
object Direction extends Enumeration{
  val North = Value("North")
  val Esat = Value("East")
  val South = Value("South")
  val West = Value("West")
}

object TestDirection{
  def main(args: Array[String]): Unit = {
    //for(d <- Direction) print(d+" ")

    PlUtils.pri(Direction(1))
    PlUtils.pri(Direction.North)

  }
}
