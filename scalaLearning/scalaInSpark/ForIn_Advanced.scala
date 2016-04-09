/**
  * Created by Variant on 16/4/9.
  */
object ForIn_Advanced {
  def main(args: Array[String]) {

  }
  //这三个函数也是调用for进行处理的
  //我们在运用for循环时,很多时候也是调用这几个函数
  //如果不是特别复杂的业务逻辑,尽量用for循环,避免用map,for更有表现力
  def map[A, B](list: List[A], f: A => B): List[B] = {
    for (elemrnt <- list) yield f(elemrnt)
  }

  def flatMap[A, B](list: List[A], f: A => List[B]) :List[B] = {
    for(element <- list;y <- f(element))yield y
  }

  def filter[A](list:List[A],f : A => Boolean) : List[A] = {
    for(element <- list if f(element))yield element
  }
}
