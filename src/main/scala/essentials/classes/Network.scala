package vsvdev.ua
package essentials.classes

import scala.collection.mutable.ArrayBuffer

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


