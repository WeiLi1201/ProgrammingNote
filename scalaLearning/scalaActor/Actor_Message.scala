/**
 * Created by Variant on 16/3/30.
 */
import scala.actors.Actor._
import scala.actors.Actor

object Actor_Message extends Actor{
  def act(): Unit ={
    while(true){
      receive{
        case msg => println("Message content Actor from inbox:" + msg)
      }
    }
  }
}


object Actor_Messages {
  def main(args: Array[String]) {
    val actor_Message = actor{
      while (true){
        receive{
          case msg => println("Message content from inbox:" + msg)
        }
      }
    }

    val Double_Message = actor{
      while (true){
        //如果receive中没有case,Actor会忽略掉
        //传递消息的时候,Actor会调用isDefinedAt方法进行验证
        //isDefinedAt 会判断传递过来的消息是否被receive的case定义为要处理的消息了
        //如果返回true,说明Apply应用是安全的,就会去匹配case
        //如果返回false,Actor内部会进行一些透明处理,不会传递给Apply方法,而是忽略掉
        receive{ //Apply | isDefinedAt
          case msg : Double=> println("Double number from inbox:" + msg)
        }
      }
    }

    Actor_Message.start
    Actor_Message ! "Hadoop"
    actor_Message ! "Spark"
    Double_Message ! Math.PI
    Double_Message ! "Hadoop 2"



  }
}
