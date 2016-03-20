

/**
 * Created by Variant on 16/3/20.
 */
object ScalaList {




  def main(args: Array[String]) {
    val bigData= List("hadoop", "spark")
    val data = List(1,2,3,"dsada")
    println(data)

    val bigData_core = "Hadoop" :: ("Spark" :: Nil)
    val dataInt = 1 :: 2 :: 3 :: Nil

    println(data.isEmpty)
    println(data.head)
    println(data.tail.head)


    val List(a,b) = bigData
    println("a = " + a + "b = " + b )

    val x :: y ::rest = data
    println("x :" + x + "y: " + y +"==>" +rest)

    val shuffleData = List(6,3,5,6,4,8,9)
    println(sortList(shuffleData))

    def sortList(list : List[Int]): List[Int] = list match{
      case List() =>list
      case head :: tail => compute(head,sortList(tail))
    }

    def compute(data: Int, dataSet: List[Int]): List[Int] = dataSet match {
      case List()=> List(data)
      case head :: tail =>
        if(data <= head) data :: dataSet
        else head :: compute(data,tail)
    }


  }

}
