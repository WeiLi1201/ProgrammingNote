/**
 * Created by Variant on 16/3/28.
 */


//隐式对象
abstract class Template[T]{
  def add(x:T,y:T) :T
}

abstract class SubTemplate[T] extends Template[T]{
  def unit :T
}

object Implicit_Object {
  def main(args: Array[String]) {
    implicit object StringAdd extends SubTemplate[String]{
      override def unit = " "
      override def add(x: String, y: String ) = x concat y
    }

    implicit object IntAdd extends SubTemplate[Int]{
      override def unit = 0
      override def add(x: Int, y: Int) = x + y
    }

    //implicit根据传入的List的类型推倒是SubTemplate[Int]还是SubTemplate[String]
    //作用域内检查是否有隐式传入的对象
    def sum[T](xs : List[T])(implicit m : SubTemplate[T]) : T ={
      if (xs isEmpty) m.unit
      else m.add(xs.head,sum(xs.tail))
    }

    println(sum(List(1,2,3,4,5)))
    println(sum(List("Hadoop","Spark","Kafka")))

  }
}
