package sum

import utils.PlUtils

import scala.collection.mutable

//统计字符串里的字符出现次数
object SumMapInScala extends App{

  val freq = mutable.Map.empty[Char,Int]
  for(c <- "Mississippi") freq(c) = freq.getOrElse(c,0)+1
  PlUtils.pri(freq)

  val aa = (Map[Char,Int]() /:"Mississippi" ){
    (m,c) =>
      PlUtils.pri(m+";"+c)
      m + (c->(m.getOrElse(c,0)+1))//第一次是empty Map +("M"->1)
  }

  PlUtils.pri(aa)

}
