package com.knoldus

import scala.annotation.tailrec

class TailRecursiveLength {

  def findLength[A](sequence: Iterable[A]): Int = {
    @tailrec
    def length(sequence: Iterable[A], accumulator: Int = 0): Int =
      if (sequence.isEmpty) accumulator
      else length(sequence.drop(1), accumulator + 1)

    length(sequence)
  }
}