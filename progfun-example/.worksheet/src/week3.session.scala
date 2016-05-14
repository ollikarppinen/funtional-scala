package week3

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  val x = new Rational(1, 3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(12); val res$0 = 

	x - y - z;System.out.println("""res0: week3.Rational = """ + $show(res$0));$skip(7); val res$1 = 
	y + y;System.out.println("""res1: week3.Rational = """ + $show(res$1))}
}

class Rational(x: Int, y: Int) {
	require(y > 0, "denominator must be positive")
	
	def this(x: Int) = this(x, 1)
	
	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
	val numer = x
	val denom = y
	
	override def toString = {
		val g = gcd(x, y)
		numer / g + "/" + denom / g
	}
	
	def + (that: Rational): Rational =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	
	def unary_- : Rational = new Rational(-numer, denom)
		
	def - (that: Rational) = this + -that
	
	def < (that: Rational) = numer * that.denom < that.numer * denom
	
	def max(that: Rational) = if (this < that) that else this
	
}
