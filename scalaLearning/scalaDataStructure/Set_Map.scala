
import scala.collection.immutable.TreeMap
import scala.collection.mutable

/**
 * Created by Variant on 16/3/22.
 */
object Set_Map {
  def main(args: Array[String]) {
    val data = mutable.Set.empty[String]
    data ++= List("1", "2", "2")
    data += "4"
    data --= List("2", "3")

    println(data)
    data += "1"
    println(data)
    data.clear
    println(data)

    val map = mutable.Map.empty[String, String]
    map("java") = "Hadoop"
    map("scala") = "Spark"
    println(map)
    println(map("java"))

    val treeSet = mutable.TreeSet(3, 45, 6, 3, 67, 35, 86, 32, 23)
    println(treeSet)
    val treeSetForChar = mutable.TreeSet("Spark", "Scala", "Hadoop")
    println(treeSetForChar)


    val treeMap = TreeMap("scala" -> "Spark", "Java" -> "Hadoop")
    val treeMap2=treeMap.addString(new StringBuilder("hello") ,"life is good","dsada","dasda")
    println(treeMap)
    println(treeMap2)




  }
}
