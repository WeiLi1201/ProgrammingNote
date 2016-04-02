package scalaOOP

/**
 * Created by Variant on 16/3/16.
 */
  class ApplyTest{
    def apply() = println("I am into Spark so much!!")

    def haveATry{
      println("Have a try on apply")
    }
  }

  object ApplyTest{
    def apply() ={
      println("I am into Scala so much!!")
      new ApplyTest
    }
  }
  object ApplyOperation {
    def main(args:Array[String]){
      val array = Array(1,2,3,4,5,6)

      //a会调用apply方法
      val a = ApplyTest()
      a.haveATry

      val b = new ApplyTest
      b.haveATry
      //b()会调用class中的apply方法
      println(b())
    }
  }
