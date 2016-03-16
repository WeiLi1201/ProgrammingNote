/**
 * Created by Variant on 16/3/16.
 */
trait  Logger{
  //抽象
  def log(msg : String)
  //具体 ,混入接口时具体方法要写extends关键字
  //def log (msg :String)
}

class ConcreteLogger extends Logger with Cloneable{

  override def log(msg: String) = println("Log : " + msg)

  def concreteLog{
    log("It's me !!!")
  }
}

trait TraitLogger extends Logger{
  override  def log (msg :String){
    println("TraitLogger Log content is : " + msg)
  }
}

trait TraitLoggered {
  def loged (msg :String): Unit ={
    println("TraitLoggered Log content is : " + msg)
  }
}

trait ConsoleLogger extends TraitLogger {

}
object UseTrait {
  def main(args: Array[String]) {
    val log = new ConcreteLogger with TraitLogger
    log.log("life is good")
    log.concreteLog


    val log2 = new ConcreteLogger with TraitLoggered
    log2.loged("this is new log")
    log2.concreteLog
  }
}
