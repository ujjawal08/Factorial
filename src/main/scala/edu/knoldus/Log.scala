package edu.knoldus

class Log {
  def log(message: String, level: String = "info"): String = {
    ("[level]: message")

  }
}
object test extends App{
  val result = new Log
  println(result.log(message = "hello"))
}
