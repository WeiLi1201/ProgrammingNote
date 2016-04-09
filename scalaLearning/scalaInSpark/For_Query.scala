/**
  * Created by Variant on 16/4/9.
  */
case class Book1(title: String, authors: List[String])

object For_Query {
  def main(args: Array[String]) {
    val books : List[Book1] = List(
      Book1("Struture and Interpertation",List("Abeson hold","Sussan")),
      Book1("Princiles of programming design",List("Aho,Gosling","Lissan")),
      Book1("Programming in modula-2",List("Wrissian","Kash")),
      Book1("Introduction to Functional programming",List("Bird Richard","kevin")),
      Book1("The Java language specification",List("Jame,Gosling","Job , Bill"))
    )

    val authorResult = for(b <- books;a <- b.authors if a startsWith "Abeson") yield b.title
    println(authorResult)

    val result = for(book <- books if (book.title indexOf "Java") >= 0)yield book.title
    println(result)
  }
}
