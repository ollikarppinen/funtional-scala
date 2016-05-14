package week2

import math.abs

object session {
  def sum(f: Int => Int, a: Int, b: Int) = {
		def loop(a: Int, acc: Int): Int =
			if (a > b) acc
			else loop(a + 1, f(a) + acc)
			
		loop(a, 0)
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
	
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 1
		else f(a) * product(f)(a + 1, b)  //> product: (f: Int => Int)(a: Int, b: Int)Int
		
	product(x => x * x)(3, 4)                 //> res0: Int = 144
	
	def factorial(a: Int) = product(x => x)(1, a)
                                                  //> factorial: (a: Int)Int
	factorial(5)                              //> res1: Int = 120
	
	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
		if (a > b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
	mapReduce(x => x, (x, y) => x + y, 0)(0, 10)
                                                  //> res2: Int = 55
	
	val tolerance = 0.0001                    //> tolerance  : Double = 1.0E-4
	def isCloseEnough(x: Double, y: Double) =
		abs((x - y) / x) / x < tolerance  //> isCloseEnough: (x: Double, y: Double)Boolean
		
	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			val next = f(guess)
			if (isCloseEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
	fixedPoint(x => (784 / x + x) / 2)(1)     //> res3: Double = 28.000000635951793
	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

	def sqrt(x: Double) =
		fixedPoint(averageDamp(y => x / y))(1)
                                                  //> sqrt: (x: Double)Double
		
	sqrt(4)                                   //> res4: Double = 2.000000000000002
                                                 
	
	
}