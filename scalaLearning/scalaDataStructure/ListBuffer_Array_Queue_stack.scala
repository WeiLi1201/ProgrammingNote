
import scala.collection.immutable.Queue
import scala.collection.mutable.Stack


/**
 * Created by Variant on 16/3/22.
 */
object ListBuffer_Array_Queue_stack {
  def main(args: Array[String]) {

    val empty = Queue[Int]()
    val queue1 = empty.enqueue(1)
    val queue2 = queue1.enqueue(List(5, 2, 3, 4))
    println(queue2)

    val (element,left) = queue2.dequeue
    //第一个元素出队列,queue2不变
    println(element + ":" + left)

    import scala.collection.mutable.Queue
    //可变Queue
    val queue =Queue[String]()
    queue += "a"
    queue ++= List("B", "C")
    println(queue)
    println(queue.dequeue)
    println(queue)


    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.top)
    println(stack)
    println(stack.pop)
    println(stack)













  }
}
