package utils

object RunThread {

//  def runInThread(block: ()=>Unit): Unit ={
//    new Thread{
//      override def run(): Unit = {block()}
//    }.start()
//  }

  def run(block1: =>Unit){
    new Thread{
      override def run(){block1}
    }.start()
  }

  def until(condition: =>Boolean)(block: =>Unit){
    if(!condition){
      block
      until(condition)(block)
    }
  }

  def indexOf(str:String,ch:Char):Int={
    var i = 0
    until(i == str.length){
      if(str(i) == ch) return i
      i+=1
    }
    return -1
  }

}
