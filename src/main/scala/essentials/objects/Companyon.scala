package vsvdev.ua
package essentials.objects

class Companyon {
  val id = Companyon.newCount
}

object Companyon {

  private var count = 0
//one method for all
  private def newCount = {
    count += 1
    count
  }

  println("Constructor comp")
}