package com.knoldus.interoperable

trait StorageTrait {
  def addElementToList(element: Int): Unit

  def removeElementFromList(element: Int): String

  def removeAllOfList(): Unit

  def checkIfContains(element: Int): Boolean
}

class StorageExpose extends StorageTrait {
  private val storage = new Storage()

  def addElementToList(element: Int): Unit = storage.addElementToList(element)

  def removeElementFromList(element: Int): String = storage.removeElementFromList(element)

  def removeAllOfList(): Unit = storage.removeAllElementsOfList()

  def checkIfContains(element: Int): Boolean = storage.checkIfContains(element)
}