package func

object RunInThread {

  def runInThread(block: ()=>Unit): Unit ={
    new Thread{
      override def run(): Unit = {block()}
    }.start()
  }

  def runInThread1(block1: =>Unit){
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



  def main(args: Array[String]): Unit = {

    runInThread{()=>println("Hi");Thread.sleep(1000);println("Bye")}

    runInThread1{println("Hi");Thread.sleep(1000);println("Bye")}

    var x = 10

    until(x==0){
      x-=1
      println(x)
    }

  }

}
