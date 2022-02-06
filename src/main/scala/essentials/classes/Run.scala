package vsvdev.ua
package essentials.classes

import essentials.classes.package1.CounterPackage

import vsvdev.ua.starter.Arrays.b

object Run extends App {
  val c1 = new Counter()
  val c2 = new Counter()
  val c3 = new Counter(3)
  val c4 = new Counter(3, "Str")

  val conter1 = new A()
  //conter1.a
  println(conter1.a)
  c1.increment
  print(c1.current())
  //c1.value
  c2.current()

  println(c1 < c2)

  println(c3.current())
  print(c4.current())

  /////
  println("**************")

  var pack = new CounterPackage()
  pack.incr
  pack.getCurrent
  //pack.currentt()
  // pack.valuee


  println("***********")
  println("***********Constructors**********")

  val constr = new Constructors()
  val constr1 = new Constructors(3)
  val constr2 = new Constructors(3, "string")
  println(constr.a)
  println(constr1.a)
  println(constr2.a, constr2.str)

  val constrWithPar = new ConstructorsMainWithParams(2)
  println(constrWithPar.valueFromConstr)
  println("***********")

  println("***********Inner*********")
  val n1 = new Network
  val n2 = new Network

  new n2.Member("Anna")

  val anna: n1.Member = n1.join("Anna")
  val ivan: n1.Member = n1.join("Ivan")

  anna.contacts += ivan
  println(anna.contacts)
  println("***********")
  for (i <- ivan.contacts) println(i)

  println("********")
  val nick: n2.Member = n2.join("Nick")
  //anna.contacts += nick

  println("***************************CASE CLASS********")

  val caseClass = CaseClass
  println(caseClass.toString())

  val cat1 = CaseClass("Pushok", 7)
  val cat2 = CaseClass("Pushok", 7)
  val cat3 = cat1.copy(name = "Snegok") // copy with changing name
  println(cat1 == cat2)
  println(cat1 == cat3)

  val dog1 = new Dog("Bim", 5)
  val dog2 = new Dog("Bim", 5)
  println(dog1 == dog2) //false because we don't create equals method
  println(cat1)
  println(n1)


}
