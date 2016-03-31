import scala.actors.Actor
import scala.actors.Actor._

/**
 * Created by Variant on 16/3/30.
 */
case class Person3(name: String, ge: Int)

class HelloActor extends Actor{
  def act(): Unit ={
    while (true){
      receive{
        //case匹配时可以传入发送消息的Actor(self)
        case Person3(name,age) => {
          //进行处理后,处理结果不要赋给全局变量,因为Actor设计的初衷就是避免共享资源
          println("name :" + name +"age:"+age)
          //返回消息给发送消息的Actor,也可以指定具体返回的Actor
          sender ! "Echo!!!"
        }
      }
    }
  }
}

object Actor_CaseClass {
  def main(args: Array[String]) {
    val hiactor = new HelloActor
    hiactor.start
    hiactor ! Person3("variant",15)

    //self是个方法,Actor类下,表示线程自身
    self.receive{case msg => println(msg)}
  }
}
