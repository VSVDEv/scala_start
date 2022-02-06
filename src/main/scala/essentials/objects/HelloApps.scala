package vsvdev.ua
package essentials.objects

object HelloApp extends App {
  if (args.length > 0) println(s"Hello, ${args(0)}!") else println("Hello, world!")
}
