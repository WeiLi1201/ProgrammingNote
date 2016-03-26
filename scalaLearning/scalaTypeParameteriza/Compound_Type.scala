/**
 * Created by Variant on 16/3/27.
 */
trait Compound_Type1
trait Compound_Type2
class Compound_Type extends Compound_Type1 with Compound_Type2


object Compound_Type {
  def compound_Type(x : Compound_Type1 with Compound_Type2) = println("Compound")

  def main(args: Array[String]) {
    compound_Type(new Compound_Type1 with Compound_Type2)

    //也可以传入object
    object compound_type_object extends Compound_Type1 with Compound_Type2
    compound_Type(compound_type_object)

    //别名,方便使用
    type compound_Type_Alias = Compound_Type1 with Compound_Type2

    def compound_Type_Local(x : compound_Type_Alias) = println("Compound_TYPE IN 1")

    val compound_type_class = new Compound_Type
    compound_Type_Local(compound_type_class)

    //复合类型和结构类型一起使用,使用别名约束,这点非常棒
    type scala = Compound_Type1 with Compound_Type2 {def init() : Unit}
  }
}
