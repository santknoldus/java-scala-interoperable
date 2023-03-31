package com.knoldus.interoperable

class CalculatorExpose {
  def add(a: Int, b: Int): Int = Calculator.add(a, b)

  def subtract(a: Int, b: Int): Int = Calculator.subtract(a, b)

  def multiply(a: Int, b: Int): Int = Calculator.multiply(a, b)

  def divide(a: Int, b: Int): Double = Calculator.divide(a, b)
}