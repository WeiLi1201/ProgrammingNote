/**
  * Created by Variant on 16/4/6.
  */
object :> {
  def unapply[A](list: List[A]) = {
    println("a")
    Some((list.init, list.last))
  }
}


object Extractor_Advanced {
  def main(args: Array[String]) {
    //List(1,2,..,9)去匹配 :>提取器调用unapply方法
    //unapply(numlist) 返回Some(List(1,2,3,..,8),9)
    //成功匹配 _ 9
    val numlist = (1 to 9).toList
    numlist match {
      case _ :> 9 => println("Hadoop")
        //从右往左匹配
      case x :> 8 :> 9 =>println("spark")
      case :>(:>(_,8),9) => println("Flink")
    }

  }

}
