/**
 * Created by Variant on 16/3/27.
 */
class Structural {def open() = println("A class instance Opened")}
//结构类型
object Structure_Type {
  //鸭子类型js和Ruby
  //如果长得像鸭子,走起路来像鸭子,声音像鸭子,那么我们就认为它是鸭子
  //类型的行为方式一致,scala中叫结构类型
  def main(args: Array[String]) {
    init(new {def open() = println("Opened")})

    type X = {def open() :  Unit}
    def init(res :X) = res.open

    init(new {def open() = println("Life is good")})

    object A {
      def open() {
        println("life is not bad")
      }
    }
    init(A)

  }

  //调用init方法传入的参数 无论什么类型都必须包含open方法
  def init(res : {def open :Unit}): Unit ={
    res.open
  }

}
