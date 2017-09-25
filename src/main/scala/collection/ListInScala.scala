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

    PlUtils.pri(fruit,"fruit")//输出列表

    PlUtils.pri(fruit.head,"fruit.head")//输出列表第一个元素

    PlUtils.pri(fruit.last,"fruit.last")//输出列表最后一个元素

    PlUtils.pri(fruit.tail.head,"fruit.tail.head")//输出列表第二个元素

    PlUtils.pri(fruit.tail,"fruit.tail")//输出列表第一个元素以外的元素

    PlUtils.pri(fruit.init,"fruit.init")//输出列表最后一个元素以外的元素

    PlUtils.pri(nums.reverse,"nums.reverse")//反转列表

    //List(1,2,3) ::: List(4)

    //1::2::Nil

    fruit :: "banana" :: Nil //列表追加元素,返回新的列表对象

    //fruit+="banana"

    PlUtils.pri(fruit.length)


    val abcde = List('a','b','c','d','e')

    PlUtils.pri(abcde take 2,"abcde take 2") //列表取前2个

    PlUtils.pri(abcde drop 2,"abcde drop 2") //列表筛掉前2个,取剩下的

    PlUtils.pri(abcde splitAt 2,"abcde splitAt 2") //列表从第二个进行分裂,分裂成2个列表

    PlUtils.pri(abcde apply 2,"abcde apply 2")//其实感觉可以简单理解为 abcde.get(2)

    PlUtils.pri(abcde(2),"abcde(2)")

    PlUtils.pri(abcde(2) == abcde.apply(2))

    //abcde.apply(2) 等价于 (abcde drop 2).head ,其实感觉可以简单理解为 abcde.get(2)

    PlUtils.pri(abcde.indices,"abcde indices 返回List的索引值列表")//返回List的索引值列表

    PlUtils.pri(abcde.indices zip abcde,"abcde.indices zip abcde")//这个蛮有用的,zip交叉组合列表,这个返回列表的元素以及其对应的索引值

    PlUtils.pri(abcde.zipWithIndex,"abcde.zipWithIndex")//同上

    val zipped = "abcde".toList zip List(1,2,3)

    PlUtils.pri(zipped.unzip,"\"abcde\".toList zip List(1,2,3)")//返回元组

    PlUtils.pri(abcde.toString())

    PlUtils.pri(abcde.mkString("[",",","]"))//拼接字符串

    val buf = new StringBuilder

    PlUtils.pri(abcde addString(buf,"(",";",")"),"abcde addString(buf,\"(\",\";\",\")\")")//拼接字符串

    val func1 = List.tabulate(6)(n => n*n)//tabulate 制表函数

    PlUtils.pri(func1,"List.tabulate(6)(n => n*n)")

    val mul = List.tabulate( 4,5 )( _ * _ ) //
    PlUtils.pri(mul,"List.tabulate( 4,5 )( _ * _ )")

    val xss = List(List('a','b'),List('c'),List('d','e'))

    //PlUtils.pri(List.flatten(xss));

    PlUtils.pri(xss.flatten,"List(List('a','b'),List('c'),List('d','e')).flatten")//将3个List合并成1个

    PlUtils.pri(List.concat(List('a','b'),List('c')),"List.concat(List('a','b',List('c')))")//将List进行连接

    //PlUtils.pri(nums.foreach(n=>println(n+"")),"nums.foreach(n=>println(n+\"\"))")//foreach迭代

    PlUtils.pri(xss.flatMap(x=>x.map(x=>x*2)),"xss.flatMap(x=>x.map(x=>x*2))")//值*2然后转换成单个List

    PlUtils.pri(nums.map(x=>x*2))

    //nums.find
    def isEven(i: Int): Boolean = i % 2 == 0

    PlUtils.pri(nums.filter(isEven _))

    PlUtils.pri(List((1,2),(1,3),(2,3),(3,3),(3,4)).groupBy(_._1),"List((1,2),(1,3),(2,3),(3,3),(3,4)).groupBy(_._1)");

  }

}
