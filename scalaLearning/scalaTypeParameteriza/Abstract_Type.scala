
import scala.io.{Source, BufferedSource}

/**
 * Created by Variant on 16/3/27.
 */
trait Reader{
  type In <: java.io.Serializable
  type Content
  def read(in : In) : Content
}
class FileReader extends Reader{
  type  In =String
  type Content = BufferedSource
  override def read(name :In) =Source.fromFile(name)
}

//如果类型是在类被实例化的时候具体指出的,此时
//这个时候使用类型参数,例如说List[T] ,使用的时候具体指定类型List[String]
//如果说类型是它的子类中给出的,当然类型可以有很多子类(如Reader)
//另外如果是有多个类型参数,就显得语法非常的复杂
//意思是能使用抽象类型的时候尽量去使用抽象类型
object Abstract_Type {
  def main(args: Array[String]) {
    val filereader = new FileReader
    val content = filereader.read("E:abc.txt")
    for(line <- content.getLines){
      println(line)
    }
  }
}
