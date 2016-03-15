import scala.collection.mutable.ArrayBuffer

/**
 * Created by Variant on 16/3/15.
 */
object ArrayOps {
  def main(args: Array[String]) {
    val s = Array("hello","world")
    s(0) = "helloworld"


    val b = ArrayBuffer[Int]()
    b += 1
    b +=(2,3,4)
    b.insert(2,3,5,7)
    b.remove(2,3)

    //数组遍历处理返回值
    val c = Array(2,3,5,7,18)
    val result = for(elem <- c) yield elem * 2
    println(result)
    c.filter( _ % 2 == 0).map(2 * _)
    c.filter(elem => elem % 2 == 0).map(2 * _)

    Array(2,4,5,6).sum
    //长度
    ArrayBuffer("Mary","linda","jack","tim").max
    //升序排序
    Array(2,4,5,6).sorted

    val e = Array(2,5,4,6,78,6)
    scala.util.Sorting.quickSort(e)
    e

    //分隔符
    e.mkString("and")
    e.mkString("<","and",">")

    val matrix = Array.ofDim[Double](3,4)
    matrix

    val triangle = new Array[Array[Int]](10)

    for(i <- 0 until triangle.length) {
      triangle(i) = new Array[Int](i + 1)
    }
    triangle


  }
}
