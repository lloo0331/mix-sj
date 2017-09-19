package collection

import utils.PlUtils

import scala.collection.mutable

object MapInScala {

  def main(args: Array[String]): Unit = {

    val map = mutable.Map.empty[String,Int]

    map("Hello") = 1//相当于map.put("Hello",1)

    map("there") = 2

    PlUtils.pri(map("Hello"),"map(\"Hello\")")//相当于Map.get("Hello")

    PlUtils.pri(countWords("See Spot run! Run,Spot. Run!"),"countWords(\"See Spot run! Run,Spot. Run!\")")

    val nums = Map("i"->1,"ii"->2) // 集合类如果没有显示指定,默认都是不可变类,该map引用自PreDef.下面针对nums的操作,返回的都是新的set,没有对nums做修改

    PlUtils.pri(nums,"nums")

    PlUtils.pri(nums+("vi"->6),"nums+(\"vi\"->6)")//创建一个新的map,加入原map的元素和vi

    PlUtils.pri(nums,"执行nums+(\"vi\"->6),nums没有发生变化,因为产生了新的map,而不是在nums上增加")

    PlUtils.pri(nums-("ii"),"nums-(\"ii\")")//创建一个新的map,加入原map的元素并减掉ii

    PlUtils.pri(nums++List("iii"->3,"v"->5),"nums++List(\"iii\"->3,\"v\"->5)")

    PlUtils.pri(nums--List("i","ii"),"nums--List(\"i\",\"ii\")")

    PlUtils.pri(nums.size,"nums.size")

    PlUtils.pri(nums.contains("i"),"nums.contains(\"i\")")

    PlUtils.pri(nums("ii"),"nums(\"ii\")")

    PlUtils.pri(nums.keys,"nums.keys")

    PlUtils.pri(nums.values,"nums.values")

    PlUtils.pri(nums.isEmpty,"nums.isEmpty")

    val words = mutable.Map.empty[String,Int] //  创建一个可变的map words,下面的操作都是直接修改words这个map

    words += ("one"->1)

    PlUtils.pri(words,"words += (\"one\"->1)")

    words -= ("one")

    PlUtils.pri(words,"words -= (\"one\")")

    words ++= List("one"->1,"two"->2,"three"->3)

    PlUtils.pri(words,"words ++= List(\"one\"->1,\"two\"->2,\"three\"->3)")

    words --= List("one","two")

    PlUtils.pri(words,"words --= List(\"one\",\"two\")")

  }

  /**
    * 遍历字符串里单词出现的次数
    * @param text
    * @return
    */
  def countWords(text:String) = {
    val counts = mutable.Map.empty[String,Int]
    for(rawWord<-text.split("[,!.+]")){
      val word = rawWord.toLowerCase
      val oldCount =
        if(counts.contains(word))counts(word)
        else 0
      counts+=(word->(oldCount+1))
    }
    counts
  }

}
