package collection

import utils.PlUtils

import scala.collection.mutable.ArrayBuffer

//Array和java的数组是一致的,而ArrayBuffer类似于StringBuffer,为Array提供可变长度
class ArrayInScala {

  def removeLast(array:ArrayBuffer[Int]): Unit ={
    var first = true
    var n = array.length
    var i = 0
    while(i<n)
      if(array(i)>0) i+=1
      else{
        if(first){first = false;i+=1}
        else{array.remove(i);n-=1}
      }
  }

  def removeLast1(a:ArrayBuffer[Int]): Unit ={
    var first = true
    val indexes = for(i<- 0 until a.length if first || a(i)>=0)yield {
      if(a(i)<0)first = false;i
    }

    for(j<- 0 until indexes.length) a(j) = a(indexes(j))
    a.trimEnd(a.length - indexes.length)
  }

}

object ArrayInScala{

  def main(args: Array[String]): Unit = {

    val nums = new Array[Int](10)//Array是定长的

    val a = new Array[String](10)

    val s = Array("Hello","World")

    s(0) = "Goodbye"//使用()而不是[]访问元素

//    PlUtils.pri(s.to)

    val b = new ArrayBuffer[Int]()

    PlUtils.pri(b,"b")

    b+=1//增加元素

    PlUtils.pri(b,"b+=1")

    b+=(1,2,3,5)//增加元素

    PlUtils.pri(b,"b+=(1,2,3,5)")

    b++= Array(8,13,21)//增加元素

    PlUtils.pri(b,"b++= Array(8,13,21)")

    b.trimEnd(5)//移除最后5个元素

    PlUtils.pri(b,"b.trimEnd(5)")

    b.insert(2,6)//在索引为2的位置插入6,如果ArrayBuffer的长度小于2,报错

    PlUtils.pri(b,"b.insert(2,6)")

    b.insert(2,7,8,9)//在索引为2的位置开始,插入7,8,9,如果ArrayBuffer的长度小于2,报错

    PlUtils.pri(b,"b.insert(2,7,8,9)")

    b.remove(2)//移除索引为2的元素

    PlUtils.pri(b,"b.remove(2)")

    b.remove(2,3)//移除从索引2开始,连续的3个元素

    PlUtils.pri(b,"b.remove(2,3)")

    PlUtils.pri(b.toArray,"b.toArray")

//    val c = new ArrayBuffer[Int]()
//
//    c+=1
//
//    PlUtils.pri(c,"c")
//
//    c.trimEnd(5)//此处会报错,因为c只有一个元素
//
//    PlUtils.pri(c)


//    val d = new ArrayBuffer[Int]()
//
//    d+=1
//
//    //d+=2
//
//    d.insert(2,7)
//
//    PlUtils.pri(d)

    val e = Array(2,3,5,7,11)

    val result = for(elem<-e)yield 2 * elem

    PlUtils.pri(result,"yield e")//产生一个新的集合

    val result1 =  for(elem<-e if elem % 2 == 0)yield 2 * elem

    e.filter(_ % 2==0).map(2 * _)

    PlUtils.pri(Array(1,7,2,9).sum,"Array(1,7,2,9).sum")

    PlUtils.pri(ArrayBuffer("Mary","had","a","little","lamb").max,"ArrayBuffer(\"Mary\",\"had\",\"a\",\"little\",\"lamb\").max")

    val f = ArrayBuffer(1,7,2,9)

//    val fSorted = f.sorted(_<_)

//    val bDescending = f.sorted(_ > _)

    val g = Array(1,7,2,9)



  }





}