object Counter {
  private var count = 0

  def newCount = {
    count += 1
    count
  }

  println("Constructor")
}

class Counter {
  val id = Counter.newCount
}

val c1 = new Counter
val c2 = new Counter
c1.id
c2.id

Counter.newCount
Counter.newCount
Counter.newCount

abstract class UndoableAction(val description: String) {
  def undo(): Unit

  def redo(): Unit
}

object DoNothing extends UndoableAction("Do nothing") {
  override def undo(): Unit = {}

  override def redo(): Unit = {}

  def apply(description: String): DoNothing = new DoNothing(description)
}

class DoNothing(description: String)

DoNothing("Do nothing from apply")

val action = Map("open" -> DoNothing, "save" -> DoNothing)

Array("1", "2", "3")
Array.apply("1", "2", "3")
Array(Array(1, 2), Array(8, 9))

object TrafficLights extends Enumeration {
  val Red = Value("Super Red")
  val Yellow = Value(10, "Super Yellow")
  val Green = Value
}

TrafficLights.Red.id
TrafficLights.Yellow.id
TrafficLights.Green.id

def onTheRoad(color: TrafficLights.Value) = {
  import TrafficLights._
  color match {
    case Green => "go"
    case Yellow => "attention"
    case Red => "stop"
    case _ => "something went wrong"
  }
}

onTheRoad(TrafficLights.Yellow)

for (c <- TrafficLights.values) println(c.id + ": " + c)

TrafficLights(0)
TrafficLights.withName("Super Red")