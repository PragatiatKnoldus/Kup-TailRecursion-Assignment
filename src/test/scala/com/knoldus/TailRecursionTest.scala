package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class TailRecursionTest extends AnyFlatSpec {

  val iterable = new TailRecursiveLength

  "A condition" should "give length as 0 for empty iterable" in {
    assert(0 == iterable.findLength[Int](List()))
    assert(0 == iterable.findLength[Int](Set()))
    assert(0 == iterable.findLength[Int](Seq()))
  }

  "A condition" should "give correct length for entered iterable of integers" in {
    assert(4 == iterable.findLength[Int](List(4, 7, 9, 2)))
    assert(5 == iterable.findLength[Int](Set(4, 7, 9, 2, 8, 9, 4)))
    assert(4 == iterable.findLength[Int](Seq(4, 7, 9, 2)))
  }

  "A condition" should "give correct length for entered iterable of strings" in {
    assert(3 == iterable.findLength[String](List("apple", "banana", "orange")))
    assert(2 == iterable.findLength[String](Set("apple", "banana", "apple")))
    assert(4 == iterable.findLength[String](Seq("apple", "banana", "orange", "grapes")))
  }

  "A condition" should "give correct length for entered string" in {
    val aString = "Hello Scala"
    assert(11 == iterable.findLength(aString))
  }

  "A condition" should "give correct length for entered map" in {
    val map = Map(1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d")
    assert(4 == iterable.findLength(map))
  }
}