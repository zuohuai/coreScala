package com.scala.demo

object CaseClassTest {
  def main(args: Array[String]) {
    println(Person("hison.zhang", 10));
  }
}

/**
 * 1.不可以变
 * 2.默认实现了apply 方法，来产生类对象的工厂
 * 3.相当于java中的javabean，用来传递消息
 */
case class Person(name: String, age: Int) {

}