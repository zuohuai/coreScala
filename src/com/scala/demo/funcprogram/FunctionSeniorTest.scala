package com.scala.demo.funcprogram

object FunctionSeniorTest {

  def main(args: Array[String]) {

    val a = Array(1, 2, 3, 4, 5, 6);
    a.map(1 + _);
    a.filter( _ > 6);
    a.reduce(_ -_);
  }
}