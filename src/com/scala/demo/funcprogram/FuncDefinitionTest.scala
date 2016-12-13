package com.scala.demo.funcprogram

/**
 * 函数式编程
 */
object FuncDefinitionTest {

  def main(args: Array[String]) {
    println(" Hello World");

    //1.定义一个函数 － 方式一
    def addA(x: Int) = x + 100;

    var add = addA _

    println("the result is : " + add);

    println("the result is : " + add(1));

    //2. 定义一个函数 －方式二
    val add2 = (x: Int) => x * 200;
    println("the result is :" + add2(2));

    //3.值函数
    var sum3 = add3 _;
    println("sum3:" + sum3(100, 200));
    println(add3(600, 500));

    //4.匿名函数
    var add4 = (x: Int) => { x + 100 };
    println(add4(20000));
    //5.匿名函数对集合的操作
    val mainList = List(11, 22, 33, 44);
    println(mainList.map { (x: Int) => x * 2 });
    println(mainList.map(3*_));
  }

  def add3(x: Int, y: Int): Int = {
    x + y;
  }
  
  
}