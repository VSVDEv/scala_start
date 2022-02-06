package vsvdev.ua.starter

import vsvdev.ua.starter.Arrays.b

import scala.language.postfixOps;/**
 * can contains different types, tuple - immutable, max 22 elem
 */
object Tuple extends App {
  val tuple: (String, Int, Boolean) = ("cat", 10, true)
  val tuple3: Tuple3[String, Int, Boolean] = ("cat", 10, true)
  val tuple2: ((Int, String), Boolean) = 1 -> "One" -> true //1->"one" -tuple1, bool tupl 2
  val t: Tuple2[Tuple2[Int, String], Boolean] = ((1, "One"), true)
  val t1: ((Int, String), Boolean) = ((1, "One"), true)


  println(tuple == tuple3)

  println(tuple2 == t)

  val animal = tuple._1
  println(animal)
  val weight = tuple._2
  println(weight)
  val vaccination = tuple._3
  println(vaccination)
  val (animal1, weight1, vaccination1) = tuple
  println(animal1)
  println(weight1)
  println(vaccination1)
  val (animal2, _, x) = tuple // we not interested in second param and skip it
  println(animal2)
  println(x)

  println("Hello World".partition(_.isUpper))//(HW,ello orld) tuple 1st isUpper, sec not

  val symbols = Array('a', 'b', 'c', '8')
  val counts = Array(1, 14, 7)
 val sss = symbols zip counts toMap // to map
 val ss = symbols zip counts // create an array with pairs ((a,1), ...)
  for (elem <- ss) println(elem)
  for (elem <- sss) println(elem)
  val days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
  days.zipWithIndex

  for ((day, count) <- days.zipWithIndex) println(s"$count is $day")
}
