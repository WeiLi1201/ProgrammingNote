/**
 * Created by Variant on 16/3/20.
 */
object option_ {
  //option 中定义的 都必须在一个文件中
  //使用了sealed关键字 就有个强制的要求,Option内定义的case class,case object都必须在一个文件内
  //用Option的子类进行模式匹配时可以检查所有匹配的选项都是否列在case中

  def main(args: Array[String]) {
    val scores = Map("Alice" -> 22, "Batch" ->23)

    scores.get("Alsice") match {
      case Some(score) => println(score)
      case None => println("No score")

    }
  }
}
