package com.knoldus.interoperable

import org.scalatest.funsuite.AnyFunSuite

class StorageExposeTest extends AnyFunSuite {

  test("Add element to storage") {
    val storage = new StorageExpose()
    storage.addElementToList(1)
    assert(storage.checkIfContains(1))
  }

  test("Remove element from storage") {
    val storage = new StorageExpose()
    storage.addElementToList(1)
    assert(storage.checkIfContains(1))
    storage.removeElementFromList(1)
    assert(!storage.checkIfContains(1))
  }

  test("Remove all elements from storage") {
    val storage = new StorageExpose()
    storage.addElementToList(1)
    storage.addElementToList(2)
    storage.removeAllOfList()
    assert(!storage.checkIfContains(1))
    assert(!storage.checkIfContains(2))
  }

  test("Check if storage contains an element") {
    val storage = new StorageExpose()
    storage.addElementToList(1)
    assert(storage.checkIfContains(1))
    assert(!storage.checkIfContains(2))
  }
}