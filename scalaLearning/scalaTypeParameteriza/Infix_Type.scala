/**
 * Created by Variant on 16/3/27.
 */
object Infix_Type {
  def main(args: Array[String]) {
    object Log {
      def >>: (data :String) :Log.type ={println(data);Log}
    }
    "Hadoop" >>: "Spark" >>: Log

    val list = List()
    val newlist = "A" :: "B" :: list
    println(newlist)

    class Infix_Type[A,B]
    val infix : Int Infix_Type String =null
    val infix1 : Infix_Type[Int,String] = null

    case class Cons(first : String,second : String)
    val case_class = Cons("one", "two")
    case_class match {
        //这样可以提取"one" 和 "two"
      case "one" Cons "two" => println("Sparks")  //unApply
    }

  }
}
