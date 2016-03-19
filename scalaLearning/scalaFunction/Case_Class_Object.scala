/**
 * Created by Variant on 16/3/19.
 */
abstract class Person1
//case class
// 一.传递消息
// 二.模式匹配
//1.成员默认是val
//2.每个case class 都会生成有伴生对象,伴生对象中有apply方法,它会构建具体的对象
//3.模式匹配时,在case class对象中提取出内容,提取方法在伴生对象unapply方法
//apply方法是传入值构建对象,unapply方法是从已经构建的对象中提取出内容
case class Student1( age : Int) extends Person1
case class Worker1(age:Int,salary :Double) extends Person1
case object Shared extends Person1


object Case_Class_Object {
  def main(args: Array[String]) {
    def caseOps(person: Person1) = person match{
      case Student1(age) => println("I'm a "+ age + "years old Student")
      case Worker1(_,salary) => println("Wow, I got " + salary)
      case Shared => println("No property")
    }

    caseOps(Student1(19))
    caseOps(Shared)
    val worker = Worker1(29,1000.1)
    val worker2 = worker.copy(salary = 19.95)
    val worker3 = worker.copy(age = 30)
  }

}
