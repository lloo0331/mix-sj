package networks

/**
  * Created by li on 2017/10/20.
  */
import java.net.{URL, URLEncoder}
import scala.io.Source.fromURL

object NetworkIO {
  def main(args: Array[String]): Unit = {
    println(fromURL(new URL("http://www.baidu.com")).mkString)
  }
}