import java.io.File

import scala.io.Source

/**
 * Created by Variant on 16/3/28.
 */

//隐式转换最佳实践
class RicherFile(val file : File){
  def read = Source.fromFile(file.getPath).mkString
}

class File_Implicit(path : String) extends File(path)
object File_Implicit{
  implicit def file2RicherFile(file:File)= new RicherFile(file) //file ->RicherFile
}


object Implicit_bestInAction {
  def main(args: Array[String]) {
    println(new File_Implicit("E:\\abc.txt").read)
  }
}
