/**
  * Created by Variant on 16/4/9.
  */
object ForInAction {
  def main(args: Array[String]) {
    val lily = Person4("lily",false)
    val lauran = Person4("lauran", false,lily)
    val rockin = Person4("rockin", true)
    val vivian = Person4("vivian",false,lauran,rockin)
    val persons = List(lauran,rockin,vivian)
                        //生成器               定义                过滤器
    val forresult = for(person <- persons;name = person.name;if !person.isMale ;children <-person.children)
      yield (name,children.name)
    println(forresult)

    val content= for(x <- List(1,2,3);y <- List("Haddop","Spark","Flink")) yield (x,y)
    println(content)
  }
}
