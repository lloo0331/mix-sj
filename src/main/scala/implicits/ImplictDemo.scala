package implicits

/**
  * 隐式转换
  */
object ImplictDemo{

  object Context{
    implicit val ccc:String = "implicit"
  }

  object Param{
    def print(content:String)(implicit prefix:String): Unit ={
      println(prefix+":"+content)
    }
  }

  def main(args:Array[String]): Unit ={
    Param.print("jack")("hello")

    import Context._
    Param.print("jack")

  }


}
