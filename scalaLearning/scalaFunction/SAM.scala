import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JButton, _}
/**
 * Created by Variant on 16/3/18.
 */
object SAM {
  def main(args: Array[String]) {
    var data = 0
    val jFrame = new JFrame("SAM Testing")
    val jButton = new JButton("counter")
    jButton.addActionListener(new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit ={
        data += 1
        println(data)
      }
    })

    implicit def convertedAction(action: (ActionEvent) => Unit) =
      new ActionListener {
        override def actionPerformed(e: ActionEvent){ action(e)}
      }

    //SAM simple abstract method转换,专注于业务逻辑处理,隐式转换实现要调用的接口方法
    jButton.addActionListener((event:ActionEvent) => {data += 1; println(data)})

    jFrame.setContentPane(jButton)
    jFrame.pack()
    jFrame.setVisible(true)

  }
}
