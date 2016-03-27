/**
 * Created by Variant on 16/3/27.
 */
class Pair_Implicits[T : Ordering](val first : T,val second : T){ //传入了隐式值Ordering[T]
  def bigger(implicit ordered : Ordering[T]) =
    if(ordered.compare(first,second) > 0) first else second
}

class Pair_Implicity[T : Ordering](val first : T,val second : T){
  def bigger = if(implicitly[Ordering[T]].compare(first,second) > 0 ) first else second
}

class Pair_Implicitly_Ordered[T : Ordering](val first : T,val second : T){
  def bigger = {
    import Ordered._
    if(first > second) first else second
  }
}
object Context_Bound_Internals {
  def main(args: Array[String]) {
    println(new Pair_Implicits(7,9).bigger)
    println(new Pair_Implicitly_Ordered(7,9).bigger)
    println(new Pair_Implicity(7,9).bigger)
  }
}
