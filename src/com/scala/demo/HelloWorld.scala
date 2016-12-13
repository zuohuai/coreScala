package com.scala.demo

import java.util.Date

class HelloWorld{
  println(HelloWorld.file);
}

/**
 * 第一个scala入门程序，感觉很诡异
 */
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello Wolrd");

    //定义可变量
    var a: Int = 1;
    a = 2;
    println(a);

    //定义不可变变量
    val b: Int = 2;
    
    fun1(10, 20);
    fun2;
  }

  var file = "scala.txt";
  
  // 函数定义：
  def fun1(x: Int, y: Int) {
    if (x > y) {
      x;
    } else {
      y;
    }
  }
  
  def fun2 = println(" Hello Fun2");
}