package collection

import utils.PlUtils

object TupleInScala {

  def main(args: Array[String]): Unit = {

    val longest = longestWord("The quick brown fox".split(" "))

    PlUtils.pri(longest)

    PlUtils.pri(longest._1,"元组的第一个元素")

    PlUtils.pri(longest._2,"元组的第二个元素")

    val (word,idx) = longest //给元组的每个属性添加名称

    PlUtils.pri(word)

    PlUtils.pri(idx)

    val word1,idx1 = longest //2个常量都是元组longest

    println(word1)

    println(idx1)



  }

  def longestWord(words:Array[String]) ={
    var word = words(0)
    var idx = 0
    for(i<- 1 until words.length)
      if(words(i).length>word.length){
        word = words(i)
        idx = i
      }
    (word,idx)
  }

}
