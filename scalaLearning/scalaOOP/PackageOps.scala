/**
 * Created by Variant on 16/3/16.
 */

//包对象
package object people{
  val defaultName = "Scala"
}

//包中可以引用包对象定义的成员变量
package people{
  class people{
    val name = defaultName
  }
}
object PackageOps {

}

//特殊引入写法
import java.util.{HashMap => JavaHashMap}
//不用scala中的Stringbuilder类
import scala.{StringBuilder => _}
//默认引入
//java.lang._  scala._ , scala.predef._