import scala.actors.Actor

/**
 * Created by Variant on 16/3/30.
 */

object First_Actor extends Actor{
  def act(): Unit ={
    println(Thread.currentThread().getName)
    for (i <- 1 to 10){
      println("Step:" + i)
      Thread.sleep(1000)
    }
  }
}

object Second_Actot extends Actor{
  def act(): Unit = {
    println(Thread.currentThread().getName)
    for (i <- 1 to 10){
      println("Step :" + i)
      Thread.sleep(1000)
    }
  }
}

object HelloActor {
  def main(args: Array[String]) {
    First_Actor.start
    Second_Actot.start
  }
}
