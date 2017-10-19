package implicits

import java.io.File

import scala.io.Source

/**
  * 隐式转化类
  * @param file
  */
class RichFile1(val file:File){

  def read = Source.fromFile(file.getPath).mkString

}

object Context{

  implicit def file2RichFile(f:File) = new RichFile1(f)

}

object ImplictDemo1{

  def main(args: Array[String]): Unit = {
    import Context.file2RichFile

    println(new File("D:\\aa.txt").read)


  }

}
