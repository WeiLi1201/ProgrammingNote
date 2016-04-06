/**
  * Created by Variant on 16/4/6.
  */
object For_Advanced {
  def main(args: Array[String]) {

    //模式匹配下的for循环
    for (i <- List(1,2,3,4)){println(i)}

    for(index@"Flink" <- List("Hadoop","Spark","Flink")){
      println(index)
    }

    for((language,"Hadoop") <- Set("scala"->"Spark","java"->"Hadoop")){println(language)}

    for((k,v:Int) <- List(("spark" -> 5),("hadoop" -> "big data"))){println(k)}
  }
}
