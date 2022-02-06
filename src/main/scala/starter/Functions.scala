package vsvdev.ua
package starter

import scala.annotation.tailrec

object Functions extends App {
  /*
         Anonymus
         Function can recieve 0 ...19 params but return only 0..1
          */

  val addOne = (x: Int) => x + 1
  val addOne1: Int => Int = (x: Int) => x + 1
  val addOne2: Function1[Int, Int] = (x: Int) => x + 1
  val sum = (x: Int, y: Int) => x + y
  val sum1: (Int, Int) => Int = (x: Int, y: Int) => x + y
  val printNumber = () => 42
  println(addOne(1))
  println(sum(1, 2))
  println(printNumber())

  /*

  Function
   */

  def abs(x: Int) = if (x > 0) x else -x

  def abs1(x: Int): Int = if (x > 0) x else -x

  println(abs(10))
  println(abs(-10))

  //method with func in params (func hight level)
  def example(x: Int, f: Int => Int) = {
    f(x)
  }

  println(example(1, addOne2))


  /*

  Recursion, we always must define return type
   */
  //3!=1*2*3
  def factorial(n: Int): Int = if (n <= 0) 1 else n * factorial(n - 1)

  println(factorial(5)) //120

  /*
  Tail recursion
  1)copy of original function
  2) different name
  3)have an additional param (accumulator)
  4)annotated with @tailrec
consume less memory
   */

  def factorialTail(n: Int): Int = {
    @tailrec def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 0) acc else factorialAcc(n * acc, n - 1)
    }

    factorialAcc(1, n)
  }

  println(factorialTail(5))



  /*

  Default args
   */

  def coolString(s: String, left: String = "@", right: String = "@"): String = {
    left + s + right

  }

  println(coolString("sv"))
  println(coolString("sv", "<<<<", ">>>>"))
  println(coolString("sv", "<<<<"))
  println(coolString("sv", right = ">>>>"))
  /*
  several(unknown) params
   */

  def summ(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  println(summ(1, 2))
  println(summ(1, 2, 3))
  println(summ(1, 2, 3, 4))

  /*

  Procedure - no return value
   */

  def printCoolestString(s: String, left: String = "@", right: String = "@"): Unit = {
    println(left + s + right)
  }
  def printCoolestString1(s: String, left: String = "@", right: String = "@") {
    println(left + s + right)
  }
  printCoolestString("ss")
}
