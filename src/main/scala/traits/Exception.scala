package traits

/**
  * Created by li on 2017/10/20.
  */
//trait扩展类Exception
trait ExceptionLogger extends Exception with Logger{
  def log(msg:String):Unit={
    println(getMessage())
  }
}

//类UnprintedException扩展自ExceptionLogger
//注意用的是extends
//此时ExceptionLogger父类Exception自动成为
//UnprintedException的父类
class UnprintedException extends ExceptionLogger{
  override def log(msg:String):Unit={
    println("")
  }
}

object Test1 extends App{

  val s = new UnprintedException

  s.log("123213")

}