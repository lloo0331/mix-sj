package matchs

import utils.PlUtils

object matchInScala extends App{

  val ch = '+'

  var sign = 0

  var digit = 0

  ch match {
    case '+' => sign = 1
    case '-' => sign = -1
    case _ if Character.isDigit(ch) => digit = Character.digit(ch,10)
    case _ => sign = 0
  }

  PlUtils.pri(sign)

  val str = "1231231"

  str(5) match {
    case '+' => sign = 1
    case '-' => sign = -1
    case ch => digit = Character.digit(ch,10)
  }

  str(5) match {
    case ch if Character.isDigit(ch) => digit = Character.digit(ch,10)
  }

//  obj match {
//    case x : Int => x
//    case s : String => Integer.parseInt(s)
//    case _ : BigInt => Int.MaxValue
//    case _ => 0
//  }

  val arr = new Array[Int](3)

  arr match {
    case Array(0) => "0"
    case Array(x,y) => x + " " + y
    case Array(0,_*) => "0 ..."
    case _ => "something else"
  }

  val pair = (1,"Fred")









}
