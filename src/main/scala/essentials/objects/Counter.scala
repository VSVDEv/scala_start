package vsvdev.ua
package essentials.objects
/*
IMPOSSIBLE when extends
object Counter extends CounterC(int: Imt....) {

 */
object Counter extends CounterC {
  private var count = 0

  override def newCount = {
    count += 1
    count
  }

  println("Constructor")
}
