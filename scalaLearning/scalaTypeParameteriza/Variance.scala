/**
 * Created by Variant on 16/3/26.
 */
class Person2
class Student2 extends Person2

class C[+T](val args : T)
class S[+T](arg : T) extends C[T](arg)

trait Friend1[T]{
  def makeFriend(somebody : T)
}

object Variance {
  def makeFriendsWithYou(s:Student2,f:Friend1[Student2]): Unit ={
    f.makeFriend(s)
  }

  def main(args: Array[String]) {
    val value : C[Person2] = new C[Student2](new Student2)

    val list : List[_ <: Any] = List[String]("Spark")
  }
}
