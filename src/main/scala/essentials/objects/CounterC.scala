package vsvdev.ua
package essentials.objects

class CounterC {
  private var count = 0
  def newCount = {
    count +=1
    count
  }
println("Const")
}
