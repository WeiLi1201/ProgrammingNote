/**
 * Created by Variant on 16/3/27.
 */
object Implicit_Conversions_With_Parameter {
  def main(args: Array[String]) {
    //泛型方法
    def bigger[T](a : T,b:T)(implicit ordered: T => Ordered[T]): T ={
      if(ordered(a) > b) a else b
    }
    println(bigger(3,4))
    println(bigger("Hadoop","Spark"))
  }
}
