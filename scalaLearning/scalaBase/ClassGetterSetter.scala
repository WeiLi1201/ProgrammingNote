/**
 * Created by Variant on 16/3/15.
 */
object ClassGetterSetter {
  def main(args: Array[String]) {
    val teacher = new Teacher()
    teacher.name ="bable"
    teacher.sayHello()


    val teacheroop = new TeacherOOP("bable",24)
    teacheroop.gender ="female"

  }


}


class Teacher{
  var name : String = _
  private var age = 27
  private[this] val gender = "male"

  def this(name:String){
    //重写构造方法都要继承主构造器
    this
    this.name = name
  }

  def sayHello(){
    println("teacher's name :" +this.name +" "+this.age +this.gender)
  }
}

class TeacherOOP(val name:String,val age :Int){
  //不让他人调用主构造器,而强行调用辅助构造器,在类名后面加入private
  //class TeacherOOP private(val name:String,val age :String){
  //new 一个类时除了方法,其他语句都会被执行
  println("constructor")
  var gender : String = _
  println(gender)


  def this(name:String,age:Int,gender: String){
    //重写构造方法都要继承主构造器
    this(name,age)

    this.gender = gender
  }

  def sayHello(){
    println("teacher's name :" +this.name +" "+this.age +this.gender)
  }
}


class Student{

  private var privateAge = 0

  //类自己的方法只能访问自己的对象(this调用),对象私有属性
  //private[this] var privateAge = 0

  //生成private fanal字段的变量,带有getter方法
  val name = "hadoop"
  //带有getter\setter方法 age和age_
  var age = 0

  //类里的方法可以访问类的所有对象的私有属性
  //
  def isYounger(other:Student) =privateAge < other.privateAge

}