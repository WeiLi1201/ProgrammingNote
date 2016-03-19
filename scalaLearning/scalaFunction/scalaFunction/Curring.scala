/**
 * Created by Variant on 16/3/18.
 */
object Curring {
  def main(args: Array[String]) {
    def multiple(x : Int,y : Int) = x * y
    def multipleOne(x : Int) = (y : Int) => x * y
    println(multipleOne(6)(7))

    def curring(x : Int)(y :Int) = x * y

    println(curring(10)(10))

    val a = Array("Hello","Spark")
    val b = Array("Hello","spark")

    //函数Curring 的目的是让接收多个参数的函数变成只接收单一参数的函数
    //柯里化的作用 是方便 参数的推导
    println(a.corresponds(b)(_.equalsIgnoreCase(_)))
  }
}
