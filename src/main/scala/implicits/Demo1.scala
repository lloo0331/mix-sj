package implicits

/**
  * 隐式转换不能存在二义性
  */
object Demo1 extends App{

  def person(implicit name:String) = name

  implicit val p = "mobin"

  //implicit val p1 = "mobin1" //会报错,在没有提供隐式值的时候会默认搜索,但此处存在2个String
  //隐式转换必须满足无歧义规则，在声明隐式参数的类型是最好使用特别的或自定义的数据类型，
  // 不要使用Int,String这些常用类型，避免碰巧匹配

  println(person)




}
