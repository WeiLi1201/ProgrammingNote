/**
 * Created by Variant on 16/3/16.
 */

class Human{
  println("Human")
}

trait TTeacher extends Human{
  println("TTeacher")
  def teach
  def eat:Unit = println("I like eat apple teacher")
}

trait PianoPlayer extends Human{
  println("PianoPlayer")

  def playPiano=println("I am a PianoPlayer,Playing Piano")
  def eat:Unit= {
    println("I like eat blanna piano")
  }
}

//混入一个整体 Human with TTeacher with PianoPlayer
//从左到右,如果Human被构造了,那么即使TTeacher继承了Human,Human也不会被重新构造
class PianoTeacher extends Human with TTeacher with PianoPlayer{
  override def teach ={
    println("I'm training students.")
  }
  //继承的Trait出现了相同的方法要复写方法
  override def eat ={
    println("I LIKE TOMATO")
  }
}

object TraitImpro extends App{
//  val t1  = new PianoTeacher
//  t1.playPiano
//  t1.teach
//  t1.eat
  //多继承trait,方法从右到左调用
  val work = new Work with TbeforeAfter with TAfter

  work.doAction
}

//AOP
trait Action{
  def doAction
}

trait TbeforeAfter extends Action{
  abstract override def doAction{
    println("Initialization")
    super.doAction
    println("Destroyed")
  }
}

trait TAfter extends Action{
  abstract override def doAction{
    println("Initialization2")
    //如果此处没有super调用,则不会执行TbeforeAfter中的doAction方法
    super.doAction
    println("Destroyed2")
  }
}

class Work extends Action{
  override def doAction{
    println("do some work")
  }
}

































