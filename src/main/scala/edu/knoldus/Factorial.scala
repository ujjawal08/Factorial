package edu.knoldus
import scala.annotation.tailrec

//FACTORIAL BY TAIL RECURSION

class Factorial {
  def factorial(num: Int): Int = {
    @tailrec
    def factorialAcc(acc: Int, num: Int): Int = {
      if (num <= 1)
        acc
      else
        factorialAcc(num * acc, num - 1)

    }

    factorialAcc(1, num)
  }
}

 object TestTailRecursion extends App {
 val  num = new Factorial
 println(num.factorial(num=5))
 }
