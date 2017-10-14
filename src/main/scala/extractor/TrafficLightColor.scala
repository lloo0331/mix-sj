package extractor

import utils.PlUtils

sealed abstract class TrafficLightColor

  case object Red extends TrafficLightColor
  case object Yellow extends TrafficLightColor
  case object Green extends TrafficLightColor



object TrafficLightColor{

  def main(args: Array[String]): Unit = {

    def op(color:TrafficLightColor) : String = color match {
      case Red => "stop"
      case Yellow => "hurry up"
      case Green => "go"
    }

    val c = Red

    val ops = op(c)

    PlUtils.pri(ops)




  }


}
