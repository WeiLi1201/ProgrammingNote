import scala.io.Source

/**
 * Created by Variant on 16/3/15.
 */
object TupleOPs {
  def main (args: Array[String]) : Unit = {
    var tuple =(100,"scala","Spark")
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)


    val array = Array(2,5,7,9,4,4,4)
    for (i <- 0 until array.length){
      println(array(i))
    }
    for (elem <- array){
      println(elem)
    }

    val ages = Map("Rocky" -> 27, "Spark" -> 5)

    for ((k,v) <- ages)  println("key"+k+"value"+v)

    for((k,_) <- ages) println("key is" + k)

    //File Scala.io.Source
    //val file = Source.fromFile("E:\\abc.txt")
    val web = Source.fromURL("http://www.baidu.com")
    for(line <- web.getLines()){
      println(line)
    }
  }
}
