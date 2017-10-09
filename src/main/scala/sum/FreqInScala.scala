package sum

import utils.PlUtils

import scala.collection.mutable

//统计字符串里的字符出现次数
object FreqInScala extends App{

  val freq = mutable.Map.empty[Char,Int]
  for(c <- "Mississippi") freq(c) = freq.getOrElse(c,0)+1
  PlUtils.pri(freq)
}
