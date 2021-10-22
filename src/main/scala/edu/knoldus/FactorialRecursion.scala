package edu.knoldus

// FACTORIAL BY USING RECURSION

class FactorialRecursion {

  def factorial(num: Int): Int = {
    if (num <= 1)
      return 1
    else
      return num * factorial(num - 1)
  }


}

object TestRecursion extends App{
  val  num = new FactorialRecursion
  println(num.factorial(num = 5))
}