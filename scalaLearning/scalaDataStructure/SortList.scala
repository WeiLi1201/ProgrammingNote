/**
 * Created by Variant on 16/3/22.
 */
object SortList {

  def main(args: Array[String]) {

    //合并算法
    def mergedsort[T] (less: (T,T) => Boolean)(input : List[T]):List[T] = {
      /**
       * @param  xlist 要合并的有序列表
       * @param  ylist 要合并的有序列表
       * @return 合并后的列表
       */
      def merge(xlist: List[T], ylist: List[T]): List[T] = {
        (xlist,ylist) match{
          case (Nil,_) => ylist
          case (_,Nil) => xlist
          case (x :: xtail,y :: ytail) =>
            if(less(x,y))  x :: merge(xtail,ylist)
            else y :: merge(xlist,ytail)
        }

      }
      val n =input.length / 2
      if(n == 0) input
      else{
        val (x,y) =input splitAt n
        merge(mergedsort(less)(x), mergedsort(less)(y))

      }
    }


    println(mergedsort((x : Int,y :Int) => x < y) (List(1,5,4,7,235,333,43,2,6)))

    val reverse_SortList = mergedsort((x:Int,y:Int) => x > y ) _
    println(reverse_SortList(List(1,5,4,7,235,333,43,2,6)))



  }
}
