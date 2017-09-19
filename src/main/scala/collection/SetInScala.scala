package collection

import utils.PlUtils

import scala.collection.mutable //mutable可变的

object SetInScala{
  def main(args: Array[String]): Unit = {


    val nums = Set(1, 2, 3); // 集合类如果没有显示指定,默认都是不可变类,该set引用自PreDef.下面针对nums的操作,返回的都是新的set,没有对nums做修改,没有带=号的操作都是返回新的集合

    PlUtils.pri("nums", nums)

    PlUtils.pri("nums-3", nums - 3)

    PlUtils.pri("nums+5", nums + 5)

    PlUtils.pri(nums ++ List(5, 6), "nums ++ List(5,6)") // 合并产生新的集合

    PlUtils.pri(nums -- List(1, 2), "nums -- List(1,2)") // 删除和集合2重叠的元素并返回新的集合

    //    PlUtils.pri(nums ** Set(1,3,5,7),"nums ** Set(1,3,5,7)")//返回(1,3)

    PlUtils.pri(nums.size, "nums.size") //  输出set的长度

    PlUtils.pri(nums.contains(3), "nums.contains(3)") //  set是否包含元素 3

    val words = mutable.Set.empty[String] //  创建一个可变的set words,下面的操作都是直接修改words这个set,这些操作也都有在最后加上=号

    words += "the"

    PlUtils.pri(words, "words += \"the\"")

    words -= "the"

    PlUtils.pri(words, "words -= \"the\"")

    words ++= List("do", "re", "mi")

    PlUtils.pri(words, "words ++= List(\"do\",\"re\",\"mi\")")

    words --= List("do", "re")

    PlUtils.pri(words, "words --= List(\"do\",\"re\")")

    words.clear()

    PlUtils.pri(words, "words.clear()")

  }

}


