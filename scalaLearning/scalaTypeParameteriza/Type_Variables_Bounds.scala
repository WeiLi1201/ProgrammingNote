/**
 * Created by Variant on 16/3/23.
 */


//T是Comparable的子类,Comparable是T的上界,T继承了Comparable的CompareTo方法
class Pair[T <: Comparable[T]](val first : T, val second : T){
  def bigger = if(first.compareTo(second) > 0) first else second
}


class Pair_Lower_Bound[T](val first : T,val second:T){
  //T是R的下界,R是T的上界,Bound是相对的
  //T是Student,R是Person,可以用一个Person代替Student
  def replaceFirst[R >: T](newFirst : R) = new Pair_Lower_Bound[R](newFirst,second)
}

object Type_Variables_Bounds {
  def main(args: Array[String]) {
    val pair = new Pair[String]("Spark","Hadoop")
    println(pair.bigger)


  }
}
