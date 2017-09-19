package collection

import utils.PlUtils

object ListInScala {

  def main(args: Array[String]): Unit = {

    val fruit = List("apples","oranges","pears")

    val nums = List(1,2,3,4)

    val diag3 = List(List(1,0,0),List(0,1,0),List(0,0,1))

    val empty = List()

    empty.isEmpty

    fruit.isEmpty

    PlUtils.pri(fruit,"fruit")

    PlUtils.pri(fruit.head,"fruit.head")

    PlUtils.pri(fruit.last,"fruit.last")

    PlUtils.pri(fruit.tail.head,"fruit.tail.head")

    PlUtils.pri(fruit.tail,"fruit.tail")

    PlUtils.pri(fruit.init,"fruit.init")

    PlUtils.pri(nums.reverse,"nums.reverse")

    //List(1,2,3) ::: List(4)

    //1::2::Nil

    fruit :: "banana" :: Nil

    //fruit+="banana"

    PlUtils.pri(fruit.length)


    val abcde = List('a','b','c','d','e')

    PlUtils.pri(abcde take 2,"abcde take 2")

    PlUtils.pri(abcde drop 2,"abcde drop 2")

    PlUtils.pri(abcde splitAt 2,"abcde splitAt 2")

    PlUtils.pri(abcde apply 2,"abcde apply 2")

    PlUtils.pri(abcde(2),"abcde(2)")

    PlUtils.pri(abcde(2) == abcde.apply(2))

    //abcde.apply(2) 等价于 (abcde drop 2).head ,其实感觉可以简单理解为 abcde.get(2)

    PlUtils.pri(abcde.indices,"abcde indices 返回List的索引值列表")

    PlUtils.pri(abcde.indices zip abcde,"abcde.indices zip abcde")

    PlUtils.pri(abcde.zipWithIndex,"abcde.zipWithIndex")

    PlUtils.pri(abcde.toString())

    PlUtils.pri(abcde.mkString("[",",","]"))

    val buf = new StringBuilder

    abcde addString(buf,"(",";",")");




  }

}
