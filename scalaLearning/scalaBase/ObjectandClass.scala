/**
 * Created by Variant on 16/3/16.
 */
object ObjectandClass {
  def main(args: Array[String]) {
    println()
    val array = Array(1,2,3,4,5,6)

  }
}


object University{
  //object伴生对象里面 都是静态成员
  //实际开发中作为静态方法区和宏观变量区,也作为类的伴生对象存储静态成员和方法
  //object 里面的内容只有在第一次使用时执行,和java类加载即执行不一样
  private var studentNo =0
  private def newStudentNo: Int ={
    studentNo +=1
    studentNo
  }
}

class University{
  //class 可以访问object的所有成员,包括private
  val id=University.newStudentNo
  private var number =0
  def aClass(number:Int){this.number = number}
}