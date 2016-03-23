/**
 * Created by Variant on 16/3/23.
 */

//class Pair_NotPerfect[T <: Comparable[T]](val first:T,val second : T){
//  def bigger = if(first.compareTo(second) > 0) first else  second
//}

//"<%" 视图界定
//当传入的T类型的实例转换成 Comparable[T],如果Comparable不是T类型的父类
//int隐式的转换成Comparable[T]类型  Int -> RichInt
class Pair_NotPerfect[T <% Comparable[T]](val first:T,val second : T){
  def bigger = if(first.compareTo(second) > 0) first else  second
}

class Pair_Better[T <% Ordered[T]](val first :T,val second : T){
  def bigger = if(first > second) first else second
}


object ViewBound {
  def main(args: Array[String]) {
    val pair = new Pair_NotPerfect("Spark", "Hadoop")
    println(pair.bigger)

    val pairInt = new Pair_NotPerfect(3, 5)
    println(pairInt.bigger)

    val pair_Better_String = new Pair_Better("java","scala")  //String ->RichString
    println(pair_Better_String.bigger)

    val pair_Better_Int = new Pair_Better(20, 12)
    println(pair_Better_Int.bigger)
  }
}
