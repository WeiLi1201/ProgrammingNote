/**
 * Created by Variant on 16/3/16.
 */
class Person(val name: String,var age : Int){
  println("The primary constructor of Person")

  val school = "BJU"

  def sleep = "8 hour"

  override def toString = "I am a Person"
}

class Worker(name : String ,age :Int,val salary : Long) extends Person(name,age){
  println("This is the subClass of Person,Primary constructor of Worker")

  override  val school ="Spark"

  override  def toString ="I am a Worker!" + super.sleep
}

object OverrideOperation {
  def main(args: Array[String]) {
    val w = new Worker("Sprak",5,10000)
    //构造子类前会先构造父类,调用子类已重写的父类的方法
    println("School : " + w.school)
    println("Salary : " + w.salary)

    println(w.toString)

  }
}
