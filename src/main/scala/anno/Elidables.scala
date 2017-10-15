package anno

import scala.annotation.elidable

/**
  * Created by li on 2017/10/15.
  * 可以在生产代码中移除的方法
  */
object Elidables {

  @elidable(500) def dump(props: Map[String,String]): Unit ={



  }

  //如果用
  //scalac -Xelide-below 800 Elidables.scala ,则代码不会生成
  //scalac -Xelide-below INFO Elidables.scala ,则代码不会生成
  // 命令编译


}
