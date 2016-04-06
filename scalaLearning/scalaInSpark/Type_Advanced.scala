/**
  * Created by Variant on 16/4/7.
  */
import scala.reflect.runtime.universe._

class Spark;
trait Hadoop;
object Flink;
class Java{
  class Scala
}
object Type_Advanced {
  def main(args: Array[String]) {
    println(typeOf[Spark])  //包名+类名
    println(classOf[Spark]) //class 包名+类名

    //类的实例没有typeOf
    val spark =new Spark
    println(spark.getClass)
    println(classOf[Spark] == spark.getClass)

    println(classOf[Hadoop])
    println(typeOf[Hadoop])
    //println(typeOf[Hadoop] == typeOf[Spark])

    println(Flink.getClass)
    //object也没有Flink
    //println(typeOf[Flink])

    val java1 = new Java
    val java2 = new Java
    val scala1 = new java1.Scala
    val scala2 = new java1.Scala
    println(scala1.getClass)
    println(scala2.getClass)

    println(typeOf[java1.Scala] == typeOf[java2.Scala])
    println(typeOf[java1.Scala])
    println(typeOf[java2.Scala])

    println(classOf[List[Int]] == classOf[List[String]])
    println(typeOf[List[Int]] == typeOf[List[String]])

  }
}
