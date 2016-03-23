import scala.reflect.ClassTag

/**
 * Created by Variant on 16/3/23.
 */
class Triple[T : ClassTag,F:ClassTag,S : ClassTag](val first : T, val second : F, val third: S)


object Hello_Type_Parameterization {
  def main(args: Array[String]) {
    val triple =new Triple("Spark",3,3.1415)
    val bigData = new Triple[String, String, Char]("Spark", "Hadoop", 'R')

    def getData[T](list:List[T]) = list(list.length / 2)
    println(getData(List("Spark", "Hadoop", 'R')))
    val f = getData[Int] _
    println(f(List(1,2,3,4,56,73,32,23)))

    //类型推断,b此处只能为A类型
    def foo[A,B](f:A => List[A],b:A) = f(b)

    def buildArray[T : ClassTag](len : Int) = new Array[T](len)
    println(buildArray[Int](5).toList)

  }
}
