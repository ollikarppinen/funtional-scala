package week3

object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  val t1 = new NonEmpty(3, Empty, Empty);System.out.println("""t1  : week3.NonEmpty = """ + $show(t1 ));$skip(28); 
  val t2 = t1 incl 4 incl 8;System.out.println("""t2  : week3.IntSet = """ + $show(t2 ));$skip(14); val res$0 = 
  t1 union t2;System.out.println("""res0: week3.IntSet = """ + $show(res$0))}
}

abstract class IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
    def union(that: IntSet): IntSet
}

object Empty extends IntSet {
    def contains(x: Int): Boolean = false
    def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
    def union(that: IntSet) = that
    override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
    
  def union(that: IntSet): IntSet = left union right union that incl elem
    
  override def toString = "{" + left + elem + right + "}"
}
