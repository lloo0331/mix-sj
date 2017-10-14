package extractor

abstract class ListScala
  case object Nil extends ListScala
  case class ::(head: Any,tail :ListScala) extends ListScala


