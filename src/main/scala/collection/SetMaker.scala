package collection

import scala.collection.mutable
import scala.collection.mutable.{HashSet, Set, SynchronizedSet}

object SetMaker {

  def makeSet:Set[String] ={

    new HashSet[String] with SynchronizedSet[String]
  }

}
