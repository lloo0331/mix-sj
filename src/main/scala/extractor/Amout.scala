package extractor


import utils.PlUtils

/**
  * Created by li on 2017/10/12.
  */
abstract class Amout

  case class Dollar(value: Double) extends Amout

  case class Currency(value: Double, unit: String) extends Amout

  case object Nothing extends Amout



object Amout{

  def main(args: Array[String]): Unit = {


    val amt = new Amout {}

    val c = amt match{
      case Dollar(v) => "$" +v
      case Currency(_,u) => "Oh noes,I got "+u
      case Nothing => ""
      case _ => "123"
    }

    PlUtils.pri(c)

    val amt1 = Currency(29.95,"Eur")

    val price = amt1.copy()

    PlUtils.pri(amt1)

    PlUtils.pri(price)

    PlUtils.pri(amt1==price)

    val price1 = amt1.copy(value= 19.95)

    val price2 = amt1.copy(unit = "CHF")

    PlUtils.pri(price1)

    PlUtils.pri(price2)

    PlUtils.pri(amt1==price1)

  }

}