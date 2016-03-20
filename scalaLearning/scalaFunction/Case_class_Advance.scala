/**
 * Created by Variant on 16/3/19.
 */

abstract class Item
case class Book(descriprion : String ,price : Double) extends Item
case class Bundle(descriprion : String ,price : Double, items : Item* ) extends Item


object Case_class_Advance {
  //表达类似于集合类型的元素,而元素的本身是case class具体的实例
  //嵌套case class
  def main(args: Array[String]) {
    def case_class_nested(person : Item) =person match{
      case Bundle(_,_,art @ Book(_,_),reset @ _*) => println(art.descriprion + ": " + art.price + reset)
      case Bundle(_,_,Book(description,_),_*) => println("The first description is" + description)
    }

    case_class_nested(Bundle("spark in inpatience",66.6,
      Book("Spark for developer",67.2),
      Bundle("hadoop",78.2,
        Book("life is good",78.2),
        Book("dash for dev",78.79)
      ))
    )
  }
  
}
