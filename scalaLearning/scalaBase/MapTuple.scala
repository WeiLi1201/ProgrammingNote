import scala.collection.immutable.SortedMap

/**
 * Created by Variant on 16/3/15.
 */
object MapTuple {
  def main(args: Array[String]) {
    val map = Map("book" -> 10,"gun" -> 18,"ipad" -> 1000)
    for((k,v) <- map) yield (k,v*0.9)

    val scores = scala.collection.mutable.Map("scala" -> 7,"Hadoop" -> 8, "Spark" ->10 )
    val hadoopScore = scores.getOrElse("Hadoop",0)
    scores += ("R" -> 0)
    scores -= "Hadoop"

    val sortedScore = SortedMap("SCALA" -> 7, "Hadoop" -> 8, "spark" -> 10)


    val tuple = (1,2,3.14,"Rocky","Spark")
    val third = tuple._3
    //会将tuple中的值赋给first,second...
    val (first,second,thirda,fourth,fifth) = tuple
    //占位符
    val (f1,s1,_,_,_) = tuple

    //根据条件分成两个数组
    "Rocky Spark".partition(_.isUpper)

    val symbols = Array("[","-","]")
    val counts = Array(2,5,2)
    //拉链操作,得到一个键值对Array
    val pairs = symbols.zip(counts)
    //输出 [[-----]]
    for ((x,y) <- pairs) print(x*y)
  }
}
