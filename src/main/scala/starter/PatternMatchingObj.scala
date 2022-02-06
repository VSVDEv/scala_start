package vsvdev.ua
package starter

object PatternMatchingObj extends App {

  val lightOn: Boolean = true
  val turnOnLight = "Turn on the light"
  val takeFeed = "Take feed"
  val feelThough = "Feel through"


  lightOn match {
    case true => println(s"$takeFeed, $feelThough ")
    case false => println(s"$turnOnLight, $takeFeed, $feelThough ")
  }
  println("*******************")
  var lightOnStr = "light on"
  lightOnStr match {
    case "light on" => println(s"$takeFeed, $feelThough ")
    case "light off" => println(s"$turnOnLight, $takeFeed, $feelThough ")
    case x => x //we can use variable it return value lightOnStr
    case _ => println(s"we don't know what to do") // _ **default value
  }
}
class Refactor {
  //before refactoring
  val day = "sunday"

  val result = if (day == "monday") {
    println("it is monday")
    false
  } else if (day != "tuesday") {
    if (day != "wednesday") {
      if (day != "thursday") {
        if (day != "friday") {
          if (day == "saturday") {
            println("it is saturday")
            false
          } else true
        } else {
          if (day == "thursday") {
            println("it is thursday")
            false
          }
          else if (day == "wednesday") {
            println("it is wednesday")
            false
          }
          else true
        }
      } else true
    } else if (day == "sunday") true else false
  } else true

  result


  //after refactoring
  val result1: Boolean = if (day == "monday") {
    println("it is monday")
    false
  } else if (day == "tuesday") {
    println("it is thursday")
    false
  }
  else if (day == "wednesday") {
    println("it is wednesday")
    false
  } else if (day == "thursday") {
    println("it is thursday")
    false
  }
  else if (day == "saturday") {
    println("it is saturday")
    false
  } else true

  result1

  val result2 = day match {
    case "monday" => println("it is monday"); false
    case "tuesday" => println("it is tuesday"); false
    case "wednesday" => println("it is wednesday"); false
    case "thursday" => println("it is thursday"); false
    case "friday" => println("it is friday"); false
    case "saturday" => println("it is saturday"); false
    case "sunday" => true
    case _ => false
  }

}