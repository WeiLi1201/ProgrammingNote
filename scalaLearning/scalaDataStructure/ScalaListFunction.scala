/**
 * Created by Variant on 16/3/21.
 */
object ScalaListFunction {
  def main(args: Array[String]) {
    println(List(1,2,3,4) ::: List(4,3,7) ::: List(8,4,5))
    println(List(2,3,5,6) ::: List(5,6,7) ::: List(10,11))
    //不建议用,速度慢,可以用List.isEmpty 判断
    println(List(1,2,4).length)

    val bigData = List("Hadoop","Spark","Storm")
    println(bigData.head)
    println(bigData.tail)
    println(bigData.init)
    println(bigData.last)
    println(bigData.reverse)
    println(bigData)

    //取前两个
    println(bigData take 2)
    //去掉第一个
    println(bigData drop 1)
    //分为(List("Hadoop","Spark"),List("Storm"))
    println(bigData splitAt 2)
    //取第三个元素
    println(bigData apply 2)
    //其实也是用的apply方法
    println(bigData(2))


    val data = List('a','b','c','d','e','f')
    //索引
    println(data.indices)
    //拉练操作
    println(data.indices zip data)
    println(data.zipWithIndex)
    println(data.toString)
    println(data.mkString("[", ",,", "]"))
    println(data.mkString(","))
    println(data.mkString)


    var buffle = new StringBuilder
    data addString(buffle,"(",",",")")
    println(buffle)
    println(data)

    val array = data.toArray
    println(array.toList)

    val new_Array = new Array[Char](10)
    //new_Array要能放得下data中的元素,前面空出3个char
    data.copyToArray(new_Array, 3)
    new_Array.foreach(print)
    println

    //这个非常重要,在Spark中大量用到
    val iterator =data.toIterator
    println(iterator.next)
    println(iterator.next)

  }
}
