import scala.collection.mutable.ArrayBuffer

class Counter() {
  private var value = 0 //visible only
  protected var val2 = 0 //visible from class and subclass
  //public  visible from anywhere
  var val3 = 0

  def increment = {
    value += 1
  }

  def current() = value

  def <(other: Counter) = value < other.value

  def this(value: Int) = {
    this()
    this.value = value
  }

  def this(value: Int, str: String) = {
    this(value)
  }

  println(s"Current value = $value")
}
//inheritance
class A extends Counter{
  def a =val2
}
val c1 = new Counter()
val c2 = new Counter()
val c3 = new Counter(3)
val c4 = new Counter(3, "Str")
val conter1 = new A()
conter1.a
c1.increment
c1.current()
//c1.value
c2.current()

c1 < c2

c3.current()
c4.current()

class Network {
  class Member(name: String) {
    val contacts = new ArrayBuffer[Member]()
  }

  private val members = new ArrayBuffer[Member]()

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

val n1 = new Network
val n2 = new Network

new n2.Member("Anna")

val anna: n1.Member = n1.join("Anna")
val ivan: n1.Member = n1.join("Ivan")

anna.contacts += ivan
anna.contacts

val nick: n2.Member = n2.join("Nick")
//anna.contacts += nick

case class Cat(name: String, age: Int) {
  override def toString: String = {
    s"name = $name, age = $age"
  }
}

class Dog(name: String, age: Int)

val cat1 = Cat("Pushok", 7)
val cat2 = Cat("Pushok", 7)
val cat3 = cat1.copy(name = "Snegok")
cat1 == cat2
cat1 == cat3
val dog1 = new Dog("Bim", 5)
val dog2 = new Dog("Bim", 5)
dog1 == dog2
println(cat1)
println(n1)

