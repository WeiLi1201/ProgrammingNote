/**
 * Created by Variant on 16/3/27.
 */

object Context_Implicite{
  implicit val default : String ="java"

}

object Parameters{
  //此处implicit是没有用的,作用域是main
  //implicit val default : String ="hello"
  def print(content : String)(implicit language: String){
    println(language +":" + content)
  }
}


object Implicit_Parameters {
  def main(args: Array[String]) {
    Parameters.print("scala")("spark")

    import Context_Implicite._
    Parameters.print("Hadoop")
  }
}
