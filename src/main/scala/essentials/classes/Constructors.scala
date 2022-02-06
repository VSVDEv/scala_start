package vsvdev.ua
package essentials.classes

class Constructors {
  var a = 0
  var str = ""

  def this(a: Int) = {
    this() // call main constructor
    this.a = a
  }

  def this(a: Int, str: String) = {
    this(a) // call additional constructor
    this.str = str
  }
}
