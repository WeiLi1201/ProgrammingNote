/**
 * Created by Variant on 16/3/26.
 */

class P[+T](val first : T,val second :T){
  //def replceFirst(newfirst : T) = new P[T](newfirst,second)
  //逆变点
  def replceFirst[R >: T](newfirst : R) = new P[R](newfirst,second)
}

object Variant_Position {

}
