package po

import utils.PlUtils

import scala.beans.BeanProperty

class PersonInScala(cName:String,sName:String) {

  //名称
  @BeanProperty //加上这个注解就会自动给你加上get set方法
  var name:String = cName;

  //姓氏
  @BeanProperty
  var surname:String = sName;

  override def toString: String = "The totalName is"+this.cName+" "+this.sName

}

object TestPerson{

  def main(args: Array[String]): Unit = {

    val robert = new PersonInScala("Rebert","Jones")

    PlUtils.pri(robert);

    val sally = new PersonInScala("Sally","Smith")

    PlUtils.pri(sally);

  }

}


object PersonInScala{



}