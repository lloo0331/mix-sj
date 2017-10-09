package func

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.JButton


//single abstract method 接口只有单个抽象方法
object SAM {

  def main(args: Array[String]): Unit = {

    var counter = 0

    val button = new JButton("Increment")
    button.addActionListener(new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit ={
        counter+=1
      }
    })

    //button.addActionListener((event:ActionEvent)=> counter+=1)

    button.addActionListener(makeAction(x=>counter+1))//不用写一大坨

  }

  //SAM转换
  implicit def makeAction(action:(ActionEvent)=>Unit)=
    new ActionListener {
      override def actionPerformed(event: ActionEvent): Unit = action(event)
    }

}
