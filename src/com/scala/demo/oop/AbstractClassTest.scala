package com.scala.demo.oop

/**
 * 抽象类
 */
object AbstractClassTest {

  def main(args: Array[String]) {
    println(" AbstractClassTest");

    var obj = new AbstractBaseImpl("hison.zhang", 10);
    obj.write();
  }
}

class AbstractBaseImpl(name: String, age: Int) extends AbstractBase(name, age) {

  //抽象属性的实现类
  val baseName: Int = 1000;

  //抽象的方法的实现方法
  def write() {
    println("AbstractBaseImp write :" + baseName);
  }
}

abstract class AbstractBase(name: String, age: Int) {

  var name: String = _;
  var age: Int = _;

  //抽象属性
  val baseName: Int;

  def this(name: String, age: Int, sex: String) {
    this(name, age);
  }

  //定义抽象的方法
  def write();

  //定义具体的方法
  def read(name: String, age: Int) {
    println("AbstractBase read !!!")
  }
}