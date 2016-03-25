/**
 * Created by Variant on 16/3/25.
 */
object Type_Constraints {
  def main(args: Array[String]) {
    // A =:= B //表示A类型等同于B类型
    // A <:< B //表示A类型是B类型的子类
    def rocky[T](i : T)(implicit ev : T <:< java.io.Serializable){
      println("Life is short,you need spark")
    }
    rocky("Spark")
    //Int 不是Serializable子类,所以编译通不过
    //rocky(10)
  }
}
