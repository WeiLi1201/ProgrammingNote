/**
 * Created by Variant on 16/3/16.
 */
class AbstractClassOps{
  //使用占位符_ 初始化成员变量不能用val(不可变)
  //val id :Int = _
  var id :Int =_
}

abstract class SuperTeacher(val name :String){
  var id : Int
  var age :Int
  def teach
}

class TeacherForMaths(name : String) extends SuperTeacher(name){
  //按照惯例要表达复写关系要写override
  override var id = name.hashCode
  override var age: Int = 29

  override def teach{
    println("Teaching !!!")
  }
}
object AbstractClass {
  def main(args: Array[String]) {
    val teacher = new TeacherForMaths("Spark")

    teacher.teach

    println("teacher.id :" + teacher.id)
    println("teacher.age :" + teacher.age)
  }
}
