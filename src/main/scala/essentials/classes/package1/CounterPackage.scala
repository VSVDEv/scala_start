package vsvdev.ua
package essentials.classes.package1

class CounterPackage {
  private[package1] var valuee = 0 //package visible []qulificator

  private[vsvdev] def incr = {
    valuee += 1
  println("increment")
  }
  private [this] def currentt() = valuee

  def getCurrent={
    println(currentt())
  }
}
