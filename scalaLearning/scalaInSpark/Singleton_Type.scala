/**
  * Created by Variant on 16/4/7.
  */
import scala.reflect.runtime.universe._


object Scala
class Java1
class JVM{def method1:this.type = this}
class JVM_Language extends JVM {def method2 : this.type = this}

object Singleton_Type {
  def main(args: Array[String]) {
    println(Scala.getClass)
    println(typeOf[Scala.type ])

    val java = new Java1
    val java2 =new Java1

    println(typeOf[java.type])
    println(typeOf[java2.type ])

    val content :java.type  = java
    println(content)

    val jvm = new JVM_Language
    jvm.method1.method2
    //运行时this调用的是jvm,this.type返回的是java_language类型,所以才能链式调用method2
    println(jvm.method1)


  }
}
