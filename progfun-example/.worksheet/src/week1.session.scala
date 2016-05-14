package week1

import scala.annotation.tailrec

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(132); 
  
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(85); 
	
	def isGoodEnough(guess: Double, x: Double) =
		abs(guess * guess - x) < x * 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(70); 
		
	def improve(guess: Double, x: Double) =
		(guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(43); 
		
	def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 
	
	sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(9); val res$1 = 
	sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(12); val res$2 = 
	sqrt(1e-6);System.out.println("""res2: Double = """ + $show(res$2));$skip(12); val res$3 = 
	sqrt(1e60);System.out.println("""res3: Double = """ + $show(res$3));$skip(13); val res$4 = 
	sqrt(0.001);System.out.println("""res4: Double = """ + $show(res$4));$skip(15); val res$5 = 
	sqrt(0.1e-20);System.out.println("""res5: Double = """ + $show(res$5));$skip(14); val res$6 = 
	sqrt(1.0e20);System.out.println("""res6: Double = """ + $show(res$6));$skip(14); val res$7 = 
	sqrt(1.0e50);System.out.println("""res7: Double = """ + $show(res$7));$skip(174); 
	def factorial(x: Int): Int = {
		@tailrec def inner(xi: Int, result: Int): Int = xi match {
			case 0 => result
			case _ => inner(xi - 1, result * xi)
		}
		inner(x, 1)
	};System.out.println("""factorial: (x: Int)Int""");$skip(57); 
	for (i <- 0 to 10) println(i + "! 8 = " + factorial(i))}
}
