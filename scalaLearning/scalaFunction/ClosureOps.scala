/**
 * Created by Variant on 16/3/17.
 */
object ClosureOps {
  def main(args: Array[String]) {
    //闭包即使变量超过作用域也可以被使用的
    //在高阶函数中被大量的使用
    val data = List(1,2,3,4,5,6)
    var sum = 0
    data.foreach(sum += _)

    def add(more : Int) = (x :Int) => x + more

    val a = add(1)
    val b = add(999)

    println(a(100))
    println(b(1000))
  }
}
