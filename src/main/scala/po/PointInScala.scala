package po

//Point实体类,自己写get,set方法.
class PointInScala(xc:Int, xy:Int) {

  private var mx = xc

  private var my = xy

  def move(movex:Int,movey:Int): Unit ={
    this.mx+=movex
    this.my+=movey
    println("x的坐标点:"+mx)
    println("y的坐标点:"+my)
  }

  def x = mx //getX()
  def y = my //getY()

  def x_=(cx:Int){//scala的约定,调用point.x就是调用x_方法,x_方法相当于java里的setX(int cx)
    this.mx = cx
    println("执行point.x调用了该方法")
  }

  def y_=(cy:Int){//scala的约定,调用point.y就是调用y_方法,y_方法相当于java里的setY(int cy)
    this.my = cy
    println("执行point.y调用了该方法")
  }

  override def toString: String = "x:"+x+";y:"+y

}

object PointInScala{

  def main(args: Array[String]): Unit = {

    val point = new PointInScala(1,2)

    println(point)

    point.move(2,2)

    println(point)

    point.x = 20
    point.y = 20

    println(point.x)

    println(point)

  }
}