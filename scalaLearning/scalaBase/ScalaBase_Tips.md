#Scala Base Tips
1. Scala是具有函数式编程语言特点，在函数式编程语言当中，一般不推荐使用var变量
2. 利用if替代while控制结构 //这些做可以减少var变量的使用，程序结构也更简单，表达能力更强 
def gcd(x: Long, y: Long): Long = if (y == 0) x else gcd(y, x % y)
3. 程序中的<-被称生成器（generator），在执行过程中，集合filesHere中（Array[File])的元素将依次赋给file，file类型为File，打印时调用其toString方法将文件名称打印出来。
4. for循环结构中还可以加入if进行过滤操作
	//还可以加入多个过滤条件
	for ( file <- filesHere
	 if file.isFile;
	 if file.getName.endsWith(".scala")
	 )
	 println(file)
5. 多重循环的实现：
	def fileLines(file: java.io.File) =
		scala.io.Source.fromFile(file).getLines.toList
  def grep(pattern: String) =
	for (
	  file <- filesHere if file.getName.endsWith(".scala");
	  line <- fileLines(file) if line.trim.matches(pattern)
	) println(file + ": " + line.trim)
  grep(".*gcd.*")
6. val定义的数组不能被改变，但是数组的内容可以被改变
	ArrayBuffer可以被改变
	\++=后面可以向数组中增加任何集合，包括List
	trimEnd,删除末尾N个元素，insert(0,6)在索引为0的位置插入元素6，remove
	ArrayBuffer.toArray转成定长数组
	Array.toBuffer 转成ArrayBuffer
	循环遍历数组
	for(1 <- arrayInt)  for(i <- 0 until (array.length,2))步长为2
	for(i <- (0 until array.length).reverse) 倒序输出
	for循环之后yield生成新的数组，原缓冲数组不变
	array.sum,array.max array.min,array.mkstring    mkstring(“<“”,””>”)
7. List
	list一旦被创建，其值不能被改变
	List具有递归结构，例如链表结构
	List类型和其它类型集合一样，它具有协变性（Covariant)
	常用操作：isEmpty—head—tail—num.tail.head—:\:\:—init—last—reverse—reverse.init—tail.reverse—drop—take—splitAt—zip(Tuple)—mastering—toArray—range—make—unzip—flatten—concat
8. Set 无序不重复，有序的用LinkedHashSet
9. Map immutable不能clear
	foreach(e => println(e.\_1+e.\_2))  val(k,v) =e —put—contain—get—
10. Tuple var tuple = (“Hello”,”Tuple”,1)  val(first,second,third) = tuple
11. Array(1,2,3,4).map(\_+1).mkString(“,”)
	像这种运行时确定自由变量more的类型及值得函数成为闭包，这是一个由开放到封闭的过程，所以叫闭包
12. 
