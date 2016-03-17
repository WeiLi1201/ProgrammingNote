import scala.io.Source

/**
 * Created by Variant on 16/3/17.
 */
object FuncitonOps {
  def main(args: Array[String]) {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      processData(arg,width)


    var increase = (x : Int) =>x + 1
    increase(10)
    increase = (x : Int) => x + 100

    val someNumbers = List(-11,-10,-5,0,5,10)
    someNumbers.foreach((x : Int) => println(x) )

    someNumbers.filter((x :Int) => x > 0)
    someNumbers.filter((x) => x > 0)
    someNumbers.filter(x => x > 0)
    someNumbers.filter(_  > 0)

    val f = (_ : Int) + (_ : Int)
    f(5,10)
  }



  def processData(filename : String,width : Int): Unit ={
    //本地函数,高内聚,低耦合
    //processLine 不暴露给外部调用
    def processLine(line: String): Unit ={
      if (line.length > width)
        println(filename + ": " +line)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines){
      processLine(line)
    }

  }






}
