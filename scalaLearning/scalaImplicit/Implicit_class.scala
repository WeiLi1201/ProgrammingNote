import java.io.File

import scala.io.Source

/**
 * Created by Variant on 16/3/28.
 */
object Context_Helper{
  //隐式类
  implicit class FileEnhance(file : File){
    def read = Source.fromFile(file.getPath).mkString
  }
  implicit class Op(i : Int){
    def addX(second : Int) = i + second
  }
}
object Implicit_class {
  def main(args: Array[String]) {
    import Context_Helper._
    println(1.addX(2))
    println(new File("E:\\abc.txt").read)
  }
}
