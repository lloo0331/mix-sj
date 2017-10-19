package anno

import utils.PlUtils

import scala.beans.{BeanProperty, BooleanBeanProperty}

/**
  * Created by li on 2017/10/15.
  */
class Person(val pid:Long, val pName:String) extends Serializable{

  @BeanProperty
  var id : Long = 0

  @BeanProperty
  var name : String = ""

  @BooleanBeanProperty
  var vip : Boolean = false

  def this(p:String) = this(1,p)

  def this() = this(1,"")


}


object Person{

  def main(args: Array[String]): Unit = {

    val p = new Person(1,"lst")

    PlUtils.pri(p.isVip)


    PlUtils.pri(p.id)

  }


}