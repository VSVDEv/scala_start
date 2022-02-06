package vsvdev.ua
package essentials.classes

class Counter {

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