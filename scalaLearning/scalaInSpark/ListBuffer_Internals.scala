/**
  * Created by Variant on 16/4/8.
  */
object ListBuffer_Internals {
  def main(args: Array[String]) {
    val list =List(1,2,3,4,5,6,7,8,9)
    increment(list,1)
    increment_MoreEffective(list,2)
    increment_MostEffective(list,3)
  }

  /**
    * 会创建很多新的List堆栈,百万数据分分钟撑爆
    *
    * @param list
    * @param i
    * @return
    */
  def increment(list: List[Int], i: Int): List[Int] = list match{
    case List() => List()
    case head :: tail =>head +i :: increment(tail,i)
  }

  /**
    * 会产生很多中间结果,也是效率低下
    *
    * @param list
    * @param i
    * @return
    */
  def increment_MoreEffective(list: List[Int], i: Int): List[Int] ={
    var result = List[Int]()
    for(element <- list) result = result ::: List(element + i)
    result
  }

  def increment_MostEffective(list: List[Int], i: Int): List[Int] = {
    import scala.collection.mutable.ListBuffer
    var buffer = new ListBuffer[Int]
    for(element <- list){ buffer += element + 1}
    buffer.toList
  }



}
