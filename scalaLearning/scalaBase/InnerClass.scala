/**
 * Created by Variant on 16/3/15.
 */
object InnerClass {
  def main(args: Array[String]) {
    //java内部类从属于外部类,而scala得内部类从属于对象
    val outer1 = new Outer("spark")
    val outer2 = new Outer("hadoop")

    val inner1 = new outer1.Inner("scala")
    val inner2 = new outer2.Inner("hadoop")
    //java里面是 outer1.new Inner("scala")

    inner1.foo(inner1)
    inner2.foo(inner2)
  }
}

class Outer(val name:String){
  outer =>

  class Inner(val name : String){
    def foo(b : Inner) =println("Outer:" + outer.name +","+ "Inner :" + b.name)
  }
}
