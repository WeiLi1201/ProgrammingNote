/**
 * Created by Variant on 16/3/25.
 */

class M_A[T]
class M_B[T]

object Multi_bound {
  def main(args: Array[String]) {
    /**
     * 多重界定
     * T >: A <: B
     * T的下界是A，上界是B,A写在B前面，A是B的子类型
     * T <% A <% B
     * T必须满足能隐式转换成A，并且能隐式转换成B
     * T <: A with B
     * T 是 A或者B的下界
     * T : A : B
     * 意思是T类型必须满足,存在A[T]和B[T]类型的隐式值
     */
    implicit val a = new M_A[Int]
    implicit  val b = new M_B[Int]

    //运行时会检查有没有隐式的转换
    def foo[T : M_A : M_B](i : T) = {
      println("OK")
      println(a.toString)
      println(b.toString)
    }
    foo(2);

  }
}
