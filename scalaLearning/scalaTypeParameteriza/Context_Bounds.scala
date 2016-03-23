/**
 * Created by Variant on 16/3/23.
 */
//上下文界定,将泛型类型T,变成Ordering[T]类型
//方法中传入ordered 类型为Ordering[T]的参数,隐式的ordered肯定可以实现ordering[T]的compare方法
class Pair_Ordering[T : Ordering](val first : T,val second :T){
  def bigger(implicit ordered: Ordering[T]) = {
    if(ordered.compare(first,second) > 0) first else second
  }
}

object Context_Bounds {
  def main(args: Array[String]) {
    val pair = new Pair_Ordering("Spark", "Hadoop")
    println(pair.bigger)

    val pairInt = new Pair_Ordering(3,5)
    println(pairInt.bigger)
  }
}
