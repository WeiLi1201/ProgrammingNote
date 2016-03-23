
/**
 * Created by Variant on 16/3/23.
 */
class A[T :Manifest]

object Classtag_Manifest {
  def main(args: Array[String]) {
    //运行时就可以获取T具体的类型
    //我们要构建泛型对象,我们需要manifest帮我们存储T的实际的类型
    //而在程序实际运行时,是作为参数用在方法运行的上下文中,实际上是一个隐式的过程
    //Java虚拟机运行时不会识别泛型
    def arrayMake[T: Manifest](first: T, second: T) = {
      val r = new Array[T](2)
      r(0) = first
      r(1) = second
      r
    }

    arrayMake(1, 2).foreach(println)

    //另外一种写法,推荐上面那种
    def mainif[T](x : List[T])(implicit m : Manifest[T]) = {
      if (m <:< manifest[String])
        println("List strings")
      else
        println("Some other type")
    }

    mainif(List("Spark", "Hadoop"))
    mainif(List(1, 2))
    mainif(List("Scala", 3))

    val m = manifest[A[String]]
    println(m)
    val cm = classManifest[A[String]]
    println(cm)
  }

}
