package week4
import week4._

object nth {
  def nth[T](n: Int, xs: List[T]): T =
    if (n == 0) xs.head
    else nth(n - 1, xs.tail)                      //> nth: [T](n: Int, xs: week4.List[T])T

  val list = List                                 //> list  : week4.List.type = week4.List$@36d64342
  
  list.apply(1)                                   //> res0: week4.Cons[Int] = week4.Cons@39ba5a14
  
  list.apply(1, 2)                                //> res1: week4.Cons[Int] = week4.Cons@511baa65

  list.apply(1, 2, 3)                             //> res2: week4.Cons[Int] = week4.Cons@340f438e
}