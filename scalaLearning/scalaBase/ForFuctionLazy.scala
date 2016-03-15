/**
 * Created by Variant on 16/3/15.
 */
object ForFuctionLazy {
  def main(args: Array[String]) {
    for (i <- 1 to 2;j <-1 to 2) print(100*i +j + " ")
    println
    //守卫
    for (i <- 1 to 2;j <-1 to 2 if i != j) print(100*i +j + " ")
    println

    //匿名函数非常重要,函数是有值的
    def addA(x : Int) = x + 100
    val add = (x : Int) => x+100
    println("The result from a function is :" + addA(2))
    println("The result from a val is :" + add(2))

    //递归运算需要声明返回类型
    def fac(n:Int):Int = if(n <= 0) 1 else n * fac(n - 1)

    //默认参数
    def combine(Content:String,left:String = "{",right:String = "}"): Unit ={
      println(left +Content +right)
    }

    //可变参数
    def connected(args:Int*): Int ={
      var result = 0
      for (arg <- args) result += arg
      result
    }
    println("The rsult from a connected is:" + connected(1,2,3,4,5))

    //Lazy值 只有在被使用的时候才会被实例化\执行

  }
}
