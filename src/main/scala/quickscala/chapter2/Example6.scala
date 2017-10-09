package quickscala.chapter2

import utils.PlUtils

object Example6 {

  def main(args: Array[String]): Unit = {

//    PlUtils.pri(10 to 0)
//
//    PlUtils.pri(10 until 0)
//
//    for(i<-(0 to 10).reverse){
//      println(i)
//    }

    PlUtils.pri(countPrint("Hello5"))


  }

  //输出字母ascii的乘积
  def countPrint(n:String): BigInt ={

    require(n!=null)

    var result = 1

    var flag = false

    for(i<-n.toCharArray if i >=97 && i<= 122 || i>=65 && i<=90){

      result *= i
      flag = true

    }

    if(flag){
      result
    }else{
      0
    }

  }

}
