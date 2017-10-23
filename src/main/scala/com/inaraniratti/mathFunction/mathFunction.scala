package com.inaraniratti.mathFunction

/**
  * Created by inaraniratti on Oct, 2017
  */

class mathFunction(expression: String) {
  def eval(x: Double): Double = {
    def toValue(s: String): Double = s match {
      case "x" => x
      case constant => constant.toDouble
    }
    def evalIter(exp: List[String]): Double = exp match {
      case left :: "+" :: right :: rest => evalIter(s"${toValue(left) + toValue(right)}" :: rest)
      case left :: "-" :: right :: rest => evalIter(s"${toValue(left) - toValue(right)}" :: rest)
      case left :: "*" :: right :: rest => evalIter(s"${toValue(left) * toValue(right)}" :: rest)
      case left :: "/" :: right :: rest => evalIter(s"${toValue(left) / toValue(right)}" :: rest)
      case result :: Nil => result.toDouble
    }
    evalIter(expression.split("\\s").toList)
  }
}
