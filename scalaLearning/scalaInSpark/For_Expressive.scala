/**
  * Created by Variant on 16/4/9.
  */
case class Person4(name:String, isMale:Boolean, children :Person4*)

object For_Expressive {
  def main(args: Array[String]) {
    val lily = Person4("lily",false)
    val lauran = Person4("lauran", false,lily)
    val rockin = Person4("rockin", true)
    val vivian = Person4("vivian",false,lauran,rockin)
    val persons = List(lauran,rockin,vivian)

    val result = persons filter(person => !person.isMale) flatMap(person =>
      (person.children map (children => (person.name,children.name))))
    println(result)

    //for循环的内部实现也是flatmap,但是for循环表现能力更强,尤其是语义上便于理解
    //这也是学for循环的原因
    val forResult = for(person <- persons;if !person.isMale;child <- person.children)
      yield (person.name,child.name)
    println(forResult)
  }

}
