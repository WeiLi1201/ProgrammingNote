/**
 * Created by Variant on 16/3/27.
 */
class Outer1{
  private val x = 10
  class Inner{
    private val y =x + 10
  }
}


object Path_Dependence {
  def main(args: Array[String]) {
    val outer = new Outer1
    val inner = new outer.Inner
    //java 中是 new outer.new Inner
    //scala 中不同实例对象 内部类实例对象也是不同的
    val inner2 : outer.Inner= new outer.Inner

    val o1 = new Outer1
    val o2 = new Outer1
    //路径依赖
    //Outer#Inner是父类
    val i : Outer1#Inner = new o1.Inner


  }
}
