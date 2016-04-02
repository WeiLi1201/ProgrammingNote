/**
 * Created by Variant on 16/3/16.
 */


package spark{
  package navigation{
    //Navigator 可被 spark包下所有类\包访问
    private[spark] class Navigator{
      //navigation作用范围内都可调用 useStarChat方法
      protected[navigation] def useStarChat(){}
      class legOfJounery{
        //Navigator作用范围可用distance变量
        private[Navigator] val distance = 10
      }
      //只能对象本身调用,对象属性私有
      private[this] var speed = 200
    }
  }

  package launch{

  import spark.navigation.Navigator

    object Vehicle{
      //new Navigator 证明范围扩大到了spark
      private[launch] val guide = new Navigator
    }
  }
}


//伴生类与伴生对象间成员可以相互访问
//如果是protected成员,伴生类子类都可以访问
class PackageOPs_Advanced{
  import PackageOPs_Advanced.power

  private def canMakeItTrue = power >10000
}

object PackageOPs_Advanced {
  private def power =1000
  def makeItTrue ( p : PackageOPs_Advanced) : Boolean = {
    val result = p.canMakeItTrue
    result
  }
}
