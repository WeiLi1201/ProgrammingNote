import java.io.File

/**
 * Created by Variant on 16/3/15.
 */
object HelloScala {
  def doWhile(): Unit ={
    var line = ""
    do{
      line = readLine()
      println("read:" + line)
    }while (line !="")

  }

  //静态代码块,加载就执行
  var line = ""
  do{
    line = readLine()
    println("static:" + line)
  }while (line !="")

  def main (args: Array[String]) : Unit = {
    for (arg <- args) println(arg)
    println("Hello Scala! A new World!")
    doWhile()
    val file = if(!args.isEmpty) args(0) else "scala.xml"
    println(file)

    for(i <- 1 to 10){
      println("NUMBER IS:" + i)
    }

    val files = (new File(".")).listFiles()
    for (file <- files){
      println(file)
    }

    val n =99
    try{
      if(n % 2 == 0) println(n /2) else throw
        new RuntimeException("N must be  event")
    }catch{
      case e :Exception => println("The exception is :" + e.getMessage)
    }finally {

    }
  }
}
