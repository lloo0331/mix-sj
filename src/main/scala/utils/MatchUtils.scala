package utils

import scala.util.matching.Regex

/**
  * Created by li on 2017/10/20.
  */
object MatchUtils {

  /**
    * 匹配Email
    */
  def matchEmail(str:String):Array[String] ={
    val regex="^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$".r
    matchFunc(regex,str)
  }

  /**
    * 匹配网址
    */
  def matchUrl(str:String):Array[String]={
    val regex="^[a-zA-Z]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\s*)?$".r
    matchFunc(regex,str)
  }

  /**
    * 匹配手机号码
    */
  def matchNumerPhone(str:String):Array[String]={
    val regex="(86)*0*13\\d{9}".r
    matchFunc(regex,str)
  }

  /**
    * 匹配IP地址
    */
  def matchIp(str:String):Array[String]={
    val regex="(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)".r
    matchFunc(regex,str)
  }


  def matchFunc(regex:Regex,str:String): Array[String] ={
    (for(matchString <- regex.findAllIn(str)) yield matchString).toArray
  }

  def main(args: Array[String]): Unit = {

    val aa = matchEmail("zhouzhihubeyond@sina.com")

    PlUtils.priArr(aa)

    val bb = matchUrl("http://www.xuetuwuyou.com")

    PlUtils.priArr(bb)

    val cc = matchNumerPhone("13887888888")

    PlUtils.priArr(cc)

    val dd = matchIp("192.168.1.1")

    PlUtils.priArr(dd)

  }


}
