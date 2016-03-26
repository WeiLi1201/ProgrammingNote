/**
 * Created by Variant on 16/3/27.
 */
class Animal {
  //链式调用,调用的方法需要返回this.type
  //返回的是单例对象
  def breathe : this.type = this
}
class Cat extends Animal{
  def eat :this.type  = this
}


object Singleton_Types {
  def main(args: Array[String]) {
    val cat = new Cat
    cat.breathe.eat
  }
}
