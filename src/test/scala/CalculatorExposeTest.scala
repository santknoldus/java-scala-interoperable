package com.knoldus.interoperable

import org.scalatest.funsuite.AnyFunSuite

class CalculatorExposeTest extends AnyFunSuite {

  test("Addition") {
    val calculator = new CalculatorExpose()
    assert(calculator.add(2, 3) == 5)
  }

  test("Subtraction") {
    val calculator = new CalculatorExpose()
    assert(calculator.subtract(5, 2) == 3)
  }

  test("Multiplication") {
    val calculator = new CalculatorExpose()
    assert(calculator.multiply(2, 3) == 6)
  }

  test("Division") {
    val calculator = new CalculatorExpose()
    assert(calculator.divide(6, 3) == 2.0)
    assertThrows[ArithmeticException] {
      calculator.divide(6, 0)
    }
  }
}