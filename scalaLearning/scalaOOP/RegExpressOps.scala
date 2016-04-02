

/**
 * Created by Variant on 16/3/17.
 */
object RegExpressOps {
  def main(args: Array[String]) {

    val regex = """([0-9]+) ([a-z]+)""".r
    val numPattern = "[0-9]+".r
    val numberPattern = """\s+[0-9]+\s""".r

    //findAllIn 方法返回遍历所有匹配项的迭代器
    for (matchingString <- numPattern.findAllIn("99345 Scala, 22298 Spark")) println(matchingString)

    //找到首个匹配项
    println(numberPattern.findFirstIn("99ss java, 222 hadoop  444"))

    val numitemPattern ="""([0-9]+) ([a-z]+)""".r

    //不是很明白,这东西干嘛的
    //val numitemPattern(num,item) = "99 hadoop"

    //生产环境下用,模式匹配与正则表达式
    val line = "98989 spark"
    line match {
      case numitemPattern(num,item) => println(num + "\t" + item)
      case _ => println("ohh...")
    }

  }
}
