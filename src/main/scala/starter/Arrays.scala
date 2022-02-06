package vsvdev.ua
package starter

import scala.collection.{immutable, mutable}
import scala.collection.mutable.ArrayBuffer

object Arrays extends App {
  /*
      [][] first string then row
       */

  var nums = new Array[Int](10);
  println(nums.toString)

  var str = new Array[String](10);
  println(str.toString)

  val a = Array(5, 5)
  println(a)
  //Any OK
  val mix = Array("he", "llo", 5)
  val str1 = Array("he", "llo")
  println(mix)
  println(str1(0))
  str1(0) = "GOD"
  println(str1(0))
  //arrays with changed length
  val b = ArrayBuffer[Int]()
  b += 7 //int we can add elements in this case 1
  b += (1, 2, 3) // add a few elements  in end
  b ++= Array(8, 6) // add array
  b ++= ArrayBuffer(6, 5) // add arraybuffer
  b.trimEnd(3) //delete 3 last
  b.trimStart(1) // delete one from start
  b.insert(0, 1) // paste elem on position 0 elem=1
  b.remove(0)
  b.remove(0, 2) // delete from 0 posit 2 elements if more than have elements throws exception
  b.toArray // to save memory

  str1.toBuffer // to have opportunity explore

  for (i <- 0 until b.length) println(b(i))
  for (i <- b.indices) println(b(i))
  for (i <- b) println(i)

  //converting

  val res = for (elem <- b) yield 2 * elem // b won't change
  for (i <- res) println(i)
  for (i <- b) println(i)
  res.sum
  res.min
  res.max
  res.sorted // create new from smallest to biggest
  res.mkString(", ") //delimiter

  val matrix = Array.ofDim[Double](3, 4)
  for (i <- matrix) println(i)
  println(matrix(1)(1))

  /*
  Map
   */
  val mmap = Map("A" -> 25, "B" -> 45) //immutable
  val mmapMutable = mutable.Map("A" -> 25, "B" -> 45) //mutable

  val al = mmap("A")
  println(al)
  println(mmap.contains("B"))
  mmapMutable("A") = 30
  mmapMutable += ("C" -> 22) //add
  mmapMutable -= "B" // remove
  val newMmap = mmap + ("D" -> 44)
  for ((k, v) <- newMmap) println(s"k = $k, v = $v")
  println(newMmap.keySet)
  println(newMmap.keys)
  println(newMmap.values)

  val revertKV = for ((k, v) <- newMmap) yield (v, k) // if val not unique we lost
  for ((k, v) <- revertKV) println(s"k = $k, v = $v")

  /*

  Hash table
   */

  val sortedMmap = immutable.SortedMap("C" -> 33, "A" -> 255, "B" -> 45) //sorted keys
  println(sortedMmap.keys)
  println(sortedMmap.values)
}
