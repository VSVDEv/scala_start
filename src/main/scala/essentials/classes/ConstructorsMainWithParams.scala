package vsvdev.ua
package essentials.classes
/*
val valueFromConst - automatically create field
(val valueFromConstr: Int = 77) - with default value
(var valueFromConstr: Int = 77) - with default value
(valueFromConstr: Int) - by default val == private[this] val valueFromConstr
 */
class ConstructorsMainWithParams (val valueFromConstr: Int){

}

/*

class ConstructorsMainWithParams private (val valueFromConstr: Int){
private means that we cannot use constructor
 */