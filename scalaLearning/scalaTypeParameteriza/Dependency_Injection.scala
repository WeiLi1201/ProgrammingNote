/**
 * Created by Variant on 16/3/27.
 */

trait Logger1{
  def log(msg :String)
}
trait Auth{
  //此处还可以添加方法要求,鸭子类型
  auth : Logger1 =>
  def act(msg : String){
    log(msg)
  }
}

object DI extends Auth with Logger1{
  //这样通过类型的限定和方法传入的要求,比java来写依赖注入要方便许多
  //也是self_type应用的典范
  override def log(msg :String){
    println(msg)
  }
}

object Dependency_Injection {
  def main(args: Array[String]) {
    DI.act("I'm happy to get self_type skill,It's easy to Apply")
  }
}
