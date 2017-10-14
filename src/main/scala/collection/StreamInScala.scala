package collection

import utils.PlUtils

import scala.io.Source

/**
  * Created by li on 2017/10/11. Stream,流式,懒加载,缓存
  */
object StreamInScala extends App{

  def numsFrom(n:BigInt): Stream[BigInt] = n #:: numsFrom(n+1)

  val tenOrMore = numsFrom(10)

  val aa = tenOrMore.tail.tail.tail

  PlUtils.pri(aa)

  val squares = numsFrom(1).map(x => x * x)

  PlUtils.pri(squares)

  val v = squares.take(5).force

  PlUtils.pri(v)

  val words = Source.fromFile("E:\\bbb.txt","gb2312").getLines().toStream

  PlUtils.pri(words)//Stream(a, ?)

  PlUtils.pri(words(5))//dd 如果文本的行数不超过5,会报错

  PlUtils.pri(words)//Stream(a, al, alll, aaaaaa, aaaaaaa, dd, ?)




}
