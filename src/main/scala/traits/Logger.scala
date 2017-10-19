package traits

/**
  * Created by li on 2017/10/19.
  */
import java.io.PrintWriter

trait Logger{
  def log(msg:String):Unit
}

trait FileLogger extends Logger{

  val fileName:String
  val fileOutput=new PrintWriter(fileName:String)
  fileOutput.println("#")

  def log(msg:String):Unit={
    fileOutput.print(msg)
    fileOutput.flush()
  }
}

trait FileLogger1 extends Logger{

  val fileName:String
  lazy val fileOutput=new PrintWriter(fileName)
  //fileOutput.println("#")

  def log(msg:String):Unit={
    fileOutput.print(msg)
    fileOutput.flush()
  }
}

class Person
class Student extends Person with FileLogger{
  val fileName="file.log"
}

class Student1 extends Person with FileLogger1{
  val fileName="file.log"
}

object TraitDemo{
  def main(args: Array[String]): Unit = {
    val s=new {
      //提前定义
      override val fileName="file.log"
    } with Student
    s.log("predifined variable ")

    //-------------------------------------//

    val s1 = new Student1
    s1.log("hello world")

  }
}