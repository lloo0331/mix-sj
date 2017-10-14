package extractor

import utils.PlUtils

abstract class Item //物品
  case class Article(description: String,price:Double) extends Item //单件物品
  case class Bundle(description:String,discount:Double,items:Item*) extends Item //组合物品



object Item{



  def main(args: Array[String]): Unit = {

    val a = Bundle("Father's day special",20.0,
      Article("Scala for the Impatient",39.95),
        Bundle("Anchor Distillery Sampler",10.0,
          Article("Old Potrero Straight Rye Whisky",79.95),
          Article("Junipero Gin",32.95)
        )
    )

    PlUtils.pri(a)

    def price(it : Item): Double = it match {
      case Article(_,p) => p
      case Bundle(_,disc,its @ _*) => its.map(price _).sum - disc
    }

    PlUtils.pri(price(a))

  }


}

