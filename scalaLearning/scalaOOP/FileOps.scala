import java.io.{File => JFile, PrintWriter}

import scala.io.Source

/**
 * Created by Variant on 16/3/17.
 */
object FileOps {
  def main(args: Array[String]) {
    //scala里的io操作很多是采用java的io操作
    val file = Source.fromFile("E:\\sparkKiwe.txt")
    for (line <- file.getLines()){println(line)}
    file.close

    val webFile = Source.fromURL("http://spark.apache.org/")
    webFile.foreach(print(_))
    webFile.close

    val writer = new PrintWriter(new JFile("scalaFile.txt"))
      for (i <- 1 to 100) writer.println(i)
      writer.close

    print("please enter your input :")
    val line = Console.readLine()
    println("Thanks,you just typed:" + line)

  }
}
