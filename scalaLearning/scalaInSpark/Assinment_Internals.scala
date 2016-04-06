/**
  * Created by Variant on 16/4/6.
  */
object Assinment_Internals {
  def main(args: Array[String]) {
    val a@b = 1000
    println("a = "+ a + "b =" + b)
    val (c,d) = (1000,"2000")
    println("c = "+ c +"d=" + d)

    //e,F   在进行模式匹配时,会将大写的F当成一个常量去匹配,但是F并没有定义
    //val F = _
    //val (e,F) = (1000,2000)
    val Array(g,h) = Array(1000,2000)
    //val Array(i,J) = Array(1000,2000)
    println(g + "  " + h)
    //编译通过,运行时错误,因为匹配错误 object是lazy的
    //object Test{ val 1 = 2}
    //Test

  }
}
