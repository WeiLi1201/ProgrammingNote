/**
 * Created by Variant on 16/3/22.
 */
object List_HighOrder_Function_Ops {
  def main(args: Array[String]) {
    println(List(1,2,3,4,5,6) map (_ + 1))
    //这两个是相等的
    println(List(1,2,3,4,5,6) map (item => item + 1))

    val data = List("Scala","Hadoop","Spark")
    println(data map (_.length))
    println(data map (_.toList.reverse.mkString))

    println(data.map(_.toList))
    //先map再合并
    println(data.flatMap(_.toList))
    println(List.range(1, 10) flatMap (i => List.range(1, i) map (j => (i, j))))
    //range是前闭后开
    println(List.range(1, 10) flatMap (i => List.range(1, i) map ((i, _))))

    var sum = 0
    List(1,2,3,4,5) foreach  (sum += _)
    println("sum: " + sum)

    println(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) filter (_ % 2 == 0))
    println(data filter (_.length == 5))



    println(List(1, 2, 3, 4, 5, 6).partition(_ % 2 == 0))
    println(List(1, 2, 3, 45, 6, 7) find (_ % 2 == 0))
    println(List(1, 2, 3, 4, 5, 7, 8) find (_ <= 0))
    println(List(1, 5, 6, 7, 2, 8, 9) takeWhile (_ < 4))
    println(List(2, 3, 5, 6, 8, 9, 21) dropWhile (_ < 5))
    println(List(1, 3, 5, 7, 9, 12, 35) span (_ < 4))

    def hasTotallyZeroRow(m :List[List[Int]]) = m exists(row => row forall(_ == 0))

    val m =List(List(1,0,0),List(0,1,0),List(0,0,1))

    println(hasTotallyZeroRow(m))
  }
}
