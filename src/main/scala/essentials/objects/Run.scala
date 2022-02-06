package vsvdev.ua
package essentials.objects

object Run extends App {
  val co = Counter.newCount
  val co1 = Counter.newCount
  val co2 = Counter.newCount
  println(co)
  println(co1)
  println(co2)
  println("***************************")
  val c1 = new CounterC
  c1.newCount
  c1.newCount
  new CounterC().newCount
  new CounterC().newCount


  println("****************COMPANYON****************")

  val a1 = new Companyon
  val a2 = new Companyon
  println(a1.id)
  println(a2.id)
  //Companyon.newCount
}
