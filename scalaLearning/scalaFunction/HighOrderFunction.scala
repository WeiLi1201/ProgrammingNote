/**
 * Created by Variant on 16/3/18.
 */

import scala.math.ceil

object HighOrderFunction {
  def main(args: Array[String]) {
    val fun1 =ceil _
    val number =3.14
    //函数是有值得,将fun1函数赋值给number,number调用了fun1函数
    fun1(number)

    Array(2.14, 3.23, 4.2,2.56).map(fun1)

    val tripple = (x: Double) => 3 * x
    Array(2.14, 3.23, 4.2,2.56).map((x : Double) => 3 * x)


    def high_order_function(f: (Double) => Double) =f(0.25)

    //传入的参数是一个输入参数double值返回参数也是double值的函数
    println(high_order_function(ceil _))
    println(high_order_function(scala.math.sqrt _))

    def mulBy(factor : Double) = (x : Double) =>  factor * x

    println(mulBy(5))

    val spark = mulBy(5)
    println(spark)
    println(spark(10))

    println(high_order_function((x : Double) => x * 3))
    println(high_order_function((x) => x * 3))
    println(high_order_function(3 * _))

    val fun2 = 3 * (_ :Double)
    val fun3 : (Double) =>Double = 3 * _






  }
}
