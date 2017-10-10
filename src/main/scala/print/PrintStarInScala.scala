package print

import utils.PlUtils
;

class PrintStarInScala {


}

object PrintStarInScala{


  def main(args: Array[String]): Unit = {
    (1 to 9).map("*" * _).foreach(println)

    (1 to 9).filter(_ % 2==0)

    PlUtils.pri((1 to 9).reduceLeft(_ - _))

    PlUtils.pri((1 to 9).reduceRight(_ - _))

    PlUtils.pri((1 to 9).reduce(_ - _))

    val arr = "Mary has a little lamb".split(" ").sortWith(_.length>_.length)

    PlUtils.priArr(arr)

  }




}
