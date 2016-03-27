import java.io.File

import scala.io.Source

/**
 * Created by Variant on 16/3/27.
 */
class RichFile(val file : File){
  def read = Source.fromFile(file.getPath).mkString
}
object Context{
  implicit def file2RichFile(file :File) = new RichFile(file)
}


object Hello_Implicit_Conversions {
  def main(args: Array[String]) {
    import Context.file2RichFile
    //隐式转换的作用域:
    //1.main方法内的implici方法
    //2.对象的object(伴生对象),此处为File的object
    //寻找File装换成的RichFile类型的方法,因为RichFile中有read方法
    println(new File("E:\\abc.txt").read)
  }
}
