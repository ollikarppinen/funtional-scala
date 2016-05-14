package week4
import week4._

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(134); 
  def nth[T](n: Int, xs: List[T]): T =
    if (n == 0) xs.head
    else nth(n - 1, xs.tail);System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""");$skip(19); 

  val list = List;System.out.println("""list  : week4.List.type = """ + $show(list ));$skip(19); val res$0 = 
  
  list.apply(1);System.out.println("""res0: week4.Cons[Int] = """ + $show(res$0));$skip(22); val res$1 = 
  
  list.apply(1, 2);System.out.println("""res1: week4.Cons[Int] = """ + $show(res$1));$skip(23); val res$2 = 

  list.apply(1, 2, 3);System.out.println("""res2: week4.Cons[Int] = """ + $show(res$2))}
}
