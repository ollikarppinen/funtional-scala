package week2

import math.abs

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(199); 
  def sum(f: Int => Int, a: Int, b: Int) = {
		def loop(a: Int, acc: Int): Int =
			if (a > b) acc
			else loop(a + 1, f(a) + acc)
			
		loop(a, 0)
	};System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(103); 
	
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 1
		else f(a) * product(f)(a + 1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(30); val res$0 = 
		
	product(x => x * x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(49); 
	
	def factorial(a: Int) = product(x => x)(1, a);System.out.println("""factorial: (a: Int)Int""");$skip(14); val res$1 = 
	factorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(172); 
	
	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
		if (a > b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a + 1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(46); val res$2 = 
	mapReduce(x => x, (x, y) => x + y, 0)(0, 10);System.out.println("""res2: Int = """ + $show(res$2));$skip(26); 
	
	val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(78); 
	def isCloseEnough(x: Double, y: Double) =
		abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(219); 
		
	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			val next = f(guess)
			if (isCloseEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(39); val res$3 = 
	fixedPoint(x => (784 / x + x) / 2)(1);System.out.println("""res3: Double = """ + $show(res$3));$skip(66); 
	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(65); 

	def sqrt(x: Double) =
		fixedPoint(averageDamp(y => x / y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$4 = 
		
	sqrt(4);System.out.println("""res4: Double = """ + $show(res$4))}
                                                 
	
	
}
