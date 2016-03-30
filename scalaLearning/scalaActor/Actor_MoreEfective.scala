import java.net.{UnknownHostException, InetAddress}

import sun.nio.ch.Net

import scala.actors.Actor
import scala.actors.Actor._

/**
  * Created by Variant on 16/3/30.
  */
object NameResolver extends Actor{
  def act(){
    //recieve会占用一个线程

    //react没有返回,就不需要保留调用的堆栈
    //那么下一个actor就可以重用当前所在的线程
    //这样就达到了线程重用的目的
//    react{
//      case Net(name,actor) =>
//        sender ! getIP(name)
//        act
//      case "EXIT" => println("name resolver exiting")
//      case msg =>
//        println("unhandled message:" + msg)
//        act
//    }
    //
    loop{
      react{
        case Net(name,actor) =>
          actor ! getIP(name)
        case "EXIT" => println("name resolver exiting")
        case msg =>
          println("unhandled message:" + msg)
      }
    }
  }

  def getIP(name : String):Option[InetAddress] = {
    try{
      println(InetAddress.getByName(name))
      Some(InetAddress.getByName(name))
    }catch{
      case _ :UnknownHostException => None
    }
  }
}

case class Net(name : String,actor : Actor)

object Actor_MoreEfective {
  def main(args: Array[String]) {
    NameResolver.start
    NameResolver ! Net("www.baidu.com",self)

    println(self.receiveWithin(1000){case x => x+"Hello"})
  }
}
