package implicits

import java.io.File

import scala.io.Source

/**
  * 隐式转换不会多次进行
  */
object ImplictDemo2 {

  implicit def double2Int(x:Double)= x.toInt

  implicit def file2RichFile(file:File) = new RichFile(file)

  implicit def richFile2RichFileAnother(file:RichFile) = new RichFileAnother(file)


  def main(args: Array[String]){

    var x:Int = 3.5

    //隐式转换不会多次进行，下面的语句会报错
    //不能期望会发生File到RichFile，然后RifchFile到
    //RichFileAnthoer的转换
    //    val f = new File("file.log").read2
    //    println(f)

  }

}

class RichFile(val file:File){
  def read=Source.fromFile(file).getLines().mkString
}

class RichFileAnother(file: RichFile){
  def read2 = file.read
}

