package utils

//打印辅助类
object PlUtils {

  var print = true;

  def pri(field:String,any:Any): Unit ={
    println(field+"   ====>   "+any)
  }

  def pri(any:Any,field:String): Unit ={
    println(field+"   ====>   "+any)
  }

  def pri(field:String): Unit ={
    println(field)
  }

  def pri(any:Any): Unit ={
    println(any)
  }


}
