package implicits

class Student(var name:String) {

  //将Student类的信息格式化打印
  def formatStudent(outputFormat:OutputFormat)={
    outputFormat.first+" "+this.name+" "+outputFormat.second
  }

  //隐式+柯里化
  def formatStudent1()(implicit outputFormat:OutputFormat)={
    outputFormat.first+" "+this.name+" "+outputFormat.second
  }

}


class OutputFormat(var first:String,val second:String)

object ImplicitParameter{

  def main(args: Array[String]): Unit = {
    val outputFormat = new OutputFormat("<<",">>")
    println(new Student("John").formatStudent(outputFormat))

    implicit val outputFormat1 = new OutputFormat("[[","]]")
    println(new Student("John").formatStudent1())
  }

}

