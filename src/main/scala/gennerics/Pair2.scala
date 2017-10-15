package gennerics

/**
  * Created by li on 2017/10/16.
  *
  * T <% Comparable[T]
  * T <% Ordered[T]
  * <% 关系意味着T可以被隐式转换成Comparable[T],
  * 如果是 <:T;那么Int是不支持的,RichInt可以支持,
  * 所以需要提供隐式转换支持,如果Pair中用的是 first < second 同样无法执行,
  * 因为 < 这个方法是RichString才支持的,而String是java.lang.String类.
  * 该类实现了Compareable接口,但是没有实现Ordered特质
  *
  */
class Pair2[T <% Ordered[T] ](val first:T, val second:T) {

  def smaller = if(first < second) first else second

  //def replaceFirst[R >: T](newFirst:R) = new Pair[R](newFirst,second)

  //def replaceFirst1[R](newFirst:R) = new Pair(newFirst,second)

}