package po

import scala.annotation.meta._

/**
  * Created by li on 2017/10/14.
  */
class PointInScala1(xc:Int, xy:Int) extends Serializable{


  @beanGetter @getter @param @field
  private var mx = xc


  @getter
  private var my = xy




}


object PointInScala1{

  def main(args: Array[String]): Unit = {

    val po1 = new PointInScala1(1,2)



  }




}