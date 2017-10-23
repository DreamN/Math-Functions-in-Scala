package com.inaraniratti.mathFunction

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by inaraniratti on Oct, 2017
  */

class mathFunctionTest extends FunSuite with Matchers{
  test("sample + -"){
    val t = new mathFunction("x + 4 - 7")
    t.eval(0) should equal(-3.0)
    t.eval(5) should equal(2.0)
    val t2 = new mathFunction("x + 5 * 2 / x")
    t2.eval(100) should equal(2.1)
  }
}
