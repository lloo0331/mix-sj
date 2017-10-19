package file

/**
  * Created by li on 2017/10/20.
  */
import scala.io._

object ScalaFileReader {
  def main(args: Array[String]): Unit = {
    //读取文件
    val file=Source.fromFile("D:\\scala\\doc\\api\\package.html")
    //返回Iterator[String]
    val lines=file.getLines()
    //打印内容
    for(i<- lines) println(i)
    //关闭文件
    file.close()
  }
}