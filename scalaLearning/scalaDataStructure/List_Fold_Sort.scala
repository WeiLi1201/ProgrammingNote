/**
 * Created by Variant on 16/3/22.
 */
object List_Fold_Sort {
  def main(args: Array[String]) {
    //0 + 1 + 2 + 3..100 从1到100
    println((1 to 100).foldLeft(0)(_+_))
    println((1 /: (1 to 100))(_ + _))
    //1...3-(4-(5-100))从5到1
    println((1 to 5).foldRight(100)(_ - _))
    println(((1 to 5) :\ 100)(_ - _))

    println(List(1, -3, 4, 2, 6) sortWith (_ < _))
    println(List(2,3,56,7,12) sortWith(_ > _))


    println(List.apply(1,2,3))
    println(List.fill(3, 3)(5))
    println(List.range(1, 5))
    //步长
    println(List.range(9, 1, -3))

    val zipped = "abcde".toList zip List(1, 2, 3, 5, 6)
    println(zipped)
    println(zipped.unzip)

    //把多个list合并成一个List
    println(List(List('a', 'b'), List('c'), List('d', 'e')).flatten)
    println(List.concat(List(),List('b'), List('c')))

    println(List.map2(List(10,20),List(10,10,20))(_ * _))

    println((List(20,30,10),List(10,20)).zipped.map(_ * _))



  }
}
