package implicits

object Demo2 extends App{

  def foo(msg:String) = println(msg)

  implicit def intToString(x:Int) = x.toString

  foo(10)

}
