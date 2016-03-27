/**
 * Created by Variant on 16/3/27.
 */
class Self{
  //this的别名
  self =>
  val tmp ="Scala"
  def foo = self.tmp + this.tmp
}
trait S1
class S2{
  //实例化S2时,必须混入S1,类似于结构类型,鸭子类型
  this : S1 =>
}
class S3 extends S2 with S1

trait T { this:S1 =>}
object S4 extends T with S1

object Self_Type {
  def main(args: Array[String]) {
    class Outer2{ outer =>
      val v1 = "spark"
      class Inner{
        //outer.v1 == Outer2.this.v1
        println(Outer2.this.v1)
        println(outer.v1)
      }
    }
    val c = new S2 with S1
  }
}
