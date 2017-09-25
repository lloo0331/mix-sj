package quickscala.chapter2

import utils.PlUtils

object Example4 {

  def main(args: Array[String]): Unit = {

//    PlUtils.pri(10 to 0)
//
//    PlUtils.pri(10 until 0)
//
//    for(i<-(0 to 10).reverse){
//      println(i)
//    }

    countdown(10)

  }

  def countdown(n:Int): Unit ={

    for(i<-(0 to n).reverse){
      println(i)
    }

  }

}
