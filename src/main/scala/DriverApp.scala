package com.knoldus.interoperable

object DriverApp extends App {

  private val calculatorExpose = new CalculatorExpose
  private val num1 = 6
  private val num2 = 4
  println(s"Sum = ${calculatorExpose.add(num1, num2)}")
  println(s"Subtraction = ${calculatorExpose.subtract(num1, num2)}")
  println(s"Multiplication = ${calculatorExpose.multiply(num1, num2)}")
  println(s"Division = ${calculatorExpose.divide(num1, num2)}")

  private val storageExpose = new StorageExpose
  storageExpose.addElementToList(20)
  storageExpose.addElementToList(30)
  storageExpose.addElementToList(40)
  println(s"CheckIfContains = ${storageExpose.checkIfContains(40)}")
  println(storageExpose.removeElementFromList(10))
  storageExpose.removeAllOfList()
}