package vsvdev.ua
package essentials.classes
/*
each param of constructors auto val if we don't specify as var
create object companyon with apply method, which allow us create objects without "new"
give us method unapply to compare with template
generate methods toString, hashCode, copy
of course we can override
 */
case class CaseClass(name: String, age: Int) {
  override def toString: String = {
    s"name = $name, age = $age"
  }
}
