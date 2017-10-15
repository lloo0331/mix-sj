package anno

import utils.RunThread

/**
  * Created by li on 2017/10/14.
  */
class Volatitlesss {




}


object Volatitlesss{

  @volatile var value = 0

  @transient var key = 1

  def main(args: Array[String]): Unit = {


    for(i <- (1 to 10)) RunThread.run(for(j<-(1 to 1000))value+=1)


    Thread.sleep(1000)

    println(value)



  }
}