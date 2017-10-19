package po

import utils.PlUtils

/**
  * apply的demo
  */

//只有辅助构造函数的类
class PersonInScala2 {
  //类成员
  private var name:String=null
  private var age:Int=18
  private var sex:Int=0

  //辅助构造器
  def this(name:String){
    this()
    this.name=name
  }
  def this(name:String,age:Int){
    this(name)
    this.age=age
  }
  def this(name:String,age:Int,sex:Int){
    this(name,age)
    this.sex=sex
  }

  override def toString: String = this.name+":"+this.age+":"+this.sex

}

object PersonInScala2{

  def apply(name:String,age:Int) = new PersonInScala2(name,age)

  def apply(str:String) ={
    val arr = str.split("#")
    val name = arr(0)
    val age = arr(1).toInt
    val sex = arr(2).toInt
    new PersonInScala2(name,age,sex)
  }

  def unapply(arg: PersonInScala2)={
    Some((arg.name,arg.age,arg.sex))
  }

//  def unapply(arg: PersonInScala2)={
//    Some(arg.name+"#"+arg.age+"#"+arg.sex)
//  }

  def main(args: Array[String]): Unit = {

    val p1 = PersonInScala2("John#10#1")

    PlUtils.pri(p1)

    val p2 = new PersonInScala2("Tom",20)

    PlUtils.pri(p2)

    val a = unapply(p1).get

    PlUtils.pri(a _1)
    PlUtils.pri(a _2)
    PlUtils.pri(a _3)


  }


}

